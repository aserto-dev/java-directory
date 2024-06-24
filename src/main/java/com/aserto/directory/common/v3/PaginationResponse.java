// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v3/common.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.common.v3;

/**
 * <pre>
 * Pagination response
 * </pre>
 *
 * Protobuf type {@code aserto.directory.common.v3.PaginationResponse}
 */
public final class PaginationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.common.v3.PaginationResponse)
    PaginationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PaginationResponse.newBuilder() to construct.
  private PaginationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PaginationResponse() {
    nextToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PaginationResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.common.v3.CommonProto.internal_static_aserto_directory_common_v3_PaginationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.common.v3.CommonProto.internal_static_aserto_directory_common_v3_PaginationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.common.v3.PaginationResponse.class, com.aserto.directory.common.v3.PaginationResponse.Builder.class);
  }

  public static final int NEXT_TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextToken_ = "";
  /**
   * <pre>
   * next page token, when empty there are no more pages to fetch
   * </pre>
   *
   * <code>string next_token = 1 [json_name = "nextToken", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The nextToken.
   */
  @java.lang.Override
  public java.lang.String getNextToken() {
    java.lang.Object ref = nextToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * next page token, when empty there are no more pages to fetch
   * </pre>
   *
   * <code>string next_token = 1 [json_name = "nextToken", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for nextToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextTokenBytes() {
    java.lang.Object ref = nextToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nextToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nextToken_);
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
    if (!(obj instanceof com.aserto.directory.common.v3.PaginationResponse)) {
      return super.equals(obj);
    }
    com.aserto.directory.common.v3.PaginationResponse other = (com.aserto.directory.common.v3.PaginationResponse) obj;

    if (!getNextToken()
        .equals(other.getNextToken())) return false;
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
    hash = (37 * hash) + NEXT_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.directory.common.v3.PaginationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v3.PaginationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v3.PaginationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v3.PaginationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v3.PaginationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v3.PaginationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v3.PaginationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v3.PaginationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.common.v3.PaginationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.common.v3.PaginationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.common.v3.PaginationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v3.PaginationResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.common.v3.PaginationResponse prototype) {
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
   * <pre>
   * Pagination response
   * </pre>
   *
   * Protobuf type {@code aserto.directory.common.v3.PaginationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.common.v3.PaginationResponse)
      com.aserto.directory.common.v3.PaginationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.common.v3.CommonProto.internal_static_aserto_directory_common_v3_PaginationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.common.v3.CommonProto.internal_static_aserto_directory_common_v3_PaginationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.common.v3.PaginationResponse.class, com.aserto.directory.common.v3.PaginationResponse.Builder.class);
    }

    // Construct using com.aserto.directory.common.v3.PaginationResponse.newBuilder()
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
      nextToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.common.v3.CommonProto.internal_static_aserto_directory_common_v3_PaginationResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.common.v3.PaginationResponse getDefaultInstanceForType() {
      return com.aserto.directory.common.v3.PaginationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.common.v3.PaginationResponse build() {
      com.aserto.directory.common.v3.PaginationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.common.v3.PaginationResponse buildPartial() {
      com.aserto.directory.common.v3.PaginationResponse result = new com.aserto.directory.common.v3.PaginationResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.common.v3.PaginationResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nextToken_ = nextToken_;
      }
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
      if (other instanceof com.aserto.directory.common.v3.PaginationResponse) {
        return mergeFrom((com.aserto.directory.common.v3.PaginationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.directory.common.v3.PaginationResponse other) {
      if (other == com.aserto.directory.common.v3.PaginationResponse.getDefaultInstance()) return this;
      if (!other.getNextToken().isEmpty()) {
        nextToken_ = other.nextToken_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              nextToken_ = input.readStringRequireUtf8();
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

    private java.lang.Object nextToken_ = "";
    /**
     * <pre>
     * next page token, when empty there are no more pages to fetch
     * </pre>
     *
     * <code>string next_token = 1 [json_name = "nextToken", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The nextToken.
     */
    public java.lang.String getNextToken() {
      java.lang.Object ref = nextToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * next page token, when empty there are no more pages to fetch
     * </pre>
     *
     * <code>string next_token = 1 [json_name = "nextToken", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for nextToken.
     */
    public com.google.protobuf.ByteString
        getNextTokenBytes() {
      java.lang.Object ref = nextToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * next page token, when empty there are no more pages to fetch
     * </pre>
     *
     * <code>string next_token = 1 [json_name = "nextToken", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The nextToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token, when empty there are no more pages to fetch
     * </pre>
     *
     * <code>string next_token = 1 [json_name = "nextToken", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextToken() {
      nextToken_ = getDefaultInstance().getNextToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token, when empty there are no more pages to fetch
     * </pre>
     *
     * <code>string next_token = 1 [json_name = "nextToken", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for nextToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.common.v3.PaginationResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.common.v3.PaginationResponse)
  private static final com.aserto.directory.common.v3.PaginationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.common.v3.PaginationResponse();
  }

  public static com.aserto.directory.common.v3.PaginationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PaginationResponse>
      PARSER = new com.google.protobuf.AbstractParser<PaginationResponse>() {
    @java.lang.Override
    public PaginationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<PaginationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PaginationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.common.v3.PaginationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

