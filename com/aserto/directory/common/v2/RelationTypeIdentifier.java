// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v2/common.proto

package com.aserto.directory.common.v2;

/**
 * <pre>
 * RelationType identifier
 * </pre>
 *
 * Protobuf type {@code aserto.directory.common.v2.RelationTypeIdentifier}
 */
public final class RelationTypeIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.common.v2.RelationTypeIdentifier)
    RelationTypeIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RelationTypeIdentifier.newBuilder() to construct.
  private RelationTypeIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelationTypeIdentifier() {
    name_ = "";
    objectType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RelationTypeIdentifier();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_RelationTypeIdentifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_RelationTypeIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.common.v2.RelationTypeIdentifier.class, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <pre>
   * relation type id selector
   * </pre>
   *
   * <code>optional int32 id = 1 [json_name = "id"];</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * relation type id selector
   * </pre>
   *
   * <code>optional int32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * relation type name selector
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * relation type name selector
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * relation type name selector
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OBJECT_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object objectType_;
  /**
   * <pre>
   * object type referenced by relation
   * </pre>
   *
   * <code>optional string object_type = 3 [json_name = "objectType"];</code>
   * @return Whether the objectType field is set.
   */
  @java.lang.Override
  public boolean hasObjectType() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * object type referenced by relation
   * </pre>
   *
   * <code>optional string object_type = 3 [json_name = "objectType"];</code>
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
   * object type referenced by relation
   * </pre>
   *
   * <code>optional string object_type = 3 [json_name = "objectType"];</code>
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

  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v2.RelationTypeIdentifier parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.common.v2.RelationTypeIdentifier prototype) {
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
   * RelationType identifier
   * </pre>
   *
   * Protobuf type {@code aserto.directory.common.v2.RelationTypeIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.common.v2.RelationTypeIdentifier)
      com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_RelationTypeIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_RelationTypeIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.common.v2.RelationTypeIdentifier.class, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder.class);
    }

    // Construct using com.aserto.directory.common.v2.RelationTypeIdentifier.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      objectType_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_RelationTypeIdentifier_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.common.v2.RelationTypeIdentifier getDefaultInstanceForType() {
      return com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.common.v2.RelationTypeIdentifier build() {
      com.aserto.directory.common.v2.RelationTypeIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.common.v2.RelationTypeIdentifier buildPartial() {
      com.aserto.directory.common.v2.RelationTypeIdentifier result = new com.aserto.directory.common.v2.RelationTypeIdentifier(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.name_ = name_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.objectType_ = objectType_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
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

    private int id_ ;
    /**
     * <pre>
     * relation type id selector
     * </pre>
     *
     * <code>optional int32 id = 1 [json_name = "id"];</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * relation type id selector
     * </pre>
     *
     * <code>optional int32 id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     * relation type id selector
     * </pre>
     *
     * <code>optional int32 id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation type id selector
     * </pre>
     *
     * <code>optional int32 id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * relation type name selector
     * </pre>
     *
     * <code>optional string name = 2 [json_name = "name"];</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * relation type name selector
     * </pre>
     *
     * <code>optional string name = 2 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * relation type name selector
     * </pre>
     *
     * <code>optional string name = 2 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * relation type name selector
     * </pre>
     *
     * <code>optional string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation type name selector
     * </pre>
     *
     * <code>optional string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation type name selector
     * </pre>
     *
     * <code>optional string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object objectType_ = "";
    /**
     * <pre>
     * object type referenced by relation
     * </pre>
     *
     * <code>optional string object_type = 3 [json_name = "objectType"];</code>
     * @return Whether the objectType field is set.
     */
    public boolean hasObjectType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * object type referenced by relation
     * </pre>
     *
     * <code>optional string object_type = 3 [json_name = "objectType"];</code>
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
     * object type referenced by relation
     * </pre>
     *
     * <code>optional string object_type = 3 [json_name = "objectType"];</code>
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
     * object type referenced by relation
     * </pre>
     *
     * <code>optional string object_type = 3 [json_name = "objectType"];</code>
     * @param value The objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      objectType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object type referenced by relation
     * </pre>
     *
     * <code>optional string object_type = 3 [json_name = "objectType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObjectType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      objectType_ = getDefaultInstance().getObjectType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object type referenced by relation
     * </pre>
     *
     * <code>optional string object_type = 3 [json_name = "objectType"];</code>
     * @param value The bytes for objectType to set.
     * @return This builder for chaining.
     */
    public Builder setObjectTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      objectType_ = value;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.common.v2.RelationTypeIdentifier)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.common.v2.RelationTypeIdentifier)
  private static final com.aserto.directory.common.v2.RelationTypeIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.common.v2.RelationTypeIdentifier();
  }

  public static com.aserto.directory.common.v2.RelationTypeIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelationTypeIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<RelationTypeIdentifier>() {
    @java.lang.Override
    public RelationTypeIdentifier parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelationTypeIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelationTypeIdentifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.common.v2.RelationTypeIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

