// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/assertion/v3/assertion.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.assertion.v3;

public interface AssertOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.assertion.v3.Assert)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * assertion identifier
   * </pre>
   *
   * <code>uint32 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  int getId();

  /**
   * <pre>
   * expected outcome of assertion
   * </pre>
   *
   * <code>bool expected = 2 [json_name = "expected", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The expected.
   */
  boolean getExpected();

  /**
   * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
   * @return Whether the check field is set.
   */
  boolean hasCheck();
  /**
   * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
   * @return The check.
   */
  com.aserto.directory.reader.v3.CheckRequest getCheck();
  /**
   * <code>.aserto.directory.reader.v3.CheckRequest check = 3 [json_name = "check"];</code>
   */
  com.aserto.directory.reader.v3.CheckRequestOrBuilder getCheckOrBuilder();

  /**
   * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
   * @return Whether the checkRelation field is set.
   */
  boolean hasCheckRelation();
  /**
   * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
   * @return The checkRelation.
   */
  com.aserto.directory.reader.v3.CheckRelationRequest getCheckRelation();
  /**
   * <code>.aserto.directory.reader.v3.CheckRelationRequest check_relation = 4 [json_name = "checkRelation"];</code>
   */
  com.aserto.directory.reader.v3.CheckRelationRequestOrBuilder getCheckRelationOrBuilder();

  /**
   * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
   * @return Whether the checkPermission field is set.
   */
  boolean hasCheckPermission();
  /**
   * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
   * @return The checkPermission.
   */
  com.aserto.directory.reader.v3.CheckPermissionRequest getCheckPermission();
  /**
   * <code>.aserto.directory.reader.v3.CheckPermissionRequest check_permission = 5 [json_name = "checkPermission"];</code>
   */
  com.aserto.directory.reader.v3.CheckPermissionRequestOrBuilder getCheckPermissionOrBuilder();

  com.aserto.directory.assertion.v3.Assert.MsgCase getMsgCase();
}
