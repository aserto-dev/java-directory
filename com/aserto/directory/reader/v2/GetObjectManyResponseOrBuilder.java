// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

public interface GetObjectManyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetObjectManyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * array of object instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Object results = 1 [json_name = "results"];</code>
   */
  java.util.List<com.aserto.directory.common.v2.Object> 
      getResultsList();
  /**
   * <pre>
   * array of object instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Object results = 1 [json_name = "results"];</code>
   */
  com.aserto.directory.common.v2.Object getResults(int index);
  /**
   * <pre>
   * array of object instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Object results = 1 [json_name = "results"];</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * array of object instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Object results = 1 [json_name = "results"];</code>
   */
  java.util.List<? extends com.aserto.directory.common.v2.ObjectOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * array of object instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Object results = 1 [json_name = "results"];</code>
   */
  com.aserto.directory.common.v2.ObjectOrBuilder getResultsOrBuilder(
      int index);
}
