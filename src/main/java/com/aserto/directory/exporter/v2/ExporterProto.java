// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/exporter/v2/exporter.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.exporter.v2;

public final class ExporterProto {
  private ExporterProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      ExporterProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_exporter_v2_ExportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_aserto_directory_exporter_v2_ExportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_exporter_v2_ExportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_aserto_directory_exporter_v2_ExportResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+aserto/directory/exporter/v2/exporter." +
      "proto\022\034aserto.directory.exporter.v2\032\'ase" +
      "rto/directory/common/v2/common.proto\032\037go" +
      "ogle/protobuf/timestamp.proto\"h\n\rExportR" +
      "equest\022\030\n\007options\030\001 \001(\rR\007options\0229\n\nstar" +
      "t_from\030\024 \001(\0132\032.google.protobuf.Timestamp" +
      "R\tstartFrom:\002\030\001\"\203\003\n\016ExportResponse\022<\n\006ob" +
      "ject\030\002 \001(\0132\".aserto.directory.common.v2." +
      "ObjectH\000R\006object\022I\n\013object_type\030\003 \001(\0132&." +
      "aserto.directory.common.v2.ObjectTypeH\000R" +
      "\nobjectType\022B\n\010relation\030\004 \001(\0132$.aserto.d" +
      "irectory.common.v2.RelationH\000R\010relation\022" +
      "O\n\rrelation_type\030\005 \001(\0132(.aserto.director" +
      "y.common.v2.RelationTypeH\000R\014relationType" +
      "\022H\n\npermission\030\006 \001(\0132&.aserto.directory." +
      "common.v2.PermissionH\000R\npermission:\002\030\001B\005" +
      "\n\003msg*\313\002\n\006Option\022\022\n\016OPTION_UNKNOWN\020\000\022 \n\034" +
      "OPTION_METADATA_OBJECT_TYPES\020\001\022\"\n\036OPTION" +
      "_METADATA_RELATION_TYPES\020\002\022\037\n\033OPTION_MET" +
      "ADATA_PERMISSIONS\020\004\022\023\n\017OPTION_METADATA\020\007" +
      "\022\027\n\023OPTION_DATA_OBJECTS\020\010\022\031\n\025OPTION_DATA" +
      "_RELATIONS\020\020\022#\n\037OPTION_DATA_RELATIONS_WI" +
      "TH_KEYS\020 \022\017\n\013OPTION_DATA\020\030\022\031\n\025OPTION_DAT" +
      "A_WITH_KEYS\020(\022\016\n\nOPTION_ALL\020\037\022\030\n\024OPTION_" +
      "ALL_WITH_KEYS\020/\032\002\030\0012v\n\010Exporter\022j\n\006Expor" +
      "t\022+.aserto.directory.exporter.v2.ExportR" +
      "equest\032,.aserto.directory.exporter.v2.Ex" +
      "portResponse\"\003\210\002\0010\001B\220\002\n com.aserto.direc" +
      "tory.exporter.v2B\rExporterProtoP\001ZHgithu" +
      "b.com/aserto-dev/go-directory/aserto/dir" +
      "ectory/exporter/v2;exporter\242\002\003ADE\252\002\034Aser" +
      "to.Directory.Exporter.V2\312\002\035Aserto\\Direct" +
      "ory_\\Exporter\\V2\342\002)Aserto\\Directory_\\Exp" +
      "orter\\V2\\GPBMetadata\352\002\037Aserto::Directory" +
      "::Exporter::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.aserto.directory.common.v2.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_aserto_directory_exporter_v2_ExportRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_exporter_v2_ExportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_aserto_directory_exporter_v2_ExportRequest_descriptor,
        new java.lang.String[] { "Options", "StartFrom", });
    internal_static_aserto_directory_exporter_v2_ExportResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aserto_directory_exporter_v2_ExportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_aserto_directory_exporter_v2_ExportResponse_descriptor,
        new java.lang.String[] { "Object", "ObjectType", "Relation", "RelationType", "Permission", "Msg", });
    descriptor.resolveAllFeaturesImmutable();
    com.aserto.directory.common.v2.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
