// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.writer.v2;

public interface SetRelationTypeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.writer.v2.SetRelationTypeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * relation types instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * relation types instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  com.aserto.directory.common.v2.RelationType getResult();
  /**
   * <pre>
   * relation types instance
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationType result = 1 [json_name = "result"];</code>
   */
  com.aserto.directory.common.v2.RelationTypeOrBuilder getResultOrBuilder();
}
