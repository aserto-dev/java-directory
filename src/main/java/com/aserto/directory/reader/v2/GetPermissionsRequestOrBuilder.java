// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.reader.v2;

public interface GetPermissionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetPermissionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
   * @return The page.
   */
  com.aserto.directory.common.v2.PaginationRequest getPage();
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
   */
  com.aserto.directory.common.v2.PaginationRequestOrBuilder getPageOrBuilder();
}
