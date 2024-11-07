// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/importer/v3/importer.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.importer.v3;

/**
 * Protobuf type {@code aserto.directory.importer.v3.ImportStatus}
 */
public final class ImportStatus extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aserto.directory.importer.v3.ImportStatus)
    ImportStatusOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      ImportStatus.class.getName());
  }
  // Use ImportStatus.newBuilder() to construct.
  private ImportStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ImportStatus() {
    msg_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.importer.v3.ImporterProto.internal_static_aserto_directory_importer_v3_ImportStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.importer.v3.ImporterProto.internal_static_aserto_directory_importer_v3_ImportStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.importer.v3.ImportStatus.class, com.aserto.directory.importer.v3.ImportStatus.Builder.class);
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  private int code_ = 0;
  /**
   * <pre>
   * gRPC status code (google.golang.org/grpc/codes)
   * </pre>
   *
   * <code>uint32 code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  @java.lang.Override
  public int getCode() {
    return code_;
  }

  public static final int MSG_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object msg_ = "";
  /**
   * <pre>
   * gRPC status message (google.golang.org/grpc/status)
   * </pre>
   *
   * <code>string msg = 2 [json_name = "msg"];</code>
   * @return The msg.
   */
  @java.lang.Override
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * gRPC status message (google.golang.org/grpc/status)
   * </pre>
   *
   * <code>string msg = 2 [json_name = "msg"];</code>
   * @return The bytes for msg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQ_FIELD_NUMBER = 3;
  private com.aserto.directory.importer.v3.ImportRequest req_;
  /**
   * <pre>
   * req contains the original import request message
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
   * @return Whether the req field is set.
   */
  @java.lang.Override
  public boolean hasReq() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * req contains the original import request message
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
   * @return The req.
   */
  @java.lang.Override
  public com.aserto.directory.importer.v3.ImportRequest getReq() {
    return req_ == null ? com.aserto.directory.importer.v3.ImportRequest.getDefaultInstance() : req_;
  }
  /**
   * <pre>
   * req contains the original import request message
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.importer.v3.ImportRequestOrBuilder getReqOrBuilder() {
    return req_ == null ? com.aserto.directory.importer.v3.ImportRequest.getDefaultInstance() : req_;
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
    if (code_ != 0) {
      output.writeUInt32(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(msg_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, msg_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getReq());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(msg_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, msg_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getReq());
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
    if (!(obj instanceof com.aserto.directory.importer.v3.ImportStatus)) {
      return super.equals(obj);
    }
    com.aserto.directory.importer.v3.ImportStatus other = (com.aserto.directory.importer.v3.ImportStatus) obj;

    if (getCode()
        != other.getCode()) return false;
    if (!getMsg()
        .equals(other.getMsg())) return false;
    if (hasReq() != other.hasReq()) return false;
    if (hasReq()) {
      if (!getReq()
          .equals(other.getReq())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    if (hasReq()) {
      hash = (37 * hash) + REQ_FIELD_NUMBER;
      hash = (53 * hash) + getReq().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.directory.importer.v3.ImportStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.importer.v3.ImportStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.importer.v3.ImportStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.importer.v3.ImportStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.importer.v3.ImportStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.importer.v3.ImportStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.importer.v3.ImportStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.importer.v3.ImportStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.importer.v3.ImportStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.importer.v3.ImportStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.importer.v3.ImportStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.importer.v3.ImportStatus parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aserto.directory.importer.v3.ImportStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code aserto.directory.importer.v3.ImportStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.importer.v3.ImportStatus)
      com.aserto.directory.importer.v3.ImportStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.importer.v3.ImporterProto.internal_static_aserto_directory_importer_v3_ImportStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.importer.v3.ImporterProto.internal_static_aserto_directory_importer_v3_ImportStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.importer.v3.ImportStatus.class, com.aserto.directory.importer.v3.ImportStatus.Builder.class);
    }

    // Construct using com.aserto.directory.importer.v3.ImportStatus.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getReqFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      code_ = 0;
      msg_ = "";
      req_ = null;
      if (reqBuilder_ != null) {
        reqBuilder_.dispose();
        reqBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.importer.v3.ImporterProto.internal_static_aserto_directory_importer_v3_ImportStatus_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.importer.v3.ImportStatus getDefaultInstanceForType() {
      return com.aserto.directory.importer.v3.ImportStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.importer.v3.ImportStatus build() {
      com.aserto.directory.importer.v3.ImportStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.importer.v3.ImportStatus buildPartial() {
      com.aserto.directory.importer.v3.ImportStatus result = new com.aserto.directory.importer.v3.ImportStatus(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.importer.v3.ImportStatus result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.code_ = code_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.msg_ = msg_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.req_ = reqBuilder_ == null
            ? req_
            : reqBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aserto.directory.importer.v3.ImportStatus) {
        return mergeFrom((com.aserto.directory.importer.v3.ImportStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.directory.importer.v3.ImportStatus other) {
      if (other == com.aserto.directory.importer.v3.ImportStatus.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasReq()) {
        mergeReq(other.getReq());
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
            case 8: {
              code_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              msg_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getReqFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int code_ ;
    /**
     * <pre>
     * gRPC status code (google.golang.org/grpc/codes)
     * </pre>
     *
     * <code>uint32 code = 1 [json_name = "code"];</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }
    /**
     * <pre>
     * gRPC status code (google.golang.org/grpc/codes)
     * </pre>
     *
     * <code>uint32 code = 1 [json_name = "code"];</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(int value) {

      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * gRPC status code (google.golang.org/grpc/codes)
     * </pre>
     *
     * <code>uint32 code = 1 [json_name = "code"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <pre>
     * gRPC status message (google.golang.org/grpc/status)
     * </pre>
     *
     * <code>string msg = 2 [json_name = "msg"];</code>
     * @return The msg.
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * gRPC status message (google.golang.org/grpc/status)
     * </pre>
     *
     * <code>string msg = 2 [json_name = "msg"];</code>
     * @return The bytes for msg.
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * gRPC status message (google.golang.org/grpc/status)
     * </pre>
     *
     * <code>string msg = 2 [json_name = "msg"];</code>
     * @param value The msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      msg_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * gRPC status message (google.golang.org/grpc/status)
     * </pre>
     *
     * <code>string msg = 2 [json_name = "msg"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMsg() {
      msg_ = getDefaultInstance().getMsg();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * gRPC status message (google.golang.org/grpc/status)
     * </pre>
     *
     * <code>string msg = 2 [json_name = "msg"];</code>
     * @param value The bytes for msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      msg_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.aserto.directory.importer.v3.ImportRequest req_;
    private com.google.protobuf.SingleFieldBuilder<
        com.aserto.directory.importer.v3.ImportRequest, com.aserto.directory.importer.v3.ImportRequest.Builder, com.aserto.directory.importer.v3.ImportRequestOrBuilder> reqBuilder_;
    /**
     * <pre>
     * req contains the original import request message
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
     * @return Whether the req field is set.
     */
    public boolean hasReq() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * req contains the original import request message
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
     * @return The req.
     */
    public com.aserto.directory.importer.v3.ImportRequest getReq() {
      if (reqBuilder_ == null) {
        return req_ == null ? com.aserto.directory.importer.v3.ImportRequest.getDefaultInstance() : req_;
      } else {
        return reqBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * req contains the original import request message
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
     */
    public Builder setReq(com.aserto.directory.importer.v3.ImportRequest value) {
      if (reqBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        req_ = value;
      } else {
        reqBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * req contains the original import request message
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
     */
    public Builder setReq(
        com.aserto.directory.importer.v3.ImportRequest.Builder builderForValue) {
      if (reqBuilder_ == null) {
        req_ = builderForValue.build();
      } else {
        reqBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * req contains the original import request message
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
     */
    public Builder mergeReq(com.aserto.directory.importer.v3.ImportRequest value) {
      if (reqBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          req_ != null &&
          req_ != com.aserto.directory.importer.v3.ImportRequest.getDefaultInstance()) {
          getReqBuilder().mergeFrom(value);
        } else {
          req_ = value;
        }
      } else {
        reqBuilder_.mergeFrom(value);
      }
      if (req_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * req contains the original import request message
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
     */
    public Builder clearReq() {
      bitField0_ = (bitField0_ & ~0x00000004);
      req_ = null;
      if (reqBuilder_ != null) {
        reqBuilder_.dispose();
        reqBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * req contains the original import request message
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
     */
    public com.aserto.directory.importer.v3.ImportRequest.Builder getReqBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getReqFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * req contains the original import request message
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
     */
    public com.aserto.directory.importer.v3.ImportRequestOrBuilder getReqOrBuilder() {
      if (reqBuilder_ != null) {
        return reqBuilder_.getMessageOrBuilder();
      } else {
        return req_ == null ?
            com.aserto.directory.importer.v3.ImportRequest.getDefaultInstance() : req_;
      }
    }
    /**
     * <pre>
     * req contains the original import request message
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.aserto.directory.importer.v3.ImportRequest, com.aserto.directory.importer.v3.ImportRequest.Builder, com.aserto.directory.importer.v3.ImportRequestOrBuilder> 
        getReqFieldBuilder() {
      if (reqBuilder_ == null) {
        reqBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.aserto.directory.importer.v3.ImportRequest, com.aserto.directory.importer.v3.ImportRequest.Builder, com.aserto.directory.importer.v3.ImportRequestOrBuilder>(
                getReq(),
                getParentForChildren(),
                isClean());
        req_ = null;
      }
      return reqBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:aserto.directory.importer.v3.ImportStatus)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.importer.v3.ImportStatus)
  private static final com.aserto.directory.importer.v3.ImportStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.importer.v3.ImportStatus();
  }

  public static com.aserto.directory.importer.v3.ImportStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportStatus>
      PARSER = new com.google.protobuf.AbstractParser<ImportStatus>() {
    @java.lang.Override
    public ImportStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.importer.v3.ImportStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

