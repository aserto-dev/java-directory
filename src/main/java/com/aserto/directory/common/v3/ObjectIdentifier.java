// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v3/common.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.common.v3;

/**
 * <pre>
 * Object identifier
 * </pre>
 *
 * Protobuf type {@code aserto.directory.common.v3.ObjectIdentifier}
 */
public final class ObjectIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.common.v3.ObjectIdentifier)
    ObjectIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ObjectIdentifier.newBuilder() to construct.
  private ObjectIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ObjectIdentifier() {
    objectType_ = "";
    objectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ObjectIdentifier();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.common.v3.CommonProto.internal_static_aserto_directory_common_v3_ObjectIdentifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.common.v3.CommonProto.internal_static_aserto_directory_common_v3_ObjectIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.common.v3.ObjectIdentifier.class, com.aserto.directory.common.v3.ObjectIdentifier.Builder.class);
  }

  public static final int OBJECT_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object objectType_ = "";
  /**
   * <pre>
   * object type (lc-string)
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
   * object type (lc-string)
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
   * object identifier (cs-string)
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
   * object identifier (cs-string)
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, objectType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, objectId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, objectType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(objectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, objectId_);
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
    if (!(obj instanceof com.aserto.directory.common.v3.ObjectIdentifier)) {
      return super.equals(obj);
    }
    com.aserto.directory.common.v3.ObjectIdentifier other = (com.aserto.directory.common.v3.ObjectIdentifier) obj;

    if (!getObjectType()
        .equals(other.getObjectType())) return false;
    if (!getObjectId()
        .equals(other.getObjectId())) return false;
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
    hash = (37 * hash) + OBJECT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getObjectType().hashCode();
    hash = (37 * hash) + OBJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getObjectId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.directory.common.v3.ObjectIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v3.ObjectIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v3.ObjectIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v3.ObjectIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v3.ObjectIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v3.ObjectIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v3.ObjectIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v3.ObjectIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.common.v3.ObjectIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.common.v3.ObjectIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.common.v3.ObjectIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v3.ObjectIdentifier parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.common.v3.ObjectIdentifier prototype) {
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
   * Object identifier
   * </pre>
   *
   * Protobuf type {@code aserto.directory.common.v3.ObjectIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.common.v3.ObjectIdentifier)
      com.aserto.directory.common.v3.ObjectIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.common.v3.CommonProto.internal_static_aserto_directory_common_v3_ObjectIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.common.v3.CommonProto.internal_static_aserto_directory_common_v3_ObjectIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.common.v3.ObjectIdentifier.class, com.aserto.directory.common.v3.ObjectIdentifier.Builder.class);
    }

    // Construct using com.aserto.directory.common.v3.ObjectIdentifier.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.common.v3.CommonProto.internal_static_aserto_directory_common_v3_ObjectIdentifier_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.common.v3.ObjectIdentifier getDefaultInstanceForType() {
      return com.aserto.directory.common.v3.ObjectIdentifier.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.common.v3.ObjectIdentifier build() {
      com.aserto.directory.common.v3.ObjectIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.common.v3.ObjectIdentifier buildPartial() {
      com.aserto.directory.common.v3.ObjectIdentifier result = new com.aserto.directory.common.v3.ObjectIdentifier(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.common.v3.ObjectIdentifier result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.objectType_ = objectType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.objectId_ = objectId_;
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
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aserto.directory.common.v3.ObjectIdentifier) {
        return mergeFrom((com.aserto.directory.common.v3.ObjectIdentifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.directory.common.v3.ObjectIdentifier other) {
      if (other == com.aserto.directory.common.v3.ObjectIdentifier.getDefaultInstance()) return this;
      if (!other.getObjectType().isEmpty()) {
        objectType_ = other.objectType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getObjectId().isEmpty()) {
        objectId_ = other.objectId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              objectType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              objectId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object objectType_ = "";
    /**
     * <pre>
     * object type (lc-string)
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
     * object type (lc-string)
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
     * object type (lc-string)
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
     * object type (lc-string)
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
     * object type (lc-string)
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
     * object identifier (cs-string)
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
     * object identifier (cs-string)
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
     * object identifier (cs-string)
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
     * object identifier (cs-string)
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
     * object identifier (cs-string)
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.common.v3.ObjectIdentifier)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.common.v3.ObjectIdentifier)
  private static final com.aserto.directory.common.v3.ObjectIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.common.v3.ObjectIdentifier();
  }

  public static com.aserto.directory.common.v3.ObjectIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<ObjectIdentifier>() {
    @java.lang.Override
    public ObjectIdentifier parsePartialFrom(
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

  public static com.google.protobuf.Parser<ObjectIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectIdentifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.common.v3.ObjectIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

