// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v3/writer.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.writer.v3;

public interface SetRelationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.writer.v3.SetRelationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * relation instance
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * relation instance
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  com.aserto.directory.common.v3.Relation getResult();
  /**
   * <pre>
   * relation instance
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation result = 1 [json_name = "result"];</code>
   */
  com.aserto.directory.common.v3.RelationOrBuilder getResultOrBuilder();
}
