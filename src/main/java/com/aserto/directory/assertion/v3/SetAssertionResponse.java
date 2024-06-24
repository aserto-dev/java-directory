// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/assertion/v3/assertion.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.assertion.v3;

/**
 * Protobuf type {@code aserto.directory.assertion.v3.SetAssertionResponse}
 */
public final class SetAssertionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.assertion.v3.SetAssertionResponse)
    SetAssertionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetAssertionResponse.newBuilder() to construct.
  private SetAssertionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetAssertionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetAssertionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.assertion.v3.AssertionProto.internal_static_aserto_directory_assertion_v3_SetAssertionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.assertion.v3.AssertionProto.internal_static_aserto_directory_assertion_v3_SetAssertionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.assertion.v3.SetAssertionResponse.class, com.aserto.directory.assertion.v3.SetAssertionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESULT_FIELD_NUMBER = 1;
  private com.aserto.directory.assertion.v3.Assert result_;
  /**
   * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  @java.lang.Override
  public com.aserto.directory.assertion.v3.Assert getResult() {
    return result_ == null ? com.aserto.directory.assertion.v3.Assert.getDefaultInstance() : result_;
  }
  /**
   * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.assertion.v3.AssertOrBuilder getResultOrBuilder() {
    return result_ == null ? com.aserto.directory.assertion.v3.Assert.getDefaultInstance() : result_;
  }

  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.assertion.v3.SetAssertionResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.assertion.v3.SetAssertionResponse prototype) {
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
   * Protobuf type {@code aserto.directory.assertion.v3.SetAssertionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.assertion.v3.SetAssertionResponse)
      com.aserto.directory.assertion.v3.SetAssertionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.assertion.v3.AssertionProto.internal_static_aserto_directory_assertion_v3_SetAssertionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.assertion.v3.AssertionProto.internal_static_aserto_directory_assertion_v3_SetAssertionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.assertion.v3.SetAssertionResponse.class, com.aserto.directory.assertion.v3.SetAssertionResponse.Builder.class);
    }

    // Construct using com.aserto.directory.assertion.v3.SetAssertionResponse.newBuilder()
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
      return com.aserto.directory.assertion.v3.AssertionProto.internal_static_aserto_directory_assertion_v3_SetAssertionResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.assertion.v3.SetAssertionResponse getDefaultInstanceForType() {
      return com.aserto.directory.assertion.v3.SetAssertionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.assertion.v3.SetAssertionResponse build() {
      com.aserto.directory.assertion.v3.SetAssertionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.assertion.v3.SetAssertionResponse buildPartial() {
      com.aserto.directory.assertion.v3.SetAssertionResponse result = new com.aserto.directory.assertion.v3.SetAssertionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.assertion.v3.SetAssertionResponse result) {
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

    private com.aserto.directory.assertion.v3.Assert result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.assertion.v3.Assert, com.aserto.directory.assertion.v3.Assert.Builder, com.aserto.directory.assertion.v3.AssertOrBuilder> resultBuilder_;
    /**
     * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
     * @return The result.
     */
    public com.aserto.directory.assertion.v3.Assert getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.aserto.directory.assertion.v3.Assert.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
     */
    public Builder setResult(com.aserto.directory.assertion.v3.Assert value) {
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
     * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
     */
    public Builder setResult(
        com.aserto.directory.assertion.v3.Assert.Builder builderForValue) {
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
     * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
     */
    public Builder mergeResult(com.aserto.directory.assertion.v3.Assert value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          result_ != null &&
          result_ != com.aserto.directory.assertion.v3.Assert.getDefaultInstance()) {
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
     * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
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
     * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
     */
    public com.aserto.directory.assertion.v3.Assert.Builder getResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
     */
    public com.aserto.directory.assertion.v3.AssertOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.aserto.directory.assertion.v3.Assert.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.aserto.directory.assertion.v3.Assert result = 1 [json_name = "result"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.assertion.v3.Assert, com.aserto.directory.assertion.v3.Assert.Builder, com.aserto.directory.assertion.v3.AssertOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.assertion.v3.Assert, com.aserto.directory.assertion.v3.Assert.Builder, com.aserto.directory.assertion.v3.AssertOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.assertion.v3.SetAssertionResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.assertion.v3.SetAssertionResponse)
  private static final com.aserto.directory.assertion.v3.SetAssertionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.assertion.v3.SetAssertionResponse();
  }

  public static com.aserto.directory.assertion.v3.SetAssertionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetAssertionResponse>
      PARSER = new com.google.protobuf.AbstractParser<SetAssertionResponse>() {
    @java.lang.Override
    public SetAssertionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetAssertionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetAssertionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.assertion.v3.SetAssertionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
