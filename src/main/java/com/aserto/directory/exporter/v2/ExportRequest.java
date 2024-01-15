// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/exporter/v2/exporter.proto

// Protobuf Java Version: 3.25.2
package com.aserto.directory.exporter.v2;

/**
 * Protobuf type {@code aserto.directory.exporter.v2.ExportRequest}
 */
public final class ExportRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.exporter.v2.ExportRequest)
    ExportRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportRequest.newBuilder() to construct.
  private ExportRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.exporter.v2.ExporterProto.internal_static_aserto_directory_exporter_v2_ExportRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.exporter.v2.ExporterProto.internal_static_aserto_directory_exporter_v2_ExportRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.exporter.v2.ExportRequest.class, com.aserto.directory.exporter.v2.ExportRequest.Builder.class);
  }

  private int bitField0_;
  public static final int OPTIONS_FIELD_NUMBER = 1;
  private int options_ = 0;
  /**
   * <pre>
   * data export options mask
   * </pre>
   *
   * <code>uint32 options = 1 [json_name = "options"];</code>
   * @return The options.
   */
  @java.lang.Override
  public int getOptions() {
    return options_;
  }

  public static final int START_FROM_FIELD_NUMBER = 20;
  private com.google.protobuf.Timestamp startFrom_;
  /**
   * <pre>
   * start export from timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
   * @return Whether the startFrom field is set.
   */
  @java.lang.Override
  public boolean hasStartFrom() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * start export from timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
   * @return The startFrom.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartFrom() {
    return startFrom_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startFrom_;
  }
  /**
   * <pre>
   * start export from timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartFromOrBuilder() {
    return startFrom_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startFrom_;
  }

  public static com.aserto.directory.exporter.v2.ExportRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.exporter.v2.ExportRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.exporter.v2.ExportRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.exporter.v2.ExportRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.exporter.v2.ExportRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.exporter.v2.ExportRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.exporter.v2.ExportRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.exporter.v2.ExportRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.exporter.v2.ExportRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.exporter.v2.ExportRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.exporter.v2.ExportRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.exporter.v2.ExportRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.exporter.v2.ExportRequest prototype) {
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
   * Protobuf type {@code aserto.directory.exporter.v2.ExportRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.exporter.v2.ExportRequest)
      com.aserto.directory.exporter.v2.ExportRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.exporter.v2.ExporterProto.internal_static_aserto_directory_exporter_v2_ExportRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.exporter.v2.ExporterProto.internal_static_aserto_directory_exporter_v2_ExportRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.exporter.v2.ExportRequest.class, com.aserto.directory.exporter.v2.ExportRequest.Builder.class);
    }

    // Construct using com.aserto.directory.exporter.v2.ExportRequest.newBuilder()
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
        getStartFromFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      options_ = 0;
      startFrom_ = null;
      if (startFromBuilder_ != null) {
        startFromBuilder_.dispose();
        startFromBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.exporter.v2.ExporterProto.internal_static_aserto_directory_exporter_v2_ExportRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.exporter.v2.ExportRequest getDefaultInstanceForType() {
      return com.aserto.directory.exporter.v2.ExportRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.exporter.v2.ExportRequest build() {
      com.aserto.directory.exporter.v2.ExportRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.exporter.v2.ExportRequest buildPartial() {
      com.aserto.directory.exporter.v2.ExportRequest result = new com.aserto.directory.exporter.v2.ExportRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.exporter.v2.ExportRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.options_ = options_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startFrom_ = startFromBuilder_ == null
            ? startFrom_
            : startFromBuilder_.build();
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

    private int options_ ;
    /**
     * <pre>
     * data export options mask
     * </pre>
     *
     * <code>uint32 options = 1 [json_name = "options"];</code>
     * @return The options.
     */
    @java.lang.Override
    public int getOptions() {
      return options_;
    }
    /**
     * <pre>
     * data export options mask
     * </pre>
     *
     * <code>uint32 options = 1 [json_name = "options"];</code>
     * @param value The options to set.
     * @return This builder for chaining.
     */
    public Builder setOptions(int value) {

      options_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * data export options mask
     * </pre>
     *
     * <code>uint32 options = 1 [json_name = "options"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOptions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      options_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp startFrom_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startFromBuilder_;
    /**
     * <pre>
     * start export from timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
     * @return Whether the startFrom field is set.
     */
    public boolean hasStartFrom() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * start export from timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
     * @return The startFrom.
     */
    public com.google.protobuf.Timestamp getStartFrom() {
      if (startFromBuilder_ == null) {
        return startFrom_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startFrom_;
      } else {
        return startFromBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * start export from timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
     */
    public Builder setStartFrom(com.google.protobuf.Timestamp value) {
      if (startFromBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startFrom_ = value;
      } else {
        startFromBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * start export from timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
     */
    public Builder setStartFrom(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startFromBuilder_ == null) {
        startFrom_ = builderForValue.build();
      } else {
        startFromBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * start export from timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
     */
    public Builder mergeStartFrom(com.google.protobuf.Timestamp value) {
      if (startFromBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          startFrom_ != null &&
          startFrom_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getStartFromBuilder().mergeFrom(value);
        } else {
          startFrom_ = value;
        }
      } else {
        startFromBuilder_.mergeFrom(value);
      }
      if (startFrom_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * start export from timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
     */
    public Builder clearStartFrom() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startFrom_ = null;
      if (startFromBuilder_ != null) {
        startFromBuilder_.dispose();
        startFromBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * start export from timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartFromBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStartFromFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * start export from timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartFromOrBuilder() {
      if (startFromBuilder_ != null) {
        return startFromBuilder_.getMessageOrBuilder();
      } else {
        return startFrom_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startFrom_;
      }
    }
    /**
     * <pre>
     * start export from timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_from = 20 [json_name = "startFrom"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartFromFieldBuilder() {
      if (startFromBuilder_ == null) {
        startFromBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartFrom(),
                getParentForChildren(),
                isClean());
        startFrom_ = null;
      }
      return startFromBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.exporter.v2.ExportRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.exporter.v2.ExportRequest)
  private static final com.aserto.directory.exporter.v2.ExportRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.exporter.v2.ExportRequest();
  }

  public static com.aserto.directory.exporter.v2.ExportRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExportRequest>() {
    @java.lang.Override
    public ExportRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.exporter.v2.ExportRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

