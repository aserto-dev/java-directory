// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

// Protobuf Java Version: 3.25.3
package com.buf.validate;

/**
 * <pre>
 * BoolRules describes the constraints applied to `bool` values. These rules
 * may also be applied to the `google.protobuf.BoolValue` Well-Known-Type.
 * </pre>
 *
 * Protobuf type {@code buf.validate.BoolRules}
 */
public final class BoolRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.BoolRules)
    BoolRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BoolRules.newBuilder() to construct.
  private BoolRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BoolRules() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BoolRules();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.buf.validate.ValidateProto.internal_static_buf_validate_BoolRules_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.buf.validate.ValidateProto.internal_static_buf_validate_BoolRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.buf.validate.BoolRules.class, com.buf.validate.BoolRules.Builder.class);
  }

  private int bitField0_;
  public static final int CONST_FIELD_NUMBER = 1;
  private boolean const_ = false;
  /**
   * <pre>
   * `const` requires the field value to exactly match the specified boolean value.
   * If the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyBool {
   *   // value must equal true
   *   bool value = 1 [(buf.validate.field).bool.const = true];
   * }
   * ```
   * </pre>
   *
   * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the const field is set.
   */
  @java.lang.Override
  public boolean hasConst() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * `const` requires the field value to exactly match the specified boolean value.
   * If the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyBool {
   *   // value must equal true
   *   bool value = 1 [(buf.validate.field).bool.const = true];
   * }
   * ```
   * </pre>
   *
   * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return The const.
   */
  @java.lang.Override
  public boolean getConst() {
    return const_;
  }

  public static com.buf.validate.BoolRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.buf.validate.BoolRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.buf.validate.BoolRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.buf.validate.BoolRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.buf.validate.BoolRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.buf.validate.BoolRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.buf.validate.BoolRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.buf.validate.BoolRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.buf.validate.BoolRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.buf.validate.BoolRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.buf.validate.BoolRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.buf.validate.BoolRules parseFrom(
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
  public static Builder newBuilder(com.buf.validate.BoolRules prototype) {
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
   * BoolRules describes the constraints applied to `bool` values. These rules
   * may also be applied to the `google.protobuf.BoolValue` Well-Known-Type.
   * </pre>
   *
   * Protobuf type {@code buf.validate.BoolRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.BoolRules)
      com.buf.validate.BoolRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.buf.validate.ValidateProto.internal_static_buf_validate_BoolRules_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.buf.validate.ValidateProto.internal_static_buf_validate_BoolRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.buf.validate.BoolRules.class, com.buf.validate.BoolRules.Builder.class);
    }

    // Construct using com.buf.validate.BoolRules.newBuilder()
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
      const_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.buf.validate.ValidateProto.internal_static_buf_validate_BoolRules_descriptor;
    }

    @java.lang.Override
    public com.buf.validate.BoolRules getDefaultInstanceForType() {
      return com.buf.validate.BoolRules.getDefaultInstance();
    }

    @java.lang.Override
    public com.buf.validate.BoolRules build() {
      com.buf.validate.BoolRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.buf.validate.BoolRules buildPartial() {
      com.buf.validate.BoolRules result = new com.buf.validate.BoolRules(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.buf.validate.BoolRules result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.const_ = const_;
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

    private boolean const_ ;
    /**
     * <pre>
     * `const` requires the field value to exactly match the specified boolean value.
     * If the field value doesn't match, an error message is generated.
     *
     * ```proto
     * message MyBool {
     *   // value must equal true
     *   bool value = 1 [(buf.validate.field).bool.const = true];
     * }
     * ```
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
     * @return Whether the const field is set.
     */
    @java.lang.Override
    public boolean hasConst() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * `const` requires the field value to exactly match the specified boolean value.
     * If the field value doesn't match, an error message is generated.
     *
     * ```proto
     * message MyBool {
     *   // value must equal true
     *   bool value = 1 [(buf.validate.field).bool.const = true];
     * }
     * ```
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
     * @return The const.
     */
    @java.lang.Override
    public boolean getConst() {
      return const_;
    }
    /**
     * <pre>
     * `const` requires the field value to exactly match the specified boolean value.
     * If the field value doesn't match, an error message is generated.
     *
     * ```proto
     * message MyBool {
     *   // value must equal true
     *   bool value = 1 [(buf.validate.field).bool.const = true];
     * }
     * ```
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
     * @param value The const to set.
     * @return This builder for chaining.
     */
    public Builder setConst(boolean value) {

      const_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `const` requires the field value to exactly match the specified boolean value.
     * If the field value doesn't match, an error message is generated.
     *
     * ```proto
     * message MyBool {
     *   // value must equal true
     *   bool value = 1 [(buf.validate.field).bool.const = true];
     * }
     * ```
     * </pre>
     *
     * <code>optional bool const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearConst() {
      bitField0_ = (bitField0_ & ~0x00000001);
      const_ = false;
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


    // @@protoc_insertion_point(builder_scope:buf.validate.BoolRules)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.BoolRules)
  private static final com.buf.validate.BoolRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.buf.validate.BoolRules();
  }

  public static com.buf.validate.BoolRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BoolRules>
      PARSER = new com.google.protobuf.AbstractParser<BoolRules>() {
    @java.lang.Override
    public BoolRules parsePartialFrom(
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

  public static com.google.protobuf.Parser<BoolRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BoolRules> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.buf.validate.BoolRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

