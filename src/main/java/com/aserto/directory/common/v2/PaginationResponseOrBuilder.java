// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v2/common.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.common.v2;

public interface PaginationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.common.v2.PaginationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * next page token, when empty there are no more pages to fetch
   * </pre>
   *
   * <code>string next_token = 1 [json_name = "nextToken"];</code>
   * @return The nextToken.
   */
  java.lang.String getNextToken();
  /**
   * <pre>
   * next page token, when empty there are no more pages to fetch
   * </pre>
   *
   * <code>string next_token = 1 [json_name = "nextToken"];</code>
   * @return The bytes for nextToken.
   */
  com.google.protobuf.ByteString
      getNextTokenBytes();

  /**
   * <pre>
   * result size of the page returned
   * </pre>
   *
   * <code>int32 result_size = 2 [json_name = "resultSize"];</code>
   * @return The resultSize.
   */
  int getResultSize();
}
