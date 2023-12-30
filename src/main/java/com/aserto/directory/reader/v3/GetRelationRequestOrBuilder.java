// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v3/reader.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.reader.v3;

public interface GetRelationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v3.GetRelationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The objectType.
   */
  java.lang.String getObjectType();
  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for objectType.
   */
  com.google.protobuf.ByteString
      getObjectTypeBytes();

  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The objectId.
   */
  java.lang.String getObjectId();
  /**
   * <pre>
   * object identifier
   * </pre>
   *
   * <code>string object_id = 2 [json_name = "objectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for objectId.
   */
  com.google.protobuf.ByteString
      getObjectIdBytes();

  /**
   * <pre>
   * relation name
   * </pre>
   *
   * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The relation.
   */
  java.lang.String getRelation();
  /**
   * <pre>
   * relation name
   * </pre>
   *
   * <code>string relation = 3 [json_name = "relation", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for relation.
   */
  com.google.protobuf.ByteString
      getRelationBytes();

  /**
   * <pre>
   * subject type
   * </pre>
   *
   * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The subjectType.
   */
  java.lang.String getSubjectType();
  /**
   * <pre>
   * subject type
   * </pre>
   *
   * <code>string subject_type = 4 [json_name = "subjectType", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for subjectType.
   */
  com.google.protobuf.ByteString
      getSubjectTypeBytes();

  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The subjectId.
   */
  java.lang.String getSubjectId();
  /**
   * <pre>
   * subject identifier
   * </pre>
   *
   * <code>string subject_id = 5 [json_name = "subjectId", (.google.api.field_behavior) = REQUIRED, (.buf.validate.field) = { ... }</code>
   * @return The bytes for subjectId.
   */
  com.google.protobuf.ByteString
      getSubjectIdBytes();

  /**
   * <pre>
   * optional subject relation name
   * </pre>
   *
   * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OPTIONAL, (.buf.validate.field) = { ... }</code>
   * @return The subjectRelation.
   */
  java.lang.String getSubjectRelation();
  /**
   * <pre>
   * optional subject relation name
   * </pre>
   *
   * <code>string subject_relation = 6 [json_name = "subjectRelation", (.google.api.field_behavior) = OPTIONAL, (.buf.validate.field) = { ... }</code>
   * @return The bytes for subjectRelation.
   */
  com.google.protobuf.ByteString
      getSubjectRelationBytes();

  /**
   * <pre>
   * materialize relation objects
   * </pre>
   *
   * <code>bool with_objects = 7 [json_name = "withObjects", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The withObjects.
   */
  boolean getWithObjects();
}