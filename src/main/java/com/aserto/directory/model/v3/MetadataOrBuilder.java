// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/model/v3/model.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.model.v3;

public interface MetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.model.v3.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <pre>
   * last updated timestamp (UTC)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt", (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <pre>
   * object instance etag
   * </pre>
   *
   * <code>string etag = 23 [json_name = "etag", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * object instance etag
   * </pre>
   *
   * <code>string etag = 23 [json_name = "etag", (.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();
}
