package com.aserto.directory.reader.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.1)",
    comments = "Source: aserto/directory/reader/v2/reader.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReaderGrpc {

  private ReaderGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aserto.directory.reader.v2.Reader";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectTypeRequest,
      com.aserto.directory.reader.v2.GetObjectTypeResponse> getGetObjectTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectType",
      requestType = com.aserto.directory.reader.v2.GetObjectTypeRequest.class,
      responseType = com.aserto.directory.reader.v2.GetObjectTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectTypeRequest,
      com.aserto.directory.reader.v2.GetObjectTypeResponse> getGetObjectTypeMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectTypeRequest, com.aserto.directory.reader.v2.GetObjectTypeResponse> getGetObjectTypeMethod;
    if ((getGetObjectTypeMethod = ReaderGrpc.getGetObjectTypeMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetObjectTypeMethod = ReaderGrpc.getGetObjectTypeMethod) == null) {
          ReaderGrpc.getGetObjectTypeMethod = getGetObjectTypeMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetObjectTypeRequest, com.aserto.directory.reader.v2.GetObjectTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetObjectTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetObjectTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetObjectType"))
              .build();
        }
      }
    }
    return getGetObjectTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectTypesRequest,
      com.aserto.directory.reader.v2.GetObjectTypesResponse> getGetObjectTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectTypes",
      requestType = com.aserto.directory.reader.v2.GetObjectTypesRequest.class,
      responseType = com.aserto.directory.reader.v2.GetObjectTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectTypesRequest,
      com.aserto.directory.reader.v2.GetObjectTypesResponse> getGetObjectTypesMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectTypesRequest, com.aserto.directory.reader.v2.GetObjectTypesResponse> getGetObjectTypesMethod;
    if ((getGetObjectTypesMethod = ReaderGrpc.getGetObjectTypesMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetObjectTypesMethod = ReaderGrpc.getGetObjectTypesMethod) == null) {
          ReaderGrpc.getGetObjectTypesMethod = getGetObjectTypesMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetObjectTypesRequest, com.aserto.directory.reader.v2.GetObjectTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetObjectTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetObjectTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetObjectTypes"))
              .build();
        }
      }
    }
    return getGetObjectTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationTypeRequest,
      com.aserto.directory.reader.v2.GetRelationTypeResponse> getGetRelationTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRelationType",
      requestType = com.aserto.directory.reader.v2.GetRelationTypeRequest.class,
      responseType = com.aserto.directory.reader.v2.GetRelationTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationTypeRequest,
      com.aserto.directory.reader.v2.GetRelationTypeResponse> getGetRelationTypeMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationTypeRequest, com.aserto.directory.reader.v2.GetRelationTypeResponse> getGetRelationTypeMethod;
    if ((getGetRelationTypeMethod = ReaderGrpc.getGetRelationTypeMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetRelationTypeMethod = ReaderGrpc.getGetRelationTypeMethod) == null) {
          ReaderGrpc.getGetRelationTypeMethod = getGetRelationTypeMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetRelationTypeRequest, com.aserto.directory.reader.v2.GetRelationTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRelationType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetRelationTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetRelationTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetRelationType"))
              .build();
        }
      }
    }
    return getGetRelationTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationTypesRequest,
      com.aserto.directory.reader.v2.GetRelationTypesResponse> getGetRelationTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRelationTypes",
      requestType = com.aserto.directory.reader.v2.GetRelationTypesRequest.class,
      responseType = com.aserto.directory.reader.v2.GetRelationTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationTypesRequest,
      com.aserto.directory.reader.v2.GetRelationTypesResponse> getGetRelationTypesMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationTypesRequest, com.aserto.directory.reader.v2.GetRelationTypesResponse> getGetRelationTypesMethod;
    if ((getGetRelationTypesMethod = ReaderGrpc.getGetRelationTypesMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetRelationTypesMethod = ReaderGrpc.getGetRelationTypesMethod) == null) {
          ReaderGrpc.getGetRelationTypesMethod = getGetRelationTypesMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetRelationTypesRequest, com.aserto.directory.reader.v2.GetRelationTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRelationTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetRelationTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetRelationTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetRelationTypes"))
              .build();
        }
      }
    }
    return getGetRelationTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetPermissionRequest,
      com.aserto.directory.reader.v2.GetPermissionResponse> getGetPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPermission",
      requestType = com.aserto.directory.reader.v2.GetPermissionRequest.class,
      responseType = com.aserto.directory.reader.v2.GetPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetPermissionRequest,
      com.aserto.directory.reader.v2.GetPermissionResponse> getGetPermissionMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetPermissionRequest, com.aserto.directory.reader.v2.GetPermissionResponse> getGetPermissionMethod;
    if ((getGetPermissionMethod = ReaderGrpc.getGetPermissionMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetPermissionMethod = ReaderGrpc.getGetPermissionMethod) == null) {
          ReaderGrpc.getGetPermissionMethod = getGetPermissionMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetPermissionRequest, com.aserto.directory.reader.v2.GetPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetPermission"))
              .build();
        }
      }
    }
    return getGetPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetPermissionsRequest,
      com.aserto.directory.reader.v2.GetPermissionsResponse> getGetPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPermissions",
      requestType = com.aserto.directory.reader.v2.GetPermissionsRequest.class,
      responseType = com.aserto.directory.reader.v2.GetPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetPermissionsRequest,
      com.aserto.directory.reader.v2.GetPermissionsResponse> getGetPermissionsMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetPermissionsRequest, com.aserto.directory.reader.v2.GetPermissionsResponse> getGetPermissionsMethod;
    if ((getGetPermissionsMethod = ReaderGrpc.getGetPermissionsMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetPermissionsMethod = ReaderGrpc.getGetPermissionsMethod) == null) {
          ReaderGrpc.getGetPermissionsMethod = getGetPermissionsMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetPermissionsRequest, com.aserto.directory.reader.v2.GetPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetPermissions"))
              .build();
        }
      }
    }
    return getGetPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectRequest,
      com.aserto.directory.reader.v2.GetObjectResponse> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = com.aserto.directory.reader.v2.GetObjectRequest.class,
      responseType = com.aserto.directory.reader.v2.GetObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectRequest,
      com.aserto.directory.reader.v2.GetObjectResponse> getGetObjectMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectRequest, com.aserto.directory.reader.v2.GetObjectResponse> getGetObjectMethod;
    if ((getGetObjectMethod = ReaderGrpc.getGetObjectMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetObjectMethod = ReaderGrpc.getGetObjectMethod) == null) {
          ReaderGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetObjectRequest, com.aserto.directory.reader.v2.GetObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectManyRequest,
      com.aserto.directory.reader.v2.GetObjectManyResponse> getGetObjectManyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectMany",
      requestType = com.aserto.directory.reader.v2.GetObjectManyRequest.class,
      responseType = com.aserto.directory.reader.v2.GetObjectManyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectManyRequest,
      com.aserto.directory.reader.v2.GetObjectManyResponse> getGetObjectManyMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectManyRequest, com.aserto.directory.reader.v2.GetObjectManyResponse> getGetObjectManyMethod;
    if ((getGetObjectManyMethod = ReaderGrpc.getGetObjectManyMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetObjectManyMethod = ReaderGrpc.getGetObjectManyMethod) == null) {
          ReaderGrpc.getGetObjectManyMethod = getGetObjectManyMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetObjectManyRequest, com.aserto.directory.reader.v2.GetObjectManyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectMany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetObjectManyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetObjectManyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetObjectMany"))
              .build();
        }
      }
    }
    return getGetObjectManyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectsRequest,
      com.aserto.directory.reader.v2.GetObjectsResponse> getGetObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjects",
      requestType = com.aserto.directory.reader.v2.GetObjectsRequest.class,
      responseType = com.aserto.directory.reader.v2.GetObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectsRequest,
      com.aserto.directory.reader.v2.GetObjectsResponse> getGetObjectsMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetObjectsRequest, com.aserto.directory.reader.v2.GetObjectsResponse> getGetObjectsMethod;
    if ((getGetObjectsMethod = ReaderGrpc.getGetObjectsMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetObjectsMethod = ReaderGrpc.getGetObjectsMethod) == null) {
          ReaderGrpc.getGetObjectsMethod = getGetObjectsMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetObjectsRequest, com.aserto.directory.reader.v2.GetObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetObjects"))
              .build();
        }
      }
    }
    return getGetObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationRequest,
      com.aserto.directory.reader.v2.GetRelationResponse> getGetRelationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRelation",
      requestType = com.aserto.directory.reader.v2.GetRelationRequest.class,
      responseType = com.aserto.directory.reader.v2.GetRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationRequest,
      com.aserto.directory.reader.v2.GetRelationResponse> getGetRelationMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationRequest, com.aserto.directory.reader.v2.GetRelationResponse> getGetRelationMethod;
    if ((getGetRelationMethod = ReaderGrpc.getGetRelationMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetRelationMethod = ReaderGrpc.getGetRelationMethod) == null) {
          ReaderGrpc.getGetRelationMethod = getGetRelationMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetRelationRequest, com.aserto.directory.reader.v2.GetRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRelation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetRelationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetRelation"))
              .build();
        }
      }
    }
    return getGetRelationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationsRequest,
      com.aserto.directory.reader.v2.GetRelationsResponse> getGetRelationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRelations",
      requestType = com.aserto.directory.reader.v2.GetRelationsRequest.class,
      responseType = com.aserto.directory.reader.v2.GetRelationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationsRequest,
      com.aserto.directory.reader.v2.GetRelationsResponse> getGetRelationsMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetRelationsRequest, com.aserto.directory.reader.v2.GetRelationsResponse> getGetRelationsMethod;
    if ((getGetRelationsMethod = ReaderGrpc.getGetRelationsMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetRelationsMethod = ReaderGrpc.getGetRelationsMethod) == null) {
          ReaderGrpc.getGetRelationsMethod = getGetRelationsMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetRelationsRequest, com.aserto.directory.reader.v2.GetRelationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRelations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetRelationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetRelationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetRelations"))
              .build();
        }
      }
    }
    return getGetRelationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.CheckPermissionRequest,
      com.aserto.directory.reader.v2.CheckPermissionResponse> getCheckPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPermission",
      requestType = com.aserto.directory.reader.v2.CheckPermissionRequest.class,
      responseType = com.aserto.directory.reader.v2.CheckPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.CheckPermissionRequest,
      com.aserto.directory.reader.v2.CheckPermissionResponse> getCheckPermissionMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.CheckPermissionRequest, com.aserto.directory.reader.v2.CheckPermissionResponse> getCheckPermissionMethod;
    if ((getCheckPermissionMethod = ReaderGrpc.getCheckPermissionMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getCheckPermissionMethod = ReaderGrpc.getCheckPermissionMethod) == null) {
          ReaderGrpc.getCheckPermissionMethod = getCheckPermissionMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.CheckPermissionRequest, com.aserto.directory.reader.v2.CheckPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.CheckPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.CheckPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("CheckPermission"))
              .build();
        }
      }
    }
    return getCheckPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.CheckRelationRequest,
      com.aserto.directory.reader.v2.CheckRelationResponse> getCheckRelationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckRelation",
      requestType = com.aserto.directory.reader.v2.CheckRelationRequest.class,
      responseType = com.aserto.directory.reader.v2.CheckRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.CheckRelationRequest,
      com.aserto.directory.reader.v2.CheckRelationResponse> getCheckRelationMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.CheckRelationRequest, com.aserto.directory.reader.v2.CheckRelationResponse> getCheckRelationMethod;
    if ((getCheckRelationMethod = ReaderGrpc.getCheckRelationMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getCheckRelationMethod = ReaderGrpc.getCheckRelationMethod) == null) {
          ReaderGrpc.getCheckRelationMethod = getCheckRelationMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.CheckRelationRequest, com.aserto.directory.reader.v2.CheckRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckRelation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.CheckRelationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.CheckRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("CheckRelation"))
              .build();
        }
      }
    }
    return getCheckRelationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetGraphRequest,
      com.aserto.directory.reader.v2.GetGraphResponse> getGetGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGraph",
      requestType = com.aserto.directory.reader.v2.GetGraphRequest.class,
      responseType = com.aserto.directory.reader.v2.GetGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetGraphRequest,
      com.aserto.directory.reader.v2.GetGraphResponse> getGetGraphMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v2.GetGraphRequest, com.aserto.directory.reader.v2.GetGraphResponse> getGetGraphMethod;
    if ((getGetGraphMethod = ReaderGrpc.getGetGraphMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetGraphMethod = ReaderGrpc.getGetGraphMethod) == null) {
          ReaderGrpc.getGetGraphMethod = getGetGraphMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v2.GetGraphRequest, com.aserto.directory.reader.v2.GetGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v2.GetGraphResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetGraph"))
              .build();
        }
      }
    }
    return getGetGraphMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReaderStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReaderStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReaderStub>() {
        @java.lang.Override
        public ReaderStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReaderStub(channel, callOptions);
        }
      };
    return ReaderStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReaderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReaderBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReaderBlockingStub>() {
        @java.lang.Override
        public ReaderBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReaderBlockingStub(channel, callOptions);
        }
      };
    return ReaderBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReaderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReaderFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReaderFutureStub>() {
        @java.lang.Override
        public ReaderFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReaderFutureStub(channel, callOptions);
        }
      };
    return ReaderFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * object type metadata methods
     * </pre>
     */
    default void getObjectType(com.aserto.directory.reader.v2.GetObjectTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectTypeMethod(), responseObserver);
    }

    /**
     */
    default void getObjectTypes(com.aserto.directory.reader.v2.GetObjectTypesRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * relation type metadata methods
     * </pre>
     */
    default void getRelationType(com.aserto.directory.reader.v2.GetRelationTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRelationTypeMethod(), responseObserver);
    }

    /**
     */
    default void getRelationTypes(com.aserto.directory.reader.v2.GetRelationTypesRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRelationTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * permission metadata methods
     * </pre>
     */
    default void getPermission(com.aserto.directory.reader.v2.GetPermissionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetPermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPermissionMethod(), responseObserver);
    }

    /**
     */
    default void getPermissions(com.aserto.directory.reader.v2.GetPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * object methods
     * </pre>
     */
    default void getObject(com.aserto.directory.reader.v2.GetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     */
    default void getObjectMany(com.aserto.directory.reader.v2.GetObjectManyRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectManyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectManyMethod(), responseObserver);
    }

    /**
     */
    default void getObjects(com.aserto.directory.reader.v2.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * relation methods
     * </pre>
     */
    default void getRelation(com.aserto.directory.reader.v2.GetRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRelationMethod(), responseObserver);
    }

    /**
     */
    default void getRelations(com.aserto.directory.reader.v2.GetRelationsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRelationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * check permission method
     * </pre>
     */
    default void checkPermission(com.aserto.directory.reader.v2.CheckPermissionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.CheckPermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * check relation method
     * </pre>
     */
    default void checkRelation(com.aserto.directory.reader.v2.CheckRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.CheckRelationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckRelationMethod(), responseObserver);
    }

    /**
     * <pre>
     * graph methods
     * </pre>
     */
    default void getGraph(com.aserto.directory.reader.v2.GetGraphRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetGraphResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGraphMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Reader.
   */
  public static abstract class ReaderImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReaderGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Reader.
   */
  public static final class ReaderStub
      extends io.grpc.stub.AbstractAsyncStub<ReaderStub> {
    private ReaderStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReaderStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReaderStub(channel, callOptions);
    }

    /**
     * <pre>
     * object type metadata methods
     * </pre>
     */
    public void getObjectType(com.aserto.directory.reader.v2.GetObjectTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObjectTypes(com.aserto.directory.reader.v2.GetObjectTypesRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * relation type metadata methods
     * </pre>
     */
    public void getRelationType(com.aserto.directory.reader.v2.GetRelationTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRelationTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRelationTypes(com.aserto.directory.reader.v2.GetRelationTypesRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRelationTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * permission metadata methods
     * </pre>
     */
    public void getPermission(com.aserto.directory.reader.v2.GetPermissionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetPermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPermissions(com.aserto.directory.reader.v2.GetPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * object methods
     * </pre>
     */
    public void getObject(com.aserto.directory.reader.v2.GetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObjectMany(com.aserto.directory.reader.v2.GetObjectManyRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectManyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectManyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObjects(com.aserto.directory.reader.v2.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * relation methods
     * </pre>
     */
    public void getRelation(com.aserto.directory.reader.v2.GetRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRelationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRelations(com.aserto.directory.reader.v2.GetRelationsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRelationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * check permission method
     * </pre>
     */
    public void checkPermission(com.aserto.directory.reader.v2.CheckPermissionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.CheckPermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * check relation method
     * </pre>
     */
    public void checkRelation(com.aserto.directory.reader.v2.CheckRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.CheckRelationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckRelationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * graph methods
     * </pre>
     */
    public void getGraph(com.aserto.directory.reader.v2.GetGraphRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetGraphResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGraphMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Reader.
   */
  public static final class ReaderBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReaderBlockingStub> {
    private ReaderBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReaderBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReaderBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * object type metadata methods
     * </pre>
     */
    public com.aserto.directory.reader.v2.GetObjectTypeResponse getObjectType(com.aserto.directory.reader.v2.GetObjectTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.reader.v2.GetObjectTypesResponse getObjectTypes(com.aserto.directory.reader.v2.GetObjectTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * relation type metadata methods
     * </pre>
     */
    public com.aserto.directory.reader.v2.GetRelationTypeResponse getRelationType(com.aserto.directory.reader.v2.GetRelationTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRelationTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.reader.v2.GetRelationTypesResponse getRelationTypes(com.aserto.directory.reader.v2.GetRelationTypesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRelationTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * permission metadata methods
     * </pre>
     */
    public com.aserto.directory.reader.v2.GetPermissionResponse getPermission(com.aserto.directory.reader.v2.GetPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.reader.v2.GetPermissionsResponse getPermissions(com.aserto.directory.reader.v2.GetPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * object methods
     * </pre>
     */
    public com.aserto.directory.reader.v2.GetObjectResponse getObject(com.aserto.directory.reader.v2.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.reader.v2.GetObjectManyResponse getObjectMany(com.aserto.directory.reader.v2.GetObjectManyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectManyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.reader.v2.GetObjectsResponse getObjects(com.aserto.directory.reader.v2.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * relation methods
     * </pre>
     */
    public com.aserto.directory.reader.v2.GetRelationResponse getRelation(com.aserto.directory.reader.v2.GetRelationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRelationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.reader.v2.GetRelationsResponse getRelations(com.aserto.directory.reader.v2.GetRelationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRelationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * check permission method
     * </pre>
     */
    public com.aserto.directory.reader.v2.CheckPermissionResponse checkPermission(com.aserto.directory.reader.v2.CheckPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * check relation method
     * </pre>
     */
    public com.aserto.directory.reader.v2.CheckRelationResponse checkRelation(com.aserto.directory.reader.v2.CheckRelationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckRelationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * graph methods
     * </pre>
     */
    public com.aserto.directory.reader.v2.GetGraphResponse getGraph(com.aserto.directory.reader.v2.GetGraphRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGraphMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Reader.
   */
  public static final class ReaderFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReaderFutureStub> {
    private ReaderFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReaderFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReaderFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * object type metadata methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetObjectTypeResponse> getObjectType(
        com.aserto.directory.reader.v2.GetObjectTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetObjectTypesResponse> getObjectTypes(
        com.aserto.directory.reader.v2.GetObjectTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * relation type metadata methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetRelationTypeResponse> getRelationType(
        com.aserto.directory.reader.v2.GetRelationTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRelationTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetRelationTypesResponse> getRelationTypes(
        com.aserto.directory.reader.v2.GetRelationTypesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRelationTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * permission metadata methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetPermissionResponse> getPermission(
        com.aserto.directory.reader.v2.GetPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetPermissionsResponse> getPermissions(
        com.aserto.directory.reader.v2.GetPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * object methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetObjectResponse> getObject(
        com.aserto.directory.reader.v2.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetObjectManyResponse> getObjectMany(
        com.aserto.directory.reader.v2.GetObjectManyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectManyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetObjectsResponse> getObjects(
        com.aserto.directory.reader.v2.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * relation methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetRelationResponse> getRelation(
        com.aserto.directory.reader.v2.GetRelationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRelationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetRelationsResponse> getRelations(
        com.aserto.directory.reader.v2.GetRelationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRelationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * check permission method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.CheckPermissionResponse> checkPermission(
        com.aserto.directory.reader.v2.CheckPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * check relation method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.CheckRelationResponse> checkRelation(
        com.aserto.directory.reader.v2.CheckRelationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckRelationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * graph methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v2.GetGraphResponse> getGraph(
        com.aserto.directory.reader.v2.GetGraphRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGraphMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OBJECT_TYPE = 0;
  private static final int METHODID_GET_OBJECT_TYPES = 1;
  private static final int METHODID_GET_RELATION_TYPE = 2;
  private static final int METHODID_GET_RELATION_TYPES = 3;
  private static final int METHODID_GET_PERMISSION = 4;
  private static final int METHODID_GET_PERMISSIONS = 5;
  private static final int METHODID_GET_OBJECT = 6;
  private static final int METHODID_GET_OBJECT_MANY = 7;
  private static final int METHODID_GET_OBJECTS = 8;
  private static final int METHODID_GET_RELATION = 9;
  private static final int METHODID_GET_RELATIONS = 10;
  private static final int METHODID_CHECK_PERMISSION = 11;
  private static final int METHODID_CHECK_RELATION = 12;
  private static final int METHODID_GET_GRAPH = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_OBJECT_TYPE:
          serviceImpl.getObjectType((com.aserto.directory.reader.v2.GetObjectTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectTypeResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_TYPES:
          serviceImpl.getObjectTypes((com.aserto.directory.reader.v2.GetObjectTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectTypesResponse>) responseObserver);
          break;
        case METHODID_GET_RELATION_TYPE:
          serviceImpl.getRelationType((com.aserto.directory.reader.v2.GetRelationTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationTypeResponse>) responseObserver);
          break;
        case METHODID_GET_RELATION_TYPES:
          serviceImpl.getRelationTypes((com.aserto.directory.reader.v2.GetRelationTypesRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationTypesResponse>) responseObserver);
          break;
        case METHODID_GET_PERMISSION:
          serviceImpl.getPermission((com.aserto.directory.reader.v2.GetPermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetPermissionResponse>) responseObserver);
          break;
        case METHODID_GET_PERMISSIONS:
          serviceImpl.getPermissions((com.aserto.directory.reader.v2.GetPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetPermissionsResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((com.aserto.directory.reader.v2.GetObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_MANY:
          serviceImpl.getObjectMany((com.aserto.directory.reader.v2.GetObjectManyRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectManyResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECTS:
          serviceImpl.getObjects((com.aserto.directory.reader.v2.GetObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetObjectsResponse>) responseObserver);
          break;
        case METHODID_GET_RELATION:
          serviceImpl.getRelation((com.aserto.directory.reader.v2.GetRelationRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationResponse>) responseObserver);
          break;
        case METHODID_GET_RELATIONS:
          serviceImpl.getRelations((com.aserto.directory.reader.v2.GetRelationsRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetRelationsResponse>) responseObserver);
          break;
        case METHODID_CHECK_PERMISSION:
          serviceImpl.checkPermission((com.aserto.directory.reader.v2.CheckPermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.CheckPermissionResponse>) responseObserver);
          break;
        case METHODID_CHECK_RELATION:
          serviceImpl.checkRelation((com.aserto.directory.reader.v2.CheckRelationRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.CheckRelationResponse>) responseObserver);
          break;
        case METHODID_GET_GRAPH:
          serviceImpl.getGraph((com.aserto.directory.reader.v2.GetGraphRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v2.GetGraphResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetObjectTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetObjectTypeRequest,
              com.aserto.directory.reader.v2.GetObjectTypeResponse>(
                service, METHODID_GET_OBJECT_TYPE)))
        .addMethod(
          getGetObjectTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetObjectTypesRequest,
              com.aserto.directory.reader.v2.GetObjectTypesResponse>(
                service, METHODID_GET_OBJECT_TYPES)))
        .addMethod(
          getGetRelationTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetRelationTypeRequest,
              com.aserto.directory.reader.v2.GetRelationTypeResponse>(
                service, METHODID_GET_RELATION_TYPE)))
        .addMethod(
          getGetRelationTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetRelationTypesRequest,
              com.aserto.directory.reader.v2.GetRelationTypesResponse>(
                service, METHODID_GET_RELATION_TYPES)))
        .addMethod(
          getGetPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetPermissionRequest,
              com.aserto.directory.reader.v2.GetPermissionResponse>(
                service, METHODID_GET_PERMISSION)))
        .addMethod(
          getGetPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetPermissionsRequest,
              com.aserto.directory.reader.v2.GetPermissionsResponse>(
                service, METHODID_GET_PERMISSIONS)))
        .addMethod(
          getGetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetObjectRequest,
              com.aserto.directory.reader.v2.GetObjectResponse>(
                service, METHODID_GET_OBJECT)))
        .addMethod(
          getGetObjectManyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetObjectManyRequest,
              com.aserto.directory.reader.v2.GetObjectManyResponse>(
                service, METHODID_GET_OBJECT_MANY)))
        .addMethod(
          getGetObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetObjectsRequest,
              com.aserto.directory.reader.v2.GetObjectsResponse>(
                service, METHODID_GET_OBJECTS)))
        .addMethod(
          getGetRelationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetRelationRequest,
              com.aserto.directory.reader.v2.GetRelationResponse>(
                service, METHODID_GET_RELATION)))
        .addMethod(
          getGetRelationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetRelationsRequest,
              com.aserto.directory.reader.v2.GetRelationsResponse>(
                service, METHODID_GET_RELATIONS)))
        .addMethod(
          getCheckPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.CheckPermissionRequest,
              com.aserto.directory.reader.v2.CheckPermissionResponse>(
                service, METHODID_CHECK_PERMISSION)))
        .addMethod(
          getCheckRelationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.CheckRelationRequest,
              com.aserto.directory.reader.v2.CheckRelationResponse>(
                service, METHODID_CHECK_RELATION)))
        .addMethod(
          getGetGraphMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v2.GetGraphRequest,
              com.aserto.directory.reader.v2.GetGraphResponse>(
                service, METHODID_GET_GRAPH)))
        .build();
  }

  private static abstract class ReaderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReaderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Reader");
    }
  }

  private static final class ReaderFileDescriptorSupplier
      extends ReaderBaseDescriptorSupplier {
    ReaderFileDescriptorSupplier() {}
  }

  private static final class ReaderMethodDescriptorSupplier
      extends ReaderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ReaderMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReaderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReaderFileDescriptorSupplier())
              .addMethod(getGetObjectTypeMethod())
              .addMethod(getGetObjectTypesMethod())
              .addMethod(getGetRelationTypeMethod())
              .addMethod(getGetRelationTypesMethod())
              .addMethod(getGetPermissionMethod())
              .addMethod(getGetPermissionsMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getGetObjectManyMethod())
              .addMethod(getGetObjectsMethod())
              .addMethod(getGetRelationMethod())
              .addMethod(getGetRelationsMethod())
              .addMethod(getCheckPermissionMethod())
              .addMethod(getCheckRelationMethod())
              .addMethod(getGetGraphMethod())
              .build();
        }
      }
    }
    return result;
  }
}
