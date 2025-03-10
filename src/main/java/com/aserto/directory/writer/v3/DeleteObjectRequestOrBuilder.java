// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v3/writer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.writer.v3;

public interface DeleteObjectRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.writer.v3.DeleteObjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The objectType.
   */
  java.lang.String getObjectType();
  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for objectType.
   */
  com.google.protobuf.ByteString
      getObjectTypeBytes();

  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <pre>
   * delete object relations, both object and subject relations.
   * </pre>
   *
   * <code>bool with_relations = 3 [json_name = "withRelations", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The withRelations.
   */
  boolean getWithRelations();
}
