// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v2/common.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.common.v2;

public interface ObjectTypeIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v2.ObjectTypeIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type name (unique, lc-string)
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * object type name (unique, lc-string)
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * object type name (unique, lc-string)
   * </pre>
   *
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
