// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.writer.v2;

/**
 * Protobuf type {@code aserto.directory.writer.v2.SetObjectTypeResponse}
 */
public final class SetObjectTypeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.writer.v2.SetObjectTypeResponse)
    SetObjectTypeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetObjectTypeResponse.newBuilder() to construct.
  private SetObjectTypeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetObjectTypeResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetObjectTypeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectTypeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectTypeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.writer.v2.SetObjectTypeResponse.class, com.aserto.directory.writer.v2.SetObjectTypeResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESULT_FIELD_NUMBER = 1;
  private com.aserto.directory.common.v2.ObjectType result_;
  /**
   * <pre>
   * object type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * object type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectType getResult() {
    return result_ == null ? com.aserto.directory.common.v2.ObjectType.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * object type instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectTypeOrBuilder getResultOrBuilder() {
    return result_ == null ? com.aserto.directory.common.v2.ObjectType.getDefaultInstance() : result_;
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
    if (!(obj instanceof com.aserto.directory.writer.v2.SetObjectTypeResponse)) {
      return super.equals(obj);
    }
    com.aserto.directory.writer.v2.SetObjectTypeResponse other = (com.aserto.directory.writer.v2.SetObjectTypeResponse) obj;

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

  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v2.SetObjectTypeResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.writer.v2.SetObjectTypeResponse prototype) {
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
   * Protobuf type {@code aserto.directory.writer.v2.SetObjectTypeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.writer.v2.SetObjectTypeResponse)
      com.aserto.directory.writer.v2.SetObjectTypeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectTypeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectTypeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.writer.v2.SetObjectTypeResponse.class, com.aserto.directory.writer.v2.SetObjectTypeResponse.Builder.class);
    }

    // Construct using com.aserto.directory.writer.v2.SetObjectTypeResponse.newBuilder()
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
      return com.aserto.directory.writer.v2.WriterProto.internal_static_aserto_directory_writer_v2_SetObjectTypeResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetObjectTypeResponse getDefaultInstanceForType() {
      return com.aserto.directory.writer.v2.SetObjectTypeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetObjectTypeResponse build() {
      com.aserto.directory.writer.v2.SetObjectTypeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v2.SetObjectTypeResponse buildPartial() {
      com.aserto.directory.writer.v2.SetObjectTypeResponse result = new com.aserto.directory.writer.v2.SetObjectTypeResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.writer.v2.SetObjectTypeResponse result) {
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
      if (other instanceof com.aserto.directory.writer.v2.SetObjectTypeResponse) {
        return mergeFrom((com.aserto.directory.writer.v2.SetObjectTypeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.directory.writer.v2.SetObjectTypeResponse other) {
      if (other == com.aserto.directory.writer.v2.SetObjectTypeResponse.getDefaultInstance()) return this;
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

    private com.aserto.directory.common.v2.ObjectType result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectType, com.aserto.directory.common.v2.ObjectType.Builder, com.aserto.directory.common.v2.ObjectTypeOrBuilder> resultBuilder_;
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
     * @return The result.
     */
    public com.aserto.directory.common.v2.ObjectType getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.aserto.directory.common.v2.ObjectType.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
     */
    public Builder setResult(com.aserto.directory.common.v2.ObjectType value) {
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
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
     */
    public Builder setResult(
        com.aserto.directory.common.v2.ObjectType.Builder builderForValue) {
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
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
     */
    public Builder mergeResult(com.aserto.directory.common.v2.ObjectType value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          result_ != null &&
          result_ != com.aserto.directory.common.v2.ObjectType.getDefaultInstance()) {
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
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
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
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
     */
    public com.aserto.directory.common.v2.ObjectType.Builder getResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
     */
    public com.aserto.directory.common.v2.ObjectTypeOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.aserto.directory.common.v2.ObjectType.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * object type instance
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectType result = 1 [json_name = "result"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectType, com.aserto.directory.common.v2.ObjectType.Builder, com.aserto.directory.common.v2.ObjectTypeOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.ObjectType, com.aserto.directory.common.v2.ObjectType.Builder, com.aserto.directory.common.v2.ObjectTypeOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.writer.v2.SetObjectTypeResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.writer.v2.SetObjectTypeResponse)
  private static final com.aserto.directory.writer.v2.SetObjectTypeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.writer.v2.SetObjectTypeResponse();
  }

  public static com.aserto.directory.writer.v2.SetObjectTypeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetObjectTypeResponse>
      PARSER = new com.google.protobuf.AbstractParser<SetObjectTypeResponse>() {
    @java.lang.Override
    public SetObjectTypeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetObjectTypeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetObjectTypeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.writer.v2.SetObjectTypeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

