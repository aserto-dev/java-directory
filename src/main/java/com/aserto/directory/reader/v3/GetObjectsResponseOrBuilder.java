// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v3/reader.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.reader.v3;

public interface GetObjectsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v3.GetObjectsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * array of object instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v3.Object results = 1 [json_name = "results"];</code>
   */
  java.util.List<com.aserto.directory.common.v3.Object> 
      getResultsList();
  /**
   * <pre>
   * array of object instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v3.Object results = 1 [json_name = "results"];</code>
   */
  com.aserto.directory.common.v3.Object getResults(int index);
  /**
   * <pre>
   * array of object instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v3.Object results = 1 [json_name = "results"];</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * array of object instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v3.Object results = 1 [json_name = "results"];</code>
   */
  java.util.List<? extends com.aserto.directory.common.v3.ObjectOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * array of object instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v3.Object results = 1 [json_name = "results"];</code>
   */
  com.aserto.directory.common.v3.ObjectOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v3.PaginationResponse page = 9 [json_name = "page", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v3.PaginationResponse page = 9 [json_name = "page", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The page.
   */
  com.aserto.directory.common.v3.PaginationResponse getPage();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v3.PaginationResponse page = 9 [json_name = "page", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.aserto.directory.common.v3.PaginationResponseOrBuilder getPageOrBuilder();
}