// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.CheckRelationResponse}
 */
public final class CheckRelationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.CheckRelationResponse)
    CheckRelationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckRelationResponse.newBuilder() to construct.
  private CheckRelationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckRelationResponse() {
    trace_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckRelationResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_CheckRelationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_CheckRelationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.CheckRelationResponse.class, com.aserto.directory.reader.v2.CheckRelationResponse.Builder.class);
  }

  public static final int CHECK_FIELD_NUMBER = 1;
  private boolean check_ = false;
  /**
   * <pre>
   * check result
   * </pre>
   *
   * <code>bool check = 1 [json_name = "check"];</code>
   * @return The check.
   */
  @java.lang.Override
  public boolean getCheck() {
    return check_;
  }

  public static final int TRACE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList trace_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * trace information
   * </pre>
   *
   * <code>repeated string trace = 2 [json_name = "trace"];</code>
   * @return A list containing the trace.
   */
  public com.google.protobuf.ProtocolStringList
      getTraceList() {
    return trace_;
  }
  /**
   * <pre>
   * trace information
   * </pre>
   *
   * <code>repeated string trace = 2 [json_name = "trace"];</code>
   * @return The count of trace.
   */
  public int getTraceCount() {
    return trace_.size();
  }
  /**
   * <pre>
   * trace information
   * </pre>
   *
   * <code>repeated string trace = 2 [json_name = "trace"];</code>
   * @param index The index of the element to return.
   * @return The trace at the given index.
   */
  public java.lang.String getTrace(int index) {
    return trace_.get(index);
  }
  /**
   * <pre>
   * trace information
   * </pre>
   *
   * <code>repeated string trace = 2 [json_name = "trace"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the trace at the given index.
   */
  public com.google.protobuf.ByteString
      getTraceBytes(int index) {
    return trace_.getByteString(index);
  }

  public static com.aserto.directory.reader.v2.CheckRelationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.CheckRelationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.CheckRelationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.CheckRelationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.CheckRelationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.CheckRelationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.CheckRelationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.CheckRelationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.reader.v2.CheckRelationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.reader.v2.CheckRelationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.CheckRelationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.CheckRelationResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.CheckRelationResponse prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.CheckRelationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.CheckRelationResponse)
      com.aserto.directory.reader.v2.CheckRelationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_CheckRelationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_CheckRelationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.CheckRelationResponse.class, com.aserto.directory.reader.v2.CheckRelationResponse.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.CheckRelationResponse.newBuilder()
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
      check_ = false;
      trace_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_CheckRelationResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.CheckRelationResponse getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.CheckRelationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.CheckRelationResponse build() {
      com.aserto.directory.reader.v2.CheckRelationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.CheckRelationResponse buildPartial() {
      com.aserto.directory.reader.v2.CheckRelationResponse result = new com.aserto.directory.reader.v2.CheckRelationResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.reader.v2.CheckRelationResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.check_ = check_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        trace_.makeImmutable();
        result.trace_ = trace_;
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
    private int bitField0_;

    private boolean check_ ;
    /**
     * <pre>
     * check result
     * </pre>
     *
     * <code>bool check = 1 [json_name = "check"];</code>
     * @return The check.
     */
    @java.lang.Override
    public boolean getCheck() {
      return check_;
    }
    /**
     * <pre>
     * check result
     * </pre>
     *
     * <code>bool check = 1 [json_name = "check"];</code>
     * @param value The check to set.
     * @return This builder for chaining.
     */
    public Builder setCheck(boolean value) {

      check_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * check result
     * </pre>
     *
     * <code>bool check = 1 [json_name = "check"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCheck() {
      bitField0_ = (bitField0_ & ~0x00000001);
      check_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList trace_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureTraceIsMutable() {
      if (!trace_.isModifiable()) {
        trace_ = new com.google.protobuf.LazyStringArrayList(trace_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * trace information
     * </pre>
     *
     * <code>repeated string trace = 2 [json_name = "trace"];</code>
     * @return A list containing the trace.
     */
    public com.google.protobuf.ProtocolStringList
        getTraceList() {
      trace_.makeImmutable();
      return trace_;
    }
    /**
     * <pre>
     * trace information
     * </pre>
     *
     * <code>repeated string trace = 2 [json_name = "trace"];</code>
     * @return The count of trace.
     */
    public int getTraceCount() {
      return trace_.size();
    }
    /**
     * <pre>
     * trace information
     * </pre>
     *
     * <code>repeated string trace = 2 [json_name = "trace"];</code>
     * @param index The index of the element to return.
     * @return The trace at the given index.
     */
    public java.lang.String getTrace(int index) {
      return trace_.get(index);
    }
    /**
     * <pre>
     * trace information
     * </pre>
     *
     * <code>repeated string trace = 2 [json_name = "trace"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the trace at the given index.
     */
    public com.google.protobuf.ByteString
        getTraceBytes(int index) {
      return trace_.getByteString(index);
    }
    /**
     * <pre>
     * trace information
     * </pre>
     *
     * <code>repeated string trace = 2 [json_name = "trace"];</code>
     * @param index The index to set the value at.
     * @param value The trace to set.
     * @return This builder for chaining.
     */
    public Builder setTrace(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTraceIsMutable();
      trace_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * trace information
     * </pre>
     *
     * <code>repeated string trace = 2 [json_name = "trace"];</code>
     * @param value The trace to add.
     * @return This builder for chaining.
     */
    public Builder addTrace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureTraceIsMutable();
      trace_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * trace information
     * </pre>
     *
     * <code>repeated string trace = 2 [json_name = "trace"];</code>
     * @param values The trace to add.
     * @return This builder for chaining.
     */
    public Builder addAllTrace(
        java.lang.Iterable<java.lang.String> values) {
      ensureTraceIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, trace_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * trace information
     * </pre>
     *
     * <code>repeated string trace = 2 [json_name = "trace"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTrace() {
      trace_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * trace information
     * </pre>
     *
     * <code>repeated string trace = 2 [json_name = "trace"];</code>
     * @param value The bytes of the trace to add.
     * @return This builder for chaining.
     */
    public Builder addTraceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureTraceIsMutable();
      trace_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.CheckRelationResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.CheckRelationResponse)
  private static final com.aserto.directory.reader.v2.CheckRelationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.CheckRelationResponse();
  }

  public static com.aserto.directory.reader.v2.CheckRelationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckRelationResponse>
      PARSER = new com.google.protobuf.AbstractParser<CheckRelationResponse>() {
    @java.lang.Override
    public CheckRelationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CheckRelationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckRelationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.CheckRelationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

