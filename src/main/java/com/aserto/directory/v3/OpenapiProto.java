// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/openapi/v3/openapi.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.v3;

public final class OpenapiProto {
  private OpenapiProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)aserto/directory/openapi/v3/openapi.pr" +
      "oto\022\023aserto.directory.v3\032.protoc-gen-ope" +
      "napiv2/options/annotations.protoB\352\004\n\027com" +
      ".aserto.directory.v3B\014OpenapiProtoP\001Z@gi" +
      "thub.com/aserto-dev/go-directory/aserto/" +
      "directory/v3;directory\242\002\003ADX\252\002\023Aserto.Di" +
      "rectory.V3\312\002\024Aserto\\Directory_\\V3\342\002 Aser" +
      "to\\Directory_\\V3\\GPBMetadata\352\002\025Aserto::D" +
      "irectory::V3\222A\215\003\022\274\001\n\021Directory Service\"N" +
      "\n\014Aserto, Inc.\022*https://github.com/asert" +
      "o-dev/pb-directory\032\022support@aserto.com*R" +
      "\n\022Apache 2.0 License\022<https://github.com" +
      "/aserto-dev/pb-directory/blob/main/LICEN" +
      "SE2\0033.1*\003\001\002\0042\020application/json:\020applicat" +
      "ion/jsonZL\n&\n\017DirectoryAPIKey\022\023\010\002\032\rautho" +
      "rization \002\n\"\n\010TenantID\022\026\010\002\032\020aserto-tenan" +
      "t-id \002b#\n\023\n\017DirectoryAPIKey\022\000\n\014\n\010TenantI" +
      "D\022\000r0\n\025Aserto API Reference.\022\027https://do" +
      "cs.aserto.comb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Swagger);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
