// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v3/common.proto

// Protobuf Java Version: 3.25.2
package com.aserto.directory.common.v3;

public interface PaginationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v3.PaginationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * requested page size, valid value between 1-100 rows (default 100)
   * </pre>
   *
   * <code>int32 size = 1 [json_name = "size", (.google.api.field_behavior) = OPTIONAL, (.buf.validate.field) = { ... }</code>
   * @return The size.
   */
  int getSize();

  /**
   * <pre>
   * pagination start token, default ""
   * </pre>
   *
   * <code>string token = 2 [json_name = "token", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * pagination start token, default ""
   * </pre>
   *
   * <code>string token = 2 [json_name = "token", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
