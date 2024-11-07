// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/common/v2/common.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.common.v2;

@java.lang.Deprecated public interface ObjectIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v2.ObjectIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>optional string type = 1 [json_name = "type"];</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>optional string type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * object type
   * </pre>
   *
   * <code>optional string type = 1 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * external object key (cs-string)
   * </pre>
   *
   * <code>optional string key = 3 [json_name = "key"];</code>
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   * <pre>
   * external object key (cs-string)
   * </pre>
   *
   * <code>optional string key = 3 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * external object key (cs-string)
   * </pre>
   *
   * <code>optional string key = 3 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();
}
