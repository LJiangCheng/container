package com.containerd.client.example;

import containerd.services.images.v1.ImagesGrpc;
import containerd.services.images.v1.ImagesOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollDomainSocketChannel;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.unix.DomainSocketAddress;

import java.util.List;

public class ContainerdClientExample {
    public static void main(String[] args) {
        // Create a new channel using Netty Native transport
        EventLoopGroup elg = new EpollEventLoopGroup();
        ManagedChannel channel =
                NettyChannelBuilder
                        .forAddress(new DomainSocketAddress("/run/containerd/containerd.sock"))
                        .eventLoopGroup(elg)
                        .channelType(EpollDomainSocketChannel.class)
                        .usePlaintext()
                        .build();
        // Since containerd requires a namespace to be specified when making a GRPC call, we will define a header with "containerd-namespace" key, set the value to our namespace
        Metadata header = new Metadata();
        Metadata.Key<String> key = Metadata.Key.of("containerd-namespace", Metadata.ASCII_STRING_MARSHALLER);
        header.put(key, "moby");
        //Create the stub and attach the header created above
        ImagesGrpc.ImagesStub stub = ImagesGrpc.newStub(channel);
        stub = MetadataUtils.attachHeaders(stub, header);
        //Let’s build the ListImagesRequest with no filter
        ImagesOuterClass.ListImagesRequest request =
                ImagesOuterClass.ListImagesRequest.newBuilder().addFilters("").build();
        System.out.println("==============================================================");
        System.out.println("IMAGE============");
        // Make the RPC Call
        stub.list(request, new StreamObserver<ImagesOuterClass.ListImagesResponse>() {
            // When response is received iterate over the Response and print the names of images
            public void onNext(ImagesOuterClass.ListImagesResponse response) {
                List<ImagesOuterClass.Image> images = response.getImagesList();
                for (int i = 0; i < images.size(); i++) {
                    System.out.println(i + "-" + images.get(i).getName());
                }
            }

            // if there is an error
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            // when server completes the response and closes the stream shutdown our channel and EventLoopGroup
            public void onCompleted() {
                channel.shutdownNow();
                elg.shutdownGracefully(50, 50, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        });
    }
}
