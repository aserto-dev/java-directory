// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/writer/v2/writer.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.writer.v2;

@java.lang.Deprecated public interface SetRelationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.writer.v2.SetRelationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * relation instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Relation result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * relation instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Relation result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  com.aserto.directory.common.v2.Relation getResult();
  /**
   * <pre>
   * relation instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.Relation result = 1 [json_name = "result"];</code>
   */
  com.aserto.directory.common.v2.RelationOrBuilder getResultOrBuilder();
}
