// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.2
package com.aserto.directory.reader.v2;

public interface GetRelationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetRelationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationIdentifier param = 1 [json_name = "param"];</code>
   * @return Whether the param field is set.
   */
  boolean hasParam();
  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationIdentifier param = 1 [json_name = "param"];</code>
   * @return The param.
   */
  com.aserto.directory.common.v2.RelationIdentifier getParam();
  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationIdentifier param = 1 [json_name = "param"];</code>
   */
  com.aserto.directory.common.v2.RelationIdentifierOrBuilder getParamOrBuilder();

  /**
   * <pre>
   * materialize relation objects
   * </pre>
   *
   * <code>optional bool with_objects = 2 [json_name = "withObjects"];</code>
   * @return Whether the withObjects field is set.
   */
  boolean hasWithObjects();
  /**
   * <pre>
   * materialize relation objects
   * </pre>
   *
   * <code>optional bool with_objects = 2 [json_name = "withObjects"];</code>
   * @return The withObjects.
   */
  boolean getWithObjects();
}
