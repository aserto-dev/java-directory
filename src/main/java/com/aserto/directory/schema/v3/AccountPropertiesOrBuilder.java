// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/schema/v3/tenant.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.schema.v3;

public interface AccountPropertiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.schema.v3.AccountProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Maximum number of organizations that can be created in this account.
   * If -1, there is no limit.
   * </pre>
   *
   * <code>int32 max_orgs = 1 [json_name = "maxOrgs"];</code>
   * @return The maxOrgs.
   */
  int getMaxOrgs();

  /**
   * <pre>
   * Tracks the account owner's progress through the getting-started guide.
   * </pre>
   *
   * <code>optional .aserto.directory.schema.v3.GuideState getting_started = 3 [json_name = "gettingStarted"];</code>
   * @return Whether the gettingStarted field is set.
   */
  boolean hasGettingStarted();
  /**
   * <pre>
   * Tracks the account owner's progress through the getting-started guide.
   * </pre>
   *
   * <code>optional .aserto.directory.schema.v3.GuideState getting_started = 3 [json_name = "gettingStarted"];</code>
   * @return The gettingStarted.
   */
  com.aserto.directory.schema.v3.GuideState getGettingStarted();
  /**
   * <pre>
   * Tracks the account owner's progress through the getting-started guide.
   * </pre>
   *
   * <code>optional .aserto.directory.schema.v3.GuideState getting_started = 3 [json_name = "gettingStarted"];</code>
   */
  com.aserto.directory.schema.v3.GuideStateOrBuilder getGettingStartedOrBuilder();

  /**
   * <pre>
   * The default organization for the account
   * </pre>
   *
   * <code>string default_tenant_id = 4 [json_name = "defaultTenantId"];</code>
   * @return The defaultTenantId.
   */
  java.lang.String getDefaultTenantId();
  /**
   * <pre>
   * The default organization for the account
   * </pre>
   *
   * <code>string default_tenant_id = 4 [json_name = "defaultTenantId"];</code>
   * @return The bytes for defaultTenantId.
   */
  com.google.protobuf.ByteString
      getDefaultTenantIdBytes();
}
