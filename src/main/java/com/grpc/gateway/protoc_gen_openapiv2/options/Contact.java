// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

// Protobuf Java Version: 3.25.1
package com.grpc.gateway.protoc_gen_openapiv2.options;

/**
 * <pre>
 * `Contact` is a representation of OpenAPI v2 specification's Contact object.
 *
 * See: https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/2.0.md#contactObject
 *
 * Example:
 *
 *  option (grpc.gateway.protoc_gen_openapiv2.options.openapiv2_swagger) = {
 *    info: {
 *      ...
 *      contact: {
 *        name: "gRPC-Gateway project";
 *        url: "https://github.com/grpc-ecosystem/grpc-gateway";
 *        email: "none&#64;example.com";
 *      };
 *      ...
 *    };
 *    ...
 *  };
 * </pre>
 *
 * Protobuf type {@code grpc.gateway.protoc_gen_openapiv2.options.Contact}
 */
public final class Contact extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.gateway.protoc_gen_openapiv2.options.Contact)
    ContactOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Contact.newBuilder() to construct.
  private Contact(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Contact() {
    name_ = "";
    url_ = "";
    email_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Contact();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Contact_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Contact_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.gateway.protoc_gen_openapiv2.options.Contact.class, com.grpc.gateway.protoc_gen_openapiv2.options.Contact.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The identifying name of the contact person/organization.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
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
   * The identifying name of the contact person/organization.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
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

  public static final int URL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   * <pre>
   * The URL pointing to the contact information. MUST be in the format of a
   * URL.
   * </pre>
   *
   * <code>string url = 2 [json_name = "url"];</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The URL pointing to the contact information. MUST be in the format of a
   * URL.
   * </pre>
   *
   * <code>string url = 2 [json_name = "url"];</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object email_ = "";
  /**
   * <pre>
   * The email address of the contact person/organization. MUST be in the format
   * of an email address.
   * </pre>
   *
   * <code>string email = 3 [json_name = "email"];</code>
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
   * The email address of the contact person/organization. MUST be in the format
   * of an email address.
   * </pre>
   *
   * <code>string email = 3 [json_name = "email"];</code>
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

  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact parseFrom(
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
  public static Builder newBuilder(com.grpc.gateway.protoc_gen_openapiv2.options.Contact prototype) {
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
   * `Contact` is a representation of OpenAPI v2 specification's Contact object.
   *
   * See: https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/2.0.md#contactObject
   *
   * Example:
   *
   *  option (grpc.gateway.protoc_gen_openapiv2.options.openapiv2_swagger) = {
   *    info: {
   *      ...
   *      contact: {
   *        name: "gRPC-Gateway project";
   *        url: "https://github.com/grpc-ecosystem/grpc-gateway";
   *        email: "none&#64;example.com";
   *      };
   *      ...
   *    };
   *    ...
   *  };
   * </pre>
   *
   * Protobuf type {@code grpc.gateway.protoc_gen_openapiv2.options.Contact}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.gateway.protoc_gen_openapiv2.options.Contact)
      com.grpc.gateway.protoc_gen_openapiv2.options.ContactOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Contact_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Contact_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.gateway.protoc_gen_openapiv2.options.Contact.class, com.grpc.gateway.protoc_gen_openapiv2.options.Contact.Builder.class);
    }

    // Construct using com.grpc.gateway.protoc_gen_openapiv2.options.Contact.newBuilder()
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
      url_ = "";
      email_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.gateway.protoc_gen_openapiv2.options.Openapiv2Proto.internal_static_grpc_gateway_protoc_gen_openapiv2_options_Contact_descriptor;
    }

    @java.lang.Override
    public com.grpc.gateway.protoc_gen_openapiv2.options.Contact getDefaultInstanceForType() {
      return com.grpc.gateway.protoc_gen_openapiv2.options.Contact.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.gateway.protoc_gen_openapiv2.options.Contact build() {
      com.grpc.gateway.protoc_gen_openapiv2.options.Contact result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.gateway.protoc_gen_openapiv2.options.Contact buildPartial() {
      com.grpc.gateway.protoc_gen_openapiv2.options.Contact result = new com.grpc.gateway.protoc_gen_openapiv2.options.Contact(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.grpc.gateway.protoc_gen_openapiv2.options.Contact result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.url_ = url_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.email_ = email_;
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The identifying name of the contact person/organization.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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
     * The identifying name of the contact person/organization.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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
     * The identifying name of the contact person/organization.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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
     * The identifying name of the contact person/organization.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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
     * The identifying name of the contact person/organization.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * The URL pointing to the contact information. MUST be in the format of a
     * URL.
     * </pre>
     *
     * <code>string url = 2 [json_name = "url"];</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URL pointing to the contact information. MUST be in the format of a
     * URL.
     * </pre>
     *
     * <code>string url = 2 [json_name = "url"];</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URL pointing to the contact information. MUST be in the format of a
     * URL.
     * </pre>
     *
     * <code>string url = 2 [json_name = "url"];</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      url_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL pointing to the contact information. MUST be in the format of a
     * URL.
     * </pre>
     *
     * <code>string url = 2 [json_name = "url"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URL pointing to the contact information. MUST be in the format of a
     * URL.
     * </pre>
     *
     * <code>string url = 2 [json_name = "url"];</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <pre>
     * The email address of the contact person/organization. MUST be in the format
     * of an email address.
     * </pre>
     *
     * <code>string email = 3 [json_name = "email"];</code>
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
     * The email address of the contact person/organization. MUST be in the format
     * of an email address.
     * </pre>
     *
     * <code>string email = 3 [json_name = "email"];</code>
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
     * The email address of the contact person/organization. MUST be in the format
     * of an email address.
     * </pre>
     *
     * <code>string email = 3 [json_name = "email"];</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      email_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The email address of the contact person/organization. MUST be in the format
     * of an email address.
     * </pre>
     *
     * <code>string email = 3 [json_name = "email"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      email_ = getDefaultInstance().getEmail();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The email address of the contact person/organization. MUST be in the format
     * of an email address.
     * </pre>
     *
     * <code>string email = 3 [json_name = "email"];</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      email_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:grpc.gateway.protoc_gen_openapiv2.options.Contact)
  }

  // @@protoc_insertion_point(class_scope:grpc.gateway.protoc_gen_openapiv2.options.Contact)
  private static final com.grpc.gateway.protoc_gen_openapiv2.options.Contact DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.gateway.protoc_gen_openapiv2.options.Contact();
  }

  public static com.grpc.gateway.protoc_gen_openapiv2.options.Contact getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Contact>
      PARSER = new com.google.protobuf.AbstractParser<Contact>() {
    @java.lang.Override
    public Contact parsePartialFrom(
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

  public static com.google.protobuf.Parser<Contact> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Contact> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.gateway.protoc_gen_openapiv2.options.Contact getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
