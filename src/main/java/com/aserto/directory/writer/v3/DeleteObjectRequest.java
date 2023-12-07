// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v3/writer.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.writer.v3;

/**
 * Protobuf type {@code aserto.directory.writer.v3.DeleteObjectRequest}
 */
public final class DeleteObjectRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.writer.v3.DeleteObjectRequest)
    DeleteObjectRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteObjectRequest.newBuilder() to construct.
  private DeleteObjectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteObjectRequest() {
    objectType_ = "";
    objectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteObjectRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.writer.v3.WriterProto.internal_static_aserto_directory_writer_v3_DeleteObjectRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.writer.v3.WriterProto.internal_static_aserto_directory_writer_v3_DeleteObjectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.writer.v3.DeleteObjectRequest.class, com.aserto.directory.writer.v3.DeleteObjectRequest.Builder.class);
  }

  public static final int OBJECT_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectType_ = "";
  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The objectType.
   */
  @java.lang.Override
  public java.lang.String getObjectType() {
    java.lang.Object ref = objectType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      objectType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for objectType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectTypeBytes() {
    java.lang.Object ref = objectType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      objectType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OBJECT_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectId_ = "";
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The objectId.
   */
  @java.lang.Override
  public java.lang.String getObjectId() {
    java.lang.Object ref = objectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      objectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for objectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectIdBytes() {
    java.lang.Object ref = objectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      objectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WITH_RELATIONS_FIELD_NUMBER = 3;
  private boolean withRelations_ = false;
  /**
   * <pre>
   * delete object relations, both object and subject relations.
   * </pre>
   *
   * <code>bool with_relations = 3 [json_name = "withRelations", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The withRelations.
   */
  @java.lang.Override
  public boolean getWithRelations() {
    return withRelations_;
  }

  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v3.DeleteObjectRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.writer.v3.DeleteObjectRequest prototype) {
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
   * Protobuf type {@code aserto.directory.writer.v3.DeleteObjectRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.writer.v3.DeleteObjectRequest)
      com.aserto.directory.writer.v3.DeleteObjectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.writer.v3.WriterProto.internal_static_aserto_directory_writer_v3_DeleteObjectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.writer.v3.WriterProto.internal_static_aserto_directory_writer_v3_DeleteObjectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.writer.v3.DeleteObjectRequest.class, com.aserto.directory.writer.v3.DeleteObjectRequest.Builder.class);
    }

    // Construct using com.aserto.directory.writer.v3.DeleteObjectRequest.newBuilder()
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
      objectType_ = "";
      objectId_ = "";
      withRelations_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.writer.v3.WriterProto.internal_static_aserto_directory_writer_v3_DeleteObjectRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v3.DeleteObjectRequest getDefaultInstanceForType() {
      return com.aserto.directory.writer.v3.DeleteObjectRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.writer.v3.DeleteObjectRequest build() {
      com.aserto.directory.writer.v3.DeleteObjectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v3.DeleteObjectRequest buildPartial() {
      com.aserto.directory.writer.v3.DeleteObjectRequest result = new com.aserto.directory.writer.v3.DeleteObjectRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.writer.v3.DeleteObjectRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectType_ = objectType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.objectId_ = objectId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.withRelations_ = withRelations_;
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

    private java.lang.Object objectType_ = "";
    /**
     * <pre>
     * object type
     * </pre>
     *
     * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The objectType.
     */
    public java.lang.String getObjectType() {
      java.lang.Object ref = objectType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objectType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * object type
     * </pre>
     *
     * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The bytes for objectType.
     */
    public com.google.protobuf.ByteString
        getObjectTypeBytes() {
      java.lang.Object ref = objectType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objectType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * object type
     * </pre>
     *
     * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      objectType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object type
     * </pre>
     *
     * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectType() {
      objectType_ = getDefaultInstance().getObjectType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object type
     * </pre>
     *
     * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      objectType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object objectId_ = "";
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The objectId.
     */
    public java.lang.String getObjectId() {
      java.lang.Object ref = objectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        objectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The bytes for objectId.
     */
    public com.google.protobuf.ByteString
        getObjectIdBytes() {
      java.lang.Object ref = objectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        objectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      objectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectId() {
      objectId_ = getDefaultInstance().getObjectId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object identifier
     * </pre>
     *
     * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for objectId to set.
     * @return This builder for chaining.
     */
    public Builder setObjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      objectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean withRelations_ ;
    /**
     * <pre>
     * delete object relations, both object and subject relations.
     * </pre>
     *
     * <code>bool with_relations = 3 [json_name = "withRelations", (.google.api.field_behavior) = OPTIONAL];</code>
     * @return The withRelations.
     */
    @java.lang.Override
    public boolean getWithRelations() {
      return withRelations_;
    }
    /**
     * <pre>
     * delete object relations, both object and subject relations.
     * </pre>
     *
     * <code>bool with_relations = 3 [json_name = "withRelations", (.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The withRelations to set.
     * @return This builder for chaining.
     */
    public Builder setWithRelations(boolean value) {

      withRelations_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * delete object relations, both object and subject relations.
     * </pre>
     *
     * <code>bool with_relations = 3 [json_name = "withRelations", (.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearWithRelations() {
      bitField0_ = (bitField0_ & ~0x00000004);
      withRelations_ = false;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.writer.v3.DeleteObjectRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.writer.v3.DeleteObjectRequest)
  private static final com.aserto.directory.writer.v3.DeleteObjectRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.writer.v3.DeleteObjectRequest();
  }

  public static com.aserto.directory.writer.v3.DeleteObjectRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteObjectRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteObjectRequest>() {
    @java.lang.Override
    public DeleteObjectRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteObjectRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteObjectRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.writer.v3.DeleteObjectRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

