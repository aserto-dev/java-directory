// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/reader/v2/reader.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.reader.v2;

@java.lang.Deprecated public interface GetPermissionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetPermissionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * permission instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * permission instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  com.aserto.directory.common.v2.Permission getResult();
  /**
   * <pre>
   * permission instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Permission result = 1 [json_name = "result"];</code>
   */
  com.aserto.directory.common.v2.PermissionOrBuilder getResultOrBuilder();
}
