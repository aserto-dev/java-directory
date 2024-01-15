// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/priv/private.proto

// Protobuf Java Version: 3.25.2
package com.buf.validate.priv;

/**
 * <pre>
 * Do not use. Internal to protovalidate library
 * </pre>
 *
 * Protobuf type {@code buf.validate.priv.FieldConstraints}
 */
public final class FieldConstraints extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.priv.FieldConstraints)
    FieldConstraintsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FieldConstraints.newBuilder() to construct.
  private FieldConstraints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FieldConstraints() {
    cel_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FieldConstraints();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.buf.validate.priv.PrivateProto.internal_static_buf_validate_priv_FieldConstraints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.buf.validate.priv.PrivateProto.internal_static_buf_validate_priv_FieldConstraints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.buf.validate.priv.FieldConstraints.class, com.buf.validate.priv.FieldConstraints.Builder.class);
  }

  public static final int CEL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.buf.validate.priv.Constraint> cel_;
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public java.util.List<com.buf.validate.priv.Constraint> getCelList() {
    return cel_;
  }
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.buf.validate.priv.ConstraintOrBuilder> 
      getCelOrBuilderList() {
    return cel_;
  }
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public int getCelCount() {
    return cel_.size();
  }
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public com.buf.validate.priv.Constraint getCel(int index) {
    return cel_.get(index);
  }
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public com.buf.validate.priv.ConstraintOrBuilder getCelOrBuilder(
      int index) {
    return cel_.get(index);
  }

  public static com.buf.validate.priv.FieldConstraints parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.buf.validate.priv.FieldConstraints parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.buf.validate.priv.FieldConstraints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.buf.validate.priv.FieldConstraints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.buf.validate.priv.FieldConstraints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.buf.validate.priv.FieldConstraints parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.buf.validate.priv.FieldConstraints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.buf.validate.priv.FieldConstraints parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.buf.validate.priv.FieldConstraints parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.buf.validate.priv.FieldConstraints parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.buf.validate.priv.FieldConstraints parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.buf.validate.priv.FieldConstraints parseFrom(
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
  public static Builder newBuilder(com.buf.validate.priv.FieldConstraints prototype) {
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
   * Do not use. Internal to protovalidate library
   * </pre>
   *
   * Protobuf type {@code buf.validate.priv.FieldConstraints}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.priv.FieldConstraints)
      com.buf.validate.priv.FieldConstraintsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.buf.validate.priv.PrivateProto.internal_static_buf_validate_priv_FieldConstraints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.buf.validate.priv.PrivateProto.internal_static_buf_validate_priv_FieldConstraints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.buf.validate.priv.FieldConstraints.class, com.buf.validate.priv.FieldConstraints.Builder.class);
    }

    // Construct using com.buf.validate.priv.FieldConstraints.newBuilder()
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
      if (celBuilder_ == null) {
        cel_ = java.util.Collections.emptyList();
      } else {
        cel_ = null;
        celBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.buf.validate.priv.PrivateProto.internal_static_buf_validate_priv_FieldConstraints_descriptor;
    }

    @java.lang.Override
    public com.buf.validate.priv.FieldConstraints getDefaultInstanceForType() {
      return com.buf.validate.priv.FieldConstraints.getDefaultInstance();
    }

    @java.lang.Override
    public com.buf.validate.priv.FieldConstraints build() {
      com.buf.validate.priv.FieldConstraints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.buf.validate.priv.FieldConstraints buildPartial() {
      com.buf.validate.priv.FieldConstraints result = new com.buf.validate.priv.FieldConstraints(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.buf.validate.priv.FieldConstraints result) {
      if (celBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cel_ = java.util.Collections.unmodifiableList(cel_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cel_ = cel_;
      } else {
        result.cel_ = celBuilder_.build();
      }
    }

    private void buildPartial0(com.buf.validate.priv.FieldConstraints result) {
      int from_bitField0_ = bitField0_;
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

    private java.util.List<com.buf.validate.priv.Constraint> cel_ =
      java.util.Collections.emptyList();
    private void ensureCelIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cel_ = new java.util.ArrayList<com.buf.validate.priv.Constraint>(cel_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.buf.validate.priv.Constraint, com.buf.validate.priv.Constraint.Builder, com.buf.validate.priv.ConstraintOrBuilder> celBuilder_;

    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public java.util.List<com.buf.validate.priv.Constraint> getCelList() {
      if (celBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cel_);
      } else {
        return celBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public int getCelCount() {
      if (celBuilder_ == null) {
        return cel_.size();
      } else {
        return celBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public com.buf.validate.priv.Constraint getCel(int index) {
      if (celBuilder_ == null) {
        return cel_.get(index);
      } else {
        return celBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder setCel(
        int index, com.buf.validate.priv.Constraint value) {
      if (celBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCelIsMutable();
        cel_.set(index, value);
        onChanged();
      } else {
        celBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder setCel(
        int index, com.buf.validate.priv.Constraint.Builder builderForValue) {
      if (celBuilder_ == null) {
        ensureCelIsMutable();
        cel_.set(index, builderForValue.build());
        onChanged();
      } else {
        celBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(com.buf.validate.priv.Constraint value) {
      if (celBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCelIsMutable();
        cel_.add(value);
        onChanged();
      } else {
        celBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(
        int index, com.buf.validate.priv.Constraint value) {
      if (celBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCelIsMutable();
        cel_.add(index, value);
        onChanged();
      } else {
        celBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(
        com.buf.validate.priv.Constraint.Builder builderForValue) {
      if (celBuilder_ == null) {
        ensureCelIsMutable();
        cel_.add(builderForValue.build());
        onChanged();
      } else {
        celBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(
        int index, com.buf.validate.priv.Constraint.Builder builderForValue) {
      if (celBuilder_ == null) {
        ensureCelIsMutable();
        cel_.add(index, builderForValue.build());
        onChanged();
      } else {
        celBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addAllCel(
        java.lang.Iterable<? extends com.buf.validate.priv.Constraint> values) {
      if (celBuilder_ == null) {
        ensureCelIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cel_);
        onChanged();
      } else {
        celBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder clearCel() {
      if (celBuilder_ == null) {
        cel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        celBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder removeCel(int index) {
      if (celBuilder_ == null) {
        ensureCelIsMutable();
        cel_.remove(index);
        onChanged();
      } else {
        celBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public com.buf.validate.priv.Constraint.Builder getCelBuilder(
        int index) {
      return getCelFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public com.buf.validate.priv.ConstraintOrBuilder getCelOrBuilder(
        int index) {
      if (celBuilder_ == null) {
        return cel_.get(index);  } else {
        return celBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public java.util.List<? extends com.buf.validate.priv.ConstraintOrBuilder> 
         getCelOrBuilderList() {
      if (celBuilder_ != null) {
        return celBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cel_);
      }
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public com.buf.validate.priv.Constraint.Builder addCelBuilder() {
      return getCelFieldBuilder().addBuilder(
          com.buf.validate.priv.Constraint.getDefaultInstance());
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public com.buf.validate.priv.Constraint.Builder addCelBuilder(
        int index) {
      return getCelFieldBuilder().addBuilder(
          index, com.buf.validate.priv.Constraint.getDefaultInstance());
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public java.util.List<com.buf.validate.priv.Constraint.Builder> 
         getCelBuilderList() {
      return getCelFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.buf.validate.priv.Constraint, com.buf.validate.priv.Constraint.Builder, com.buf.validate.priv.ConstraintOrBuilder> 
        getCelFieldBuilder() {
      if (celBuilder_ == null) {
        celBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.buf.validate.priv.Constraint, com.buf.validate.priv.Constraint.Builder, com.buf.validate.priv.ConstraintOrBuilder>(
                cel_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cel_ = null;
      }
      return celBuilder_;
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


    // @@protoc_insertion_point(builder_scope:buf.validate.priv.FieldConstraints)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.priv.FieldConstraints)
  private static final com.buf.validate.priv.FieldConstraints DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.buf.validate.priv.FieldConstraints();
  }

  public static com.buf.validate.priv.FieldConstraints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldConstraints>
      PARSER = new com.google.protobuf.AbstractParser<FieldConstraints>() {
    @java.lang.Override
    public FieldConstraints parsePartialFrom(
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

  public static com.google.protobuf.Parser<FieldConstraints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldConstraints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.buf.validate.priv.FieldConstraints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

