// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/exporter/v3/exporter.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.exporter.v3;

/**
 * Protobuf type {@code aserto.directory.exporter.v3.ExportResponse}
 */
public final class ExportResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.exporter.v3.ExportResponse)
    ExportResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportResponse.newBuilder() to construct.
  private ExportResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.exporter.v3.ExporterProto.internal_static_aserto_directory_exporter_v3_ExportResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.exporter.v3.ExporterProto.internal_static_aserto_directory_exporter_v3_ExportResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.exporter.v3.ExportResponse.class, com.aserto.directory.exporter.v3.ExportResponse.Builder.class);
  }

  private int msgCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object msg_;
  public enum MsgCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    OBJECT(2),
    RELATION(4),
    MSG_NOT_SET(0);
    private final int value;
    private MsgCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MsgCase valueOf(int value) {
      return forNumber(value);
    }

    public static MsgCase forNumber(int value) {
      switch (value) {
        case 2: return OBJECT;
        case 4: return RELATION;
        case 0: return MSG_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MsgCase
  getMsgCase() {
    return MsgCase.forNumber(
        msgCase_);
  }

  public static final int OBJECT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * object instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return msgCase_ == 2;
  }
  /**
   * <pre>
   * object instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public com.aserto.directory.common.v3.Object getObject() {
    if (msgCase_ == 2) {
       return (com.aserto.directory.common.v3.Object) msg_;
    }
    return com.aserto.directory.common.v3.Object.getDefaultInstance();
  }
  /**
   * <pre>
   * object instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v3.ObjectOrBuilder getObjectOrBuilder() {
    if (msgCase_ == 2) {
       return (com.aserto.directory.common.v3.Object) msg_;
    }
    return com.aserto.directory.common.v3.Object.getDefaultInstance();
  }

  public static final int RELATION_FIELD_NUMBER = 4;
  /**
   * <pre>
   * relation instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  @java.lang.Override
  public boolean hasRelation() {
    return msgCase_ == 4;
  }
  /**
   * <pre>
   * relation instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
   * @return The relation.
   */
  @java.lang.Override
  public com.aserto.directory.common.v3.Relation getRelation() {
    if (msgCase_ == 4) {
       return (com.aserto.directory.common.v3.Relation) msg_;
    }
    return com.aserto.directory.common.v3.Relation.getDefaultInstance();
  }
  /**
   * <pre>
   * relation instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v3.RelationOrBuilder getRelationOrBuilder() {
    if (msgCase_ == 4) {
       return (com.aserto.directory.common.v3.Relation) msg_;
    }
    return com.aserto.directory.common.v3.Relation.getDefaultInstance();
  }

  public static com.aserto.directory.exporter.v3.ExportResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.exporter.v3.ExportResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.exporter.v3.ExportResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.exporter.v3.ExportResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.exporter.v3.ExportResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.exporter.v3.ExportResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.exporter.v3.ExportResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.exporter.v3.ExportResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.exporter.v3.ExportResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.exporter.v3.ExportResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.exporter.v3.ExportResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.exporter.v3.ExportResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.exporter.v3.ExportResponse prototype) {
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
   * Protobuf type {@code aserto.directory.exporter.v3.ExportResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.exporter.v3.ExportResponse)
      com.aserto.directory.exporter.v3.ExportResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.exporter.v3.ExporterProto.internal_static_aserto_directory_exporter_v3_ExportResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.exporter.v3.ExporterProto.internal_static_aserto_directory_exporter_v3_ExportResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.exporter.v3.ExportResponse.class, com.aserto.directory.exporter.v3.ExportResponse.Builder.class);
    }

    // Construct using com.aserto.directory.exporter.v3.ExportResponse.newBuilder()
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
      if (objectBuilder_ != null) {
        objectBuilder_.clear();
      }
      if (relationBuilder_ != null) {
        relationBuilder_.clear();
      }
      msgCase_ = 0;
      msg_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.exporter.v3.ExporterProto.internal_static_aserto_directory_exporter_v3_ExportResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.exporter.v3.ExportResponse getDefaultInstanceForType() {
      return com.aserto.directory.exporter.v3.ExportResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.exporter.v3.ExportResponse build() {
      com.aserto.directory.exporter.v3.ExportResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.exporter.v3.ExportResponse buildPartial() {
      com.aserto.directory.exporter.v3.ExportResponse result = new com.aserto.directory.exporter.v3.ExportResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.exporter.v3.ExportResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.aserto.directory.exporter.v3.ExportResponse result) {
      result.msgCase_ = msgCase_;
      result.msg_ = this.msg_;
      if (msgCase_ == 2 &&
          objectBuilder_ != null) {
        result.msg_ = objectBuilder_.build();
      }
      if (msgCase_ == 4 &&
          relationBuilder_ != null) {
        result.msg_ = relationBuilder_.build();
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
    private int msgCase_ = 0;
    private java.lang.Object msg_;
    public MsgCase
        getMsgCase() {
      return MsgCase.forNumber(
          msgCase_);
    }

    public Builder clearMsg() {
      msgCase_ = 0;
      msg_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v3.Object, com.aserto.directory.common.v3.Object.Builder, com.aserto.directory.common.v3.ObjectOrBuilder> objectBuilder_;
    /**
     * <pre>
     * object instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
     * @return Whether the object field is set.
     */
    @java.lang.Override
    public boolean hasObject() {
      return msgCase_ == 2;
    }
    /**
     * <pre>
     * object instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
     * @return The object.
     */
    @java.lang.Override
    public com.aserto.directory.common.v3.Object getObject() {
      if (objectBuilder_ == null) {
        if (msgCase_ == 2) {
          return (com.aserto.directory.common.v3.Object) msg_;
        }
        return com.aserto.directory.common.v3.Object.getDefaultInstance();
      } else {
        if (msgCase_ == 2) {
          return objectBuilder_.getMessage();
        }
        return com.aserto.directory.common.v3.Object.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * object instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
     */
    public Builder setObject(com.aserto.directory.common.v3.Object value) {
      if (objectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msg_ = value;
        onChanged();
      } else {
        objectBuilder_.setMessage(value);
      }
      msgCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * object instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
     */
    public Builder setObject(
        com.aserto.directory.common.v3.Object.Builder builderForValue) {
      if (objectBuilder_ == null) {
        msg_ = builderForValue.build();
        onChanged();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }
      msgCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * object instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
     */
    public Builder mergeObject(com.aserto.directory.common.v3.Object value) {
      if (objectBuilder_ == null) {
        if (msgCase_ == 2 &&
            msg_ != com.aserto.directory.common.v3.Object.getDefaultInstance()) {
          msg_ = com.aserto.directory.common.v3.Object.newBuilder((com.aserto.directory.common.v3.Object) msg_)
              .mergeFrom(value).buildPartial();
        } else {
          msg_ = value;
        }
        onChanged();
      } else {
        if (msgCase_ == 2) {
          objectBuilder_.mergeFrom(value);
        } else {
          objectBuilder_.setMessage(value);
        }
      }
      msgCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * object instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
     */
    public Builder clearObject() {
      if (objectBuilder_ == null) {
        if (msgCase_ == 2) {
          msgCase_ = 0;
          msg_ = null;
          onChanged();
        }
      } else {
        if (msgCase_ == 2) {
          msgCase_ = 0;
          msg_ = null;
        }
        objectBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * object instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
     */
    public com.aserto.directory.common.v3.Object.Builder getObjectBuilder() {
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * object instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
     */
    @java.lang.Override
    public com.aserto.directory.common.v3.ObjectOrBuilder getObjectOrBuilder() {
      if ((msgCase_ == 2) && (objectBuilder_ != null)) {
        return objectBuilder_.getMessageOrBuilder();
      } else {
        if (msgCase_ == 2) {
          return (com.aserto.directory.common.v3.Object) msg_;
        }
        return com.aserto.directory.common.v3.Object.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * object instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v3.Object, com.aserto.directory.common.v3.Object.Builder, com.aserto.directory.common.v3.ObjectOrBuilder> 
        getObjectFieldBuilder() {
      if (objectBuilder_ == null) {
        if (!(msgCase_ == 2)) {
          msg_ = com.aserto.directory.common.v3.Object.getDefaultInstance();
        }
        objectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v3.Object, com.aserto.directory.common.v3.Object.Builder, com.aserto.directory.common.v3.ObjectOrBuilder>(
                (com.aserto.directory.common.v3.Object) msg_,
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      msgCase_ = 2;
      onChanged();
      return objectBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v3.Relation, com.aserto.directory.common.v3.Relation.Builder, com.aserto.directory.common.v3.RelationOrBuilder> relationBuilder_;
    /**
     * <pre>
     * relation instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
     * @return Whether the relation field is set.
     */
    @java.lang.Override
    public boolean hasRelation() {
      return msgCase_ == 4;
    }
    /**
     * <pre>
     * relation instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
     * @return The relation.
     */
    @java.lang.Override
    public com.aserto.directory.common.v3.Relation getRelation() {
      if (relationBuilder_ == null) {
        if (msgCase_ == 4) {
          return (com.aserto.directory.common.v3.Relation) msg_;
        }
        return com.aserto.directory.common.v3.Relation.getDefaultInstance();
      } else {
        if (msgCase_ == 4) {
          return relationBuilder_.getMessage();
        }
        return com.aserto.directory.common.v3.Relation.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * relation instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
     */
    public Builder setRelation(com.aserto.directory.common.v3.Relation value) {
      if (relationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msg_ = value;
        onChanged();
      } else {
        relationBuilder_.setMessage(value);
      }
      msgCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * relation instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
     */
    public Builder setRelation(
        com.aserto.directory.common.v3.Relation.Builder builderForValue) {
      if (relationBuilder_ == null) {
        msg_ = builderForValue.build();
        onChanged();
      } else {
        relationBuilder_.setMessage(builderForValue.build());
      }
      msgCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * relation instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
     */
    public Builder mergeRelation(com.aserto.directory.common.v3.Relation value) {
      if (relationBuilder_ == null) {
        if (msgCase_ == 4 &&
            msg_ != com.aserto.directory.common.v3.Relation.getDefaultInstance()) {
          msg_ = com.aserto.directory.common.v3.Relation.newBuilder((com.aserto.directory.common.v3.Relation) msg_)
              .mergeFrom(value).buildPartial();
        } else {
          msg_ = value;
        }
        onChanged();
      } else {
        if (msgCase_ == 4) {
          relationBuilder_.mergeFrom(value);
        } else {
          relationBuilder_.setMessage(value);
        }
      }
      msgCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * relation instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
     */
    public Builder clearRelation() {
      if (relationBuilder_ == null) {
        if (msgCase_ == 4) {
          msgCase_ = 0;
          msg_ = null;
          onChanged();
        }
      } else {
        if (msgCase_ == 4) {
          msgCase_ = 0;
          msg_ = null;
        }
        relationBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * relation instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
     */
    public com.aserto.directory.common.v3.Relation.Builder getRelationBuilder() {
      return getRelationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * relation instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
     */
    @java.lang.Override
    public com.aserto.directory.common.v3.RelationOrBuilder getRelationOrBuilder() {
      if ((msgCase_ == 4) && (relationBuilder_ != null)) {
        return relationBuilder_.getMessageOrBuilder();
      } else {
        if (msgCase_ == 4) {
          return (com.aserto.directory.common.v3.Relation) msg_;
        }
        return com.aserto.directory.common.v3.Relation.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * relation instance (data)
     * </pre>
     *
     * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v3.Relation, com.aserto.directory.common.v3.Relation.Builder, com.aserto.directory.common.v3.RelationOrBuilder> 
        getRelationFieldBuilder() {
      if (relationBuilder_ == null) {
        if (!(msgCase_ == 4)) {
          msg_ = com.aserto.directory.common.v3.Relation.getDefaultInstance();
        }
        relationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v3.Relation, com.aserto.directory.common.v3.Relation.Builder, com.aserto.directory.common.v3.RelationOrBuilder>(
                (com.aserto.directory.common.v3.Relation) msg_,
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      msgCase_ = 4;
      onChanged();
      return relationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.exporter.v3.ExportResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.exporter.v3.ExportResponse)
  private static final com.aserto.directory.exporter.v3.ExportResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.exporter.v3.ExportResponse();
  }

  public static com.aserto.directory.exporter.v3.ExportResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportResponse>
      PARSER = new com.google.protobuf.AbstractParser<ExportResponse>() {
    @java.lang.Override
    public ExportResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.exporter.v3.ExportResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

