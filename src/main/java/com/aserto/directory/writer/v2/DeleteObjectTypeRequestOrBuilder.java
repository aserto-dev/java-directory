// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/writer/v2/writer.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.writer.v2;

@java.lang.Deprecated public interface DeleteObjectTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.writer.v2.DeleteObjectTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectTypeIdentifier param = 1 [json_name = "param"];</code>
   * @return Whether the param field is set.
   */
  boolean hasParam();
  /**
   * <pre>
   * object type identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectTypeIdentifier param = 1 [json_name = "param"];</code>
   * @return The param.
   */
  com.aserto.directory.common.v2.ObjectTypeIdentifier getParam();
  /**
   * <pre>
   * object type identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectTypeIdentifier param = 1 [json_name = "param"];</code>
   */
  com.aserto.directory.common.v2.ObjectTypeIdentifierOrBuilder getParamOrBuilder();
}
