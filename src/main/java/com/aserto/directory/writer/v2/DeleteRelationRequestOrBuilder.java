// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v2/writer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.writer.v2;

public interface DeleteRelationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.writer.v2.DeleteRelationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * relation identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationIdentifier param = 1 [json_name = "param"];</code>
   * @return Whether the param field is set.
   */
  boolean hasParam();
  /**
   * <pre>
   * relation identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationIdentifier param = 1 [json_name = "param"];</code>
   * @return The param.
   */
  com.aserto.directory.common.v2.RelationIdentifier getParam();
  /**
   * <pre>
   * relation identifier
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationIdentifier param = 1 [json_name = "param"];</code>
   */
  com.aserto.directory.common.v2.RelationIdentifierOrBuilder getParamOrBuilder();
}
