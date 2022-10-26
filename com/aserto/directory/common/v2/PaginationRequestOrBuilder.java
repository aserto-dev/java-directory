// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v2/common.proto

package com.aserto.directory.common.v2;

public interface PaginationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v2.PaginationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * requested page size, valid value between 1-100 rows (default 100)
   * </pre>
   *
   * <code>int32 size = 1 [json_name = "size"];</code>
   * @return The size.
   */
  int getSize();

  /**
   * <pre>
   * pagination start token, default ""
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * pagination start token, default ""
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
