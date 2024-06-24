// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.writer.v2;

/**
 * Protobuf type {@code aserto.directory.writer.v2.DeleteRelationTypeResponse}
 */
public final class DeleteRelationTypeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.writer.v2.DeleteRelationTypeResponse)
    DeleteRelationTypeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteRelationTypeResponse.newBuilder() to construct.
  private DeleteRelationTypeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteRelationTypeResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteRelationTypeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteRelationTypeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteRelationTypeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.writer.v2.DeleteRelationTypeResponse.class, com.aserto.directory.writer.v2.DeleteRelationTypeResponse.Builder.class);
  }

  private int bitField0_;
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

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResult());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.aserto.directory.writer.v2.DeleteRelationTypeResponse)) {
      return super.equals(obj);
    }
    com.aserto.directory.writer.v2.DeleteRelationTypeResponse other = (com.aserto.directory.writer.v2.DeleteRelationTypeResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.writer.v2.DeleteRelationTypeResponse prototype) {
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
   * Protobuf type {@code aserto.directory.writer.v2.DeleteRelationTypeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.writer.v2.DeleteRelationTypeResponse)
      com.aserto.directory.writer.v2.DeleteRelationTypeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteRelationTypeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteRelationTypeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.writer.v2.DeleteRelationTypeResponse.class, com.aserto.directory.writer.v2.DeleteRelationTypeResponse.Builder.class);
    }

    // Construct using com.aserto.directory.writer.v2.DeleteRelationTypeResponse.newBuilder()
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
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_DeleteRelationTypeResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.DeleteRelationTypeResponse getDefaultInstanceForType() {
      return com.aserto.directory.writer.v2.DeleteRelationTypeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.DeleteRelationTypeResponse build() {
      com.aserto.directory.writer.v2.DeleteRelationTypeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.DeleteRelationTypeResponse buildPartial() {
      com.aserto.directory.writer.v2.DeleteRelationTypeResponse result = new com.aserto.directory.writer.v2.DeleteRelationTypeResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.writer.v2.DeleteRelationTypeResponse result) {
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
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aserto.directory.writer.v2.DeleteRelationTypeResponse) {
        return mergeFrom((com.aserto.directory.writer.v2.DeleteRelationTypeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.directory.writer.v2.DeleteRelationTypeResponse other) {
      if (other == com.aserto.directory.writer.v2.DeleteRelationTypeResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getResultFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
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
      if (result_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.writer.v2.DeleteRelationTypeResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.writer.v2.DeleteRelationTypeResponse)
  private static final com.aserto.directory.writer.v2.DeleteRelationTypeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.writer.v2.DeleteRelationTypeResponse();
  }

  public static com.aserto.directory.writer.v2.DeleteRelationTypeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRelationTypeResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeleteRelationTypeResponse>() {
    @java.lang.Override
    public DeleteRelationTypeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteRelationTypeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRelationTypeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.writer.v2.DeleteRelationTypeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

