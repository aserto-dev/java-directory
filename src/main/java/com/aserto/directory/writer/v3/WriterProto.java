// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/writer/v3/writer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.writer.v3;

public final class WriterProto {
  private WriterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_writer_v3_SetObjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_writer_v3_SetObjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_writer_v3_SetObjectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_writer_v3_SetObjectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_writer_v3_DeleteObjectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_writer_v3_DeleteObjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_writer_v3_DeleteObjectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_writer_v3_DeleteObjectResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_writer_v3_SetRelationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_writer_v3_SetRelationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_writer_v3_SetRelationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_writer_v3_SetRelationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_writer_v3_DeleteRelationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_writer_v3_DeleteRelationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_writer_v3_DeleteRelationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_writer_v3_DeleteRelationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'aserto/directory/writer/v3/writer.prot" +
      "o\022\032aserto.directory.writer.v3\032.protoc-ge" +
      "n-openapiv2/options/annotations.proto\032\033g" +
      "oogle/protobuf/empty.proto\032\034google/api/a" +
      "nnotations.proto\032\037google/api/field_behav" +
      "ior.proto\032\'aserto/directory/common/v3/co" +
      "mmon.proto\"S\n\020SetObjectRequest\022?\n\006object" +
      "\030\001 \001(\0132\".aserto.directory.common.v3.Obje" +
      "ctB\003\340A\002R\006object\"O\n\021SetObjectResponse\022:\n\006" +
      "result\030\001 \001(\0132\".aserto.directory.common.v" +
      "3.ObjectR\006result\"\211\001\n\023DeleteObjectRequest" +
      "\022$\n\013object_type\030\001 \001(\tB\003\340A\002R\nobjectType\022 " +
      "\n\tobject_id\030\002 \001(\tB\003\340A\002R\010objectId\022*\n\016with" +
      "_relations\030\003 \001(\010B\003\340A\001R\rwithRelations\"F\n\024" +
      "DeleteObjectResponse\022.\n\006result\030\001 \001(\0132\026.g" +
      "oogle.protobuf.EmptyR\006result\"[\n\022SetRelat" +
      "ionRequest\022E\n\010relation\030\001 \001(\0132$.aserto.di" +
      "rectory.common.v3.RelationB\003\340A\002R\010relatio" +
      "n\"S\n\023SetRelationResponse\022<\n\006result\030\001 \001(\013" +
      "2$.aserto.directory.common.v3.RelationR\006" +
      "result\"\374\001\n\025DeleteRelationRequest\022$\n\013obje" +
      "ct_type\030\001 \001(\tB\003\340A\002R\nobjectType\022 \n\tobject" +
      "_id\030\002 \001(\tB\003\340A\002R\010objectId\022\037\n\010relation\030\003 \001" +
      "(\tB\003\340A\002R\010relation\022&\n\014subject_type\030\004 \001(\tB" +
      "\003\340A\002R\013subjectType\022\"\n\nsubject_id\030\005 \001(\tB\003\340" +
      "A\002R\tsubjectId\022.\n\020subject_relation\030\006 \001(\tB" +
      "\003\340A\001R\017subjectRelation\"H\n\026DeleteRelationR" +
      "esponse\022.\n\006result\030\001 \001(\0132\026.google.protobu" +
      "f.EmptyR\006result2\320\010\n\006Writer\022\372\001\n\tSetObject" +
      "\022,.aserto.directory.writer.v3.SetObjectR" +
      "equest\032-.aserto.directory.writer.v3.SetO" +
      "bjectResponse\"\217\001\222Ai\n\tdirectory\022\nSet obje" +
      "ct\032\013Set object.*\036directory.writer.v3.obj" +
      "ect.setb#\n\023\n\017DirectoryAPIKey\022\000\n\014\n\010Tenant" +
      "ID\022\000\202\323\344\223\002\035\"\030/api/v3/directory/object:\001*\022" +
      "\243\002\n\014DeleteObject\022/.aserto.directory.writ" +
      "er.v3.DeleteObjectRequest\0320.aserto.direc" +
      "tory.writer.v3.DeleteObjectResponse\"\257\001\222A" +
      "r\n\tdirectory\022\rDelete object\032\016Delete obje" +
      "ct.*!directory.writer.v3.object.deleteb#" +
      "\n\023\n\017DirectoryAPIKey\022\000\n\014\n\010TenantID\022\000\202\323\344\223\002" +
      "4*2/api/v3/directory/object/{object_type" +
      "}/{object_id}\022\210\002\n\013SetRelation\022..aserto.d" +
      "irectory.writer.v3.SetRelationRequest\032/." +
      "aserto.directory.writer.v3.SetRelationRe" +
      "sponse\"\227\001\222Ao\n\tdirectory\022\014Set relation\032\rS" +
      "et relation.* directory.writer.v3.relati" +
      "on.setb#\n\023\n\017DirectoryAPIKey\022\000\n\014\n\010TenantI" +
      "D\022\000\202\323\344\223\002\037\"\032/api/v3/directory/relation:\001*" +
      "\022\227\002\n\016DeleteRelation\0221.aserto.directory.w" +
      "riter.v3.DeleteRelationRequest\0322.aserto." +
      "directory.writer.v3.DeleteRelationRespon" +
      "se\"\235\001\222Ax\n\tdirectory\022\017Delete relation\032\020De" +
      "lete relation.*#directory.writer.v3.rela" +
      "tion.deleteb#\n\023\n\017DirectoryAPIKey\022\000\n\014\n\010Te" +
      "nantID\022\000\202\323\344\223\002\034*\032/api/v3/directory/relati" +
      "onB\200\002\n\036com.aserto.directory.writer.v3B\013W" +
      "riterProtoP\001ZDgithub.com/aserto-dev/go-d" +
      "irectory/aserto/directory/writer/v3;writ" +
      "er\242\002\003ADW\252\002\032Aserto.Directory.Writer.V3\312\002\033" +
      "Aserto\\Directory_\\Writer\\V3\342\002\'Aserto\\Dir" +
      "ectory_\\Writer\\V3\\GPBMetadata\352\002\035Aserto::" +
      "Directory::Writer::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.aserto.directory.common.v3.CommonProto.getDescriptor(),
        });
    internal_static_aserto_directory_writer_v3_SetObjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_writer_v3_SetObjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_writer_v3_SetObjectRequest_descriptor,
        new java.lang.String[] { "Object", });
    internal_static_aserto_directory_writer_v3_SetObjectResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aserto_directory_writer_v3_SetObjectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_writer_v3_SetObjectResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_aserto_directory_writer_v3_DeleteObjectRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aserto_directory_writer_v3_DeleteObjectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_writer_v3_DeleteObjectRequest_descriptor,
        new java.lang.String[] { "ObjectType", "ObjectId", "WithRelations", });
    internal_static_aserto_directory_writer_v3_DeleteObjectResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aserto_directory_writer_v3_DeleteObjectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_writer_v3_DeleteObjectResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_aserto_directory_writer_v3_SetRelationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aserto_directory_writer_v3_SetRelationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_writer_v3_SetRelationRequest_descriptor,
        new java.lang.String[] { "Relation", });
    internal_static_aserto_directory_writer_v3_SetRelationResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aserto_directory_writer_v3_SetRelationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_writer_v3_SetRelationResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_aserto_directory_writer_v3_DeleteRelationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_aserto_directory_writer_v3_DeleteRelationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_writer_v3_DeleteRelationRequest_descriptor,
        new java.lang.String[] { "ObjectType", "ObjectId", "Relation", "SubjectType", "SubjectId", "SubjectRelation", });
    internal_static_aserto_directory_writer_v3_DeleteRelationResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_aserto_directory_writer_v3_DeleteRelationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_writer_v3_DeleteRelationResponse_descriptor,
        new java.lang.String[] { "Result", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Operation);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.aserto.directory.common.v3.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
