// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/common/v2/common.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.common.v2;

@java.lang.Deprecated public interface RelationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v2.Relation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
   * @return The subject.
   */
  com.aserto.directory.common.v2.ObjectIdentifier getSubject();
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
   */
  com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getSubjectOrBuilder();

  /**
   * <pre>
   * relation type name
   * </pre>
   *
   * <code>string relation = 2 [json_name = "relation"];</code>
   * @return The relation.
   */
  java.lang.String getRelation();
  /**
   * <pre>
   * relation type name
   * </pre>
   *
   * <code>string relation = 2 [json_name = "relation"];</code>
   * @return The bytes for relation.
   */
  com.google.protobuf.ByteString
      getRelationBytes();

  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
   * @return The object.
   */
  com.aserto.directory.common.v2.ObjectIdentifier getObject();
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
   */
  com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getObjectOrBuilder();

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
