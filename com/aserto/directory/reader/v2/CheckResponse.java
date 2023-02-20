// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.CheckResponse}
 */
public final class CheckResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.CheckResponse)
    CheckResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckResponse.newBuilder() to construct.
  private CheckResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckResponse() {
    trace_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_CheckResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_CheckResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.CheckResponse.class, com.aserto.directory.reader.v2.CheckResponse.Builder.class);
  }

  public static final int CHECK_FIELD_NUMBER = 1;
  private boolean check_ = false;
  /**
   * <pre>
   * check result (BOOL)
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
  private com.google.protobuf.LazyStringList trace_;
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

  public static com.aserto.directory.reader.v2.CheckResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.CheckResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.CheckResponse prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.CheckResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.CheckResponse)
      com.aserto.directory.reader.v2.CheckResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_CheckResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_CheckResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.CheckResponse.class, com.aserto.directory.reader.v2.CheckResponse.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.CheckResponse.newBuilder()
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
      trace_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_CheckResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.CheckResponse getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.CheckResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.CheckResponse build() {
      com.aserto.directory.reader.v2.CheckResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.CheckResponse buildPartial() {
      com.aserto.directory.reader.v2.CheckResponse result = new com.aserto.directory.reader.v2.CheckResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aserto.directory.reader.v2.CheckResponse result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        trace_ = trace_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.trace_ = trace_;
    }

    private void buildPartial0(com.aserto.directory.reader.v2.CheckResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.check_ = check_;
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
     * check result (BOOL)
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
     * check result (BOOL)
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
     * check result (BOOL)
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

    private com.google.protobuf.LazyStringList trace_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTraceIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        trace_ = new com.google.protobuf.LazyStringArrayList(trace_);
        bitField0_ |= 0x00000002;
       }
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
      return trace_.getUnmodifiableView();
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
      trace_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.CheckResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.CheckResponse)
  private static final com.aserto.directory.reader.v2.CheckResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.CheckResponse();
  }

  public static com.aserto.directory.reader.v2.CheckResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckResponse>
      PARSER = new com.google.protobuf.AbstractParser<CheckResponse>() {
    @java.lang.Override
    public CheckResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CheckResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.CheckResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

