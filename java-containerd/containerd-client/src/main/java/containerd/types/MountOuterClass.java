// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/containerd/containerd/api/types/mount.proto

package containerd.types;

import containerd.protobuf.GoGoProtos;

public final class MountOuterClass {
  private MountOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MountOrBuilder extends
      // @@protoc_insertion_point(interface_extends:containerd.types.Mount)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Type defines the nature of the mount.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    String getType();
    /**
     * <pre>
     * Type defines the nature of the mount.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <pre>
     * Source specifies the name of the mount. Depending on mount type, this
     * may be a volume name or a host path, or even ignored.
     * </pre>
     *
     * <code>string source = 2;</code>
     */
    String getSource();
    /**
     * <pre>
     * Source specifies the name of the mount. Depending on mount type, this
     * may be a volume name or a host path, or even ignored.
     * </pre>
     *
     * <code>string source = 2;</code>
     */
    com.google.protobuf.ByteString
        getSourceBytes();

    /**
     * <pre>
     * Target path in container
     * </pre>
     *
     * <code>string target = 3;</code>
     */
    String getTarget();
    /**
     * <pre>
     * Target path in container
     * </pre>
     *
     * <code>string target = 3;</code>
     */
    com.google.protobuf.ByteString
        getTargetBytes();

    /**
     * <pre>
     * Options specifies zero or more fstab style mount options.
     * </pre>
     *
     * <code>repeated string options = 4;</code>
     */
    java.util.List<String>
        getOptionsList();
    /**
     * <pre>
     * Options specifies zero or more fstab style mount options.
     * </pre>
     *
     * <code>repeated string options = 4;</code>
     */
    int getOptionsCount();
    /**
     * <pre>
     * Options specifies zero or more fstab style mount options.
     * </pre>
     *
     * <code>repeated string options = 4;</code>
     */
    String getOptions(int index);
    /**
     * <pre>
     * Options specifies zero or more fstab style mount options.
     * </pre>
     *
     * <code>repeated string options = 4;</code>
     */
    com.google.protobuf.ByteString
        getOptionsBytes(int index);
  }
  /**
   * <pre>
   * Mount describes mounts for a container.
   * This type is the lingua franca of ContainerD. All services provide mounts
   * to be used with the container at creation time.
   * The Mount type follows the structure of the mount syscall, including a type,
   * source, target and options.
   * </pre>
   *
   * Protobuf type {@code containerd.types.Mount}
   */
  public  static final class Mount extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:containerd.types.Mount)
      MountOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Mount.newBuilder() to construct.
    private Mount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Mount() {
      type_ = "";
      source_ = "";
      target_ = "";
      options_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Mount(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              String s = input.readStringRequireUtf8();

              type_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              source_ = s;
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              target_ = s;
              break;
            }
            case 34: {
              String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                options_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              options_.add(s);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          options_ = options_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MountOuterClass.internal_static_containerd_types_Mount_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MountOuterClass.internal_static_containerd_types_Mount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Mount.class, Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile Object type_;
    /**
     * <pre>
     * Type defines the nature of the mount.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public String getType() {
      Object ref = type_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Type defines the nature of the mount.
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SOURCE_FIELD_NUMBER = 2;
    private volatile Object source_;
    /**
     * <pre>
     * Source specifies the name of the mount. Depending on mount type, this
     * may be a volume name or a host path, or even ignored.
     * </pre>
     *
     * <code>string source = 2;</code>
     */
    public String getSource() {
      Object ref = source_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        source_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Source specifies the name of the mount. Depending on mount type, this
     * may be a volume name or a host path, or even ignored.
     * </pre>
     *
     * <code>string source = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGET_FIELD_NUMBER = 3;
    private volatile Object target_;
    /**
     * <pre>
     * Target path in container
     * </pre>
     *
     * <code>string target = 3;</code>
     */
    public String getTarget() {
      Object ref = target_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        target_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Target path in container
     * </pre>
     *
     * <code>string target = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OPTIONS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList options_;
    /**
     * <pre>
     * Options specifies zero or more fstab style mount options.
     * </pre>
     *
     * <code>repeated string options = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getOptionsList() {
      return options_;
    }
    /**
     * <pre>
     * Options specifies zero or more fstab style mount options.
     * </pre>
     *
     * <code>repeated string options = 4;</code>
     */
    public int getOptionsCount() {
      return options_.size();
    }
    /**
     * <pre>
     * Options specifies zero or more fstab style mount options.
     * </pre>
     *
     * <code>repeated string options = 4;</code>
     */
    public String getOptions(int index) {
      return options_.get(index);
    }
    /**
     * <pre>
     * Options specifies zero or more fstab style mount options.
     * </pre>
     *
     * <code>repeated string options = 4;</code>
     */
    public com.google.protobuf.ByteString
        getOptionsBytes(int index) {
      return options_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (!getSourceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, source_);
      }
      if (!getTargetBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, target_);
      }
      for (int i = 0; i < options_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, options_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (!getSourceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, source_);
      }
      if (!getTargetBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, target_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < options_.size(); i++) {
          dataSize += computeStringSizeNoTag(options_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getOptionsList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Mount)) {
        return super.equals(obj);
      }
      Mount other = (Mount) obj;

      if (!getType()
          .equals(other.getType())) return false;
      if (!getSource()
          .equals(other.getSource())) return false;
      if (!getTarget()
          .equals(other.getTarget())) return false;
      if (!getOptionsList()
          .equals(other.getOptionsList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getTarget().hashCode();
      if (getOptionsCount() > 0) {
        hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getOptionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Mount parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Mount parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Mount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Mount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Mount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Mount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Mount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Mount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Mount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Mount parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Mount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Mount parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Mount prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Mount describes mounts for a container.
     * This type is the lingua franca of ContainerD. All services provide mounts
     * to be used with the container at creation time.
     * The Mount type follows the structure of the mount syscall, including a type,
     * source, target and options.
     * </pre>
     *
     * Protobuf type {@code containerd.types.Mount}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:containerd.types.Mount)
        MountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MountOuterClass.internal_static_containerd_types_Mount_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MountOuterClass.internal_static_containerd_types_Mount_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Mount.class, Builder.class);
      }

      // Construct using containerd.types.MountOuterClass.Mount.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        type_ = "";

        source_ = "";

        target_ = "";

        options_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MountOuterClass.internal_static_containerd_types_Mount_descriptor;
      }

      @Override
      public Mount getDefaultInstanceForType() {
        return Mount.getDefaultInstance();
      }

      @Override
      public Mount build() {
        Mount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Mount buildPartial() {
        Mount result = new Mount(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.type_ = type_;
        result.source_ = source_;
        result.target_ = target_;
        if (((bitField0_ & 0x00000008) != 0)) {
          options_ = options_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.options_ = options_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Mount) {
          return mergeFrom((Mount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Mount other) {
        if (other == Mount.getDefaultInstance()) return this;
        if (!other.getType().isEmpty()) {
          type_ = other.type_;
          onChanged();
        }
        if (!other.getSource().isEmpty()) {
          source_ = other.source_;
          onChanged();
        }
        if (!other.getTarget().isEmpty()) {
          target_ = other.target_;
          onChanged();
        }
        if (!other.options_.isEmpty()) {
          if (options_.isEmpty()) {
            options_ = other.options_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureOptionsIsMutable();
            options_.addAll(other.options_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Mount parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Mount) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object type_ = "";
      /**
       * <pre>
       * Type defines the nature of the mount.
       * </pre>
       *
       * <code>string type = 1;</code>
       */
      public String getType() {
        Object ref = type_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * Type defines the nature of the mount.
       * </pre>
       *
       * <code>string type = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Type defines the nature of the mount.
       * </pre>
       *
       * <code>string type = 1;</code>
       */
      public Builder setType(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Type defines the nature of the mount.
       * </pre>
       *
       * <code>string type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Type defines the nature of the mount.
       * </pre>
       *
       * <code>string type = 1;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        type_ = value;
        onChanged();
        return this;
      }

      private Object source_ = "";
      /**
       * <pre>
       * Source specifies the name of the mount. Depending on mount type, this
       * may be a volume name or a host path, or even ignored.
       * </pre>
       *
       * <code>string source = 2;</code>
       */
      public String getSource() {
        Object ref = source_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          source_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * Source specifies the name of the mount. Depending on mount type, this
       * may be a volume name or a host path, or even ignored.
       * </pre>
       *
       * <code>string source = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSourceBytes() {
        Object ref = source_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          source_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Source specifies the name of the mount. Depending on mount type, this
       * may be a volume name or a host path, or even ignored.
       * </pre>
       *
       * <code>string source = 2;</code>
       */
      public Builder setSource(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        source_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Source specifies the name of the mount. Depending on mount type, this
       * may be a volume name or a host path, or even ignored.
       * </pre>
       *
       * <code>string source = 2;</code>
       */
      public Builder clearSource() {
        
        source_ = getDefaultInstance().getSource();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Source specifies the name of the mount. Depending on mount type, this
       * may be a volume name or a host path, or even ignored.
       * </pre>
       *
       * <code>string source = 2;</code>
       */
      public Builder setSourceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        source_ = value;
        onChanged();
        return this;
      }

      private Object target_ = "";
      /**
       * <pre>
       * Target path in container
       * </pre>
       *
       * <code>string target = 3;</code>
       */
      public String getTarget() {
        Object ref = target_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          target_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * Target path in container
       * </pre>
       *
       * <code>string target = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTargetBytes() {
        Object ref = target_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          target_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Target path in container
       * </pre>
       *
       * <code>string target = 3;</code>
       */
      public Builder setTarget(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        target_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Target path in container
       * </pre>
       *
       * <code>string target = 3;</code>
       */
      public Builder clearTarget() {
        
        target_ = getDefaultInstance().getTarget();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Target path in container
       * </pre>
       *
       * <code>string target = 3;</code>
       */
      public Builder setTargetBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        target_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList options_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureOptionsIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          options_ = new com.google.protobuf.LazyStringArrayList(options_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <pre>
       * Options specifies zero or more fstab style mount options.
       * </pre>
       *
       * <code>repeated string options = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getOptionsList() {
        return options_.getUnmodifiableView();
      }
      /**
       * <pre>
       * Options specifies zero or more fstab style mount options.
       * </pre>
       *
       * <code>repeated string options = 4;</code>
       */
      public int getOptionsCount() {
        return options_.size();
      }
      /**
       * <pre>
       * Options specifies zero or more fstab style mount options.
       * </pre>
       *
       * <code>repeated string options = 4;</code>
       */
      public String getOptions(int index) {
        return options_.get(index);
      }
      /**
       * <pre>
       * Options specifies zero or more fstab style mount options.
       * </pre>
       *
       * <code>repeated string options = 4;</code>
       */
      public com.google.protobuf.ByteString
          getOptionsBytes(int index) {
        return options_.getByteString(index);
      }
      /**
       * <pre>
       * Options specifies zero or more fstab style mount options.
       * </pre>
       *
       * <code>repeated string options = 4;</code>
       */
      public Builder setOptions(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOptionsIsMutable();
        options_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Options specifies zero or more fstab style mount options.
       * </pre>
       *
       * <code>repeated string options = 4;</code>
       */
      public Builder addOptions(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureOptionsIsMutable();
        options_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Options specifies zero or more fstab style mount options.
       * </pre>
       *
       * <code>repeated string options = 4;</code>
       */
      public Builder addAllOptions(
          Iterable<String> values) {
        ensureOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, options_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Options specifies zero or more fstab style mount options.
       * </pre>
       *
       * <code>repeated string options = 4;</code>
       */
      public Builder clearOptions() {
        options_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Options specifies zero or more fstab style mount options.
       * </pre>
       *
       * <code>repeated string options = 4;</code>
       */
      public Builder addOptionsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureOptionsIsMutable();
        options_.add(value);
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:containerd.types.Mount)
    }

    // @@protoc_insertion_point(class_scope:containerd.types.Mount)
    private static final Mount DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Mount();
    }

    public static Mount getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Mount>
        PARSER = new com.google.protobuf.AbstractParser<Mount>() {
      @Override
      public Mount parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Mount(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Mount> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Mount> getParserForType() {
      return PARSER;
    }

    @Override
    public Mount getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_containerd_types_Mount_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_containerd_types_Mount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n6github.com/containerd/containerd/api/t" +
      "ypes/mount.proto\022\020containerd.types\032\024gogo" +
      "proto/gogo.proto\"F\n\005Mount\022\014\n\004type\030\001 \001(\t\022" +
      "\016\n\006source\030\002 \001(\t\022\016\n\006target\030\003 \001(\t\022\017\n\007optio" +
      "ns\030\004 \003(\tB2Z0github.com/containerd/contai" +
      "nerd/api/types;typesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          GoGoProtos.getDescriptor(),
        }, assigner);
    internal_static_containerd_types_Mount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_containerd_types_Mount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_containerd_types_Mount_descriptor,
        new String[] { "Type", "Source", "Target", "Options", });
    GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
