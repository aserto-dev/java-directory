// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/exporter/v3/exporter.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.exporter.v3;

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
    internal_static_aserto_directory_exporter_v3_ExportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_aserto_directory_exporter_v3_ExportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_exporter_v3_ExportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_aserto_directory_exporter_v3_ExportResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+aserto/directory/exporter/v3/exporter." +
      "proto\022\034aserto.directory.exporter.v3\032\'ase" +
      "rto/directory/common/v3/common.proto\032\034go" +
      "ogle/protobuf/struct.proto\032\037google/proto" +
      "buf/timestamp.proto\"d\n\rExportRequest\022\030\n\007" +
      "options\030\001 \001(\rR\007options\0229\n\nstart_from\030\024 \001" +
      "(\0132\032.google.protobuf.TimestampR\tstartFro" +
      "m\"\312\001\n\016ExportResponse\022<\n\006object\030\002 \001(\0132\".a" +
      "serto.directory.common.v3.ObjectH\000R\006obje" +
      "ct\022B\n\010relation\030\004 \001(\0132$.aserto.directory." +
      "common.v3.RelationH\000R\010relation\022/\n\005stats\030" +
      "\010 \001(\0132\027.google.protobuf.StructH\000R\005statsB" +
      "\005\n\003msg*s\n\006Option\022\022\n\016OPTION_UNKNOWN\020\000\022\027\n\023" +
      "OPTION_DATA_OBJECTS\020\010\022\031\n\025OPTION_DATA_REL" +
      "ATIONS\020\020\022\017\n\013OPTION_DATA\020\030\022\020\n\014OPTION_STAT" +
      "S\020@2s\n\010Exporter\022g\n\006Export\022+.aserto.direc" +
      "tory.exporter.v3.ExportRequest\032,.aserto." +
      "directory.exporter.v3.ExportResponse\"\0000\001" +
      "B\220\002\n com.aserto.directory.exporter.v3B\rE" +
      "xporterProtoP\001ZHgithub.com/aserto-dev/go" +
      "-directory/aserto/directory/exporter/v3;" +
      "exporter\242\002\003ADE\252\002\034Aserto.Directory.Export" +
      "er.V3\312\002\035Aserto\\Directory_\\Exporter\\V3\342\002)" +
      "Aserto\\Directory_\\Exporter\\V3\\GPBMetadat" +
      "a\352\002\037Aserto::Directory::Exporter::V3b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.aserto.directory.common.v3.CommonProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_aserto_directory_exporter_v3_ExportRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_exporter_v3_ExportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_aserto_directory_exporter_v3_ExportRequest_descriptor,
        new java.lang.String[] { "Options", "StartFrom", });
    internal_static_aserto_directory_exporter_v3_ExportResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aserto_directory_exporter_v3_ExportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_aserto_directory_exporter_v3_ExportResponse_descriptor,
        new java.lang.String[] { "Object", "Relation", "Stats", "Msg", });
    descriptor.resolveAllFeaturesImmutable();
    com.aserto.directory.common.v3.CommonProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
