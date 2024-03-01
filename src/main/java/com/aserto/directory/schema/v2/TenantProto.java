// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v2/tenant.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.schema.v2;

public final class TenantProto {
  private TenantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_schema_v2_TenantProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_schema_v2_TenantProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_schema_v2_AccountProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_schema_v2_AccountProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_schema_v2_GuideState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_schema_v2_GuideState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'aserto/directory/schema/v2/tenant.prot" +
      "o\022\032aserto.directory.schema.v2\032\034google/pr" +
      "otobuf/struct.proto\"\367\001\n\020TenantProperties" +
      "\022:\n\004kind\030\001 \001(\0162&.aserto.directory.schema" +
      ".v2.TenantKindR\004kind\022!\n\014directory_v2\030\002 \001" +
      "(\010R\013directoryV2\022*\n\021directory_v2_only\030\003 \001" +
      "(\010R\017directoryV2Only\022L\n\007account\030\004 \001(\0132-.a" +
      "serto.directory.schema.v2.AccountPropert" +
      "iesH\000R\007account\210\001\001B\n\n\010_account\"\304\001\n\021Accoun" +
      "tProperties\022\031\n\010max_orgs\030\001 \001(\005R\007maxOrgs\022T" +
      "\n\017getting_started\030\003 \001(\0132&.aserto.directo" +
      "ry.schema.v2.GuideStateH\000R\016gettingStarte" +
      "d\210\001\001\022*\n\021default_tenant_id\030\004 \001(\tR\017default" +
      "TenantIdB\022\n\020_getting_started\"O\n\nGuideSta" +
      "te\022\022\n\004show\030\001 \001(\010R\004show\022-\n\005steps\030\002 \001(\0132\027." +
      "google.protobuf.StructR\005steps*\\\n\nTenantK" +
      "ind\022\027\n\023TENANT_KIND_UNKNOWN\020\000\022\034\n\030TENANT_K" +
      "IND_ORGANIZATION\020\001\022\027\n\023TENANT_KIND_ACCOUN" +
      "T\020\002B\205\002\n\036com.aserto.directory.schema.v2B\013" +
      "TenantProtoH\002P\001ZDgithub.com/aserto-dev/g" +
      "o-directory/aserto/directory/schema/v2;s" +
      "chema\370\001\000\242\002\003ADS\252\002\032Aserto.Directory.Schema" +
      ".V2\312\002\033Aserto\\Directory_\\Schema\\V2\342\002\'Aser" +
      "to\\Directory_\\Schema\\V2\\GPBMetadata\352\002\035As" +
      "erto::Directory::Schema::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_aserto_directory_schema_v2_TenantProperties_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_schema_v2_TenantProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_schema_v2_TenantProperties_descriptor,
        new java.lang.String[] { "Kind", "DirectoryV2", "DirectoryV2Only", "Account", });
    internal_static_aserto_directory_schema_v2_AccountProperties_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aserto_directory_schema_v2_AccountProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_schema_v2_AccountProperties_descriptor,
        new java.lang.String[] { "MaxOrgs", "GettingStarted", "DefaultTenantId", });
    internal_static_aserto_directory_schema_v2_GuideState_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aserto_directory_schema_v2_GuideState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_schema_v2_GuideState_descriptor,
        new java.lang.String[] { "Show", "Steps", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
