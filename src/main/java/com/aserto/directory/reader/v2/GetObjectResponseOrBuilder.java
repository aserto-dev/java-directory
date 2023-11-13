// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.reader.v2;

public interface GetObjectResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetObjectResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * object instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  com.aserto.directory.common.v2.Object getResult();
  /**
   * <pre>
   * object instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Object result = 1 [json_name = "result"];</code>
   */
  com.aserto.directory.common.v2.ObjectOrBuilder getResultOrBuilder();

  /**
   * <pre>
   * object relations
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation relations = 4 [json_name = "relations"];</code>
   */
  java.util.List<com.aserto.directory.common.v2.Relation> 
      getRelationsList();
  /**
   * <pre>
   * object relations
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation relations = 4 [json_name = "relations"];</code>
   */
  com.aserto.directory.common.v2.Relation getRelations(int index);
  /**
   * <pre>
   * object relations
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation relations = 4 [json_name = "relations"];</code>
   */
  int getRelationsCount();
  /**
   * <pre>
   * object relations
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation relations = 4 [json_name = "relations"];</code>
   */
  java.util.List<? extends com.aserto.directory.common.v2.RelationOrBuilder> 
      getRelationsOrBuilderList();
  /**
   * <pre>
   * object relations
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation relations = 4 [json_name = "relations"];</code>
   */
  com.aserto.directory.common.v2.RelationOrBuilder getRelationsOrBuilder(
      int index);

  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
   * @return The page.
   */
  com.aserto.directory.common.v2.PaginationResponse getPage();
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
   */
  com.aserto.directory.common.v2.PaginationResponseOrBuilder getPageOrBuilder();
}
