// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.reader.v2;

public interface GetPermissionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetPermissionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * permission selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PermissionIdentifier param = 1 [json_name = "param"];</code>
   * @return Whether the param field is set.
   */
  boolean hasParam();
  /**
   * <pre>
   * permission selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PermissionIdentifier param = 1 [json_name = "param"];</code>
   * @return The param.
   */
  com.aserto.directory.common.v2.PermissionIdentifier getParam();
  /**
   * <pre>
   * permission selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PermissionIdentifier param = 1 [json_name = "param"];</code>
   */
  com.aserto.directory.common.v2.PermissionIdentifierOrBuilder getParamOrBuilder();
}
