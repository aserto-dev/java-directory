// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

public interface GetRelationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetRelationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * array of relation instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
   */
  java.util.List<com.aserto.directory.common.v2.Relation> 
      getResultsList();
  /**
   * <pre>
   * array of relation instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
   */
  com.aserto.directory.common.v2.Relation getResults(int index);
  /**
   * <pre>
   * array of relation instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * array of relation instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
   */
  java.util.List<? extends com.aserto.directory.common.v2.RelationOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * array of relation instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
   */
  com.aserto.directory.common.v2.RelationOrBuilder getResultsOrBuilder(
      int index);
}
