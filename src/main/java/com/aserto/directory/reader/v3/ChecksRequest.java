// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v3/reader.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.reader.v3;

/**
 * <pre>
 * EXPERIMENTAL
 * </pre>
 *
 * Protobuf type {@code aserto.directory.reader.v3.ChecksRequest}
 */
public final class ChecksRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v3.ChecksRequest)
    ChecksRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChecksRequest.newBuilder() to construct.
  private ChecksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChecksRequest() {
    checks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChecksRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v3.ReaderProto.internal_static_aserto_directory_reader_v3_ChecksRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v3.ReaderProto.internal_static_aserto_directory_reader_v3_ChecksRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v3.ChecksRequest.class, com.aserto.directory.reader.v3.ChecksRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DEFAULT_FIELD_NUMBER = 1;
  private com.aserto.directory.reader.v3.CheckRequest default_;
  /**
   * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
   * @return Whether the default field is set.
   */
  @java.lang.Override
  public boolean hasDefault() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
   * @return The default.
   */
  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckRequest getDefault() {
    return default_ == null ? com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance() : default_;
  }
  /**
   * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckRequestOrBuilder getDefaultOrBuilder() {
    return default_ == null ? com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance() : default_;
  }

  public static final int CHECKS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.aserto.directory.reader.v3.CheckRequest> checks_;
  /**
   * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aserto.directory.reader.v3.CheckRequest> getChecksList() {
    return checks_;
  }
  /**
   * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aserto.directory.reader.v3.CheckRequestOrBuilder> 
      getChecksOrBuilderList() {
    return checks_;
  }
  /**
   * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
   */
  @java.lang.Override
  public int getChecksCount() {
    return checks_.size();
  }
  /**
   * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckRequest getChecks(int index) {
    return checks_.get(index);
  }
  /**
   * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckRequestOrBuilder getChecksOrBuilder(
      int index) {
    return checks_.get(index);
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
      output.writeMessage(1, getDefault());
    }
    for (int i = 0; i < checks_.size(); i++) {
      output.writeMessage(2, checks_.get(i));
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
        .computeMessageSize(1, getDefault());
    }
    for (int i = 0; i < checks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, checks_.get(i));
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
    if (!(obj instanceof com.aserto.directory.reader.v3.ChecksRequest)) {
      return super.equals(obj);
    }
    com.aserto.directory.reader.v3.ChecksRequest other = (com.aserto.directory.reader.v3.ChecksRequest) obj;

    if (hasDefault() != other.hasDefault()) return false;
    if (hasDefault()) {
      if (!getDefault()
          .equals(other.getDefault())) return false;
    }
    if (!getChecksList()
        .equals(other.getChecksList())) return false;
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
    if (hasDefault()) {
      hash = (37 * hash) + DEFAULT_FIELD_NUMBER;
      hash = (53 * hash) + getDefault().hashCode();
    }
    if (getChecksCount() > 0) {
      hash = (37 * hash) + CHECKS_FIELD_NUMBER;
      hash = (53 * hash) + getChecksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.directory.reader.v3.ChecksRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v3.ChecksRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v3.ChecksRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v3.ChecksRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v3.ChecksRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v3.ChecksRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v3.ChecksRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v3.ChecksRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.reader.v3.ChecksRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.reader.v3.ChecksRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v3.ChecksRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v3.ChecksRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v3.ChecksRequest prototype) {
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
   * EXPERIMENTAL
   * </pre>
   *
   * Protobuf type {@code aserto.directory.reader.v3.ChecksRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v3.ChecksRequest)
      com.aserto.directory.reader.v3.ChecksRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v3.ReaderProto.internal_static_aserto_directory_reader_v3_ChecksRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v3.ReaderProto.internal_static_aserto_directory_reader_v3_ChecksRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v3.ChecksRequest.class, com.aserto.directory.reader.v3.ChecksRequest.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v3.ChecksRequest.newBuilder()
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
        getDefaultFieldBuilder();
        getChecksFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      default_ = null;
      if (defaultBuilder_ != null) {
        defaultBuilder_.dispose();
        defaultBuilder_ = null;
      }
      if (checksBuilder_ == null) {
        checks_ = java.util.Collections.emptyList();
      } else {
        checks_ = null;
        checksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v3.ReaderProto.internal_static_aserto_directory_reader_v3_ChecksRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v3.ChecksRequest getDefaultInstanceForType() {
      return com.aserto.directory.reader.v3.ChecksRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v3.ChecksRequest build() {
      com.aserto.directory.reader.v3.ChecksRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v3.ChecksRequest buildPartial() {
      com.aserto.directory.reader.v3.ChecksRequest result = new com.aserto.directory.reader.v3.ChecksRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aserto.directory.reader.v3.ChecksRequest result) {
      if (checksBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          checks_ = java.util.Collections.unmodifiableList(checks_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.checks_ = checks_;
      } else {
        result.checks_ = checksBuilder_.build();
      }
    }

    private void buildPartial0(com.aserto.directory.reader.v3.ChecksRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.default_ = defaultBuilder_ == null
            ? default_
            : defaultBuilder_.build();
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
      if (other instanceof com.aserto.directory.reader.v3.ChecksRequest) {
        return mergeFrom((com.aserto.directory.reader.v3.ChecksRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.directory.reader.v3.ChecksRequest other) {
      if (other == com.aserto.directory.reader.v3.ChecksRequest.getDefaultInstance()) return this;
      if (other.hasDefault()) {
        mergeDefault(other.getDefault());
      }
      if (checksBuilder_ == null) {
        if (!other.checks_.isEmpty()) {
          if (checks_.isEmpty()) {
            checks_ = other.checks_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureChecksIsMutable();
            checks_.addAll(other.checks_);
          }
          onChanged();
        }
      } else {
        if (!other.checks_.isEmpty()) {
          if (checksBuilder_.isEmpty()) {
            checksBuilder_.dispose();
            checksBuilder_ = null;
            checks_ = other.checks_;
            bitField0_ = (bitField0_ & ~0x00000002);
            checksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getChecksFieldBuilder() : null;
          } else {
            checksBuilder_.addAllMessages(other.checks_);
          }
        }
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
                  getDefaultFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.aserto.directory.reader.v3.CheckRequest m =
                  input.readMessage(
                      com.aserto.directory.reader.v3.CheckRequest.parser(),
                      extensionRegistry);
              if (checksBuilder_ == null) {
                ensureChecksIsMutable();
                checks_.add(m);
              } else {
                checksBuilder_.addMessage(m);
              }
              break;
            } // case 18
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

    private com.aserto.directory.reader.v3.CheckRequest default_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckRequest.Builder, com.aserto.directory.reader.v3.CheckRequestOrBuilder> defaultBuilder_;
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
     * @return Whether the default field is set.
     */
    public boolean hasDefault() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
     * @return The default.
     */
    public com.aserto.directory.reader.v3.CheckRequest getDefault() {
      if (defaultBuilder_ == null) {
        return default_ == null ? com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance() : default_;
      } else {
        return defaultBuilder_.getMessage();
      }
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
     */
    public Builder setDefault(com.aserto.directory.reader.v3.CheckRequest value) {
      if (defaultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        default_ = value;
      } else {
        defaultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
     */
    public Builder setDefault(
        com.aserto.directory.reader.v3.CheckRequest.Builder builderForValue) {
      if (defaultBuilder_ == null) {
        default_ = builderForValue.build();
      } else {
        defaultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
     */
    public Builder mergeDefault(com.aserto.directory.reader.v3.CheckRequest value) {
      if (defaultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          default_ != null &&
          default_ != com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance()) {
          getDefaultBuilder().mergeFrom(value);
        } else {
          default_ = value;
        }
      } else {
        defaultBuilder_.mergeFrom(value);
      }
      if (default_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
     */
    public Builder clearDefault() {
      bitField0_ = (bitField0_ & ~0x00000001);
      default_ = null;
      if (defaultBuilder_ != null) {
        defaultBuilder_.dispose();
        defaultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
     */
    public com.aserto.directory.reader.v3.CheckRequest.Builder getDefaultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDefaultFieldBuilder().getBuilder();
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
     */
    public com.aserto.directory.reader.v3.CheckRequestOrBuilder getDefaultOrBuilder() {
      if (defaultBuilder_ != null) {
        return defaultBuilder_.getMessageOrBuilder();
      } else {
        return default_ == null ?
            com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance() : default_;
      }
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckRequest.Builder, com.aserto.directory.reader.v3.CheckRequestOrBuilder> 
        getDefaultFieldBuilder() {
      if (defaultBuilder_ == null) {
        defaultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckRequest.Builder, com.aserto.directory.reader.v3.CheckRequestOrBuilder>(
                getDefault(),
                getParentForChildren(),
                isClean());
        default_ = null;
      }
      return defaultBuilder_;
    }

    private java.util.List<com.aserto.directory.reader.v3.CheckRequest> checks_ =
      java.util.Collections.emptyList();
    private void ensureChecksIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        checks_ = new java.util.ArrayList<com.aserto.directory.reader.v3.CheckRequest>(checks_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckRequest.Builder, com.aserto.directory.reader.v3.CheckRequestOrBuilder> checksBuilder_;

    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public java.util.List<com.aserto.directory.reader.v3.CheckRequest> getChecksList() {
      if (checksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(checks_);
      } else {
        return checksBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public int getChecksCount() {
      if (checksBuilder_ == null) {
        return checks_.size();
      } else {
        return checksBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public com.aserto.directory.reader.v3.CheckRequest getChecks(int index) {
      if (checksBuilder_ == null) {
        return checks_.get(index);
      } else {
        return checksBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public Builder setChecks(
        int index, com.aserto.directory.reader.v3.CheckRequest value) {
      if (checksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChecksIsMutable();
        checks_.set(index, value);
        onChanged();
      } else {
        checksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public Builder setChecks(
        int index, com.aserto.directory.reader.v3.CheckRequest.Builder builderForValue) {
      if (checksBuilder_ == null) {
        ensureChecksIsMutable();
        checks_.set(index, builderForValue.build());
        onChanged();
      } else {
        checksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public Builder addChecks(com.aserto.directory.reader.v3.CheckRequest value) {
      if (checksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChecksIsMutable();
        checks_.add(value);
        onChanged();
      } else {
        checksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public Builder addChecks(
        int index, com.aserto.directory.reader.v3.CheckRequest value) {
      if (checksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChecksIsMutable();
        checks_.add(index, value);
        onChanged();
      } else {
        checksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public Builder addChecks(
        com.aserto.directory.reader.v3.CheckRequest.Builder builderForValue) {
      if (checksBuilder_ == null) {
        ensureChecksIsMutable();
        checks_.add(builderForValue.build());
        onChanged();
      } else {
        checksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public Builder addChecks(
        int index, com.aserto.directory.reader.v3.CheckRequest.Builder builderForValue) {
      if (checksBuilder_ == null) {
        ensureChecksIsMutable();
        checks_.add(index, builderForValue.build());
        onChanged();
      } else {
        checksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public Builder addAllChecks(
        java.lang.Iterable<? extends com.aserto.directory.reader.v3.CheckRequest> values) {
      if (checksBuilder_ == null) {
        ensureChecksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, checks_);
        onChanged();
      } else {
        checksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public Builder clearChecks() {
      if (checksBuilder_ == null) {
        checks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        checksBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public Builder removeChecks(int index) {
      if (checksBuilder_ == null) {
        ensureChecksIsMutable();
        checks_.remove(index);
        onChanged();
      } else {
        checksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public com.aserto.directory.reader.v3.CheckRequest.Builder getChecksBuilder(
        int index) {
      return getChecksFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public com.aserto.directory.reader.v3.CheckRequestOrBuilder getChecksOrBuilder(
        int index) {
      if (checksBuilder_ == null) {
        return checks_.get(index);  } else {
        return checksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public java.util.List<? extends com.aserto.directory.reader.v3.CheckRequestOrBuilder> 
         getChecksOrBuilderList() {
      if (checksBuilder_ != null) {
        return checksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(checks_);
      }
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public com.aserto.directory.reader.v3.CheckRequest.Builder addChecksBuilder() {
      return getChecksFieldBuilder().addBuilder(
          com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public com.aserto.directory.reader.v3.CheckRequest.Builder addChecksBuilder(
        int index) {
      return getChecksFieldBuilder().addBuilder(
          index, com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
     */
    public java.util.List<com.aserto.directory.reader.v3.CheckRequest.Builder> 
         getChecksBuilderList() {
      return getChecksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckRequest.Builder, com.aserto.directory.reader.v3.CheckRequestOrBuilder> 
        getChecksFieldBuilder() {
      if (checksBuilder_ == null) {
        checksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckRequest.Builder, com.aserto.directory.reader.v3.CheckRequestOrBuilder>(
                checks_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        checks_ = null;
      }
      return checksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v3.ChecksRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v3.ChecksRequest)
  private static final com.aserto.directory.reader.v3.ChecksRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v3.ChecksRequest();
  }

  public static com.aserto.directory.reader.v3.ChecksRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChecksRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChecksRequest>() {
    @java.lang.Override
    public ChecksRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChecksRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChecksRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v3.ChecksRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

