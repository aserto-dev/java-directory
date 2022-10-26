// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

public interface CheckPermissionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.reader.v2.CheckPermissionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * subject selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * subject selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
   * @return The subject.
   */
  com.aserto.directory.common.v2.ObjectIdentifier getSubject();
  /**
   * <pre>
   * subject selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 1 [json_name = "subject"];</code>
   */
  com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getSubjectOrBuilder();

  /**
   * <pre>
   * permission selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PermissionIdentifier permission = 2 [json_name = "permission"];</code>
   * @return Whether the permission field is set.
   */
  boolean hasPermission();
  /**
   * <pre>
   * permission selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PermissionIdentifier permission = 2 [json_name = "permission"];</code>
   * @return The permission.
   */
  com.aserto.directory.common.v2.PermissionIdentifier getPermission();
  /**
   * <pre>
   * permission selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PermissionIdentifier permission = 2 [json_name = "permission"];</code>
   */
  com.aserto.directory.common.v2.PermissionIdentifierOrBuilder getPermissionOrBuilder();

  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
   * @return The object.
   */
  com.aserto.directory.common.v2.ObjectIdentifier getObject();
  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 3 [json_name = "object"];</code>
   */
  com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getObjectOrBuilder();

  /**
   * <pre>
   * collect trace information
   * </pre>
   *
   * <code>bool trace = 7 [json_name = "trace"];</code>
   * @return The trace.
   */
  boolean getTrace();
}
