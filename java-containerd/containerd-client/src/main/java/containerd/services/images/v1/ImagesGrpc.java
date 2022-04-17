package containerd.services.images.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Images is a service that allows one to register images with containerd.
 * In containerd, an image is merely the mapping of a name to a content root,
 * described by a descriptor. The behavior and state of image is purely
 * dictated by the type of the descriptor.
 * From the perspective of this service, these references are mostly shallow,
 * in that the existence of the required content won't be validated until
 * required by consuming services.
 * As such, this can really be considered a "metadata service".
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: github.com/containerd/containerd/api/services/images/v1/images.proto")
public final class ImagesGrpc {

  private ImagesGrpc() {}

  public static final String SERVICE_NAME = "containerd.services.images.v1.Images";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.GetImageRequest,
      containerd.services.images.v1.ImagesOuterClass.GetImageResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = containerd.services.images.v1.ImagesOuterClass.GetImageRequest.class,
      responseType = containerd.services.images.v1.ImagesOuterClass.GetImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.GetImageRequest,
      containerd.services.images.v1.ImagesOuterClass.GetImageResponse> getGetMethod() {
    io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.GetImageRequest, containerd.services.images.v1.ImagesOuterClass.GetImageResponse> getGetMethod;
    if ((getGetMethod = ImagesGrpc.getGetMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getGetMethod = ImagesGrpc.getGetMethod) == null) {
          ImagesGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<containerd.services.images.v1.ImagesOuterClass.GetImageRequest, containerd.services.images.v1.ImagesOuterClass.GetImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "containerd.services.images.v1.Images", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  containerd.services.images.v1.ImagesOuterClass.GetImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  containerd.services.images.v1.ImagesOuterClass.GetImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.ListImagesRequest,
      containerd.services.images.v1.ImagesOuterClass.ListImagesResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = containerd.services.images.v1.ImagesOuterClass.ListImagesRequest.class,
      responseType = containerd.services.images.v1.ImagesOuterClass.ListImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.ListImagesRequest,
      containerd.services.images.v1.ImagesOuterClass.ListImagesResponse> getListMethod() {
    io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.ListImagesRequest, containerd.services.images.v1.ImagesOuterClass.ListImagesResponse> getListMethod;
    if ((getListMethod = ImagesGrpc.getListMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getListMethod = ImagesGrpc.getListMethod) == null) {
          ImagesGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<containerd.services.images.v1.ImagesOuterClass.ListImagesRequest, containerd.services.images.v1.ImagesOuterClass.ListImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "containerd.services.images.v1.Images", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  containerd.services.images.v1.ImagesOuterClass.ListImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  containerd.services.images.v1.ImagesOuterClass.ListImagesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.CreateImageRequest,
      containerd.services.images.v1.ImagesOuterClass.CreateImageResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = containerd.services.images.v1.ImagesOuterClass.CreateImageRequest.class,
      responseType = containerd.services.images.v1.ImagesOuterClass.CreateImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.CreateImageRequest,
      containerd.services.images.v1.ImagesOuterClass.CreateImageResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.CreateImageRequest, containerd.services.images.v1.ImagesOuterClass.CreateImageResponse> getCreateMethod;
    if ((getCreateMethod = ImagesGrpc.getCreateMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getCreateMethod = ImagesGrpc.getCreateMethod) == null) {
          ImagesGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<containerd.services.images.v1.ImagesOuterClass.CreateImageRequest, containerd.services.images.v1.ImagesOuterClass.CreateImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "containerd.services.images.v1.Images", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  containerd.services.images.v1.ImagesOuterClass.CreateImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  containerd.services.images.v1.ImagesOuterClass.CreateImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest,
      containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest.class,
      responseType = containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest,
      containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest, containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse> getUpdateMethod;
    if ((getUpdateMethod = ImagesGrpc.getUpdateMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getUpdateMethod = ImagesGrpc.getUpdateMethod) == null) {
          ImagesGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest, containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "containerd.services.images.v1.Images", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest,
      com.google.protobuf.Empty> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest,
      com.google.protobuf.Empty> getDeleteMethod() {
    io.grpc.MethodDescriptor<containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest, com.google.protobuf.Empty> getDeleteMethod;
    if ((getDeleteMethod = ImagesGrpc.getDeleteMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getDeleteMethod = ImagesGrpc.getDeleteMethod) == null) {
          ImagesGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "containerd.services.images.v1.Images", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImagesStub newStub(io.grpc.Channel channel) {
    return new ImagesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImagesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImagesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImagesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImagesFutureStub(channel);
  }

  /**
   * <pre>
   * Images is a service that allows one to register images with containerd.
   * In containerd, an image is merely the mapping of a name to a content root,
   * described by a descriptor. The behavior and state of image is purely
   * dictated by the type of the descriptor.
   * From the perspective of this service, these references are mostly shallow,
   * in that the existence of the required content won't be validated until
   * required by consuming services.
   * As such, this can really be considered a "metadata service".
   * </pre>
   */
  public static abstract class ImagesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get returns an image by name.
     * </pre>
     */
    public void get(containerd.services.images.v1.ImagesOuterClass.GetImageRequest request,
        io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.GetImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * List returns a list of all images known to containerd.
     * </pre>
     */
    public void list(containerd.services.images.v1.ImagesOuterClass.ListImagesRequest request,
        io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.ListImagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create an image record in the metadata store.
     * The name of the image must be unique.
     * </pre>
     */
    public void create(containerd.services.images.v1.ImagesOuterClass.CreateImageRequest request,
        io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.CreateImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update assigns the name to a given target image based on the provided
     * image.
     * </pre>
     */
    public void update(containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest request,
        io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete deletes the image by name.
     * </pre>
     */
    public void delete(containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                containerd.services.images.v1.ImagesOuterClass.GetImageRequest,
                containerd.services.images.v1.ImagesOuterClass.GetImageResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                containerd.services.images.v1.ImagesOuterClass.ListImagesRequest,
                containerd.services.images.v1.ImagesOuterClass.ListImagesResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                containerd.services.images.v1.ImagesOuterClass.CreateImageRequest,
                containerd.services.images.v1.ImagesOuterClass.CreateImageResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest,
                containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * Images is a service that allows one to register images with containerd.
   * In containerd, an image is merely the mapping of a name to a content root,
   * described by a descriptor. The behavior and state of image is purely
   * dictated by the type of the descriptor.
   * From the perspective of this service, these references are mostly shallow,
   * in that the existence of the required content won't be validated until
   * required by consuming services.
   * As such, this can really be considered a "metadata service".
   * </pre>
   */
  public static final class ImagesStub extends io.grpc.stub.AbstractStub<ImagesStub> {
    private ImagesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImagesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ImagesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImagesStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get returns an image by name.
     * </pre>
     */
    public void get(containerd.services.images.v1.ImagesOuterClass.GetImageRequest request,
        io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.GetImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List returns a list of all images known to containerd.
     * </pre>
     */
    public void list(containerd.services.images.v1.ImagesOuterClass.ListImagesRequest request,
        io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.ListImagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create an image record in the metadata store.
     * The name of the image must be unique.
     * </pre>
     */
    public void create(containerd.services.images.v1.ImagesOuterClass.CreateImageRequest request,
        io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.CreateImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update assigns the name to a given target image based on the provided
     * image.
     * </pre>
     */
    public void update(containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest request,
        io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete deletes the image by name.
     * </pre>
     */
    public void delete(containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Images is a service that allows one to register images with containerd.
   * In containerd, an image is merely the mapping of a name to a content root,
   * described by a descriptor. The behavior and state of image is purely
   * dictated by the type of the descriptor.
   * From the perspective of this service, these references are mostly shallow,
   * in that the existence of the required content won't be validated until
   * required by consuming services.
   * As such, this can really be considered a "metadata service".
   * </pre>
   */
  public static final class ImagesBlockingStub extends io.grpc.stub.AbstractStub<ImagesBlockingStub> {
    private ImagesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImagesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ImagesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImagesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get returns an image by name.
     * </pre>
     */
    public containerd.services.images.v1.ImagesOuterClass.GetImageResponse get(containerd.services.images.v1.ImagesOuterClass.GetImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List returns a list of all images known to containerd.
     * </pre>
     */
    public containerd.services.images.v1.ImagesOuterClass.ListImagesResponse list(containerd.services.images.v1.ImagesOuterClass.ListImagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create an image record in the metadata store.
     * The name of the image must be unique.
     * </pre>
     */
    public containerd.services.images.v1.ImagesOuterClass.CreateImageResponse create(containerd.services.images.v1.ImagesOuterClass.CreateImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update assigns the name to a given target image based on the provided
     * image.
     * </pre>
     */
    public containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse update(containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete deletes the image by name.
     * </pre>
     */
    public com.google.protobuf.Empty delete(containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Images is a service that allows one to register images with containerd.
   * In containerd, an image is merely the mapping of a name to a content root,
   * described by a descriptor. The behavior and state of image is purely
   * dictated by the type of the descriptor.
   * From the perspective of this service, these references are mostly shallow,
   * in that the existence of the required content won't be validated until
   * required by consuming services.
   * As such, this can really be considered a "metadata service".
   * </pre>
   */
  public static final class ImagesFutureStub extends io.grpc.stub.AbstractStub<ImagesFutureStub> {
    private ImagesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImagesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ImagesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImagesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get returns an image by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<containerd.services.images.v1.ImagesOuterClass.GetImageResponse> get(
        containerd.services.images.v1.ImagesOuterClass.GetImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List returns a list of all images known to containerd.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<containerd.services.images.v1.ImagesOuterClass.ListImagesResponse> list(
        containerd.services.images.v1.ImagesOuterClass.ListImagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create an image record in the metadata store.
     * The name of the image must be unique.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<containerd.services.images.v1.ImagesOuterClass.CreateImageResponse> create(
        containerd.services.images.v1.ImagesOuterClass.CreateImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update assigns the name to a given target image based on the provided
     * image.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse> update(
        containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete deletes the image by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> delete(
        containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_CREATE = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImagesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImagesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((containerd.services.images.v1.ImagesOuterClass.GetImageRequest) request,
              (io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.GetImageResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((containerd.services.images.v1.ImagesOuterClass.ListImagesRequest) request,
              (io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.ListImagesResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((containerd.services.images.v1.ImagesOuterClass.CreateImageRequest) request,
              (io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.CreateImageResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((containerd.services.images.v1.ImagesOuterClass.UpdateImageRequest) request,
              (io.grpc.stub.StreamObserver<containerd.services.images.v1.ImagesOuterClass.UpdateImageResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((containerd.services.images.v1.ImagesOuterClass.DeleteImageRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ImagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImagesBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return containerd.services.images.v1.ImagesOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Images");
    }
  }

  private static final class ImagesFileDescriptorSupplier
      extends ImagesBaseDescriptorSupplier {
    ImagesFileDescriptorSupplier() {}
  }

  private static final class ImagesMethodDescriptorSupplier
      extends ImagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImagesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ImagesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImagesFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
