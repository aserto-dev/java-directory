// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

// Protobuf Java Version: 3.25.2
package com.aserto.directory.writer.v2;

public interface SetObjectResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.writer.v2.SetObjectResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * object instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  com.aserto.directory.common.v2.Object getResult();
  /**
   * <pre>
   * object instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object result = 1 [json_name = "result"];</code>
   */
  com.aserto.directory.common.v2.ObjectOrBuilder getResultOrBuilder();
}
