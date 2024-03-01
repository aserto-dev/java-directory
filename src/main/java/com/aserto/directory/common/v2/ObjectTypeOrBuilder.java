// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v2/common.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.common.v2;

public interface ObjectTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v2.ObjectType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type name (unique, lc-string)
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * object type name (unique, lc-string)
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * object type display name
   * </pre>
   *
   * <code>string display_name = 3 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * object type display name
   * </pre>
   *
   * <code>string display_name = 3 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * object type is a subject (user|group) (default false)
   * </pre>
   *
   * <code>bool is_subject = 4 [json_name = "isSubject"];</code>
   * @return The isSubject.
   */
  boolean getIsSubject();

  /**
   * <pre>
   * sort ordinal (default 0)
   * </pre>
   *
   * <code>int32 ordinal = 5 [json_name = "ordinal"];</code>
   * @return The ordinal.
   */
  int getOrdinal();

  /**
   * <pre>
   * status flag bitmap (default 0)
   * </pre>
   *
   * <code>uint32 status = 6 [json_name = "status"];</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <pre>
   * object type schema definition (JSON)
   * </pre>
   *
   * <code>.google.protobuf.Struct schema = 10 [json_name = "schema"];</code>
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   * <pre>
   * object type schema definition (JSON)
   * </pre>
   *
   * <code>.google.protobuf.Struct schema = 10 [json_name = "schema"];</code>
   * @return The schema.
   */
  com.google.protobuf.Struct getSchema();
  /**
   * <pre>
   * object type schema definition (JSON)
   * </pre>
   *
   * <code>.google.protobuf.Struct schema = 10 [json_name = "schema"];</code>
   */
  com.google.protobuf.StructOrBuilder getSchemaOrBuilder();

  /**
   * <pre>
   * created at timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 20 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * created at timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 20 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * created at timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 20 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt"];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <pre>
   * object instance hash
   * </pre>
   *
   * <code>string hash = 23 [json_name = "hash"];</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <pre>
   * object instance hash
   * </pre>
   *
   * <code>string hash = 23 [json_name = "hash"];</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();
}
