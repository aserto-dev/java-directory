// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.2
package com.aserto.directory.reader.v2;

public interface GetObjectTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetObjectTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectTypeIdentifier param = 1 [json_name = "param"];</code>
   * @return Whether the param field is set.
   */
  boolean hasParam();
  /**
   * <pre>
   * object type selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectTypeIdentifier param = 1 [json_name = "param"];</code>
   * @return The param.
   */
  com.aserto.directory.common.v2.ObjectTypeIdentifier getParam();
  /**
   * <pre>
   * object type selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectTypeIdentifier param = 1 [json_name = "param"];</code>
   */
  com.aserto.directory.common.v2.ObjectTypeIdentifierOrBuilder getParamOrBuilder();
}
