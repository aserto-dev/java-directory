// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/schema/v2/identity.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.schema.v2;

/**
 * <pre>
 * Properties of "identity" objects.
 * </pre>
 *
 * Protobuf type {@code aserto.directory.schema.v2.IdentityProperties}
 */
@java.lang.Deprecated public final class IdentityProperties extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aserto.directory.schema.v2.IdentityProperties)
    IdentityPropertiesOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      IdentityProperties.class.getName());
  }
  // Use IdentityProperties.newBuilder() to construct.
  private IdentityProperties(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private IdentityProperties() {
    kind_ = 0;
    provider_ = "";
    connectionId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.schema.v2.IdentityProto.internal_static_aserto_directory_schema_v2_IdentityProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.schema.v2.IdentityProto.internal_static_aserto_directory_schema_v2_IdentityProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.schema.v2.IdentityProperties.class, com.aserto.directory.schema.v2.IdentityProperties.Builder.class);
  }

  private int bitField0_;
  public static final int KIND_FIELD_NUMBER = 1;
  private int kind_ = 0;
  /**
   * <pre>
   * identity kind [email|username|uid|pid|dn|phone]
   * </pre>
   *
   * <code>.aserto.directory.schema.v2.IdentityKind kind = 1 [json_name = "kind"];</code>
   * @return The enum numeric value on the wire for kind.
   */
  @java.lang.Override public int getKindValue() {
    return kind_;
  }
  /**
   * <pre>
   * identity kind [email|username|uid|pid|dn|phone]
   * </pre>
   *
   * <code>.aserto.directory.schema.v2.IdentityKind kind = 1 [json_name = "kind"];</code>
   * @return The kind.
   */
  @java.lang.Override public com.aserto.directory.schema.v2.IdentityKind getKind() {
    com.aserto.directory.schema.v2.IdentityKind result = com.aserto.directory.schema.v2.IdentityKind.forNumber(kind_);
    return result == null ? com.aserto.directory.schema.v2.IdentityKind.UNRECOGNIZED : result;
  }

  public static final int PROVIDER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object provider_ = "";
  /**
   * <pre>
   * identity provider name
   * </pre>
   *
   * <code>string provider = 2 [json_name = "provider"];</code>
   * @return The provider.
   */
  @java.lang.Override
  public java.lang.String getProvider() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      provider_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * identity provider name
   * </pre>
   *
   * <code>string provider = 2 [json_name = "provider"];</code>
   * @return The bytes for provider.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProviderBytes() {
    java.lang.Object ref = provider_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      provider_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERIFIED_FIELD_NUMBER = 3;
  private boolean verified_ = false;
  /**
   * <pre>
   * identity has been verified (false when not explicitly specified)
   * </pre>
   *
   * <code>bool verified = 3 [json_name = "verified"];</code>
   * @return The verified.
   */
  @java.lang.Override
  public boolean getVerified() {
    return verified_;
  }

  public static final int CONNECTION_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object connectionId_ = "";
  /**
   * <pre>
   * IDP connection id which owns the object instance
   * </pre>
   *
   * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
   * @return Whether the connectionId field is set.
   */
  @java.lang.Override
  public boolean hasConnectionId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * IDP connection id which owns the object instance
   * </pre>
   *
   * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
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
   * IDP connection id which owns the object instance
   * </pre>
   *
   * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
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
    if (kind_ != com.aserto.directory.schema.v2.IdentityKind.IDENTITY_KIND_UNKNOWN.getNumber()) {
      output.writeEnum(1, kind_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(provider_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, provider_);
    }
    if (verified_ != false) {
      output.writeBool(3, verified_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, connectionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kind_ != com.aserto.directory.schema.v2.IdentityKind.IDENTITY_KIND_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, kind_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(provider_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, provider_);
    }
    if (verified_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, verified_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, connectionId_);
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
    if (!(obj instanceof com.aserto.directory.schema.v2.IdentityProperties)) {
      return super.equals(obj);
    }
    com.aserto.directory.schema.v2.IdentityProperties other = (com.aserto.directory.schema.v2.IdentityProperties) obj;

    if (kind_ != other.kind_) return false;
    if (!getProvider()
        .equals(other.getProvider())) return false;
    if (getVerified()
        != other.getVerified()) return false;
    if (hasConnectionId() != other.hasConnectionId()) return false;
    if (hasConnectionId()) {
      if (!getConnectionId()
          .equals(other.getConnectionId())) return false;
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
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + kind_;
    hash = (37 * hash) + PROVIDER_FIELD_NUMBER;
    hash = (53 * hash) + getProvider().hashCode();
    hash = (37 * hash) + VERIFIED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getVerified());
    if (hasConnectionId()) {
      hash = (37 * hash) + CONNECTION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConnectionId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.directory.schema.v2.IdentityProperties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.IdentityProperties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.IdentityProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.IdentityProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.IdentityProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.schema.v2.IdentityProperties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.IdentityProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.IdentityProperties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.schema.v2.IdentityProperties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.schema.v2.IdentityProperties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.schema.v2.IdentityProperties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.schema.v2.IdentityProperties parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.schema.v2.IdentityProperties prototype) {
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
   * Properties of "identity" objects.
   * </pre>
   *
   * Protobuf type {@code aserto.directory.schema.v2.IdentityProperties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.schema.v2.IdentityProperties)
      com.aserto.directory.schema.v2.IdentityPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.schema.v2.IdentityProto.internal_static_aserto_directory_schema_v2_IdentityProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.schema.v2.IdentityProto.internal_static_aserto_directory_schema_v2_IdentityProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.schema.v2.IdentityProperties.class, com.aserto.directory.schema.v2.IdentityProperties.Builder.class);
    }

    // Construct using com.aserto.directory.schema.v2.IdentityProperties.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      kind_ = 0;
      provider_ = "";
      verified_ = false;
      connectionId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.schema.v2.IdentityProto.internal_static_aserto_directory_schema_v2_IdentityProperties_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.IdentityProperties getDefaultInstanceForType() {
      return com.aserto.directory.schema.v2.IdentityProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.IdentityProperties build() {
      com.aserto.directory.schema.v2.IdentityProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.schema.v2.IdentityProperties buildPartial() {
      com.aserto.directory.schema.v2.IdentityProperties result = new com.aserto.directory.schema.v2.IdentityProperties(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.schema.v2.IdentityProperties result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.provider_ = provider_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.verified_ = verified_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.connectionId_ = connectionId_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aserto.directory.schema.v2.IdentityProperties) {
        return mergeFrom((com.aserto.directory.schema.v2.IdentityProperties)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.directory.schema.v2.IdentityProperties other) {
      if (other == com.aserto.directory.schema.v2.IdentityProperties.getDefaultInstance()) return this;
      if (other.kind_ != 0) {
        setKindValue(other.getKindValue());
      }
      if (!other.getProvider().isEmpty()) {
        provider_ = other.provider_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getVerified() != false) {
        setVerified(other.getVerified());
      }
      if (other.hasConnectionId()) {
        connectionId_ = other.connectionId_;
        bitField0_ |= 0x00000008;
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
            case 8: {
              kind_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              provider_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              verified_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              connectionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int kind_ = 0;
    /**
     * <pre>
     * identity kind [email|username|uid|pid|dn|phone]
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.IdentityKind kind = 1 [json_name = "kind"];</code>
     * @return The enum numeric value on the wire for kind.
     */
    @java.lang.Override public int getKindValue() {
      return kind_;
    }
    /**
     * <pre>
     * identity kind [email|username|uid|pid|dn|phone]
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.IdentityKind kind = 1 [json_name = "kind"];</code>
     * @param value The enum numeric value on the wire for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindValue(int value) {
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identity kind [email|username|uid|pid|dn|phone]
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.IdentityKind kind = 1 [json_name = "kind"];</code>
     * @return The kind.
     */
    @java.lang.Override
    public com.aserto.directory.schema.v2.IdentityKind getKind() {
      com.aserto.directory.schema.v2.IdentityKind result = com.aserto.directory.schema.v2.IdentityKind.forNumber(kind_);
      return result == null ? com.aserto.directory.schema.v2.IdentityKind.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * identity kind [email|username|uid|pid|dn|phone]
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.IdentityKind kind = 1 [json_name = "kind"];</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(com.aserto.directory.schema.v2.IdentityKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identity kind [email|username|uid|pid|dn|phone]
     * </pre>
     *
     * <code>.aserto.directory.schema.v2.IdentityKind kind = 1 [json_name = "kind"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kind_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object provider_ = "";
    /**
     * <pre>
     * identity provider name
     * </pre>
     *
     * <code>string provider = 2 [json_name = "provider"];</code>
     * @return The provider.
     */
    public java.lang.String getProvider() {
      java.lang.Object ref = provider_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        provider_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * identity provider name
     * </pre>
     *
     * <code>string provider = 2 [json_name = "provider"];</code>
     * @return The bytes for provider.
     */
    public com.google.protobuf.ByteString
        getProviderBytes() {
      java.lang.Object ref = provider_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        provider_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * identity provider name
     * </pre>
     *
     * <code>string provider = 2 [json_name = "provider"];</code>
     * @param value The provider to set.
     * @return This builder for chaining.
     */
    public Builder setProvider(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      provider_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identity provider name
     * </pre>
     *
     * <code>string provider = 2 [json_name = "provider"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProvider() {
      provider_ = getDefaultInstance().getProvider();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identity provider name
     * </pre>
     *
     * <code>string provider = 2 [json_name = "provider"];</code>
     * @param value The bytes for provider to set.
     * @return This builder for chaining.
     */
    public Builder setProviderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      provider_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean verified_ ;
    /**
     * <pre>
     * identity has been verified (false when not explicitly specified)
     * </pre>
     *
     * <code>bool verified = 3 [json_name = "verified"];</code>
     * @return The verified.
     */
    @java.lang.Override
    public boolean getVerified() {
      return verified_;
    }
    /**
     * <pre>
     * identity has been verified (false when not explicitly specified)
     * </pre>
     *
     * <code>bool verified = 3 [json_name = "verified"];</code>
     * @param value The verified to set.
     * @return This builder for chaining.
     */
    public Builder setVerified(boolean value) {

      verified_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identity has been verified (false when not explicitly specified)
     * </pre>
     *
     * <code>bool verified = 3 [json_name = "verified"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVerified() {
      bitField0_ = (bitField0_ & ~0x00000004);
      verified_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object connectionId_ = "";
    /**
     * <pre>
     * IDP connection id which owns the object instance
     * </pre>
     *
     * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
     * @return Whether the connectionId field is set.
     */
    public boolean hasConnectionId() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * IDP connection id which owns the object instance
     * </pre>
     *
     * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
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
     * IDP connection id which owns the object instance
     * </pre>
     *
     * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
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
     * IDP connection id which owns the object instance
     * </pre>
     *
     * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
     * @param value The connectionId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      connectionId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDP connection id which owns the object instance
     * </pre>
     *
     * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConnectionId() {
      connectionId_ = getDefaultInstance().getConnectionId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDP connection id which owns the object instance
     * </pre>
     *
     * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
     * @param value The bytes for connectionId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      connectionId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:aserto.directory.schema.v2.IdentityProperties)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.schema.v2.IdentityProperties)
  private static final com.aserto.directory.schema.v2.IdentityProperties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.schema.v2.IdentityProperties();
  }

  public static com.aserto.directory.schema.v2.IdentityProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdentityProperties>
      PARSER = new com.google.protobuf.AbstractParser<IdentityProperties>() {
    @java.lang.Override
    public IdentityProperties parsePartialFrom(
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

  public static com.google.protobuf.Parser<IdentityProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdentityProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.schema.v2.IdentityProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

