// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.writer.v2;

/**
 * Protobuf type {@code aserto.directory.writer.v2.SetObjectTypeRequest}
 */
public final class SetObjectTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.writer.v2.SetObjectTypeRequest)
    SetObjectTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetObjectTypeRequest.newBuilder() to construct.
  private SetObjectTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetObjectTypeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetObjectTypeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.writer.v2.SetObjectTypeRequest.class, com.aserto.directory.writer.v2.SetObjectTypeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int OBJECT_TYPE_FIELD_NUMBER = 1;
  private com.aserto.directory.common.v2.ObjectType objectType_;
  /**
   * <pre>
   * object type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
   * @return Whether the objectType field is set.
   */
  @java.lang.Override
  public boolean hasObjectType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * object type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
   * @return The objectType.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectType getObjectType() {
    return objectType_ == null ? com.aserto.directory.common.v2.ObjectType.getDefaultInstance() : objectType_;
  }
  /**
   * <pre>
   * object type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectTypeOrBuilder getObjectTypeOrBuilder() {
    return objectType_ == null ? com.aserto.directory.common.v2.ObjectType.getDefaultInstance() : objectType_;
  }

  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aserto.directory.writer.v2.SetObjectTypeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code aserto.directory.writer.v2.SetObjectTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.writer.v2.SetObjectTypeRequest)
      com.aserto.directory.writer.v2.SetObjectTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.writer.v2.SetObjectTypeRequest.class, com.aserto.directory.writer.v2.SetObjectTypeRequest.Builder.class);
    }

    // Construct using com.aserto.directory.writer.v2.SetObjectTypeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getObjectTypeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      objectType_ = null;
      if (objectTypeBuilder_ != null) {
        objectTypeBuilder_.dispose();
        objectTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetObjectTypeRequest getDefaultInstanceForType() {
      return com.aserto.directory.writer.v2.SetObjectTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetObjectTypeRequest build() {
      com.aserto.directory.writer.v2.SetObjectTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetObjectTypeRequest buildPartial() {
      com.aserto.directory.writer.v2.SetObjectTypeRequest result = new com.aserto.directory.writer.v2.SetObjectTypeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.writer.v2.SetObjectTypeRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectType_ = objectTypeBuilder_ == null
            ? objectType_
            : objectTypeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private com.aserto.directory.common.v2.ObjectType objectType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectType, com.aserto.directory.common.v2.ObjectType.Builder, com.aserto.directory.common.v2.ObjectTypeOrBuilder> objectTypeBuilder_;
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @return Whether the objectType field is set.
     */
    public boolean hasObjectType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
     * @return The objectType.
     */
    public com.aserto.directory.common.v2.ObjectType getObjectType() {
      if (objectTypeBuilder_ == null) {
        return objectType_ == null ? com.aserto.directory.common.v2.ObjectType.getDefaultInstance() : objectType_;
      } else {
        return objectTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
     */
    public Builder setObjectType(com.aserto.directory.common.v2.ObjectType value) {
      if (objectTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        objectType_ = value;
      } else {
        objectTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
     */
    public Builder setObjectType(
        com.aserto.directory.common.v2.ObjectType.Builder builderForValue) {
      if (objectTypeBuilder_ == null) {
        objectType_ = builderForValue.build();
      } else {
        objectTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
     */
    public Builder mergeObjectType(com.aserto.directory.common.v2.ObjectType value) {
      if (objectTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          objectType_ != null &&
          objectType_ != com.aserto.directory.common.v2.ObjectType.getDefaultInstance()) {
          getObjectTypeBuilder().mergeFrom(value);
        } else {
          objectType_ = value;
        }
      } else {
        objectTypeBuilder_.mergeFrom(value);
      }
      if (objectType_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
     */
    public Builder clearObjectType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      objectType_ = null;
      if (objectTypeBuilder_ != null) {
        objectTypeBuilder_.dispose();
        objectTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
     */
    public com.aserto.directory.common.v2.ObjectType.Builder getObjectTypeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getObjectTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
     */
    public com.aserto.directory.common.v2.ObjectTypeOrBuilder getObjectTypeOrBuilder() {
      if (objectTypeBuilder_ != null) {
        return objectTypeBuilder_.getMessageOrBuilder();
      } else {
        return objectType_ == null ?
            com.aserto.directory.common.v2.ObjectType.getDefaultInstance() : objectType_;
      }
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType object_type = 1 [json_name = "objectType"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectType, com.aserto.directory.common.v2.ObjectType.Builder, com.aserto.directory.common.v2.ObjectTypeOrBuilder> 
        getObjectTypeFieldBuilder() {
      if (objectTypeBuilder_ == null) {
        objectTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.ObjectType, com.aserto.directory.common.v2.ObjectType.Builder, com.aserto.directory.common.v2.ObjectTypeOrBuilder>(
                getObjectType(),
                getParentForChildren(),
                isClean());
        objectType_ = null;
      }
      return objectTypeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:aserto.directory.writer.v2.SetObjectTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.writer.v2.SetObjectTypeRequest)
  private static final com.aserto.directory.writer.v2.SetObjectTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.writer.v2.SetObjectTypeRequest();
  }

  public static com.aserto.directory.writer.v2.SetObjectTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetObjectTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetObjectTypeRequest>() {
    @java.lang.Override
    public SetObjectTypeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SetObjectTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetObjectTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.writer.v2.SetObjectTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

