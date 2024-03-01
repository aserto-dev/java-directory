// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v2/common.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.common.v2;

/**
 * <pre>
 * Permission identifier
 * </pre>
 *
 * Protobuf type {@code aserto.directory.common.v2.PermissionIdentifier}
 */
public final class PermissionIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.common.v2.PermissionIdentifier)
    PermissionIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PermissionIdentifier.newBuilder() to construct.
  private PermissionIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PermissionIdentifier() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PermissionIdentifier();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_PermissionIdentifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_PermissionIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.common.v2.PermissionIdentifier.class, com.aserto.directory.common.v2.PermissionIdentifier.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * permission name (unique, cs-string)
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * permission name (unique, cs-string)
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
   * permission name (unique, cs-string)
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

  public static com.aserto.directory.common.v2.PermissionIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v2.PermissionIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.PermissionIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v2.PermissionIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.PermissionIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.common.v2.PermissionIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.PermissionIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v2.PermissionIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.common.v2.PermissionIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.common.v2.PermissionIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.common.v2.PermissionIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.common.v2.PermissionIdentifier parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.common.v2.PermissionIdentifier prototype) {
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
   * Permission identifier
   * </pre>
   *
   * Protobuf type {@code aserto.directory.common.v2.PermissionIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.common.v2.PermissionIdentifier)
      com.aserto.directory.common.v2.PermissionIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_PermissionIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_PermissionIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.common.v2.PermissionIdentifier.class, com.aserto.directory.common.v2.PermissionIdentifier.Builder.class);
    }

    // Construct using com.aserto.directory.common.v2.PermissionIdentifier.newBuilder()
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
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.common.v2.CommonProto.internal_static_aserto_directory_common_v2_PermissionIdentifier_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.common.v2.PermissionIdentifier getDefaultInstanceForType() {
      return com.aserto.directory.common.v2.PermissionIdentifier.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.common.v2.PermissionIdentifier build() {
      com.aserto.directory.common.v2.PermissionIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.common.v2.PermissionIdentifier buildPartial() {
      com.aserto.directory.common.v2.PermissionIdentifier result = new com.aserto.directory.common.v2.PermissionIdentifier(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.common.v2.PermissionIdentifier result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * permission name (unique, cs-string)
     * </pre>
     *
     * <code>optional string name = 2 [json_name = "name"];</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * permission name (unique, cs-string)
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
     * permission name (unique, cs-string)
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
     * permission name (unique, cs-string)
     * </pre>
     *
     * <code>optional string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * permission name (unique, cs-string)
     * </pre>
     *
     * <code>optional string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * permission name (unique, cs-string)
     * </pre>
     *
     * <code>optional string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.common.v2.PermissionIdentifier)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.common.v2.PermissionIdentifier)
  private static final com.aserto.directory.common.v2.PermissionIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.common.v2.PermissionIdentifier();
  }

  public static com.aserto.directory.common.v2.PermissionIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PermissionIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<PermissionIdentifier>() {
    @java.lang.Override
    public PermissionIdentifier parsePartialFrom(
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

  public static com.google.protobuf.Parser<PermissionIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PermissionIdentifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.common.v2.PermissionIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

