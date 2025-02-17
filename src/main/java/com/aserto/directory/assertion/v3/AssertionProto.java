// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/assertion/v3/assertion.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.assertion.v3;

public final class AssertionProto {
  private AssertionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_assertion_v3_GetAssertionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_assertion_v3_GetAssertionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_assertion_v3_GetAssertionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_assertion_v3_GetAssertionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_assertion_v3_ListAssertionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_assertion_v3_ListAssertionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_assertion_v3_ListAssertionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_assertion_v3_ListAssertionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_assertion_v3_SetAssertionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_assertion_v3_SetAssertionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_assertion_v3_SetAssertionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_assertion_v3_SetAssertionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_assertion_v3_DeleteAssertionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_assertion_v3_DeleteAssertionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_assertion_v3_DeleteAssertionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_assertion_v3_DeleteAssertionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_directory_assertion_v3_Assert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_directory_assertion_v3_Assert_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-aserto/directory/assertion/v3/assertio" +
      "n.proto\022\035aserto.directory.assertion.v3\032\033" +
      "google/protobuf/empty.proto\032\034google/api/" +
      "annotations.proto\032\037google/api/field_beha" +
      "vior.proto\032.protoc-gen-openapiv2/options" +
      "/annotations.proto\032\'aserto/directory/com" +
      "mon/v3/common.proto\032\'aserto/directory/re" +
      "ader/v3/reader.proto\"*\n\023GetAssertionRequ" +
      "est\022\023\n\002id\030\001 \001(\rB\003\340A\002R\002id\"U\n\024GetAssertion" +
      "Response\022=\n\006result\030\001 \001(\0132%.aserto.direct" +
      "ory.assertion.v3.AssertR\006result\"_\n\025ListA" +
      "ssertionsRequest\022F\n\004page\030\001 \001(\0132-.aserto." +
      "directory.common.v3.PaginationRequestB\003\340" +
      "A\001R\004page\"\235\001\n\026ListAssertionsResponse\022?\n\007r" +
      "esults\030\001 \003(\0132%.aserto.directory.assertio" +
      "n.v3.AssertR\007results\022B\n\004page\030\002 \001(\0132..ase" +
      "rto.directory.common.v3.PaginationRespon" +
      "seR\004page\"Y\n\023SetAssertionRequest\022B\n\006asser" +
      "t\030\001 \001(\0132%.aserto.directory.assertion.v3." +
      "AssertB\003\340A\002R\006assert\"U\n\024SetAssertionRespo" +
      "nse\022=\n\006result\030\001 \001(\0132%.aserto.directory.a" +
      "ssertion.v3.AssertR\006result\"-\n\026DeleteAsse" +
      "rtionRequest\022\023\n\002id\030\001 \001(\rB\003\340A\002R\002id\"I\n\027Del" +
      "eteAssertionResponse\022.\n\006result\030\001 \001(\0132\026.g" +
      "oogle.protobuf.EmptyR\006result\"\340\002\n\006Assert\022" +
      "\016\n\002id\030\001 \001(\rR\002id\022\037\n\010expected\030\002 \001(\010B\003\340A\002R\010" +
      "expected\022@\n\005check\030\003 \001(\0132(.aserto.directo" +
      "ry.reader.v3.CheckRequestH\000R\005check\022Y\n\016ch" +
      "eck_relation\030\004 \001(\01320.aserto.directory.re" +
      "ader.v3.CheckRelationRequestH\000R\rcheckRel" +
      "ation\022_\n\020check_permission\030\005 \001(\01322.aserto" +
      ".directory.reader.v3.CheckPermissionRequ" +
      "estH\000R\017checkPermission\022 \n\013description\030\006 " +
      "\001(\tR\013descriptionB\005\n\003msg2\312\t\n\tAssertion\022\270\002" +
      "\n\014GetAssertion\0222.aserto.directory.assert" +
      "ion.v3.GetAssertionRequest\0323.aserto.dire" +
      "ctory.assertion.v3.GetAssertionResponse\"" +
      "\276\001\222A\222\001\n\tdirectory\022\026Get assertion instanc" +
      "e\032\"Returns single assertion instance.*$d" +
      "irectory.assertion.v3.assertion.getb#\n\023\n" +
      "\017DirectoryAPIKey\022\000\n\014\n\010TenantID\022\000\202\323\344\223\002\"\022 " +
      "/api/v3/directory/assertion/{id}\022\267\002\n\016Lis" +
      "tAssertions\0224.aserto.directory.assertion" +
      ".v3.ListAssertionsRequest\0325.aserto.direc" +
      "tory.assertion.v3.ListAssertionsResponse" +
      "\"\267\001\222A\217\001\n\tdirectory\022\017List assertions\032$Ret" +
      "urns list of assertion instances.*&direc" +
      "tory.assertion.v3.assertions.listb#\n\023\n\017D" +
      "irectoryAPIKey\022\000\n\014\n\010TenantID\022\000\202\323\344\223\002\036\022\034/a" +
      "pi/v3/directory/assertions\022\230\002\n\014SetAssert" +
      "ion\0222.aserto.directory.assertion.v3.SetA" +
      "ssertionRequest\0323.aserto.directory.asser" +
      "tion.v3.SetAssertionResponse\"\236\001\222Au\n\tdire" +
      "ctory\022\rSet assertion\032\016Set assertion.*$di" +
      "rectory.assertion.v3.assertion.setb#\n\023\n\017" +
      "DirectoryAPIKey\022\000\n\014\n\010TenantID\022\000\202\323\344\223\002 \"\033/" +
      "api/v3/directory/assertion:\001*\022\254\002\n\017Delete" +
      "Assertion\0225.aserto.directory.assertion.v" +
      "3.DeleteAssertionRequest\0326.aserto.direct" +
      "ory.assertion.v3.DeleteAssertionResponse" +
      "\"\251\001\222A~\n\tdirectory\022\020Delete assertion\032\021Del" +
      "ete assertion.*\'directory.assertion.v3.a" +
      "ssertion.deleteb#\n\023\n\017DirectoryAPIKey\022\000\n\014" +
      "\n\010TenantID\022\000\202\323\344\223\002\"* /api/v3/directory/as" +
      "sertion/{id}B\230\002\n!com.aserto.directory.as" +
      "sertion.v3B\016AssertionProtoP\001ZJgithub.com" +
      "/aserto-dev/go-directory/aserto/director" +
      "y/assertion/v3;assertion\242\002\003ADA\252\002\035Aserto." +
      "Directory.Assertion.V3\312\002\036Aserto\\Director" +
      "y_\\Assertion\\V3\342\002*Aserto\\Directory_\\Asse" +
      "rtion\\V3\\GPBMetadata\352\002 Aserto::Directory" +
      "::Assertion::V3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor(),
          com.aserto.directory.common.v3.CommonProto.getDescriptor(),
          com.aserto.directory.reader.v3.ReaderProto.getDescriptor(),
        });
    internal_static_aserto_directory_assertion_v3_GetAssertionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_directory_assertion_v3_GetAssertionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_assertion_v3_GetAssertionRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_aserto_directory_assertion_v3_GetAssertionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aserto_directory_assertion_v3_GetAssertionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_assertion_v3_GetAssertionResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_aserto_directory_assertion_v3_ListAssertionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aserto_directory_assertion_v3_ListAssertionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_assertion_v3_ListAssertionsRequest_descriptor,
        new java.lang.String[] { "Page", });
    internal_static_aserto_directory_assertion_v3_ListAssertionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aserto_directory_assertion_v3_ListAssertionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_assertion_v3_ListAssertionsResponse_descriptor,
        new java.lang.String[] { "Results", "Page", });
    internal_static_aserto_directory_assertion_v3_SetAssertionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aserto_directory_assertion_v3_SetAssertionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_assertion_v3_SetAssertionRequest_descriptor,
        new java.lang.String[] { "Assert", });
    internal_static_aserto_directory_assertion_v3_SetAssertionResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aserto_directory_assertion_v3_SetAssertionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_assertion_v3_SetAssertionResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_aserto_directory_assertion_v3_DeleteAssertionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_aserto_directory_assertion_v3_DeleteAssertionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_assertion_v3_DeleteAssertionRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_aserto_directory_assertion_v3_DeleteAssertionResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_aserto_directory_assertion_v3_DeleteAssertionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_assertion_v3_DeleteAssertionResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_aserto_directory_assertion_v3_Assert_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_aserto_directory_assertion_v3_Assert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_directory_assertion_v3_Assert_descriptor,
        new java.lang.String[] { "Id", "Expected", "Check", "CheckRelation", "CheckPermission", "Description", "Msg", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Operation);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor();
    com.aserto.directory.common.v3.CommonProto.getDescriptor();
    com.aserto.directory.reader.v3.ReaderProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
