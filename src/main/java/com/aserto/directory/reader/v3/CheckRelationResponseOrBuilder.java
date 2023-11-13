// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v3/reader.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.reader.v3;

public interface CheckRelationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v3.CheckRelationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * check result
   * </pre>
   *
   * <code>bool check = 1 [json_name = "check"];</code>
   * @return The check.
   */
  boolean getCheck();

  /**
   * <pre>
   * trace information
   * </pre>
   *
   * <code>repeated string trace = 2 [json_name = "trace"];</code>
   * @return A list containing the trace.
   */
  java.util.List<java.lang.String>
      getTraceList();
  /**
   * <pre>
   * trace information
   * </pre>
   *
   * <code>repeated string trace = 2 [json_name = "trace"];</code>
   * @return The count of trace.
   */
  int getTraceCount();
  /**
   * <pre>
   * trace information
   * </pre>
   *
   * <code>repeated string trace = 2 [json_name = "trace"];</code>
   * @param index The index of the element to return.
   * @return The trace at the given index.
   */
  java.lang.String getTrace(int index);
  /**
   * <pre>
   * trace information
   * </pre>
   *
   * <code>repeated string trace = 2 [json_name = "trace"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the trace at the given index.
   */
  com.google.protobuf.ByteString
      getTraceBytes(int index);
}
