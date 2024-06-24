// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/importer/v3/importer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.importer.v3;

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
    internal_static_aserto_directory_importer_v3_ImportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_importer_v3_ImportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_importer_v3_ImportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_importer_v3_ImportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_importer_v3_ImportCounter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_importer_v3_ImportCounter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+aserto/directory/importer/v3/importer." +
      "proto\022\034aserto.directory.importer.v3\032\'ase" +
      "rto/directory/common/v3/common.proto\"\327\001\n" +
      "\rImportRequest\022=\n\007op_code\030\001 \001(\0162$.aserto" +
      ".directory.importer.v3.OpcodeR\006opCode\022<\n" +
      "\006object\030\005 \001(\0132\".aserto.directory.common." +
      "v3.ObjectH\000R\006object\022B\n\010relation\030\006 \001(\0132$." +
      "aserto.directory.common.v3.RelationH\000R\010r" +
      "elationB\005\n\003msg\"\236\001\n\016ImportResponse\022C\n\006obj" +
      "ect\030\001 \001(\0132+.aserto.directory.importer.v3" +
      ".ImportCounterR\006object\022G\n\010relation\030\002 \001(\013" +
      "2+.aserto.directory.importer.v3.ImportCo" +
      "unterR\010relation\"c\n\rImportCounter\022\022\n\004recv" +
      "\030\001 \001(\004R\004recv\022\020\n\003set\030\002 \001(\004R\003set\022\026\n\006delete" +
      "\030\003 \001(\004R\006delete\022\024\n\005error\030\004 \001(\004R\005error*a\n\006" +
      "Opcode\022\022\n\016OPCODE_UNKNOWN\020\000\022\016\n\nOPCODE_SET" +
      "\020\001\022\021\n\rOPCODE_DELETE\020\002\022 \n\034OPCODE_DELETE_W" +
      "ITH_RELATIONS\020\0032u\n\010Importer\022i\n\006Import\022+." +
      "aserto.directory.importer.v3.ImportReque" +
      "st\032,.aserto.directory.importer.v3.Import" +
      "Response\"\000(\0010\001B\225\002\n com.aserto.directory." +
      "importer.v3B\rImporterProtoH\002P\001ZHgithub.c" +
      "om/aserto-dev/go-directory/aserto/direct" +
      "ory/importer/v3;importer\370\001\000\242\002\003ADI\252\002\034Aser" +
      "to.Directory.Importer.V3\312\002\035Aserto\\Direct" +
      "ory_\\Importer\\V3\342\002)Aserto\\Directory_\\Imp" +
      "orter\\V3\\GPBMetadata\352\002\037Aserto::Directory" +
      "::Importer::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.aserto.directory.common.v3.CommonProto.getDescriptor(),
        });
    internal_static_aserto_directory_importer_v3_ImportRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_importer_v3_ImportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_importer_v3_ImportRequest_descriptor,
        new java.lang.String[] { "OpCode", "Object", "Relation", "Msg", });
    internal_static_aserto_directory_importer_v3_ImportResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aserto_directory_importer_v3_ImportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_importer_v3_ImportResponse_descriptor,
        new java.lang.String[] { "Object", "Relation", });
    internal_static_aserto_directory_importer_v3_ImportCounter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aserto_directory_importer_v3_ImportCounter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_importer_v3_ImportCounter_descriptor,
        new java.lang.String[] { "Recv", "Set", "Delete", "Error", });
    com.aserto.directory.common.v3.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
