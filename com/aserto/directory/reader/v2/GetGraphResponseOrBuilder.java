// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

public interface GetGraphResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetGraphResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * dependency graph
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
   */
  java.util.List<com.aserto.directory.common.v2.ObjectDependency> 
      getResultsList();
  /**
   * <pre>
   * dependency graph
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
   */
  com.aserto.directory.common.v2.ObjectDependency getResults(int index);
  /**
   * <pre>
   * dependency graph
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * dependency graph
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
   */
  java.util.List<? extends com.aserto.directory.common.v2.ObjectDependencyOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * dependency graph
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
   */
  com.aserto.directory.common.v2.ObjectDependencyOrBuilder getResultsOrBuilder(
      int index);
}
