// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v2/group.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.schema.v2;

public interface GroupPropertiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.schema.v2.GroupProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the IDP connection the group instance is associated with.
   * </pre>
   *
   * <code>string connection_id = 1 [json_name = "connectionId"];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <pre>
   * ID of the IDP connection the group instance is associated with.
   * </pre>
   *
   * <code>string connection_id = 1 [json_name = "connectionId"];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();
}
