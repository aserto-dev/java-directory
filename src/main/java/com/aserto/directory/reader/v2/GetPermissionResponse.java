// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.GetPermissionResponse}
 */
public final class GetPermissionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.GetPermissionResponse)
    GetPermissionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPermissionResponse.newBuilder() to construct.
  private GetPermissionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPermissionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPermissionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetPermissionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetPermissionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetPermissionResponse.class, com.aserto.directory.reader.v2.GetPermissionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESULT_FIELD_NUMBER = 1;
  private com.aserto.directory.common.v2.Permission result_;
  /**
   * <pre>
   * permission instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * permission instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.Permission getResult() {
    return result_ == null ? com.aserto.directory.common.v2.Permission.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * permission instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.PermissionOrBuilder getResultOrBuilder() {
    return result_ == null ? com.aserto.directory.common.v2.Permission.getDefaultInstance() : result_;
  }

  public static com.aserto.directory.reader.v2.GetPermissionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetPermissionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetPermissionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetPermissionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetPermissionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetPermissionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetPermissionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetPermissionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.reader.v2.GetPermissionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.reader.v2.GetPermissionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetPermissionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetPermissionResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.GetPermissionResponse prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.GetPermissionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.GetPermissionResponse)
      com.aserto.directory.reader.v2.GetPermissionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetPermissionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetPermissionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.GetPermissionResponse.class, com.aserto.directory.reader.v2.GetPermissionResponse.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.GetPermissionResponse.newBuilder()
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
        getResultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetPermissionResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetPermissionResponse getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.GetPermissionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetPermissionResponse build() {
      com.aserto.directory.reader.v2.GetPermissionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetPermissionResponse buildPartial() {
      com.aserto.directory.reader.v2.GetPermissionResponse result = new com.aserto.directory.reader.v2.GetPermissionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.reader.v2.GetPermissionResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.result_ = resultBuilder_ == null
            ? result_
            : resultBuilder_.build();
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

    private com.aserto.directory.common.v2.Permission result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.Permission, com.aserto.directory.common.v2.Permission.Builder, com.aserto.directory.common.v2.PermissionOrBuilder> resultBuilder_;
    /**
     * <pre>
     * permission instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * permission instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
     * @return The result.
     */
    public com.aserto.directory.common.v2.Permission getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.aserto.directory.common.v2.Permission.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * permission instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
     */
    public Builder setResult(com.aserto.directory.common.v2.Permission value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * permission instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
     */
    public Builder setResult(
        com.aserto.directory.common.v2.Permission.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * permission instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
     */
    public Builder mergeResult(com.aserto.directory.common.v2.Permission value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          result_ != null &&
          result_ != com.aserto.directory.common.v2.Permission.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      if (result_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * permission instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * permission instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
     */
    public com.aserto.directory.common.v2.Permission.Builder getResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * permission instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
     */
    public com.aserto.directory.common.v2.PermissionOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.aserto.directory.common.v2.Permission.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * permission instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.Permission, com.aserto.directory.common.v2.Permission.Builder, com.aserto.directory.common.v2.PermissionOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.Permission, com.aserto.directory.common.v2.Permission.Builder, com.aserto.directory.common.v2.PermissionOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.GetPermissionResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.GetPermissionResponse)
  private static final com.aserto.directory.reader.v2.GetPermissionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.GetPermissionResponse();
  }

  public static com.aserto.directory.reader.v2.GetPermissionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPermissionResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPermissionResponse>() {
    @java.lang.Override
    public GetPermissionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPermissionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPermissionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.GetPermissionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

