// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/exporter/v2/exporter.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.exporter.v2;

public interface ExportResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.exporter.v2.ExportResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object object = 2 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <pre>
   * object instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object object = 2 [json_name = "object"];</code>
   * @return The object.
   */
  com.aserto.directory.common.v2.Object getObject();
  /**
   * <pre>
   * object instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object object = 2 [json_name = "object"];</code>
   */
  com.aserto.directory.common.v2.ObjectOrBuilder getObjectOrBuilder();

  /**
   * <pre>
   * object type instance (metadata)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType object_type = 3 [json_name = "objectType"];</code>
   * @return Whether the objectType field is set.
   */
  boolean hasObjectType();
  /**
   * <pre>
   * object type instance (metadata)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType object_type = 3 [json_name = "objectType"];</code>
   * @return The objectType.
   */
  com.aserto.directory.common.v2.ObjectType getObjectType();
  /**
   * <pre>
   * object type instance (metadata)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectType object_type = 3 [json_name = "objectType"];</code>
   */
  com.aserto.directory.common.v2.ObjectTypeOrBuilder getObjectTypeOrBuilder();

  /**
   * <pre>
   * relation instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Relation relation = 4 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * relation instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Relation relation = 4 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.aserto.directory.common.v2.Relation getRelation();
  /**
   * <pre>
   * relation instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Relation relation = 4 [json_name = "relation"];</code>
   */
  com.aserto.directory.common.v2.RelationOrBuilder getRelationOrBuilder();

  /**
   * <pre>
   * relation type instance (metadata)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType relation_type = 5 [json_name = "relationType"];</code>
   * @return Whether the relationType field is set.
   */
  boolean hasRelationType();
  /**
   * <pre>
   * relation type instance (metadata)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType relation_type = 5 [json_name = "relationType"];</code>
   * @return The relationType.
   */
  com.aserto.directory.common.v2.RelationType getRelationType();
  /**
   * <pre>
   * relation type instance (metadata)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType relation_type = 5 [json_name = "relationType"];</code>
   */
  com.aserto.directory.common.v2.RelationTypeOrBuilder getRelationTypeOrBuilder();

  /**
   * <pre>
   * permission instance (metadata)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission permission = 6 [json_name = "permission"];</code>
   * @return Whether the permission field is set.
   */
  boolean hasPermission();
  /**
   * <pre>
   * permission instance (metadata)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission permission = 6 [json_name = "permission"];</code>
   * @return The permission.
   */
  com.aserto.directory.common.v2.Permission getPermission();
  /**
   * <pre>
   * permission instance (metadata)
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission permission = 6 [json_name = "permission"];</code>
   */
  com.aserto.directory.common.v2.PermissionOrBuilder getPermissionOrBuilder();

  com.aserto.directory.exporter.v2.ExportResponse.MsgCase getMsgCase();
}
