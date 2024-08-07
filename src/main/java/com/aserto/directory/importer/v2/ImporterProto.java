// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/importer/v2/importer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.importer.v2;

public final class ImporterProto {
  private ImporterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_importer_v2_ImportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_importer_v2_ImportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_importer_v2_ImportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_importer_v2_ImportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_importer_v2_ImportCounter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_importer_v2_ImportCounter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+aserto/directory/importer/v2/importer." +
      "proto\022\034aserto.directory.importer.v2\032\'ase" +
      "rto/directory/common/v2/common.proto\"\301\003\n" +
      "\rImportRequest\022=\n\007op_code\030\001 \001(\0162$.aserto" +
      ".directory.importer.v2.OpcodeR\006opCode\022I\n" +
      "\013object_type\030\002 \001(\0132&.aserto.directory.co" +
      "mmon.v2.ObjectTypeH\000R\nobjectType\022H\n\nperm" +
      "ission\030\003 \001(\0132&.aserto.directory.common.v" +
      "2.PermissionH\000R\npermission\022O\n\rrelation_t" +
      "ype\030\004 \001(\0132(.aserto.directory.common.v2.R" +
      "elationTypeH\000R\014relationType\022<\n\006object\030\005 " +
      "\001(\0132\".aserto.directory.common.v2.ObjectH" +
      "\000R\006object\022B\n\010relation\030\006 \001(\0132$.aserto.dir" +
      "ectory.common.v2.RelationH\000R\010relation:\002\030" +
      "\001B\005\n\003msg\"\217\003\n\016ImportResponse\022L\n\013object_ty" +
      "pe\030\001 \001(\0132+.aserto.directory.importer.v2." +
      "ImportCounterR\nobjectType\022K\n\npermission\030" +
      "\002 \001(\0132+.aserto.directory.importer.v2.Imp" +
      "ortCounterR\npermission\022P\n\rrelation_type\030" +
      "\003 \001(\0132+.aserto.directory.importer.v2.Imp" +
      "ortCounterR\014relationType\022C\n\006object\030\004 \001(\013" +
      "2+.aserto.directory.importer.v2.ImportCo" +
      "unterR\006object\022G\n\010relation\030\005 \001(\0132+.aserto" +
      ".directory.importer.v2.ImportCounterR\010re" +
      "lation:\002\030\001\"g\n\rImportCounter\022\022\n\004recv\030\001 \001(" +
      "\004R\004recv\022\020\n\003set\030\002 \001(\004R\003set\022\026\n\006delete\030\003 \001(" +
      "\004R\006delete\022\024\n\005error\030\004 \001(\004R\005error:\002\030\001*C\n\006O" +
      "pcode\022\022\n\016OPCODE_UNKNOWN\020\000\022\016\n\nOPCODE_SET\020" +
      "\001\022\021\n\rOPCODE_DELETE\020\002\032\002\030\0012x\n\010Importer\022l\n\006" +
      "Import\022+.aserto.directory.importer.v2.Im" +
      "portRequest\032,.aserto.directory.importer." +
      "v2.ImportResponse\"\003\210\002\001(\0010\001B\220\002\n com.asert" +
      "o.directory.importer.v2B\rImporterProtoP\001" +
      "ZHgithub.com/aserto-dev/go-directory/ase" +
      "rto/directory/importer/v2;importer\242\002\003ADI" +
      "\252\002\034Aserto.Directory.Importer.V2\312\002\035Aserto" +
      "\\Directory_\\Importer\\V2\342\002)Aserto\\Directo" +
      "ry_\\Importer\\V2\\GPBMetadata\352\002\037Aserto::Di" +
      "rectory::Importer::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.aserto.directory.common.v2.CommonProto.getDescriptor(),
        });
    internal_static_aserto_directory_importer_v2_ImportRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_importer_v2_ImportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_importer_v2_ImportRequest_descriptor,
        new java.lang.String[] { "OpCode", "ObjectType", "Permission", "RelationType", "Object", "Relation", "Msg", });
    internal_static_aserto_directory_importer_v2_ImportResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aserto_directory_importer_v2_ImportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_importer_v2_ImportResponse_descriptor,
        new java.lang.String[] { "ObjectType", "Permission", "RelationType", "Object", "Relation", });
    internal_static_aserto_directory_importer_v2_ImportCounter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aserto_directory_importer_v2_ImportCounter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_importer_v2_ImportCounter_descriptor,
        new java.lang.String[] { "Recv", "Set", "Delete", "Error", });
    com.aserto.directory.common.v2.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
