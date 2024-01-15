// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v3/common.proto

// Protobuf Java Version: 3.25.2
package com.aserto.directory.common.v3;

public interface ObjectTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v3.ObjectType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type name (lc-string)
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * object type name (lc-string)
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * relations associated to object type
   * </pre>
   *
   * <code>repeated string relations = 2 [json_name = "relations", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the relations.
   */
  java.util.List<java.lang.String>
      getRelationsList();
  /**
   * <pre>
   * relations associated to object type
   * </pre>
   *
   * <code>repeated string relations = 2 [json_name = "relations", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of relations.
   */
  int getRelationsCount();
  /**
   * <pre>
   * relations associated to object type
   * </pre>
   *
   * <code>repeated string relations = 2 [json_name = "relations", (.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The relations at the given index.
   */
  java.lang.String getRelations(int index);
  /**
   * <pre>
   * relations associated to object type
   * </pre>
   *
   * <code>repeated string relations = 2 [json_name = "relations", (.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the relations at the given index.
   */
  com.google.protobuf.ByteString
      getRelationsBytes(int index);

  /**
   * <pre>
   * permissions associated to object type
   * </pre>
   *
   * <code>repeated string permissions = 3 [json_name = "permissions", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the permissions.
   */
  java.util.List<java.lang.String>
      getPermissionsList();
  /**
   * <pre>
   * permissions associated to object type
   * </pre>
   *
   * <code>repeated string permissions = 3 [json_name = "permissions", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <pre>
   * permissions associated to object type
   * </pre>
   *
   * <code>repeated string permissions = 3 [json_name = "permissions", (.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  java.lang.String getPermissions(int index);
  /**
   * <pre>
   * permissions associated to object type
   * </pre>
   *
   * <code>repeated string permissions = 3 [json_name = "permissions", (.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  com.google.protobuf.ByteString
      getPermissionsBytes(int index);
}
