package com.aserto.directory.writer.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: aserto/directory/writer/v2/writer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WriterGrpc {

  private WriterGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aserto.directory.writer.v2.Writer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetObjectTypeRequest,
      com.aserto.directory.writer.v2.SetObjectTypeResponse> getSetObjectTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetObjectType",
      requestType = com.aserto.directory.writer.v2.SetObjectTypeRequest.class,
      responseType = com.aserto.directory.writer.v2.SetObjectTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetObjectTypeRequest,
      com.aserto.directory.writer.v2.SetObjectTypeResponse> getSetObjectTypeMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetObjectTypeRequest, com.aserto.directory.writer.v2.SetObjectTypeResponse> getSetObjectTypeMethod;
    if ((getSetObjectTypeMethod = WriterGrpc.getSetObjectTypeMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getSetObjectTypeMethod = WriterGrpc.getSetObjectTypeMethod) == null) {
          WriterGrpc.getSetObjectTypeMethod = getSetObjectTypeMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v2.SetObjectTypeRequest, com.aserto.directory.writer.v2.SetObjectTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetObjectType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.SetObjectTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.SetObjectTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("SetObjectType"))
              .build();
        }
      }
    }
    return getSetObjectTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteObjectTypeRequest,
      com.aserto.directory.writer.v2.DeleteObjectTypeResponse> getDeleteObjectTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObjectType",
      requestType = com.aserto.directory.writer.v2.DeleteObjectTypeRequest.class,
      responseType = com.aserto.directory.writer.v2.DeleteObjectTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteObjectTypeRequest,
      com.aserto.directory.writer.v2.DeleteObjectTypeResponse> getDeleteObjectTypeMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteObjectTypeRequest, com.aserto.directory.writer.v2.DeleteObjectTypeResponse> getDeleteObjectTypeMethod;
    if ((getDeleteObjectTypeMethod = WriterGrpc.getDeleteObjectTypeMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getDeleteObjectTypeMethod = WriterGrpc.getDeleteObjectTypeMethod) == null) {
          WriterGrpc.getDeleteObjectTypeMethod = getDeleteObjectTypeMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v2.DeleteObjectTypeRequest, com.aserto.directory.writer.v2.DeleteObjectTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObjectType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.DeleteObjectTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.DeleteObjectTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("DeleteObjectType"))
              .build();
        }
      }
    }
    return getDeleteObjectTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetRelationTypeRequest,
      com.aserto.directory.writer.v2.SetRelationTypeResponse> getSetRelationTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelationType",
      requestType = com.aserto.directory.writer.v2.SetRelationTypeRequest.class,
      responseType = com.aserto.directory.writer.v2.SetRelationTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetRelationTypeRequest,
      com.aserto.directory.writer.v2.SetRelationTypeResponse> getSetRelationTypeMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetRelationTypeRequest, com.aserto.directory.writer.v2.SetRelationTypeResponse> getSetRelationTypeMethod;
    if ((getSetRelationTypeMethod = WriterGrpc.getSetRelationTypeMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getSetRelationTypeMethod = WriterGrpc.getSetRelationTypeMethod) == null) {
          WriterGrpc.getSetRelationTypeMethod = getSetRelationTypeMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v2.SetRelationTypeRequest, com.aserto.directory.writer.v2.SetRelationTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelationType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.SetRelationTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.SetRelationTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("SetRelationType"))
              .build();
        }
      }
    }
    return getSetRelationTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteRelationTypeRequest,
      com.aserto.directory.writer.v2.DeleteRelationTypeResponse> getDeleteRelationTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRelationType",
      requestType = com.aserto.directory.writer.v2.DeleteRelationTypeRequest.class,
      responseType = com.aserto.directory.writer.v2.DeleteRelationTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteRelationTypeRequest,
      com.aserto.directory.writer.v2.DeleteRelationTypeResponse> getDeleteRelationTypeMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteRelationTypeRequest, com.aserto.directory.writer.v2.DeleteRelationTypeResponse> getDeleteRelationTypeMethod;
    if ((getDeleteRelationTypeMethod = WriterGrpc.getDeleteRelationTypeMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getDeleteRelationTypeMethod = WriterGrpc.getDeleteRelationTypeMethod) == null) {
          WriterGrpc.getDeleteRelationTypeMethod = getDeleteRelationTypeMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v2.DeleteRelationTypeRequest, com.aserto.directory.writer.v2.DeleteRelationTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRelationType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.DeleteRelationTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.DeleteRelationTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("DeleteRelationType"))
              .build();
        }
      }
    }
    return getDeleteRelationTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetPermissionRequest,
      com.aserto.directory.writer.v2.SetPermissionResponse> getSetPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPermission",
      requestType = com.aserto.directory.writer.v2.SetPermissionRequest.class,
      responseType = com.aserto.directory.writer.v2.SetPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetPermissionRequest,
      com.aserto.directory.writer.v2.SetPermissionResponse> getSetPermissionMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetPermissionRequest, com.aserto.directory.writer.v2.SetPermissionResponse> getSetPermissionMethod;
    if ((getSetPermissionMethod = WriterGrpc.getSetPermissionMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getSetPermissionMethod = WriterGrpc.getSetPermissionMethod) == null) {
          WriterGrpc.getSetPermissionMethod = getSetPermissionMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v2.SetPermissionRequest, com.aserto.directory.writer.v2.SetPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.SetPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.SetPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("SetPermission"))
              .build();
        }
      }
    }
    return getSetPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeletePermissionRequest,
      com.aserto.directory.writer.v2.DeletePermissionResponse> getDeletePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePermission",
      requestType = com.aserto.directory.writer.v2.DeletePermissionRequest.class,
      responseType = com.aserto.directory.writer.v2.DeletePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeletePermissionRequest,
      com.aserto.directory.writer.v2.DeletePermissionResponse> getDeletePermissionMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeletePermissionRequest, com.aserto.directory.writer.v2.DeletePermissionResponse> getDeletePermissionMethod;
    if ((getDeletePermissionMethod = WriterGrpc.getDeletePermissionMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getDeletePermissionMethod = WriterGrpc.getDeletePermissionMethod) == null) {
          WriterGrpc.getDeletePermissionMethod = getDeletePermissionMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v2.DeletePermissionRequest, com.aserto.directory.writer.v2.DeletePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.DeletePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.DeletePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("DeletePermission"))
              .build();
        }
      }
    }
    return getDeletePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetObjectRequest,
      com.aserto.directory.writer.v2.SetObjectResponse> getSetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetObject",
      requestType = com.aserto.directory.writer.v2.SetObjectRequest.class,
      responseType = com.aserto.directory.writer.v2.SetObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetObjectRequest,
      com.aserto.directory.writer.v2.SetObjectResponse> getSetObjectMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetObjectRequest, com.aserto.directory.writer.v2.SetObjectResponse> getSetObjectMethod;
    if ((getSetObjectMethod = WriterGrpc.getSetObjectMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getSetObjectMethod = WriterGrpc.getSetObjectMethod) == null) {
          WriterGrpc.getSetObjectMethod = getSetObjectMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v2.SetObjectRequest, com.aserto.directory.writer.v2.SetObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.SetObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.SetObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("SetObject"))
              .build();
        }
      }
    }
    return getSetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteObjectRequest,
      com.aserto.directory.writer.v2.DeleteObjectResponse> getDeleteObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObject",
      requestType = com.aserto.directory.writer.v2.DeleteObjectRequest.class,
      responseType = com.aserto.directory.writer.v2.DeleteObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteObjectRequest,
      com.aserto.directory.writer.v2.DeleteObjectResponse> getDeleteObjectMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteObjectRequest, com.aserto.directory.writer.v2.DeleteObjectResponse> getDeleteObjectMethod;
    if ((getDeleteObjectMethod = WriterGrpc.getDeleteObjectMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getDeleteObjectMethod = WriterGrpc.getDeleteObjectMethod) == null) {
          WriterGrpc.getDeleteObjectMethod = getDeleteObjectMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v2.DeleteObjectRequest, com.aserto.directory.writer.v2.DeleteObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.DeleteObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.DeleteObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("DeleteObject"))
              .build();
        }
      }
    }
    return getDeleteObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetRelationRequest,
      com.aserto.directory.writer.v2.SetRelationResponse> getSetRelationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelation",
      requestType = com.aserto.directory.writer.v2.SetRelationRequest.class,
      responseType = com.aserto.directory.writer.v2.SetRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetRelationRequest,
      com.aserto.directory.writer.v2.SetRelationResponse> getSetRelationMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.SetRelationRequest, com.aserto.directory.writer.v2.SetRelationResponse> getSetRelationMethod;
    if ((getSetRelationMethod = WriterGrpc.getSetRelationMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getSetRelationMethod = WriterGrpc.getSetRelationMethod) == null) {
          WriterGrpc.getSetRelationMethod = getSetRelationMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v2.SetRelationRequest, com.aserto.directory.writer.v2.SetRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.SetRelationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.SetRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("SetRelation"))
              .build();
        }
      }
    }
    return getSetRelationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteRelationRequest,
      com.aserto.directory.writer.v2.DeleteRelationResponse> getDeleteRelationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRelation",
      requestType = com.aserto.directory.writer.v2.DeleteRelationRequest.class,
      responseType = com.aserto.directory.writer.v2.DeleteRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteRelationRequest,
      com.aserto.directory.writer.v2.DeleteRelationResponse> getDeleteRelationMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v2.DeleteRelationRequest, com.aserto.directory.writer.v2.DeleteRelationResponse> getDeleteRelationMethod;
    if ((getDeleteRelationMethod = WriterGrpc.getDeleteRelationMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getDeleteRelationMethod = WriterGrpc.getDeleteRelationMethod) == null) {
          WriterGrpc.getDeleteRelationMethod = getDeleteRelationMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v2.DeleteRelationRequest, com.aserto.directory.writer.v2.DeleteRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRelation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.DeleteRelationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v2.DeleteRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("DeleteRelation"))
              .build();
        }
      }
    }
    return getDeleteRelationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WriterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WriterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WriterStub>() {
        @java.lang.Override
        public WriterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WriterStub(channel, callOptions);
        }
      };
    return WriterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WriterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WriterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WriterBlockingStub>() {
        @java.lang.Override
        public WriterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WriterBlockingStub(channel, callOptions);
        }
      };
    return WriterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WriterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WriterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WriterFutureStub>() {
        @java.lang.Override
        public WriterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WriterFutureStub(channel, callOptions);
        }
      };
    return WriterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    @java.lang.Deprecated
    default void setObjectType(com.aserto.directory.writer.v2.SetObjectTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetObjectTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetObjectTypeMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void deleteObjectType(com.aserto.directory.writer.v2.DeleteObjectTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteObjectTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectTypeMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void setRelationType(com.aserto.directory.writer.v2.SetRelationTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetRelationTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRelationTypeMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void deleteRelationType(com.aserto.directory.writer.v2.DeleteRelationTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteRelationTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRelationTypeMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void setPermission(com.aserto.directory.writer.v2.SetPermissionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetPermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPermissionMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void deletePermission(com.aserto.directory.writer.v2.DeletePermissionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeletePermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * set object instance
     * Deprecated: directory.v2.SetObject is deprecated, use directory.v3.SetObject.
     * </pre>
     */
    @java.lang.Deprecated
    default void setObject(com.aserto.directory.writer.v2.SetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete object instance
     * Deprecated: directory.v2.DeleteObject is deprecated, use directory.v3.DeleteObject.
     * </pre>
     */
    @java.lang.Deprecated
    default void deleteObject(com.aserto.directory.writer.v2.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * set relation instance
     * Deprecated: directory.v2.SetRelation is deprecated, use directory.v3.SetRelation.
     * </pre>
     */
    @java.lang.Deprecated
    default void setRelation(com.aserto.directory.writer.v2.SetRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetRelationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRelationMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete relation instance
     * Deprecated: directory.v2.DeleteRelation is deprecated, use directory.v3.DeleteRelation.
     * </pre>
     */
    @java.lang.Deprecated
    default void deleteRelation(com.aserto.directory.writer.v2.DeleteRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteRelationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRelationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Writer.
   */
  public static abstract class WriterImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WriterGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Writer.
   */
  public static final class WriterStub
      extends io.grpc.stub.AbstractAsyncStub<WriterStub> {
    private WriterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WriterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WriterStub(channel, callOptions);
    }

    /**
     */
    @java.lang.Deprecated
    public void setObjectType(com.aserto.directory.writer.v2.SetObjectTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetObjectTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetObjectTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void deleteObjectType(com.aserto.directory.writer.v2.DeleteObjectTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteObjectTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void setRelationType(com.aserto.directory.writer.v2.SetRelationTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetRelationTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRelationTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void deleteRelationType(com.aserto.directory.writer.v2.DeleteRelationTypeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteRelationTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRelationTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void setPermission(com.aserto.directory.writer.v2.SetPermissionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetPermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void deletePermission(com.aserto.directory.writer.v2.DeletePermissionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeletePermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * set object instance
     * Deprecated: directory.v2.SetObject is deprecated, use directory.v3.SetObject.
     * </pre>
     */
    @java.lang.Deprecated
    public void setObject(com.aserto.directory.writer.v2.SetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete object instance
     * Deprecated: directory.v2.DeleteObject is deprecated, use directory.v3.DeleteObject.
     * </pre>
     */
    @java.lang.Deprecated
    public void deleteObject(com.aserto.directory.writer.v2.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * set relation instance
     * Deprecated: directory.v2.SetRelation is deprecated, use directory.v3.SetRelation.
     * </pre>
     */
    @java.lang.Deprecated
    public void setRelation(com.aserto.directory.writer.v2.SetRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetRelationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRelationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete relation instance
     * Deprecated: directory.v2.DeleteRelation is deprecated, use directory.v3.DeleteRelation.
     * </pre>
     */
    @java.lang.Deprecated
    public void deleteRelation(com.aserto.directory.writer.v2.DeleteRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteRelationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRelationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Writer.
   */
  public static final class WriterBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WriterBlockingStub> {
    private WriterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WriterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WriterBlockingStub(channel, callOptions);
    }

    /**
     */
    @java.lang.Deprecated
    public com.aserto.directory.writer.v2.SetObjectTypeResponse setObjectType(com.aserto.directory.writer.v2.SetObjectTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetObjectTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.aserto.directory.writer.v2.DeleteObjectTypeResponse deleteObjectType(com.aserto.directory.writer.v2.DeleteObjectTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.aserto.directory.writer.v2.SetRelationTypeResponse setRelationType(com.aserto.directory.writer.v2.SetRelationTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRelationTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.aserto.directory.writer.v2.DeleteRelationTypeResponse deleteRelationType(com.aserto.directory.writer.v2.DeleteRelationTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRelationTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.aserto.directory.writer.v2.SetPermissionResponse setPermission(com.aserto.directory.writer.v2.SetPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.aserto.directory.writer.v2.DeletePermissionResponse deletePermission(com.aserto.directory.writer.v2.DeletePermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * set object instance
     * Deprecated: directory.v2.SetObject is deprecated, use directory.v3.SetObject.
     * </pre>
     */
    @java.lang.Deprecated
    public com.aserto.directory.writer.v2.SetObjectResponse setObject(com.aserto.directory.writer.v2.SetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete object instance
     * Deprecated: directory.v2.DeleteObject is deprecated, use directory.v3.DeleteObject.
     * </pre>
     */
    @java.lang.Deprecated
    public com.aserto.directory.writer.v2.DeleteObjectResponse deleteObject(com.aserto.directory.writer.v2.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * set relation instance
     * Deprecated: directory.v2.SetRelation is deprecated, use directory.v3.SetRelation.
     * </pre>
     */
    @java.lang.Deprecated
    public com.aserto.directory.writer.v2.SetRelationResponse setRelation(com.aserto.directory.writer.v2.SetRelationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRelationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete relation instance
     * Deprecated: directory.v2.DeleteRelation is deprecated, use directory.v3.DeleteRelation.
     * </pre>
     */
    @java.lang.Deprecated
    public com.aserto.directory.writer.v2.DeleteRelationResponse deleteRelation(com.aserto.directory.writer.v2.DeleteRelationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRelationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Writer.
   */
  public static final class WriterFutureStub
      extends io.grpc.stub.AbstractFutureStub<WriterFutureStub> {
    private WriterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WriterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WriterFutureStub(channel, callOptions);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v2.SetObjectTypeResponse> setObjectType(
        com.aserto.directory.writer.v2.SetObjectTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetObjectTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v2.DeleteObjectTypeResponse> deleteObjectType(
        com.aserto.directory.writer.v2.DeleteObjectTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v2.SetRelationTypeResponse> setRelationType(
        com.aserto.directory.writer.v2.SetRelationTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRelationTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v2.DeleteRelationTypeResponse> deleteRelationType(
        com.aserto.directory.writer.v2.DeleteRelationTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRelationTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v2.SetPermissionResponse> setPermission(
        com.aserto.directory.writer.v2.SetPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v2.DeletePermissionResponse> deletePermission(
        com.aserto.directory.writer.v2.DeletePermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * set object instance
     * Deprecated: directory.v2.SetObject is deprecated, use directory.v3.SetObject.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v2.SetObjectResponse> setObject(
        com.aserto.directory.writer.v2.SetObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete object instance
     * Deprecated: directory.v2.DeleteObject is deprecated, use directory.v3.DeleteObject.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v2.DeleteObjectResponse> deleteObject(
        com.aserto.directory.writer.v2.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * set relation instance
     * Deprecated: directory.v2.SetRelation is deprecated, use directory.v3.SetRelation.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v2.SetRelationResponse> setRelation(
        com.aserto.directory.writer.v2.SetRelationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRelationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete relation instance
     * Deprecated: directory.v2.DeleteRelation is deprecated, use directory.v3.DeleteRelation.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v2.DeleteRelationResponse> deleteRelation(
        com.aserto.directory.writer.v2.DeleteRelationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRelationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_OBJECT_TYPE = 0;
  private static final int METHODID_DELETE_OBJECT_TYPE = 1;
  private static final int METHODID_SET_RELATION_TYPE = 2;
  private static final int METHODID_DELETE_RELATION_TYPE = 3;
  private static final int METHODID_SET_PERMISSION = 4;
  private static final int METHODID_DELETE_PERMISSION = 5;
  private static final int METHODID_SET_OBJECT = 6;
  private static final int METHODID_DELETE_OBJECT = 7;
  private static final int METHODID_SET_RELATION = 8;
  private static final int METHODID_DELETE_RELATION = 9;

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
        case METHODID_SET_OBJECT_TYPE:
          serviceImpl.setObjectType((com.aserto.directory.writer.v2.SetObjectTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetObjectTypeResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT_TYPE:
          serviceImpl.deleteObjectType((com.aserto.directory.writer.v2.DeleteObjectTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteObjectTypeResponse>) responseObserver);
          break;
        case METHODID_SET_RELATION_TYPE:
          serviceImpl.setRelationType((com.aserto.directory.writer.v2.SetRelationTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetRelationTypeResponse>) responseObserver);
          break;
        case METHODID_DELETE_RELATION_TYPE:
          serviceImpl.deleteRelationType((com.aserto.directory.writer.v2.DeleteRelationTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteRelationTypeResponse>) responseObserver);
          break;
        case METHODID_SET_PERMISSION:
          serviceImpl.setPermission((com.aserto.directory.writer.v2.SetPermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetPermissionResponse>) responseObserver);
          break;
        case METHODID_DELETE_PERMISSION:
          serviceImpl.deletePermission((com.aserto.directory.writer.v2.DeletePermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeletePermissionResponse>) responseObserver);
          break;
        case METHODID_SET_OBJECT:
          serviceImpl.setObject((com.aserto.directory.writer.v2.SetObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetObjectResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT:
          serviceImpl.deleteObject((com.aserto.directory.writer.v2.DeleteObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteObjectResponse>) responseObserver);
          break;
        case METHODID_SET_RELATION:
          serviceImpl.setRelation((com.aserto.directory.writer.v2.SetRelationRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.SetRelationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RELATION:
          serviceImpl.deleteRelation((com.aserto.directory.writer.v2.DeleteRelationRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v2.DeleteRelationResponse>) responseObserver);
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
          getSetObjectTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v2.SetObjectTypeRequest,
              com.aserto.directory.writer.v2.SetObjectTypeResponse>(
                service, METHODID_SET_OBJECT_TYPE)))
        .addMethod(
          getDeleteObjectTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v2.DeleteObjectTypeRequest,
              com.aserto.directory.writer.v2.DeleteObjectTypeResponse>(
                service, METHODID_DELETE_OBJECT_TYPE)))
        .addMethod(
          getSetRelationTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v2.SetRelationTypeRequest,
              com.aserto.directory.writer.v2.SetRelationTypeResponse>(
                service, METHODID_SET_RELATION_TYPE)))
        .addMethod(
          getDeleteRelationTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v2.DeleteRelationTypeRequest,
              com.aserto.directory.writer.v2.DeleteRelationTypeResponse>(
                service, METHODID_DELETE_RELATION_TYPE)))
        .addMethod(
          getSetPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v2.SetPermissionRequest,
              com.aserto.directory.writer.v2.SetPermissionResponse>(
                service, METHODID_SET_PERMISSION)))
        .addMethod(
          getDeletePermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v2.DeletePermissionRequest,
              com.aserto.directory.writer.v2.DeletePermissionResponse>(
                service, METHODID_DELETE_PERMISSION)))
        .addMethod(
          getSetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v2.SetObjectRequest,
              com.aserto.directory.writer.v2.SetObjectResponse>(
                service, METHODID_SET_OBJECT)))
        .addMethod(
          getDeleteObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v2.DeleteObjectRequest,
              com.aserto.directory.writer.v2.DeleteObjectResponse>(
                service, METHODID_DELETE_OBJECT)))
        .addMethod(
          getSetRelationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v2.SetRelationRequest,
              com.aserto.directory.writer.v2.SetRelationResponse>(
                service, METHODID_SET_RELATION)))
        .addMethod(
          getDeleteRelationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v2.DeleteRelationRequest,
              com.aserto.directory.writer.v2.DeleteRelationResponse>(
                service, METHODID_DELETE_RELATION)))
        .build();
  }

  private static abstract class WriterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WriterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aserto.directory.writer.v2.WriterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Writer");
    }
  }

  private static final class WriterFileDescriptorSupplier
      extends WriterBaseDescriptorSupplier {
    WriterFileDescriptorSupplier() {}
  }

  private static final class WriterMethodDescriptorSupplier
      extends WriterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WriterMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WriterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WriterFileDescriptorSupplier())
              .addMethod(getSetObjectTypeMethod())
              .addMethod(getDeleteObjectTypeMethod())
              .addMethod(getSetRelationTypeMethod())
              .addMethod(getDeleteRelationTypeMethod())
              .addMethod(getSetPermissionMethod())
              .addMethod(getDeletePermissionMethod())
              .addMethod(getSetObjectMethod())
              .addMethod(getDeleteObjectMethod())
              .addMethod(getSetRelationMethod())
              .addMethod(getDeleteRelationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
