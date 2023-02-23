// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

package com.aserto.directory.writer.v2;

/**
 * Protobuf type {@code aserto.directory.writer.v2.DeleteObjectResponse}
 */
public final class DeleteObjectResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.writer.v2.DeleteObjectResponse)
    DeleteObjectResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteObjectResponse.newBuilder() to construct.
  private DeleteObjectResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteObjectResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteObjectResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteObjectResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteObjectResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.writer.v2.DeleteObjectResponse.class, com.aserto.directory.writer.v2.DeleteObjectResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private com.google.protobuf.Empty result_;
  /**
   * <pre>
   * empty result
   * </pre>
   *
   * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <pre>
   * empty result
   * </pre>
   *
   * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  @java.lang.Override
  public com.google.protobuf.Empty getResult() {
    return result_ == null ? com.google.protobuf.Empty.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * empty result
   * </pre>
   *
   * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.EmptyOrBuilder getResultOrBuilder() {
    return result_ == null ? com.google.protobuf.Empty.getDefaultInstance() : result_;
  }

  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.DeleteObjectResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.writer.v2.DeleteObjectResponse prototype) {
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
   * Protobuf type {@code aserto.directory.writer.v2.DeleteObjectResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.writer.v2.DeleteObjectResponse)
      com.aserto.directory.writer.v2.DeleteObjectResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteObjectResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteObjectResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.writer.v2.DeleteObjectResponse.class, com.aserto.directory.writer.v2.DeleteObjectResponse.Builder.class);
    }

    // Construct using com.aserto.directory.writer.v2.DeleteObjectResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

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
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteObjectResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.DeleteObjectResponse getDefaultInstanceForType() {
      return com.aserto.directory.writer.v2.DeleteObjectResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.DeleteObjectResponse build() {
      com.aserto.directory.writer.v2.DeleteObjectResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.DeleteObjectResponse buildPartial() {
      com.aserto.directory.writer.v2.DeleteObjectResponse result = new com.aserto.directory.writer.v2.DeleteObjectResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.writer.v2.DeleteObjectResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.result_ = resultBuilder_ == null
            ? result_
            : resultBuilder_.build();
      }
    }

    private int bitField0_;

    private com.google.protobuf.Empty result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Empty, com.google.protobuf.Empty.Builder, com.google.protobuf.EmptyOrBuilder> resultBuilder_;
    /**
     * <pre>
     * empty result
     * </pre>
     *
     * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * empty result
     * </pre>
     *
     * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
     * @return The result.
     */
    public com.google.protobuf.Empty getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.google.protobuf.Empty.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * empty result
     * </pre>
     *
     * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
     */
    public Builder setResult(com.google.protobuf.Empty value) {
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
     * empty result
     * </pre>
     *
     * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
     */
    public Builder setResult(
        com.google.protobuf.Empty.Builder builderForValue) {
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
     * empty result
     * </pre>
     *
     * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
     */
    public Builder mergeResult(com.google.protobuf.Empty value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          result_ != null &&
          result_ != com.google.protobuf.Empty.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * empty result
     * </pre>
     *
     * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
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
     * empty result
     * </pre>
     *
     * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
     */
    public com.google.protobuf.Empty.Builder getResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * empty result
     * </pre>
     *
     * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
     */
    public com.google.protobuf.EmptyOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.google.protobuf.Empty.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * empty result
     * </pre>
     *
     * <code>.google.protobuf.Empty result = 1 [json_name = "result"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Empty, com.google.protobuf.Empty.Builder, com.google.protobuf.EmptyOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Empty, com.google.protobuf.Empty.Builder, com.google.protobuf.EmptyOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.writer.v2.DeleteObjectResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.writer.v2.DeleteObjectResponse)
  private static final com.aserto.directory.writer.v2.DeleteObjectResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.writer.v2.DeleteObjectResponse();
  }

  public static com.aserto.directory.writer.v2.DeleteObjectResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteObjectResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeleteObjectResponse>() {
    @java.lang.Override
    public DeleteObjectResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteObjectResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteObjectResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.writer.v2.DeleteObjectResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

