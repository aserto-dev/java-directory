// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/common/v2/common.proto

package com.aserto.directory.common.v2;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_ObjectType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_ObjectType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_Permission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_Permission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_RelationType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_RelationType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_Object_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_Object_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_Relation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_Relation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_ObjectDependency_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_ObjectDependency_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_ObjectTypeIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_ObjectTypeIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_PermissionIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_PermissionIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_RelationTypeIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_RelationTypeIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_ObjectIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_ObjectIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_RelationIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_RelationIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_PaginationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_PaginationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_common_v2_PaginationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_common_v2_PaginationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'aserto/directory/common/v2/common.prot" +
      "o\022\032aserto.directory.common.v2\032\034google/pr" +
      "otobuf/struct.proto\032\037google/protobuf/tim" +
      "estamp.proto\"\232\003\n\nObjectType\022\016\n\002id\030\001 \001(\005R" +
      "\002id\022\022\n\004name\030\002 \001(\tR\004name\022!\n\014display_name\030" +
      "\003 \001(\tR\013displayName\022\035\n\nis_subject\030\004 \001(\010R\t" +
      "isSubject\022\030\n\007ordinal\030\005 \001(\005R\007ordinal\022\026\n\006s" +
      "tatus\030\006 \001(\rR\006status\022/\n\006schema\030\n \001(\0132\027.go" +
      "ogle.protobuf.StructR\006schema\0229\n\ncreated_" +
      "at\030\024 \001(\0132\032.google.protobuf.TimestampR\tcr" +
      "eatedAt\0229\n\nupdated_at\030\025 \001(\0132\032.google.pro" +
      "tobuf.TimestampR\tupdatedAt\0229\n\ndeleted_at" +
      "\030\026 \001(\0132\032.google.protobuf.TimestampR\tdele" +
      "tedAt\022\022\n\004hash\030\027 \001(\tR\004hash\"\230\002\n\nPermission" +
      "\022\016\n\002id\030\001 \001(\tR\002id\022\022\n\004name\030\002 \001(\tR\004name\022!\n\014" +
      "display_name\030\003 \001(\tR\013displayName\0229\n\ncreat" +
      "ed_at\030\024 \001(\0132\032.google.protobuf.TimestampR" +
      "\tcreatedAt\0229\n\nupdated_at\030\025 \001(\0132\032.google." +
      "protobuf.TimestampR\tupdatedAt\0229\n\ndeleted" +
      "_at\030\026 \001(\0132\032.google.protobuf.TimestampR\td" +
      "eletedAt\022\022\n\004hash\030\027 \001(\tR\004hash\"\247\003\n\014Relatio" +
      "nType\022\016\n\002id\030\001 \001(\005R\002id\022\022\n\004name\030\002 \001(\tR\004nam" +
      "e\022\037\n\013object_type\030\003 \001(\tR\nobjectType\022!\n\014di" +
      "splay_name\030\004 \001(\tR\013displayName\022\030\n\007ordinal" +
      "\030\005 \001(\005R\007ordinal\022\026\n\006status\030\006 \001(\rR\006status\022" +
      "\026\n\006unions\030\007 \003(\tR\006unions\022 \n\013permissions\030\010" +
      " \003(\tR\013permissions\0229\n\ncreated_at\030\024 \001(\0132\032." +
      "google.protobuf.TimestampR\tcreatedAt\0229\n\n" +
      "updated_at\030\025 \001(\0132\032.google.protobuf.Times" +
      "tampR\tupdatedAt\0229\n\ndeleted_at\030\026 \001(\0132\032.go" +
      "ogle.protobuf.TimestampR\tdeletedAt\022\022\n\004ha" +
      "sh\030\027 \001(\tR\004hash\"\337\002\n\006Object\022\016\n\002id\030\001 \001(\tR\002i" +
      "d\022\020\n\003key\030\002 \001(\tR\003key\022\022\n\004type\030\003 \001(\tR\004type\022" +
      "!\n\014display_name\030\004 \001(\tR\013displayName\0227\n\npr" +
      "operties\030\005 \001(\0132\027.google.protobuf.StructR" +
      "\nproperties\0229\n\ncreated_at\030\024 \001(\0132\032.google" +
      ".protobuf.TimestampR\tcreatedAt\0229\n\nupdate" +
      "d_at\030\025 \001(\0132\032.google.protobuf.TimestampR\t" +
      "updatedAt\0229\n\ndeleted_at\030\026 \001(\0132\032.google.p" +
      "rotobuf.TimestampR\tdeletedAt\022\022\n\004hash\030\027 \001" +
      "(\tR\004hash\"\371\002\n\010Relation\022F\n\007subject\030\001 \001(\0132," +
      ".aserto.directory.common.v2.ObjectIdenti" +
      "fierR\007subject\022\032\n\010relation\030\002 \001(\tR\010relatio" +
      "n\022D\n\006object\030\003 \001(\0132,.aserto.directory.com" +
      "mon.v2.ObjectIdentifierR\006object\0229\n\ncreat" +
      "ed_at\030\024 \001(\0132\032.google.protobuf.TimestampR" +
      "\tcreatedAt\0229\n\nupdated_at\030\025 \001(\0132\032.google." +
      "protobuf.TimestampR\tupdatedAt\0229\n\ndeleted" +
      "_at\030\026 \001(\0132\032.google.protobuf.TimestampR\td" +
      "eletedAt\022\022\n\004hash\030\027 \001(\tR\004hash\"\263\002\n\020ObjectD" +
      "ependency\022\037\n\013object_type\030\001 \001(\tR\nobjectTy" +
      "pe\022\033\n\tobject_id\030\003 \001(\tR\010objectId\022\035\n\nobjec" +
      "t_key\030\004 \001(\tR\tobjectKey\022\032\n\010relation\030\005 \001(\t" +
      "R\010relation\022!\n\014subject_type\030\007 \001(\tR\013subjec" +
      "tType\022\035\n\nsubject_id\030\t \001(\tR\tsubjectId\022\037\n\013" +
      "subject_key\030\n \001(\tR\nsubjectKey\022\024\n\005depth\030\013" +
      " \001(\005R\005depth\022\031\n\010is_cycle\030\014 \001(\010R\007isCycle\022\022" +
      "\n\004path\030\r \003(\tR\004path\"T\n\024ObjectTypeIdentifi" +
      "er\022\023\n\002id\030\001 \001(\005H\000R\002id\210\001\001\022\027\n\004name\030\002 \001(\tH\001R" +
      "\004name\210\001\001B\005\n\003_idB\007\n\005_name\"T\n\024PermissionId" +
      "entifier\022\023\n\002id\030\001 \001(\tH\000R\002id\210\001\001\022\027\n\004name\030\002 " +
      "\001(\tH\001R\004name\210\001\001B\005\n\003_idB\007\n\005_name\"\214\001\n\026Relat" +
      "ionTypeIdentifier\022\023\n\002id\030\001 \001(\005H\000R\002id\210\001\001\022\027" +
      "\n\004name\030\002 \001(\tH\001R\004name\210\001\001\022$\n\013object_type\030\003" +
      " \001(\tH\002R\nobjectType\210\001\001B\005\n\003_idB\007\n\005_nameB\016\n" +
      "\014_object_type\"o\n\020ObjectIdentifier\022\027\n\004typ" +
      "e\030\001 \001(\tH\000R\004type\210\001\001\022\023\n\002id\030\002 \001(\tH\001R\002id\210\001\001\022" +
      "\025\n\003key\030\003 \001(\tH\002R\003key\210\001\001B\007\n\005_typeB\005\n\003_idB\006" +
      "\n\004_key\"\362\001\n\022RelationIdentifier\022F\n\007subject" +
      "\030\001 \001(\0132,.aserto.directory.common.v2.Obje" +
      "ctIdentifierR\007subject\022N\n\010relation\030\002 \001(\0132" +
      "2.aserto.directory.common.v2.RelationTyp" +
      "eIdentifierR\010relation\022D\n\006object\030\003 \001(\0132,." +
      "aserto.directory.common.v2.ObjectIdentif" +
      "ierR\006object\"=\n\021PaginationRequest\022\022\n\004size" +
      "\030\001 \001(\005R\004size\022\024\n\005token\030\002 \001(\tR\005token\"T\n\022Pa" +
      "ginationResponse\022\035\n\nnext_token\030\001 \001(\tR\tne" +
      "xtToken\022\037\n\013result_size\030\002 \001(\005R\nresultSize" +
      "*^\n\004Flag\022\020\n\014FLAG_UNKNOWN\020\000\022\017\n\013FLAG_HIDDE" +
      "N\020\001\022\021\n\rFLAG_READONLY\020\002\022\017\n\013FLAG_SYSTEM\020\004\022" +
      "\017\n\013FLAG_SHADOW\020\010B\205\002\n\036com.aserto.director" +
      "y.common.v2B\013CommonProtoH\002P\001ZDgithub.com" +
      "/aserto-dev/go-directory/aserto/director" +
      "y/common/v2;common\370\001\000\242\002\003ADC\252\002\032Aserto.Dir" +
      "ectory.Common.V2\312\002\033Aserto\\Directory_\\Com" +
      "mon\\V2\342\002\'Aserto\\Directory_\\Common\\V2\\GPB" +
      "Metadata\352\002\035Aserto::Directory::Common::V2" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_aserto_directory_common_v2_ObjectType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_common_v2_ObjectType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_ObjectType_descriptor,
        new java.lang.String[] { "Id", "Name", "DisplayName", "IsSubject", "Ordinal", "Status", "Schema", "CreatedAt", "UpdatedAt", "DeletedAt", "Hash", });
    internal_static_aserto_directory_common_v2_Permission_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aserto_directory_common_v2_Permission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_Permission_descriptor,
        new java.lang.String[] { "Id", "Name", "DisplayName", "CreatedAt", "UpdatedAt", "DeletedAt", "Hash", });
    internal_static_aserto_directory_common_v2_RelationType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aserto_directory_common_v2_RelationType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_RelationType_descriptor,
        new java.lang.String[] { "Id", "Name", "ObjectType", "DisplayName", "Ordinal", "Status", "Unions", "Permissions", "CreatedAt", "UpdatedAt", "DeletedAt", "Hash", });
    internal_static_aserto_directory_common_v2_Object_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aserto_directory_common_v2_Object_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_Object_descriptor,
        new java.lang.String[] { "Id", "Key", "Type", "DisplayName", "Properties", "CreatedAt", "UpdatedAt", "DeletedAt", "Hash", });
    internal_static_aserto_directory_common_v2_Relation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aserto_directory_common_v2_Relation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_Relation_descriptor,
        new java.lang.String[] { "Subject", "Relation", "Object", "CreatedAt", "UpdatedAt", "DeletedAt", "Hash", });
    internal_static_aserto_directory_common_v2_ObjectDependency_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aserto_directory_common_v2_ObjectDependency_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_ObjectDependency_descriptor,
        new java.lang.String[] { "ObjectType", "ObjectId", "ObjectKey", "Relation", "SubjectType", "SubjectId", "SubjectKey", "Depth", "IsCycle", "Path", });
    internal_static_aserto_directory_common_v2_ObjectTypeIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_aserto_directory_common_v2_ObjectTypeIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_ObjectTypeIdentifier_descriptor,
        new java.lang.String[] { "Id", "Name", "Id", "Name", });
    internal_static_aserto_directory_common_v2_PermissionIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_aserto_directory_common_v2_PermissionIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_PermissionIdentifier_descriptor,
        new java.lang.String[] { "Id", "Name", "Id", "Name", });
    internal_static_aserto_directory_common_v2_RelationTypeIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_aserto_directory_common_v2_RelationTypeIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_RelationTypeIdentifier_descriptor,
        new java.lang.String[] { "Id", "Name", "ObjectType", "Id", "Name", "ObjectType", });
    internal_static_aserto_directory_common_v2_ObjectIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_aserto_directory_common_v2_ObjectIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_ObjectIdentifier_descriptor,
        new java.lang.String[] { "Type", "Id", "Key", "Type", "Id", "Key", });
    internal_static_aserto_directory_common_v2_RelationIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_aserto_directory_common_v2_RelationIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_RelationIdentifier_descriptor,
        new java.lang.String[] { "Subject", "Relation", "Object", });
    internal_static_aserto_directory_common_v2_PaginationRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_aserto_directory_common_v2_PaginationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_PaginationRequest_descriptor,
        new java.lang.String[] { "Size", "Token", });
    internal_static_aserto_directory_common_v2_PaginationResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_aserto_directory_common_v2_PaginationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_common_v2_PaginationResponse_descriptor,
        new java.lang.String[] { "NextToken", "ResultSize", });
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
