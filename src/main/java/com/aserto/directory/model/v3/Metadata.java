// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/model/v3/model.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.model.v3;

/**
 * Protobuf type {@code aserto.directory.model.v3.Metadata}
 */
public final class Metadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.model.v3.Metadata)
    MetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metadata.newBuilder() to construct.
  private Metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metadata() {
    etag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Metadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_Metadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_Metadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.model.v3.Metadata.class, com.aserto.directory.model.v3.Metadata.Builder.class);
  }

  private int bitField0_;
  public static final int UPDATED_AT_FIELD_NUMBER = 21;
  private com.google.protobuf.Timestamp updatedAt_;
  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updatedAt field is set.
   */
  @java.lang.Override
  public boolean hasUpdatedAt() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updatedAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdatedAt() {
    return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
  }
  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
    return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
  }

  public static final int ETAG_FIELD_NUMBER = 23;
  @SuppressWarnings("serial")
  private volatile java.lang.Object etag_ = "";
  /**
   * <pre>
   * object instance etag
   * </pre>
   *
   * <code>string etag = 23 [json_name = "etag", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The etag.
   */
  @java.lang.Override
  public java.lang.String getEtag() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      etag_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * object instance etag
   * </pre>
   *
   * <code>string etag = 23 [json_name = "etag", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for etag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEtagBytes() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      etag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static com.aserto.directory.model.v3.Metadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.model.v3.Metadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.Metadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.model.v3.Metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.Metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.model.v3.Metadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.Metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.model.v3.Metadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.model.v3.Metadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.model.v3.Metadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.model.v3.Metadata parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.model.v3.Metadata prototype) {
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
   * Protobuf type {@code aserto.directory.model.v3.Metadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.model.v3.Metadata)
      com.aserto.directory.model.v3.MetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_Metadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.model.v3.Metadata.class, com.aserto.directory.model.v3.Metadata.Builder.class);
    }

    // Construct using com.aserto.directory.model.v3.Metadata.newBuilder()
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
        getUpdatedAtFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updatedAt_ = null;
      if (updatedAtBuilder_ != null) {
        updatedAtBuilder_.dispose();
        updatedAtBuilder_ = null;
      }
      etag_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_Metadata_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.model.v3.Metadata getDefaultInstanceForType() {
      return com.aserto.directory.model.v3.Metadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.model.v3.Metadata build() {
      com.aserto.directory.model.v3.Metadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.model.v3.Metadata buildPartial() {
      com.aserto.directory.model.v3.Metadata result = new com.aserto.directory.model.v3.Metadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.model.v3.Metadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updatedAt_ = updatedAtBuilder_ == null
            ? updatedAt_
            : updatedAtBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.etag_ = etag_;
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

    private com.google.protobuf.Timestamp updatedAt_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updatedAtBuilder_;
    /**
     * <pre>
     * last updated timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the updatedAt field is set.
     */
    public boolean hasUpdatedAt() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * last updated timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The updatedAt.
     */
    public com.google.protobuf.Timestamp getUpdatedAt() {
      if (updatedAtBuilder_ == null) {
        return updatedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      } else {
        return updatedAtBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * last updated timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updatedAt_ = value;
      } else {
        updatedAtBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * last updated timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setUpdatedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updatedAtBuilder_ == null) {
        updatedAt_ = builderForValue.build();
      } else {
        updatedAtBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * last updated timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeUpdatedAt(com.google.protobuf.Timestamp value) {
      if (updatedAtBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          updatedAt_ != null &&
          updatedAt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdatedAtBuilder().mergeFrom(value);
        } else {
          updatedAt_ = value;
        }
      } else {
        updatedAtBuilder_.mergeFrom(value);
      }
      if (updatedAt_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * last updated timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearUpdatedAt() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updatedAt_ = null;
      if (updatedAtBuilder_ != null) {
        updatedAtBuilder_.dispose();
        updatedAtBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * last updated timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdatedAtBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdatedAtFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * last updated timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder() {
      if (updatedAtBuilder_ != null) {
        return updatedAtBuilder_.getMessageOrBuilder();
      } else {
        return updatedAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updatedAt_;
      }
    }
    /**
     * <pre>
     * last updated timestamp (UTC)
     * </pre>
     *
     * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdatedAtFieldBuilder() {
      if (updatedAtBuilder_ == null) {
        updatedAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdatedAt(),
                getParentForChildren(),
                isClean());
        updatedAt_ = null;
      }
      return updatedAtBuilder_;
    }

    private java.lang.Object etag_ = "";
    /**
     * <pre>
     * object instance etag
     * </pre>
     *
     * <code>string etag = 23 [json_name = "etag", (.google.api.field_behavior) = OPTIONAL];</code>
     * @return The etag.
     */
    public java.lang.String getEtag() {
      java.lang.Object ref = etag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        etag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * object instance etag
     * </pre>
     *
     * <code>string etag = 23 [json_name = "etag", (.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for etag.
     */
    public com.google.protobuf.ByteString
        getEtagBytes() {
      java.lang.Object ref = etag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        etag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * object instance etag
     * </pre>
     *
     * <code>string etag = 23 [json_name = "etag", (.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtag(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      etag_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object instance etag
     * </pre>
     *
     * <code>string etag = 23 [json_name = "etag", (.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearEtag() {
      etag_ = getDefaultInstance().getEtag();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object instance etag
     * </pre>
     *
     * <code>string etag = 23 [json_name = "etag", (.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      etag_ = value;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.model.v3.Metadata)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.model.v3.Metadata)
  private static final com.aserto.directory.model.v3.Metadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.model.v3.Metadata();
  }

  public static com.aserto.directory.model.v3.Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metadata>
      PARSER = new com.google.protobuf.AbstractParser<Metadata>() {
    @java.lang.Override
    public Metadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<Metadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.model.v3.Metadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

