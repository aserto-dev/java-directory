package com.aserto.directory.writer.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: aserto/directory/writer/v3/writer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WriterGrpc {

  private WriterGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aserto.directory.writer.v3.Writer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.SetObjectRequest,
      com.aserto.directory.writer.v3.SetObjectResponse> getSetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetObject",
      requestType = com.aserto.directory.writer.v3.SetObjectRequest.class,
      responseType = com.aserto.directory.writer.v3.SetObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.SetObjectRequest,
      com.aserto.directory.writer.v3.SetObjectResponse> getSetObjectMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.SetObjectRequest, com.aserto.directory.writer.v3.SetObjectResponse> getSetObjectMethod;
    if ((getSetObjectMethod = WriterGrpc.getSetObjectMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getSetObjectMethod = WriterGrpc.getSetObjectMethod) == null) {
          WriterGrpc.getSetObjectMethod = getSetObjectMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v3.SetObjectRequest, com.aserto.directory.writer.v3.SetObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v3.SetObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v3.SetObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("SetObject"))
              .build();
        }
      }
    }
    return getSetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.DeleteObjectRequest,
      com.aserto.directory.writer.v3.DeleteObjectResponse> getDeleteObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObject",
      requestType = com.aserto.directory.writer.v3.DeleteObjectRequest.class,
      responseType = com.aserto.directory.writer.v3.DeleteObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.DeleteObjectRequest,
      com.aserto.directory.writer.v3.DeleteObjectResponse> getDeleteObjectMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.DeleteObjectRequest, com.aserto.directory.writer.v3.DeleteObjectResponse> getDeleteObjectMethod;
    if ((getDeleteObjectMethod = WriterGrpc.getDeleteObjectMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getDeleteObjectMethod = WriterGrpc.getDeleteObjectMethod) == null) {
          WriterGrpc.getDeleteObjectMethod = getDeleteObjectMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v3.DeleteObjectRequest, com.aserto.directory.writer.v3.DeleteObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v3.DeleteObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v3.DeleteObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("DeleteObject"))
              .build();
        }
      }
    }
    return getDeleteObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.SetRelationRequest,
      com.aserto.directory.writer.v3.SetRelationResponse> getSetRelationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRelation",
      requestType = com.aserto.directory.writer.v3.SetRelationRequest.class,
      responseType = com.aserto.directory.writer.v3.SetRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.SetRelationRequest,
      com.aserto.directory.writer.v3.SetRelationResponse> getSetRelationMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.SetRelationRequest, com.aserto.directory.writer.v3.SetRelationResponse> getSetRelationMethod;
    if ((getSetRelationMethod = WriterGrpc.getSetRelationMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getSetRelationMethod = WriterGrpc.getSetRelationMethod) == null) {
          WriterGrpc.getSetRelationMethod = getSetRelationMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v3.SetRelationRequest, com.aserto.directory.writer.v3.SetRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRelation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v3.SetRelationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v3.SetRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WriterMethodDescriptorSupplier("SetRelation"))
              .build();
        }
      }
    }
    return getSetRelationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.DeleteRelationRequest,
      com.aserto.directory.writer.v3.DeleteRelationResponse> getDeleteRelationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRelation",
      requestType = com.aserto.directory.writer.v3.DeleteRelationRequest.class,
      responseType = com.aserto.directory.writer.v3.DeleteRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.DeleteRelationRequest,
      com.aserto.directory.writer.v3.DeleteRelationResponse> getDeleteRelationMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.writer.v3.DeleteRelationRequest, com.aserto.directory.writer.v3.DeleteRelationResponse> getDeleteRelationMethod;
    if ((getDeleteRelationMethod = WriterGrpc.getDeleteRelationMethod) == null) {
      synchronized (WriterGrpc.class) {
        if ((getDeleteRelationMethod = WriterGrpc.getDeleteRelationMethod) == null) {
          WriterGrpc.getDeleteRelationMethod = getDeleteRelationMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.writer.v3.DeleteRelationRequest, com.aserto.directory.writer.v3.DeleteRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRelation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v3.DeleteRelationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.writer.v3.DeleteRelationResponse.getDefaultInstance()))
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
     * <pre>
     * set object instance
     * </pre>
     */
    default void setObject(com.aserto.directory.writer.v3.SetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.SetObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete object instance
     * </pre>
     */
    default void deleteObject(com.aserto.directory.writer.v3.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * set relation instance
     * </pre>
     */
    default void setRelation(com.aserto.directory.writer.v3.SetRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.SetRelationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRelationMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete relation instance
     * </pre>
     */
    default void deleteRelation(com.aserto.directory.writer.v3.DeleteRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.DeleteRelationResponse> responseObserver) {
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
     * <pre>
     * set object instance
     * </pre>
     */
    public void setObject(com.aserto.directory.writer.v3.SetObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.SetObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete object instance
     * </pre>
     */
    public void deleteObject(com.aserto.directory.writer.v3.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * set relation instance
     * </pre>
     */
    public void setRelation(com.aserto.directory.writer.v3.SetRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.SetRelationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRelationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete relation instance
     * </pre>
     */
    public void deleteRelation(com.aserto.directory.writer.v3.DeleteRelationRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.DeleteRelationResponse> responseObserver) {
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
     * <pre>
     * set object instance
     * </pre>
     */
    public com.aserto.directory.writer.v3.SetObjectResponse setObject(com.aserto.directory.writer.v3.SetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete object instance
     * </pre>
     */
    public com.aserto.directory.writer.v3.DeleteObjectResponse deleteObject(com.aserto.directory.writer.v3.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * set relation instance
     * </pre>
     */
    public com.aserto.directory.writer.v3.SetRelationResponse setRelation(com.aserto.directory.writer.v3.SetRelationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRelationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete relation instance
     * </pre>
     */
    public com.aserto.directory.writer.v3.DeleteRelationResponse deleteRelation(com.aserto.directory.writer.v3.DeleteRelationRequest request) {
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
     * <pre>
     * set object instance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v3.SetObjectResponse> setObject(
        com.aserto.directory.writer.v3.SetObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete object instance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v3.DeleteObjectResponse> deleteObject(
        com.aserto.directory.writer.v3.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * set relation instance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v3.SetRelationResponse> setRelation(
        com.aserto.directory.writer.v3.SetRelationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRelationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete relation instance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.writer.v3.DeleteRelationResponse> deleteRelation(
        com.aserto.directory.writer.v3.DeleteRelationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRelationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_OBJECT = 0;
  private static final int METHODID_DELETE_OBJECT = 1;
  private static final int METHODID_SET_RELATION = 2;
  private static final int METHODID_DELETE_RELATION = 3;

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
        case METHODID_SET_OBJECT:
          serviceImpl.setObject((com.aserto.directory.writer.v3.SetObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.SetObjectResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT:
          serviceImpl.deleteObject((com.aserto.directory.writer.v3.DeleteObjectRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.DeleteObjectResponse>) responseObserver);
          break;
        case METHODID_SET_RELATION:
          serviceImpl.setRelation((com.aserto.directory.writer.v3.SetRelationRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.SetRelationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RELATION:
          serviceImpl.deleteRelation((com.aserto.directory.writer.v3.DeleteRelationRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.writer.v3.DeleteRelationResponse>) responseObserver);
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
          getSetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v3.SetObjectRequest,
              com.aserto.directory.writer.v3.SetObjectResponse>(
                service, METHODID_SET_OBJECT)))
        .addMethod(
          getDeleteObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v3.DeleteObjectRequest,
              com.aserto.directory.writer.v3.DeleteObjectResponse>(
                service, METHODID_DELETE_OBJECT)))
        .addMethod(
          getSetRelationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v3.SetRelationRequest,
              com.aserto.directory.writer.v3.SetRelationResponse>(
                service, METHODID_SET_RELATION)))
        .addMethod(
          getDeleteRelationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.writer.v3.DeleteRelationRequest,
              com.aserto.directory.writer.v3.DeleteRelationResponse>(
                service, METHODID_DELETE_RELATION)))
        .build();
  }

  private static abstract class WriterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WriterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aserto.directory.writer.v3.WriterProto.getDescriptor();
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
