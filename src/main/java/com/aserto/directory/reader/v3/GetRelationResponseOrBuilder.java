// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v3/reader.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.reader.v3;

public interface GetRelationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v3.GetRelationResponse)
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

  /**
   * <pre>
   * map of materialized relation objects
   * </pre>
   *
   * <code>map&lt;string, .aserto.directory.common.v3.Object&gt; objects = 2 [json_name = "objects"];</code>
   */
  int getObjectsCount();
  /**
   * <pre>
   * map of materialized relation objects
   * </pre>
   *
   * <code>map&lt;string, .aserto.directory.common.v3.Object&gt; objects = 2 [json_name = "objects"];</code>
   */
  boolean containsObjects(
      java.lang.String key);
  /**
   * Use {@link #getObjectsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.aserto.directory.common.v3.Object>
  getObjects();
  /**
   * <pre>
   * map of materialized relation objects
   * </pre>
   *
   * <code>map&lt;string, .aserto.directory.common.v3.Object&gt; objects = 2 [json_name = "objects"];</code>
   */
  java.util.Map<java.lang.String, com.aserto.directory.common.v3.Object>
  getObjectsMap();
  /**
   * <pre>
   * map of materialized relation objects
   * </pre>
   *
   * <code>map&lt;string, .aserto.directory.common.v3.Object&gt; objects = 2 [json_name = "objects"];</code>
   */
  /* nullable */
com.aserto.directory.common.v3.Object getObjectsOrDefault(
      java.lang.String key,
      /* nullable */
com.aserto.directory.common.v3.Object defaultValue);
  /**
   * <pre>
   * map of materialized relation objects
   * </pre>
   *
   * <code>map&lt;string, .aserto.directory.common.v3.Object&gt; objects = 2 [json_name = "objects"];</code>
   */
  com.aserto.directory.common.v3.Object getObjectsOrThrow(
      java.lang.String key);
}
