// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

public interface GetGraphRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.GetGraphRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * anchor selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
   * @return Whether the anchor field is set.
   */
  boolean hasAnchor();
  /**
   * <pre>
   * anchor selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
   * @return The anchor.
   */
  com.aserto.directory.common.v2.ObjectIdentifier getAnchor();
  /**
   * <pre>
   * anchor selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
   */
  com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getAnchorOrBuilder();

  /**
   * <pre>
   * subject selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * subject selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
   * @return The subject.
   */
  com.aserto.directory.common.v2.ObjectIdentifier getSubject();
  /**
   * <pre>
   * subject selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
   */
  com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getSubjectOrBuilder();

  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  boolean hasRelation();
  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
   * @return The relation.
   */
  com.aserto.directory.common.v2.RelationTypeIdentifier getRelation();
  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
   */
  com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder getRelationOrBuilder();

  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
   * @return The object.
   */
  com.aserto.directory.common.v2.ObjectIdentifier getObject();
  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
   */
  com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getObjectOrBuilder();
}
