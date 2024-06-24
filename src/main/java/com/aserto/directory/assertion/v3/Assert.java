// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/assertion/v3/assertion.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.assertion.v3;

/**
 * Protobuf type {@code aserto.directory.assertion.v3.Assert}
 */
public final class Assert extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.assertion.v3.Assert)
    AssertOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Assert.newBuilder() to construct.
  private Assert(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Assert() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Assert();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.assertion.v3.AssertionProto.internal_static_aserto_directory_assertion_v3_Assert_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.assertion.v3.AssertionProto.internal_static_aserto_directory_assertion_v3_Assert_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.assertion.v3.Assert.class, com.aserto.directory.assertion.v3.Assert.Builder.class);
  }

  private int msgCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object msg_;
  public enum MsgCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CHECK(3),
    CHECK_RELATION(4),
    CHECK_PERMISSION(5),
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
        case 3: return CHECK;
        case 4: return CHECK_RELATION;
        case 5: return CHECK_PERMISSION;
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

  public static final int ID_FIELD_NUMBER = 1;
  private int id_ = 0;
  /**
   * <pre>
   * assertion identifier
   * </pre>
   *
   * <code>uint32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int EXPECTED_FIELD_NUMBER = 2;
  private boolean expected_ = false;
  /**
   * <pre>
   * expected outcome of assertion
   * </pre>
   *
   * <code>bool expected = 2 [json_name = "expected", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The expected.
   */
  @java.lang.Override
  public boolean getExpected() {
    return expected_;
  }

  public static final int CHECK_FIELD_NUMBER = 3;
  /**
   * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
   * @return Whether the check field is set.
   */
  @java.lang.Override
  public boolean hasCheck() {
    return msgCase_ == 3;
  }
  /**
   * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
   * @return The check.
   */
  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckRequest getCheck() {
    if (msgCase_ == 3) {
       return (com.aserto.directory.reader.v3.CheckRequest) msg_;
    }
    return com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance();
  }
  /**
   * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckRequestOrBuilder getCheckOrBuilder() {
    if (msgCase_ == 3) {
       return (com.aserto.directory.reader.v3.CheckRequest) msg_;
    }
    return com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance();
  }

  public static final int CHECK_RELATION_FIELD_NUMBER = 4;
  /**
   * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
   * @return Whether the checkRelation field is set.
   */
  @java.lang.Override
  public boolean hasCheckRelation() {
    return msgCase_ == 4;
  }
  /**
   * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
   * @return The checkRelation.
   */
  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckRelationRequest getCheckRelation() {
    if (msgCase_ == 4) {
       return (com.aserto.directory.reader.v3.CheckRelationRequest) msg_;
    }
    return com.aserto.directory.reader.v3.CheckRelationRequest.getDefaultInstance();
  }
  /**
   * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckRelationRequestOrBuilder getCheckRelationOrBuilder() {
    if (msgCase_ == 4) {
       return (com.aserto.directory.reader.v3.CheckRelationRequest) msg_;
    }
    return com.aserto.directory.reader.v3.CheckRelationRequest.getDefaultInstance();
  }

  public static final int CHECK_PERMISSION_FIELD_NUMBER = 5;
  /**
   * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
   * @return Whether the checkPermission field is set.
   */
  @java.lang.Override
  public boolean hasCheckPermission() {
    return msgCase_ == 5;
  }
  /**
   * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
   * @return The checkPermission.
   */
  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckPermissionRequest getCheckPermission() {
    if (msgCase_ == 5) {
       return (com.aserto.directory.reader.v3.CheckPermissionRequest) msg_;
    }
    return com.aserto.directory.reader.v3.CheckPermissionRequest.getDefaultInstance();
  }
  /**
   * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.reader.v3.CheckPermissionRequestOrBuilder getCheckPermissionOrBuilder() {
    if (msgCase_ == 5) {
       return (com.aserto.directory.reader.v3.CheckPermissionRequest) msg_;
    }
    return com.aserto.directory.reader.v3.CheckPermissionRequest.getDefaultInstance();
  }

  public static com.aserto.directory.assertion.v3.Assert parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.assertion.v3.Assert parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.assertion.v3.Assert parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.assertion.v3.Assert parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.assertion.v3.Assert parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.assertion.v3.Assert parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.assertion.v3.Assert parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.assertion.v3.Assert parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.assertion.v3.Assert parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.assertion.v3.Assert parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.assertion.v3.Assert parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.assertion.v3.Assert parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.assertion.v3.Assert prototype) {
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
   * Protobuf type {@code aserto.directory.assertion.v3.Assert}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.assertion.v3.Assert)
      com.aserto.directory.assertion.v3.AssertOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.assertion.v3.AssertionProto.internal_static_aserto_directory_assertion_v3_Assert_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.assertion.v3.AssertionProto.internal_static_aserto_directory_assertion_v3_Assert_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.assertion.v3.Assert.class, com.aserto.directory.assertion.v3.Assert.Builder.class);
    }

    // Construct using com.aserto.directory.assertion.v3.Assert.newBuilder()
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
      id_ = 0;
      expected_ = false;
      if (checkBuilder_ != null) {
        checkBuilder_.clear();
      }
      if (checkRelationBuilder_ != null) {
        checkRelationBuilder_.clear();
      }
      if (checkPermissionBuilder_ != null) {
        checkPermissionBuilder_.clear();
      }
      msgCase_ = 0;
      msg_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.assertion.v3.AssertionProto.internal_static_aserto_directory_assertion_v3_Assert_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.assertion.v3.Assert getDefaultInstanceForType() {
      return com.aserto.directory.assertion.v3.Assert.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.assertion.v3.Assert build() {
      com.aserto.directory.assertion.v3.Assert result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.assertion.v3.Assert buildPartial() {
      com.aserto.directory.assertion.v3.Assert result = new com.aserto.directory.assertion.v3.Assert(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.assertion.v3.Assert result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.expected_ = expected_;
      }
    }

    private void buildPartialOneofs(com.aserto.directory.assertion.v3.Assert result) {
      result.msgCase_ = msgCase_;
      result.msg_ = this.msg_;
      if (msgCase_ == 3 &&
          checkBuilder_ != null) {
        result.msg_ = checkBuilder_.build();
      }
      if (msgCase_ == 4 &&
          checkRelationBuilder_ != null) {
        result.msg_ = checkRelationBuilder_.build();
      }
      if (msgCase_ == 5 &&
          checkPermissionBuilder_ != null) {
        result.msg_ = checkPermissionBuilder_.build();
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

    private int id_ ;
    /**
     * <pre>
     * assertion identifier
     * </pre>
     *
     * <code>uint32 id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     * assertion identifier
     * </pre>
     *
     * <code>uint32 id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * assertion identifier
     * </pre>
     *
     * <code>uint32 id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0;
      onChanged();
      return this;
    }

    private boolean expected_ ;
    /**
     * <pre>
     * expected outcome of assertion
     * </pre>
     *
     * <code>bool expected = 2 [json_name = "expected", (.google.api.field_behavior) = REQUIRED];</code>
     * @return The expected.
     */
    @java.lang.Override
    public boolean getExpected() {
      return expected_;
    }
    /**
     * <pre>
     * expected outcome of assertion
     * </pre>
     *
     * <code>bool expected = 2 [json_name = "expected", (.google.api.field_behavior) = REQUIRED];</code>
     * @param value The expected to set.
     * @return This builder for chaining.
     */
    public Builder setExpected(boolean value) {

      expected_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * expected outcome of assertion
     * </pre>
     *
     * <code>bool expected = 2 [json_name = "expected", (.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpected() {
      bitField0_ = (bitField0_ & ~0x00000002);
      expected_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckRequest.Builder, com.aserto.directory.reader.v3.CheckRequestOrBuilder> checkBuilder_;
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
     * @return Whether the check field is set.
     */
    @java.lang.Override
    public boolean hasCheck() {
      return msgCase_ == 3;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
     * @return The check.
     */
    @java.lang.Override
    public com.aserto.directory.reader.v3.CheckRequest getCheck() {
      if (checkBuilder_ == null) {
        if (msgCase_ == 3) {
          return (com.aserto.directory.reader.v3.CheckRequest) msg_;
        }
        return com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance();
      } else {
        if (msgCase_ == 3) {
          return checkBuilder_.getMessage();
        }
        return com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance();
      }
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
     */
    public Builder setCheck(com.aserto.directory.reader.v3.CheckRequest value) {
      if (checkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msg_ = value;
        onChanged();
      } else {
        checkBuilder_.setMessage(value);
      }
      msgCase_ = 3;
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
     */
    public Builder setCheck(
        com.aserto.directory.reader.v3.CheckRequest.Builder builderForValue) {
      if (checkBuilder_ == null) {
        msg_ = builderForValue.build();
        onChanged();
      } else {
        checkBuilder_.setMessage(builderForValue.build());
      }
      msgCase_ = 3;
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
     */
    public Builder mergeCheck(com.aserto.directory.reader.v3.CheckRequest value) {
      if (checkBuilder_ == null) {
        if (msgCase_ == 3 &&
            msg_ != com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance()) {
          msg_ = com.aserto.directory.reader.v3.CheckRequest.newBuilder((com.aserto.directory.reader.v3.CheckRequest) msg_)
              .mergeFrom(value).buildPartial();
        } else {
          msg_ = value;
        }
        onChanged();
      } else {
        if (msgCase_ == 3) {
          checkBuilder_.mergeFrom(value);
        } else {
          checkBuilder_.setMessage(value);
        }
      }
      msgCase_ = 3;
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
     */
    public Builder clearCheck() {
      if (checkBuilder_ == null) {
        if (msgCase_ == 3) {
          msgCase_ = 0;
          msg_ = null;
          onChanged();
        }
      } else {
        if (msgCase_ == 3) {
          msgCase_ = 0;
          msg_ = null;
        }
        checkBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
     */
    public com.aserto.directory.reader.v3.CheckRequest.Builder getCheckBuilder() {
      return getCheckFieldBuilder().getBuilder();
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
     */
    @java.lang.Override
    public com.aserto.directory.reader.v3.CheckRequestOrBuilder getCheckOrBuilder() {
      if ((msgCase_ == 3) && (checkBuilder_ != null)) {
        return checkBuilder_.getMessageOrBuilder();
      } else {
        if (msgCase_ == 3) {
          return (com.aserto.directory.reader.v3.CheckRequest) msg_;
        }
        return com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance();
      }
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckRequest.Builder, com.aserto.directory.reader.v3.CheckRequestOrBuilder> 
        getCheckFieldBuilder() {
      if (checkBuilder_ == null) {
        if (!(msgCase_ == 3)) {
          msg_ = com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance();
        }
        checkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckRequest.Builder, com.aserto.directory.reader.v3.CheckRequestOrBuilder>(
                (com.aserto.directory.reader.v3.CheckRequest) msg_,
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      msgCase_ = 3;
      onChanged();
      return checkBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.reader.v3.CheckRelationRequest, com.aserto.directory.reader.v3.CheckRelationRequest.Builder, com.aserto.directory.reader.v3.CheckRelationRequestOrBuilder> checkRelationBuilder_;
    /**
     * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
     * @return Whether the checkRelation field is set.
     */
    @java.lang.Override
    public boolean hasCheckRelation() {
      return msgCase_ == 4;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
     * @return The checkRelation.
     */
    @java.lang.Override
    public com.aserto.directory.reader.v3.CheckRelationRequest getCheckRelation() {
      if (checkRelationBuilder_ == null) {
        if (msgCase_ == 4) {
          return (com.aserto.directory.reader.v3.CheckRelationRequest) msg_;
        }
        return com.aserto.directory.reader.v3.CheckRelationRequest.getDefaultInstance();
      } else {
        if (msgCase_ == 4) {
          return checkRelationBuilder_.getMessage();
        }
        return com.aserto.directory.reader.v3.CheckRelationRequest.getDefaultInstance();
      }
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
     */
    public Builder setCheckRelation(com.aserto.directory.reader.v3.CheckRelationRequest value) {
      if (checkRelationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msg_ = value;
        onChanged();
      } else {
        checkRelationBuilder_.setMessage(value);
      }
      msgCase_ = 4;
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
     */
    public Builder setCheckRelation(
        com.aserto.directory.reader.v3.CheckRelationRequest.Builder builderForValue) {
      if (checkRelationBuilder_ == null) {
        msg_ = builderForValue.build();
        onChanged();
      } else {
        checkRelationBuilder_.setMessage(builderForValue.build());
      }
      msgCase_ = 4;
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
     */
    public Builder mergeCheckRelation(com.aserto.directory.reader.v3.CheckRelationRequest value) {
      if (checkRelationBuilder_ == null) {
        if (msgCase_ == 4 &&
            msg_ != com.aserto.directory.reader.v3.CheckRelationRequest.getDefaultInstance()) {
          msg_ = com.aserto.directory.reader.v3.CheckRelationRequest.newBuilder((com.aserto.directory.reader.v3.CheckRelationRequest) msg_)
              .mergeFrom(value).buildPartial();
        } else {
          msg_ = value;
        }
        onChanged();
      } else {
        if (msgCase_ == 4) {
          checkRelationBuilder_.mergeFrom(value);
        } else {
          checkRelationBuilder_.setMessage(value);
        }
      }
      msgCase_ = 4;
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
     */
    public Builder clearCheckRelation() {
      if (checkRelationBuilder_ == null) {
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
        checkRelationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
     */
    public com.aserto.directory.reader.v3.CheckRelationRequest.Builder getCheckRelationBuilder() {
      return getCheckRelationFieldBuilder().getBuilder();
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
     */
    @java.lang.Override
    public com.aserto.directory.reader.v3.CheckRelationRequestOrBuilder getCheckRelationOrBuilder() {
      if ((msgCase_ == 4) && (checkRelationBuilder_ != null)) {
        return checkRelationBuilder_.getMessageOrBuilder();
      } else {
        if (msgCase_ == 4) {
          return (com.aserto.directory.reader.v3.CheckRelationRequest) msg_;
        }
        return com.aserto.directory.reader.v3.CheckRelationRequest.getDefaultInstance();
      }
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.reader.v3.CheckRelationRequest, com.aserto.directory.reader.v3.CheckRelationRequest.Builder, com.aserto.directory.reader.v3.CheckRelationRequestOrBuilder> 
        getCheckRelationFieldBuilder() {
      if (checkRelationBuilder_ == null) {
        if (!(msgCase_ == 4)) {
          msg_ = com.aserto.directory.reader.v3.CheckRelationRequest.getDefaultInstance();
        }
        checkRelationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.reader.v3.CheckRelationRequest, com.aserto.directory.reader.v3.CheckRelationRequest.Builder, com.aserto.directory.reader.v3.CheckRelationRequestOrBuilder>(
                (com.aserto.directory.reader.v3.CheckRelationRequest) msg_,
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      msgCase_ = 4;
      onChanged();
      return checkRelationBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.reader.v3.CheckPermissionRequest, com.aserto.directory.reader.v3.CheckPermissionRequest.Builder, com.aserto.directory.reader.v3.CheckPermissionRequestOrBuilder> checkPermissionBuilder_;
    /**
     * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
     * @return Whether the checkPermission field is set.
     */
    @java.lang.Override
    public boolean hasCheckPermission() {
      return msgCase_ == 5;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
     * @return The checkPermission.
     */
    @java.lang.Override
    public com.aserto.directory.reader.v3.CheckPermissionRequest getCheckPermission() {
      if (checkPermissionBuilder_ == null) {
        if (msgCase_ == 5) {
          return (com.aserto.directory.reader.v3.CheckPermissionRequest) msg_;
        }
        return com.aserto.directory.reader.v3.CheckPermissionRequest.getDefaultInstance();
      } else {
        if (msgCase_ == 5) {
          return checkPermissionBuilder_.getMessage();
        }
        return com.aserto.directory.reader.v3.CheckPermissionRequest.getDefaultInstance();
      }
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
     */
    public Builder setCheckPermission(com.aserto.directory.reader.v3.CheckPermissionRequest value) {
      if (checkPermissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        msg_ = value;
        onChanged();
      } else {
        checkPermissionBuilder_.setMessage(value);
      }
      msgCase_ = 5;
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
     */
    public Builder setCheckPermission(
        com.aserto.directory.reader.v3.CheckPermissionRequest.Builder builderForValue) {
      if (checkPermissionBuilder_ == null) {
        msg_ = builderForValue.build();
        onChanged();
      } else {
        checkPermissionBuilder_.setMessage(builderForValue.build());
      }
      msgCase_ = 5;
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
     */
    public Builder mergeCheckPermission(com.aserto.directory.reader.v3.CheckPermissionRequest value) {
      if (checkPermissionBuilder_ == null) {
        if (msgCase_ == 5 &&
            msg_ != com.aserto.directory.reader.v3.CheckPermissionRequest.getDefaultInstance()) {
          msg_ = com.aserto.directory.reader.v3.CheckPermissionRequest.newBuilder((com.aserto.directory.reader.v3.CheckPermissionRequest) msg_)
              .mergeFrom(value).buildPartial();
        } else {
          msg_ = value;
        }
        onChanged();
      } else {
        if (msgCase_ == 5) {
          checkPermissionBuilder_.mergeFrom(value);
        } else {
          checkPermissionBuilder_.setMessage(value);
        }
      }
      msgCase_ = 5;
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
     */
    public Builder clearCheckPermission() {
      if (checkPermissionBuilder_ == null) {
        if (msgCase_ == 5) {
          msgCase_ = 0;
          msg_ = null;
          onChanged();
        }
      } else {
        if (msgCase_ == 5) {
          msgCase_ = 0;
          msg_ = null;
        }
        checkPermissionBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
     */
    public com.aserto.directory.reader.v3.CheckPermissionRequest.Builder getCheckPermissionBuilder() {
      return getCheckPermissionFieldBuilder().getBuilder();
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
     */
    @java.lang.Override
    public com.aserto.directory.reader.v3.CheckPermissionRequestOrBuilder getCheckPermissionOrBuilder() {
      if ((msgCase_ == 5) && (checkPermissionBuilder_ != null)) {
        return checkPermissionBuilder_.getMessageOrBuilder();
      } else {
        if (msgCase_ == 5) {
          return (com.aserto.directory.reader.v3.CheckPermissionRequest) msg_;
        }
        return com.aserto.directory.reader.v3.CheckPermissionRequest.getDefaultInstance();
      }
    }
    /**
     * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.reader.v3.CheckPermissionRequest, com.aserto.directory.reader.v3.CheckPermissionRequest.Builder, com.aserto.directory.reader.v3.CheckPermissionRequestOrBuilder> 
        getCheckPermissionFieldBuilder() {
      if (checkPermissionBuilder_ == null) {
        if (!(msgCase_ == 5)) {
          msg_ = com.aserto.directory.reader.v3.CheckPermissionRequest.getDefaultInstance();
        }
        checkPermissionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.reader.v3.CheckPermissionRequest, com.aserto.directory.reader.v3.CheckPermissionRequest.Builder, com.aserto.directory.reader.v3.CheckPermissionRequestOrBuilder>(
                (com.aserto.directory.reader.v3.CheckPermissionRequest) msg_,
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      msgCase_ = 5;
      onChanged();
      return checkPermissionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.assertion.v3.Assert)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.assertion.v3.Assert)
  private static final com.aserto.directory.assertion.v3.Assert DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.assertion.v3.Assert();
  }

  public static com.aserto.directory.assertion.v3.Assert getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Assert>
      PARSER = new com.google.protobuf.AbstractParser<Assert>() {
    @java.lang.Override
    public Assert parsePartialFrom(
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

  public static com.google.protobuf.Parser<Assert> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Assert> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.assertion.v3.Assert getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
