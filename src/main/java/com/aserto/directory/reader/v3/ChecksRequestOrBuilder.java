// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v3/reader.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.reader.v3;

public interface ChecksRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v3.ChecksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
   * @return Whether the default field is set.
   */
  boolean hasDefault();
  /**
   * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
   * @return The default.
   */
  com.aserto.directory.reader.v3.CheckRequest getDefault();
  /**
   * <code>.aserto.directory.reader.v3.CheckRequest default = 1 [json_name = "default"];</code>
   */
  com.aserto.directory.reader.v3.CheckRequestOrBuilder getDefaultOrBuilder();

  /**
   * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
   */
  java.util.List<com.aserto.directory.reader.v3.CheckRequest> 
      getChecksList();
  /**
   * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
   */
  com.aserto.directory.reader.v3.CheckRequest getChecks(int index);
  /**
   * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
   */
  int getChecksCount();
  /**
   * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
   */
  java.util.List<? extends com.aserto.directory.reader.v3.CheckRequestOrBuilder> 
      getChecksOrBuilderList();
  /**
   * <code>repeated .aserto.directory.reader.v3.CheckRequest checks = 2 [json_name = "checks"];</code>
   */
  com.aserto.directory.reader.v3.CheckRequestOrBuilder getChecksOrBuilder(
      int index);
}
