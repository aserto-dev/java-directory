// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v2/identity.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.schema.v2;

@java.lang.Deprecated public interface IdentityPropertiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.schema.v2.IdentityProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * identity kind [email|username|uid|pid|dn|phone]
   * </pre>
   *
   * <code>.aserto.directory.schema.v2.IdentityKind kind = 1 [json_name = "kind"];</code>
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   * <pre>
   * identity kind [email|username|uid|pid|dn|phone]
   * </pre>
   *
   * <code>.aserto.directory.schema.v2.IdentityKind kind = 1 [json_name = "kind"];</code>
   * @return The kind.
   */
  com.aserto.directory.schema.v2.IdentityKind getKind();

  /**
   * <pre>
   * identity provider name
   * </pre>
   *
   * <code>string provider = 2 [json_name = "provider"];</code>
   * @return The provider.
   */
  java.lang.String getProvider();
  /**
   * <pre>
   * identity provider name
   * </pre>
   *
   * <code>string provider = 2 [json_name = "provider"];</code>
   * @return The bytes for provider.
   */
  com.google.protobuf.ByteString
      getProviderBytes();

  /**
   * <pre>
   * identity has been verified (false when not explicitly specified)
   * </pre>
   *
   * <code>bool verified = 3 [json_name = "verified"];</code>
   * @return The verified.
   */
  boolean getVerified();

  /**
   * <pre>
   * IDP connection id which owns the object instance
   * </pre>
   *
   * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
   * @return Whether the connectionId field is set.
   */
  boolean hasConnectionId();
  /**
   * <pre>
   * IDP connection id which owns the object instance
   * </pre>
   *
   * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <pre>
   * IDP connection id which owns the object instance
   * </pre>
   *
   * <code>optional string connection_id = 4 [json_name = "connectionId"];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();
}
