// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/importer/v2/importer.proto

// Protobuf Java Version: 3.25.2
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
      "rto/directory/common/v2/common.proto\"\275\003\n" +
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
      "ectory.common.v2.RelationH\000R\010relationB\005\n" +
      "\003msg\"\213\003\n\016ImportResponse\022L\n\013object_type\030\001" +
      " \001(\0132+.aserto.directory.importer.v2.Impo" +
      "rtCounterR\nobjectType\022K\n\npermission\030\002 \001(" +
      "\0132+.aserto.directory.importer.v2.ImportC" +
      "ounterR\npermission\022P\n\rrelation_type\030\003 \001(" +
      "\0132+.aserto.directory.importer.v2.ImportC" +
      "ounterR\014relationType\022C\n\006object\030\004 \001(\0132+.a" +
      "serto.directory.importer.v2.ImportCounte" +
      "rR\006object\022G\n\010relation\030\005 \001(\0132+.aserto.dir" +
      "ectory.importer.v2.ImportCounterR\010relati" +
      "on\"c\n\rImportCounter\022\022\n\004recv\030\001 \001(\004R\004recv\022" +
      "\020\n\003set\030\002 \001(\004R\003set\022\026\n\006delete\030\003 \001(\004R\006delet" +
      "e\022\024\n\005error\030\004 \001(\004R\005error*?\n\006Opcode\022\022\n\016OPC" +
      "ODE_UNKNOWN\020\000\022\016\n\nOPCODE_SET\020\001\022\021\n\rOPCODE_" +
      "DELETE\020\0022u\n\010Importer\022i\n\006Import\022+.aserto." +
      "directory.importer.v2.ImportRequest\032,.as" +
      "erto.directory.importer.v2.ImportRespons" +
      "e\"\000(\0010\001B\225\002\n com.aserto.directory.importe" +
      "r.v2B\rImporterProtoH\002P\001ZHgithub.com/aser" +
      "to-dev/go-directory/aserto/directory/imp" +
      "orter/v2;importer\370\001\000\242\002\003ADI\252\002\034Aserto.Dire" +
      "ctory.Importer.V2\312\002\035Aserto\\Directory_\\Im" +
      "porter\\V2\342\002)Aserto\\Directory_\\Importer\\V" +
      "2\\GPBMetadata\352\002\037Aserto::Directory::Impor" +
      "ter::V2b\006proto3"
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
