// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v3/writer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.writer.v3;

/**
 * Protobuf type {@code aserto.directory.writer.v3.DeleteRelationRequest}
 */
public final class DeleteRelationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.writer.v3.DeleteRelationRequest)
    DeleteRelationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteRelationRequest.newBuilder() to construct.
  private DeleteRelationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteRelationRequest() {
    objectType_ = "";
    objectId_ = "";
    relation_ = "";
    subjectType_ = "";
    subjectId_ = "";
    subjectRelation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteRelationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.writer.v3.WriterProto.internal_static_aserto_directory_writer_v3_DeleteRelationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.writer.v3.WriterProto.internal_static_aserto_directory_writer_v3_DeleteRelationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.writer.v3.DeleteRelationRequest.class, com.aserto.directory.writer.v3.DeleteRelationRequest.Builder.class);
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

  public static final int RELATION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object relation_ = "";
  /**
   * <pre>
   * object relation name
   * </pre>
   *
   * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The relation.
   */
  @java.lang.Override
  public java.lang.String getRelation() {
    java.lang.Object ref = relation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      relation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * object relation name
   * </pre>
   *
   * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for relation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRelationBytes() {
    java.lang.Object ref = relation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      relation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_TYPE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subjectType_ = "";
  /**
   * <pre>
   * subject type
   * </pre>
   *
   * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The subjectType.
   */
  @java.lang.Override
  public java.lang.String getSubjectType() {
    java.lang.Object ref = subjectType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subjectType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * subject type
   * </pre>
   *
   * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for subjectType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectTypeBytes() {
    java.lang.Object ref = subjectType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subjectType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subjectId_ = "";
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The subjectId.
   */
  @java.lang.Override
  public java.lang.String getSubjectId() {
    java.lang.Object ref = subjectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subjectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for subjectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectIdBytes() {
    java.lang.Object ref = subjectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subjectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_RELATION_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object subjectRelation_ = "";
  /**
   * <pre>
   * optional subject relation name
   * </pre>
   *
   * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OPTIONAL, (.buf.validate.field) = { ... }</code>
   * @return The subjectRelation.
   */
  @java.lang.Override
  public java.lang.String getSubjectRelation() {
    java.lang.Object ref = subjectRelation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subjectRelation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * optional subject relation name
   * </pre>
   *
   * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OPTIONAL, (.buf.validate.field) = { ... }</code>
   * @return The bytes for subjectRelation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectRelationBytes() {
    java.lang.Object ref = subjectRelation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subjectRelation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.writer.v3.DeleteRelationRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.writer.v3.DeleteRelationRequest prototype) {
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
   * Protobuf type {@code aserto.directory.writer.v3.DeleteRelationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.writer.v3.DeleteRelationRequest)
      com.aserto.directory.writer.v3.DeleteRelationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.writer.v3.WriterProto.internal_static_aserto_directory_writer_v3_DeleteRelationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.writer.v3.WriterProto.internal_static_aserto_directory_writer_v3_DeleteRelationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.writer.v3.DeleteRelationRequest.class, com.aserto.directory.writer.v3.DeleteRelationRequest.Builder.class);
    }

    // Construct using com.aserto.directory.writer.v3.DeleteRelationRequest.newBuilder()
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
      relation_ = "";
      subjectType_ = "";
      subjectId_ = "";
      subjectRelation_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.writer.v3.WriterProto.internal_static_aserto_directory_writer_v3_DeleteRelationRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v3.DeleteRelationRequest getDefaultInstanceForType() {
      return com.aserto.directory.writer.v3.DeleteRelationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.writer.v3.DeleteRelationRequest build() {
      com.aserto.directory.writer.v3.DeleteRelationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.writer.v3.DeleteRelationRequest buildPartial() {
      com.aserto.directory.writer.v3.DeleteRelationRequest result = new com.aserto.directory.writer.v3.DeleteRelationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.writer.v3.DeleteRelationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectType_ = objectType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.objectId_ = objectId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.relation_ = relation_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.subjectType_ = subjectType_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.subjectId_ = subjectId_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.subjectRelation_ = subjectRelation_;
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

    private java.lang.Object relation_ = "";
    /**
     * <pre>
     * object relation name
     * </pre>
     *
     * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The relation.
     */
    public java.lang.String getRelation() {
      java.lang.Object ref = relation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        relation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * object relation name
     * </pre>
     *
     * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The bytes for relation.
     */
    public com.google.protobuf.ByteString
        getRelationBytes() {
      java.lang.Object ref = relation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        relation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * object relation name
     * </pre>
     *
     * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The relation to set.
     * @return This builder for chaining.
     */
    public Builder setRelation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      relation_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object relation name
     * </pre>
     *
     * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearRelation() {
      relation_ = getDefaultInstance().getRelation();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object relation name
     * </pre>
     *
     * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for relation to set.
     * @return This builder for chaining.
     */
    public Builder setRelationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      relation_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object subjectType_ = "";
    /**
     * <pre>
     * subject type
     * </pre>
     *
     * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The subjectType.
     */
    public java.lang.String getSubjectType() {
      java.lang.Object ref = subjectType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subjectType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * subject type
     * </pre>
     *
     * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The bytes for subjectType.
     */
    public com.google.protobuf.ByteString
        getSubjectTypeBytes() {
      java.lang.Object ref = subjectType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subjectType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * subject type
     * </pre>
     *
     * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The subjectType to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subjectType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject type
     * </pre>
     *
     * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectType() {
      subjectType_ = getDefaultInstance().getSubjectType();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject type
     * </pre>
     *
     * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for subjectType to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subjectType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object subjectId_ = "";
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The subjectId.
     */
    public java.lang.String getSubjectId() {
      java.lang.Object ref = subjectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subjectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return The bytes for subjectId.
     */
    public com.google.protobuf.ByteString
        getSubjectIdBytes() {
      java.lang.Object ref = subjectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subjectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The subjectId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subjectId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectId() {
      subjectId_ = getDefaultInstance().getSubjectId();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject identifier
     * </pre>
     *
     * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for subjectId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subjectId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private java.lang.Object subjectRelation_ = "";
    /**
     * <pre>
     * optional subject relation name
     * </pre>
     *
     * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OPTIONAL, (.buf.validate.field) = { ... }</code>
     * @return The subjectRelation.
     */
    public java.lang.String getSubjectRelation() {
      java.lang.Object ref = subjectRelation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subjectRelation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * optional subject relation name
     * </pre>
     *
     * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OPTIONAL, (.buf.validate.field) = { ... }</code>
     * @return The bytes for subjectRelation.
     */
    public com.google.protobuf.ByteString
        getSubjectRelationBytes() {
      java.lang.Object ref = subjectRelation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subjectRelation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * optional subject relation name
     * </pre>
     *
     * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OPTIONAL, (.buf.validate.field) = { ... }</code>
     * @param value The subjectRelation to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectRelation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      subjectRelation_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional subject relation name
     * </pre>
     *
     * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OPTIONAL, (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectRelation() {
      subjectRelation_ = getDefaultInstance().getSubjectRelation();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional subject relation name
     * </pre>
     *
     * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OPTIONAL, (.buf.validate.field) = { ... }</code>
     * @param value The bytes for subjectRelation to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectRelationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      subjectRelation_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.writer.v3.DeleteRelationRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.writer.v3.DeleteRelationRequest)
  private static final com.aserto.directory.writer.v3.DeleteRelationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.writer.v3.DeleteRelationRequest();
  }

  public static com.aserto.directory.writer.v3.DeleteRelationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRelationRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteRelationRequest>() {
    @java.lang.Override
    public DeleteRelationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteRelationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRelationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.writer.v3.DeleteRelationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

