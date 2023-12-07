// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v2/common.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.common.v2;

public interface RelationTypeIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v2.RelationTypeIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * relation type name selector
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * relation type name selector
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * relation type name selector
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * object type referenced by relation
   * </pre>
   *
   * <code>optional string object_type = 3 [json_name = "objectType"];</code>
   * @return Whether the objectType field is set.
   */
  boolean hasObjectType();
  /**
   * <pre>
   * object type referenced by relation
   * </pre>
   *
   * <code>optional string object_type = 3 [json_name = "objectType"];</code>
   * @return The objectType.
   */
  java.lang.String getObjectType();
  /**
   * <pre>
   * object type referenced by relation
   * </pre>
   *
   * <code>optional string object_type = 3 [json_name = "objectType"];</code>
   * @return The bytes for objectType.
   */
  com.google.protobuf.ByteString
      getObjectTypeBytes();
}
