// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.reader.v2;

public interface GetRelationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetRelationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationIdentifier param = 1 [json_name = "param"];</code>
   * @return Whether the param field is set.
   */
  boolean hasParam();
  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationIdentifier param = 1 [json_name = "param"];</code>
   * @return The param.
   */
  com.aserto.directory.common.v2.RelationIdentifier getParam();
  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationIdentifier param = 1 [json_name = "param"];</code>
   */
  com.aserto.directory.common.v2.RelationIdentifierOrBuilder getParamOrBuilder();

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
