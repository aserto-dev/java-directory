// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.writer.v2;

@java.lang.Deprecated public interface DeletePermissionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.writer.v2.DeletePermissionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * permission identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PermissionIdentifier param = 1 [json_name = "param"];</code>
   * @return Whether the param field is set.
   */
  boolean hasParam();
  /**
   * <pre>
   * permission identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PermissionIdentifier param = 1 [json_name = "param"];</code>
   * @return The param.
   */
  com.aserto.directory.common.v2.PermissionIdentifier getParam();
  /**
   * <pre>
   * permission identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PermissionIdentifier param = 1 [json_name = "param"];</code>
   */
  com.aserto.directory.common.v2.PermissionIdentifierOrBuilder getParamOrBuilder();
}
