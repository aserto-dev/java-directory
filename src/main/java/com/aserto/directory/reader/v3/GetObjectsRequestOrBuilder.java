// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v3/reader.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.reader.v3;

public interface GetObjectsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v3.GetObjectsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object type name (lc-string)
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The objectType.
   */
  java.lang.String getObjectType();
  /**
   * <pre>
   * object type name (lc-string)
   * </pre>
   *
   * <code>string object_type = 1 [json_name = "objectType", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for objectType.
   */
  com.google.protobuf.ByteString
      getObjectTypeBytes();

  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v3.PaginationRequest page = 9 [json_name = "page", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v3.PaginationRequest page = 9 [json_name = "page", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The page.
   */
  com.aserto.directory.common.v3.PaginationRequest getPage();
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v3.PaginationRequest page = 9 [json_name = "page", (.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.aserto.directory.common.v3.PaginationRequestOrBuilder getPageOrBuilder();
}
