package com.aserto.directory.reader.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: aserto/directory/reader/v3/reader.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReaderGrpc {

  private ReaderGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aserto.directory.reader.v3.Reader";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetObjectRequest,
      com.aserto.directory.reader.v3.GetObjectResponse> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = com.aserto.directory.reader.v3.GetObjectRequest.class,
      responseType = com.aserto.directory.reader.v3.GetObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetObjectRequest,
      com.aserto.directory.reader.v3.GetObjectResponse> getGetObjectMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetObjectRequest, com.aserto.directory.reader.v3.GetObjectResponse> getGetObjectMethod;
    if ((getGetObjectMethod = ReaderGrpc.getGetObjectMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetObjectMethod = ReaderGrpc.getGetObjectMethod) == null) {
          ReaderGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v3.GetObjectRequest, com.aserto.directory.reader.v3.GetObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetObjectManyRequest,
      com.aserto.directory.reader.v3.GetObjectManyResponse> getGetObjectManyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectMany",
      requestType = com.aserto.directory.reader.v3.GetObjectManyRequest.class,
      responseType = com.aserto.directory.reader.v3.GetObjectManyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetObjectManyRequest,
      com.aserto.directory.reader.v3.GetObjectManyResponse> getGetObjectManyMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetObjectManyRequest, com.aserto.directory.reader.v3.GetObjectManyResponse> getGetObjectManyMethod;
    if ((getGetObjectManyMethod = ReaderGrpc.getGetObjectManyMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetObjectManyMethod = ReaderGrpc.getGetObjectManyMethod) == null) {
          ReaderGrpc.getGetObjectManyMethod = getGetObjectManyMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v3.GetObjectManyRequest, com.aserto.directory.reader.v3.GetObjectManyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectMany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetObjectManyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetObjectManyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetObjectMany"))
              .build();
        }
      }
    }
    return getGetObjectManyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetObjectsRequest,
      com.aserto.directory.reader.v3.GetObjectsResponse> getGetObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjects",
      requestType = com.aserto.directory.reader.v3.GetObjectsRequest.class,
      responseType = com.aserto.directory.reader.v3.GetObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetObjectsRequest,
      com.aserto.directory.reader.v3.GetObjectsResponse> getGetObjectsMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetObjectsRequest, com.aserto.directory.reader.v3.GetObjectsResponse> getGetObjectsMethod;
    if ((getGetObjectsMethod = ReaderGrpc.getGetObjectsMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetObjectsMethod = ReaderGrpc.getGetObjectsMethod) == null) {
          ReaderGrpc.getGetObjectsMethod = getGetObjectsMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v3.GetObjectsRequest, com.aserto.directory.reader.v3.GetObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetObjects"))
              .build();
        }
      }
    }
    return getGetObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetRelationRequest,
      com.aserto.directory.reader.v3.GetRelationResponse> getGetRelationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRelation",
      requestType = com.aserto.directory.reader.v3.GetRelationRequest.class,
      responseType = com.aserto.directory.reader.v3.GetRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetRelationRequest,
      com.aserto.directory.reader.v3.GetRelationResponse> getGetRelationMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetRelationRequest, com.aserto.directory.reader.v3.GetRelationResponse> getGetRelationMethod;
    if ((getGetRelationMethod = ReaderGrpc.getGetRelationMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetRelationMethod = ReaderGrpc.getGetRelationMethod) == null) {
          ReaderGrpc.getGetRelationMethod = getGetRelationMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v3.GetRelationRequest, com.aserto.directory.reader.v3.GetRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRelation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetRelationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetRelation"))
              .build();
        }
      }
    }
    return getGetRelationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetRelationsRequest,
      com.aserto.directory.reader.v3.GetRelationsResponse> getGetRelationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRelations",
      requestType = com.aserto.directory.reader.v3.GetRelationsRequest.class,
      responseType = com.aserto.directory.reader.v3.GetRelationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetRelationsRequest,
      com.aserto.directory.reader.v3.GetRelationsResponse> getGetRelationsMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetRelationsRequest, com.aserto.directory.reader.v3.GetRelationsResponse> getGetRelationsMethod;
    if ((getGetRelationsMethod = ReaderGrpc.getGetRelationsMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetRelationsMethod = ReaderGrpc.getGetRelationsMethod) == null) {
          ReaderGrpc.getGetRelationsMethod = getGetRelationsMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v3.GetRelationsRequest, com.aserto.directory.reader.v3.GetRelationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRelations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetRelationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetRelationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("GetRelations"))
              .build();
        }
      }
    }
    return getGetRelationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.CheckRequest,
      com.aserto.directory.reader.v3.CheckResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Check",
      requestType = com.aserto.directory.reader.v3.CheckRequest.class,
      responseType = com.aserto.directory.reader.v3.CheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.CheckRequest,
      com.aserto.directory.reader.v3.CheckResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckResponse> getCheckMethod;
    if ((getCheckMethod = ReaderGrpc.getCheckMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getCheckMethod = ReaderGrpc.getCheckMethod) == null) {
          ReaderGrpc.getCheckMethod = getCheckMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v3.CheckRequest, com.aserto.directory.reader.v3.CheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.CheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.CheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("Check"))
              .build();
        }
      }
    }
    return getCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.CheckPermissionRequest,
      com.aserto.directory.reader.v3.CheckPermissionResponse> getCheckPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPermission",
      requestType = com.aserto.directory.reader.v3.CheckPermissionRequest.class,
      responseType = com.aserto.directory.reader.v3.CheckPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.CheckPermissionRequest,
      com.aserto.directory.reader.v3.CheckPermissionResponse> getCheckPermissionMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.CheckPermissionRequest, com.aserto.directory.reader.v3.CheckPermissionResponse> getCheckPermissionMethod;
    if ((getCheckPermissionMethod = ReaderGrpc.getCheckPermissionMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getCheckPermissionMethod = ReaderGrpc.getCheckPermissionMethod) == null) {
          ReaderGrpc.getCheckPermissionMethod = getCheckPermissionMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v3.CheckPermissionRequest, com.aserto.directory.reader.v3.CheckPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.CheckPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.CheckPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("CheckPermission"))
              .build();
        }
      }
    }
    return getCheckPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.CheckRelationRequest,
      com.aserto.directory.reader.v3.CheckRelationResponse> getCheckRelationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckRelation",
      requestType = com.aserto.directory.reader.v3.CheckRelationRequest.class,
      responseType = com.aserto.directory.reader.v3.CheckRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.CheckRelationRequest,
      com.aserto.directory.reader.v3.CheckRelationResponse> getCheckRelationMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.CheckRelationRequest, com.aserto.directory.reader.v3.CheckRelationResponse> getCheckRelationMethod;
    if ((getCheckRelationMethod = ReaderGrpc.getCheckRelationMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getCheckRelationMethod = ReaderGrpc.getCheckRelationMethod) == null) {
          ReaderGrpc.getCheckRelationMethod = getCheckRelationMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v3.CheckRelationRequest, com.aserto.directory.reader.v3.CheckRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckRelation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.CheckRelationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.CheckRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReaderMethodDescriptorSupplier("CheckRelation"))
              .build();
        }
      }
    }
    return getCheckRelationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetGraphRequest,
      com.aserto.directory.reader.v3.GetGraphResponse> getGetGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGraph",
      requestType = com.aserto.directory.reader.v3.GetGraphRequest.class,
      responseType = com.aserto.directory.reader.v3.GetGraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetGraphRequest,
      com.aserto.directory.reader.v3.GetGraphResponse> getGetGraphMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.reader.v3.GetGraphRequest, com.aserto.directory.reader.v3.GetGraphResponse> getGetGraphMethod;
    if ((getGetGraphMethod = ReaderGrpc.getGetGraphMethod) == null) {
      synchronized (ReaderGrpc.class) {
        if ((getGetGraphMethod = ReaderGrpc.getGetGraphMethod) == null) {
          ReaderGrpc.getGetGraphMethod = getGetGraphMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.reader.v3.GetGraphRequest, com.aserto.directory.reader.v3.GetGraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGraph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.reader.v3.GetGraphResponse.getDefaultInstance()))
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
     * object methods
     * </pre>
     */
    default void getObject(com.aserto.directory.reader.v3.GetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     */
    default void getObjectMany(com.aserto.directory.reader.v3.GetObjectManyRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetObjectManyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectManyMethod(), responseObserver);
    }

    /**
     */
    default void getObjects(com.aserto.directory.reader.v3.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * relation methods
     * </pre>
     */
    default void getRelation(com.aserto.directory.reader.v3.GetRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetRelationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRelationMethod(), responseObserver);
    }

    /**
     */
    default void getRelations(com.aserto.directory.reader.v3.GetRelationsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetRelationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRelationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * check method
     * </pre>
     */
    default void check(com.aserto.directory.reader.v3.CheckRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.CheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * check permission method
     * </pre>
     */
    default void checkPermission(com.aserto.directory.reader.v3.CheckPermissionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.CheckPermissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * check relation method
     * </pre>
     */
    default void checkRelation(com.aserto.directory.reader.v3.CheckRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.CheckRelationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckRelationMethod(), responseObserver);
    }

    /**
     * <pre>
     * graph methods
     * </pre>
     */
    default void getGraph(com.aserto.directory.reader.v3.GetGraphRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetGraphResponse> responseObserver) {
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
     * object methods
     * </pre>
     */
    public void getObject(com.aserto.directory.reader.v3.GetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObjectMany(com.aserto.directory.reader.v3.GetObjectManyRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetObjectManyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectManyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObjects(com.aserto.directory.reader.v3.GetObjectsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * relation methods
     * </pre>
     */
    public void getRelation(com.aserto.directory.reader.v3.GetRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetRelationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRelationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRelations(com.aserto.directory.reader.v3.GetRelationsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetRelationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRelationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * check method
     * </pre>
     */
    public void check(com.aserto.directory.reader.v3.CheckRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.CheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * check permission method
     * </pre>
     */
    public void checkPermission(com.aserto.directory.reader.v3.CheckPermissionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.CheckPermissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * check relation method
     * </pre>
     */
    public void checkRelation(com.aserto.directory.reader.v3.CheckRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.CheckRelationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckRelationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * graph methods
     * </pre>
     */
    public void getGraph(com.aserto.directory.reader.v3.GetGraphRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetGraphResponse> responseObserver) {
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
     * object methods
     * </pre>
     */
    public com.aserto.directory.reader.v3.GetObjectResponse getObject(com.aserto.directory.reader.v3.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.reader.v3.GetObjectManyResponse getObjectMany(com.aserto.directory.reader.v3.GetObjectManyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectManyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.reader.v3.GetObjectsResponse getObjects(com.aserto.directory.reader.v3.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * relation methods
     * </pre>
     */
    public com.aserto.directory.reader.v3.GetRelationResponse getRelation(com.aserto.directory.reader.v3.GetRelationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRelationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.reader.v3.GetRelationsResponse getRelations(com.aserto.directory.reader.v3.GetRelationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRelationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * check method
     * </pre>
     */
    public com.aserto.directory.reader.v3.CheckResponse check(com.aserto.directory.reader.v3.CheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * check permission method
     * </pre>
     */
    public com.aserto.directory.reader.v3.CheckPermissionResponse checkPermission(com.aserto.directory.reader.v3.CheckPermissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * check relation method
     * </pre>
     */
    public com.aserto.directory.reader.v3.CheckRelationResponse checkRelation(com.aserto.directory.reader.v3.CheckRelationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckRelationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * graph methods
     * </pre>
     */
    public com.aserto.directory.reader.v3.GetGraphResponse getGraph(com.aserto.directory.reader.v3.GetGraphRequest request) {
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
     * object methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v3.GetObjectResponse> getObject(
        com.aserto.directory.reader.v3.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v3.GetObjectManyResponse> getObjectMany(
        com.aserto.directory.reader.v3.GetObjectManyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectManyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v3.GetObjectsResponse> getObjects(
        com.aserto.directory.reader.v3.GetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * relation methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v3.GetRelationResponse> getRelation(
        com.aserto.directory.reader.v3.GetRelationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRelationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v3.GetRelationsResponse> getRelations(
        com.aserto.directory.reader.v3.GetRelationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRelationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * check method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v3.CheckResponse> check(
        com.aserto.directory.reader.v3.CheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * check permission method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v3.CheckPermissionResponse> checkPermission(
        com.aserto.directory.reader.v3.CheckPermissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * check relation method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v3.CheckRelationResponse> checkRelation(
        com.aserto.directory.reader.v3.CheckRelationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckRelationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * graph methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.reader.v3.GetGraphResponse> getGraph(
        com.aserto.directory.reader.v3.GetGraphRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGraphMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_OBJECT = 0;
  private static final int METHODID_GET_OBJECT_MANY = 1;
  private static final int METHODID_GET_OBJECTS = 2;
  private static final int METHODID_GET_RELATION = 3;
  private static final int METHODID_GET_RELATIONS = 4;
  private static final int METHODID_CHECK = 5;
  private static final int METHODID_CHECK_PERMISSION = 6;
  private static final int METHODID_CHECK_RELATION = 7;
  private static final int METHODID_GET_GRAPH = 8;

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
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((com.aserto.directory.reader.v3.GetObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetObjectResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_MANY:
          serviceImpl.getObjectMany((com.aserto.directory.reader.v3.GetObjectManyRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetObjectManyResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECTS:
          serviceImpl.getObjects((com.aserto.directory.reader.v3.GetObjectsRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetObjectsResponse>) responseObserver);
          break;
        case METHODID_GET_RELATION:
          serviceImpl.getRelation((com.aserto.directory.reader.v3.GetRelationRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetRelationResponse>) responseObserver);
          break;
        case METHODID_GET_RELATIONS:
          serviceImpl.getRelations((com.aserto.directory.reader.v3.GetRelationsRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetRelationsResponse>) responseObserver);
          break;
        case METHODID_CHECK:
          serviceImpl.check((com.aserto.directory.reader.v3.CheckRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.CheckResponse>) responseObserver);
          break;
        case METHODID_CHECK_PERMISSION:
          serviceImpl.checkPermission((com.aserto.directory.reader.v3.CheckPermissionRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.CheckPermissionResponse>) responseObserver);
          break;
        case METHODID_CHECK_RELATION:
          serviceImpl.checkRelation((com.aserto.directory.reader.v3.CheckRelationRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.CheckRelationResponse>) responseObserver);
          break;
        case METHODID_GET_GRAPH:
          serviceImpl.getGraph((com.aserto.directory.reader.v3.GetGraphRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.reader.v3.GetGraphResponse>) responseObserver);
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
          getGetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v3.GetObjectRequest,
              com.aserto.directory.reader.v3.GetObjectResponse>(
                service, METHODID_GET_OBJECT)))
        .addMethod(
          getGetObjectManyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v3.GetObjectManyRequest,
              com.aserto.directory.reader.v3.GetObjectManyResponse>(
                service, METHODID_GET_OBJECT_MANY)))
        .addMethod(
          getGetObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v3.GetObjectsRequest,
              com.aserto.directory.reader.v3.GetObjectsResponse>(
                service, METHODID_GET_OBJECTS)))
        .addMethod(
          getGetRelationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v3.GetRelationRequest,
              com.aserto.directory.reader.v3.GetRelationResponse>(
                service, METHODID_GET_RELATION)))
        .addMethod(
          getGetRelationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v3.GetRelationsRequest,
              com.aserto.directory.reader.v3.GetRelationsResponse>(
                service, METHODID_GET_RELATIONS)))
        .addMethod(
          getCheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v3.CheckRequest,
              com.aserto.directory.reader.v3.CheckResponse>(
                service, METHODID_CHECK)))
        .addMethod(
          getCheckPermissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v3.CheckPermissionRequest,
              com.aserto.directory.reader.v3.CheckPermissionResponse>(
                service, METHODID_CHECK_PERMISSION)))
        .addMethod(
          getCheckRelationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v3.CheckRelationRequest,
              com.aserto.directory.reader.v3.CheckRelationResponse>(
                service, METHODID_CHECK_RELATION)))
        .addMethod(
          getGetGraphMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.reader.v3.GetGraphRequest,
              com.aserto.directory.reader.v3.GetGraphResponse>(
                service, METHODID_GET_GRAPH)))
        .build();
  }

  private static abstract class ReaderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReaderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aserto.directory.reader.v3.ReaderProto.getDescriptor();
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
              .addMethod(getGetObjectMethod())
              .addMethod(getGetObjectManyMethod())
              .addMethod(getGetObjectsMethod())
              .addMethod(getGetRelationMethod())
              .addMethod(getGetRelationsMethod())
              .addMethod(getCheckMethod())
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
