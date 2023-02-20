// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v2/user.proto

package com.aserto.directory.schema.v2;

/**
 * <pre>
 * Properties of "user" objects.
 * </pre>
 *
 * Protobuf type {@code aserto.directory.schema.v2.UserProperties}
 */
public final class UserProperties extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.schema.v2.UserProperties)
    UserPropertiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserProperties.newBuilder() to construct.
  private UserProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserProperties() {
    email_ = "";
    picture_ = "";
    status_ = 0;
    connectionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserProperties();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.schema.v2.UserProto.internal_static_aserto_directory_schema_v2_UserProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.schema.v2.UserProto.internal_static_aserto_directory_schema_v2_UserProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.schema.v2.UserProperties.class, com.aserto.directory.schema.v2.UserProperties.Builder.class);
  }

  public static final int EMAIL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object email_ = "";
  /**
   * <pre>
   * main email address of user
   * </pre>
   *
   * <code>string email = 1 [json_name = "email"];</code>
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * main email address of user
   * </pre>
   *
   * <code>string email = 1 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PICTURE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object picture_ = "";
  /**
   * <pre>
   * URL to user's picture
   * </pre>
   *
   * <code>string picture = 2 [json_name = "picture"];</code>
   * @return The picture.
   */
  @java.lang.Override
  public java.lang.String getPicture() {
    java.lang.Object ref = picture_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      picture_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL to user's picture
   * </pre>
   *
   * <code>string picture = 2 [json_name = "picture"];</code>
   * @return The bytes for picture.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPictureBytes() {
    java.lang.Object ref = picture_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      picture_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_ = 0;
  /**
   * <pre>
   * user lifecycle status
   * </pre>
   *
   * <code>.aserto.directory.schema.v2.UserStatus status = 3 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * user lifecycle status
   * </pre>
   *
   * <code>.aserto.directory.schema.v2.UserStatus status = 3 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public com.aserto.directory.schema.v2.UserStatus getStatus() {
    com.aserto.directory.schema.v2.UserStatus result = com.aserto.directory.schema.v2.UserStatus.forNumber(status_);
    return result == null ? com.aserto.directory.schema.v2.UserStatus.UNRECOGNIZED : result;
  }

  public static final int ENABLED_FIELD_NUMBER = 4;
  private boolean enabled_ = false;
  /**
   * <pre>
   * enabled (false prevents the user from accessing anything)
   * </pre>
   *
   * <code>bool enabled = 4 [json_name = "enabled"];</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int CONNECTION_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object connectionId_ = "";
  /**
   * <pre>
   * ID of the IDP connection the user is associated with.
   * </pre>
   *
   * <code>string connection_id = 5 [json_name = "connectionId"];</code>
   * @return The connectionId.
   */
  @java.lang.Override
  public java.lang.String getConnectionId() {
    java.lang.Object ref = connectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      connectionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ID of the IDP connection the user is associated with.
   * </pre>
   *
   * <code>string connection_id = 5 [json_name = "connectionId"];</code>
   * @return The bytes for connectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConnectionIdBytes() {
    java.lang.Object ref = connectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      connectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static com.aserto.directory.schema.v2.UserProperties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.UserProperties parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.schema.v2.UserProperties prototype) {
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
   * Properties of "user" objects.
   * </pre>
   *
   * Protobuf type {@code aserto.directory.schema.v2.UserProperties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.schema.v2.UserProperties)
      com.aserto.directory.schema.v2.UserPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.schema.v2.UserProto.internal_static_aserto_directory_schema_v2_UserProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.schema.v2.UserProto.internal_static_aserto_directory_schema_v2_UserProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.schema.v2.UserProperties.class, com.aserto.directory.schema.v2.UserProperties.Builder.class);
    }

    // Construct using com.aserto.directory.schema.v2.UserProperties.newBuilder()
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
      email_ = "";
      picture_ = "";
      status_ = 0;
      enabled_ = false;
      connectionId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.schema.v2.UserProto.internal_static_aserto_directory_schema_v2_UserProperties_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.UserProperties getDefaultInstanceForType() {
      return com.aserto.directory.schema.v2.UserProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.UserProperties build() {
      com.aserto.directory.schema.v2.UserProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.UserProperties buildPartial() {
      com.aserto.directory.schema.v2.UserProperties result = new com.aserto.directory.schema.v2.UserProperties(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.schema.v2.UserProperties result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.email_ = email_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.picture_ = picture_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.status_ = status_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.enabled_ = enabled_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.connectionId_ = connectionId_;
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

    private java.lang.Object email_ = "";
    /**
     * <pre>
     * main email address of user
     * </pre>
     *
     * <code>string email = 1 [json_name = "email"];</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * main email address of user
     * </pre>
     *
     * <code>string email = 1 [json_name = "email"];</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * main email address of user
     * </pre>
     *
     * <code>string email = 1 [json_name = "email"];</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      email_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * main email address of user
     * </pre>
     *
     * <code>string email = 1 [json_name = "email"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      email_ = getDefaultInstance().getEmail();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * main email address of user
     * </pre>
     *
     * <code>string email = 1 [json_name = "email"];</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      email_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object picture_ = "";
    /**
     * <pre>
     * URL to user's picture
     * </pre>
     *
     * <code>string picture = 2 [json_name = "picture"];</code>
     * @return The picture.
     */
    public java.lang.String getPicture() {
      java.lang.Object ref = picture_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        picture_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL to user's picture
     * </pre>
     *
     * <code>string picture = 2 [json_name = "picture"];</code>
     * @return The bytes for picture.
     */
    public com.google.protobuf.ByteString
        getPictureBytes() {
      java.lang.Object ref = picture_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        picture_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL to user's picture
     * </pre>
     *
     * <code>string picture = 2 [json_name = "picture"];</code>
     * @param value The picture to set.
     * @return This builder for chaining.
     */
    public Builder setPicture(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      picture_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL to user's picture
     * </pre>
     *
     * <code>string picture = 2 [json_name = "picture"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPicture() {
      picture_ = getDefaultInstance().getPicture();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL to user's picture
     * </pre>
     *
     * <code>string picture = 2 [json_name = "picture"];</code>
     * @param value The bytes for picture to set.
     * @return This builder for chaining.
     */
    public Builder setPictureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      picture_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * user lifecycle status
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.UserStatus status = 3 [json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * user lifecycle status
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.UserStatus status = 3 [json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * user lifecycle status
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.UserStatus status = 3 [json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public com.aserto.directory.schema.v2.UserStatus getStatus() {
      com.aserto.directory.schema.v2.UserStatus result = com.aserto.directory.schema.v2.UserStatus.forNumber(status_);
      return result == null ? com.aserto.directory.schema.v2.UserStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * user lifecycle status
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.UserStatus status = 3 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.aserto.directory.schema.v2.UserStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * user lifecycle status
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.UserStatus status = 3 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      status_ = 0;
      onChanged();
      return this;
    }

    private boolean enabled_ ;
    /**
     * <pre>
     * enabled (false prevents the user from accessing anything)
     * </pre>
     *
     * <code>bool enabled = 4 [json_name = "enabled"];</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * enabled (false prevents the user from accessing anything)
     * </pre>
     *
     * <code>bool enabled = 4 [json_name = "enabled"];</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * enabled (false prevents the user from accessing anything)
     * </pre>
     *
     * <code>bool enabled = 4 [json_name = "enabled"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000008);
      enabled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object connectionId_ = "";
    /**
     * <pre>
     * ID of the IDP connection the user is associated with.
     * </pre>
     *
     * <code>string connection_id = 5 [json_name = "connectionId"];</code>
     * @return The connectionId.
     */
    public java.lang.String getConnectionId() {
      java.lang.Object ref = connectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        connectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ID of the IDP connection the user is associated with.
     * </pre>
     *
     * <code>string connection_id = 5 [json_name = "connectionId"];</code>
     * @return The bytes for connectionId.
     */
    public com.google.protobuf.ByteString
        getConnectionIdBytes() {
      java.lang.Object ref = connectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        connectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ID of the IDP connection the user is associated with.
     * </pre>
     *
     * <code>string connection_id = 5 [json_name = "connectionId"];</code>
     * @param value The connectionId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      connectionId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the IDP connection the user is associated with.
     * </pre>
     *
     * <code>string connection_id = 5 [json_name = "connectionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConnectionId() {
      connectionId_ = getDefaultInstance().getConnectionId();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the IDP connection the user is associated with.
     * </pre>
     *
     * <code>string connection_id = 5 [json_name = "connectionId"];</code>
     * @param value The bytes for connectionId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      connectionId_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.schema.v2.UserProperties)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.schema.v2.UserProperties)
  private static final com.aserto.directory.schema.v2.UserProperties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.schema.v2.UserProperties();
  }

  public static com.aserto.directory.schema.v2.UserProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserProperties>
      PARSER = new com.google.protobuf.AbstractParser<UserProperties>() {
    @java.lang.Override
    public UserProperties parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.schema.v2.UserProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

