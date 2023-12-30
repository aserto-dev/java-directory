// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/exporter/v3/exporter.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.exporter.v3;

public interface ExportResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.exporter.v3.ExportResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <pre>
   * object instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
   * @return The object.
   */
  com.aserto.directory.common.v3.Object getObject();
  /**
   * <pre>
   * object instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Object object = 2 [json_name = "object"];</code>
   */
  com.aserto.directory.common.v3.ObjectOrBuilder getObjectOrBuilder();

  /**
   * <pre>
   * relation instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * relation instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.aserto.directory.common.v3.Relation getRelation();
  /**
   * <pre>
   * relation instance (data)
   * </pre>
   *
   * <code>.aserto.directory.common.v3.Relation relation = 4 [json_name = "relation"];</code>
   */
  com.aserto.directory.common.v3.RelationOrBuilder getRelationOrBuilder();

  /**
   * <pre>
   * object and/or relation stats (no data)
   * </pre>
   *
   * <code>.google.protobuf.Struct stats = 8 [json_name = "stats"];</code>
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   * <pre>
   * object and/or relation stats (no data)
   * </pre>
   *
   * <code>.google.protobuf.Struct stats = 8 [json_name = "stats"];</code>
   * @return The stats.
   */
  com.google.protobuf.Struct getStats();
  /**
   * <pre>
   * object and/or relation stats (no data)
   * </pre>
   *
   * <code>.google.protobuf.Struct stats = 8 [json_name = "stats"];</code>
   */
  com.google.protobuf.StructOrBuilder getStatsOrBuilder();

  com.aserto.directory.exporter.v3.ExportResponse.MsgCase getMsgCase();
}