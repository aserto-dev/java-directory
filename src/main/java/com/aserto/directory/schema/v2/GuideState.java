// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/schema/v2/tenant.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.schema.v2;

/**
 * <pre>
 * The state of a user's progress through the console's getting started guide.
 * </pre>
 *
 * Protobuf type {@code aserto.directory.schema.v2.GuideState}
 */
@java.lang.Deprecated public final class GuideState extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aserto.directory.schema.v2.GuideState)
    GuideStateOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      GuideState.class.getName());
  }
  // Use GuideState.newBuilder() to construct.
  private GuideState(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GuideState() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_GuideState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_GuideState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.schema.v2.GuideState.class, com.aserto.directory.schema.v2.GuideState.Builder.class);
  }

  private int bitField0_;
  public static final int SHOW_FIELD_NUMBER = 1;
  private boolean show_ = false;
  /**
   * <pre>
   * Whether or not to display the getting started guide.
   * </pre>
   *
   * <code>bool show = 1 [json_name = "show"];</code>
   * @return The show.
   */
  @java.lang.Override
  public boolean getShow() {
    return show_;
  }

  public static final int STEPS_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct steps_;
  /**
   * <pre>
   * Progress information about individual steps in the guide.
   * </pre>
   *
   * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
   * @return Whether the steps field is set.
   */
  @java.lang.Override
  public boolean hasSteps() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Progress information about individual steps in the guide.
   * </pre>
   *
   * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
   * @return The steps.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getSteps() {
    return steps_ == null ? com.google.protobuf.Struct.getDefaultInstance() : steps_;
  }
  /**
   * <pre>
   * Progress information about individual steps in the guide.
   * </pre>
   *
   * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getStepsOrBuilder() {
    return steps_ == null ? com.google.protobuf.Struct.getDefaultInstance() : steps_;
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
    if (show_ != false) {
      output.writeBool(1, show_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getSteps());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (show_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, show_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSteps());
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
    if (!(obj instanceof com.aserto.directory.schema.v2.GuideState)) {
      return super.equals(obj);
    }
    com.aserto.directory.schema.v2.GuideState other = (com.aserto.directory.schema.v2.GuideState) obj;

    if (getShow()
        != other.getShow()) return false;
    if (hasSteps() != other.hasSteps()) return false;
    if (hasSteps()) {
      if (!getSteps()
          .equals(other.getSteps())) return false;
    }
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
    hash = (37 * hash) + SHOW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getShow());
    if (hasSteps()) {
      hash = (37 * hash) + STEPS_FIELD_NUMBER;
      hash = (53 * hash) + getSteps().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.schema.v2.GuideState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.schema.v2.GuideState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.GuideState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aserto.directory.schema.v2.GuideState prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The state of a user's progress through the console's getting started guide.
   * </pre>
   *
   * Protobuf type {@code aserto.directory.schema.v2.GuideState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.schema.v2.GuideState)
      com.aserto.directory.schema.v2.GuideStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_GuideState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_GuideState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.schema.v2.GuideState.class, com.aserto.directory.schema.v2.GuideState.Builder.class);
    }

    // Construct using com.aserto.directory.schema.v2.GuideState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getStepsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      show_ = false;
      steps_ = null;
      if (stepsBuilder_ != null) {
        stepsBuilder_.dispose();
        stepsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.schema.v2.TenantProto.internal_static_aserto_directory_schema_v2_GuideState_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.GuideState getDefaultInstanceForType() {
      return com.aserto.directory.schema.v2.GuideState.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.GuideState build() {
      com.aserto.directory.schema.v2.GuideState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.GuideState buildPartial() {
      com.aserto.directory.schema.v2.GuideState result = new com.aserto.directory.schema.v2.GuideState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.schema.v2.GuideState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.show_ = show_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.steps_ = stepsBuilder_ == null
            ? steps_
            : stepsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aserto.directory.schema.v2.GuideState) {
        return mergeFrom((com.aserto.directory.schema.v2.GuideState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.directory.schema.v2.GuideState other) {
      if (other == com.aserto.directory.schema.v2.GuideState.getDefaultInstance()) return this;
      if (other.getShow() != false) {
        setShow(other.getShow());
      }
      if (other.hasSteps()) {
        mergeSteps(other.getSteps());
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
            case 8: {
              show_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getStepsFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private boolean show_ ;
    /**
     * <pre>
     * Whether or not to display the getting started guide.
     * </pre>
     *
     * <code>bool show = 1 [json_name = "show"];</code>
     * @return The show.
     */
    @java.lang.Override
    public boolean getShow() {
      return show_;
    }
    /**
     * <pre>
     * Whether or not to display the getting started guide.
     * </pre>
     *
     * <code>bool show = 1 [json_name = "show"];</code>
     * @param value The show to set.
     * @return This builder for chaining.
     */
    public Builder setShow(boolean value) {

      show_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether or not to display the getting started guide.
     * </pre>
     *
     * <code>bool show = 1 [json_name = "show"];</code>
     * @return This builder for chaining.
     */
    public Builder clearShow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      show_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct steps_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> stepsBuilder_;
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     * @return Whether the steps field is set.
     */
    public boolean hasSteps() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     * @return The steps.
     */
    public com.google.protobuf.Struct getSteps() {
      if (stepsBuilder_ == null) {
        return steps_ == null ? com.google.protobuf.Struct.getDefaultInstance() : steps_;
      } else {
        return stepsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public Builder setSteps(com.google.protobuf.Struct value) {
      if (stepsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        steps_ = value;
      } else {
        stepsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public Builder setSteps(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (stepsBuilder_ == null) {
        steps_ = builderForValue.build();
      } else {
        stepsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public Builder mergeSteps(com.google.protobuf.Struct value) {
      if (stepsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          steps_ != null &&
          steps_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getStepsBuilder().mergeFrom(value);
        } else {
          steps_ = value;
        }
      } else {
        stepsBuilder_.mergeFrom(value);
      }
      if (steps_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public Builder clearSteps() {
      bitField0_ = (bitField0_ & ~0x00000002);
      steps_ = null;
      if (stepsBuilder_ != null) {
        stepsBuilder_.dispose();
        stepsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public com.google.protobuf.Struct.Builder getStepsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStepsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    public com.google.protobuf.StructOrBuilder getStepsOrBuilder() {
      if (stepsBuilder_ != null) {
        return stepsBuilder_.getMessageOrBuilder();
      } else {
        return steps_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : steps_;
      }
    }
    /**
     * <pre>
     * Progress information about individual steps in the guide.
     * </pre>
     *
     * <code>.google.protobuf.Struct steps = 2 [json_name = "steps"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getStepsFieldBuilder() {
      if (stepsBuilder_ == null) {
        stepsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getSteps(),
                getParentForChildren(),
                isClean());
        steps_ = null;
      }
      return stepsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:aserto.directory.schema.v2.GuideState)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.schema.v2.GuideState)
  private static final com.aserto.directory.schema.v2.GuideState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.schema.v2.GuideState();
  }

  public static com.aserto.directory.schema.v2.GuideState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuideState>
      PARSER = new com.google.protobuf.AbstractParser<GuideState>() {
    @java.lang.Override
    public GuideState parsePartialFrom(
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

  public static com.google.protobuf.Parser<GuideState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuideState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.schema.v2.GuideState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

