// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v2/user.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.schema.v2;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_schema_v2_UserProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_schema_v2_UserProperties_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%aserto/directory/schema/v2/user.proto\022" +
      "\032aserto.directory.schema.v2\"\277\001\n\016UserProp" +
      "erties\022\024\n\005email\030\001 \001(\tR\005email\022\030\n\007picture\030" +
      "\002 \001(\tR\007picture\022>\n\006status\030\003 \001(\0162&.aserto." +
      "directory.schema.v2.UserStatusR\006status\022\030" +
      "\n\007enabled\030\004 \001(\010R\007enabled\022#\n\rconnection_i" +
      "d\030\005 \001(\tR\014connectionId*\204\002\n\nUserStatus\022\027\n\023" +
      "USER_STATUS_UNKNOWN\020\000\022\026\n\022USER_STATUS_STA" +
      "GED\020\001\022\033\n\027USER_STATUS_PROVISIONED\020\002\022\026\n\022US" +
      "ER_STATUS_ACTIVE\020\003\022\030\n\024USER_STATUS_RECOVE" +
      "RY\020\004\022 \n\034USER_STATUS_PASSWORD_EXPIRED\020\005\022\032" +
      "\n\026USER_STATUS_LOCKED_OUT\020\006\022\031\n\025USER_STATU" +
      "S_SUSPENDED\020\007\022\035\n\031USER_STATUS_DEPROVISION" +
      "ED\020\010B\203\002\n\036com.aserto.directory.schema.v2B" +
      "\tUserProtoH\002P\001ZDgithub.com/aserto-dev/go" +
      "-directory/aserto/directory/schema/v2;sc" +
      "hema\370\001\000\242\002\003ADS\252\002\032Aserto.Directory.Schema." +
      "V2\312\002\033Aserto\\Directory_\\Schema\\V2\342\002\'Asert" +
      "o\\Directory_\\Schema\\V2\\GPBMetadata\352\002\035Ase" +
      "rto::Directory::Schema::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_aserto_directory_schema_v2_UserProperties_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_schema_v2_UserProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_schema_v2_UserProperties_descriptor,
        new java.lang.String[] { "Email", "Picture", "Status", "Enabled", "ConnectionId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
