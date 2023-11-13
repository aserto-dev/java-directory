package com.aserto.directory.model.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: aserto/directory/model/v3/model.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ModelGrpc {

  private ModelGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aserto.directory.model.v3.Model";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.model.v3.GetManifestRequest,
      com.aserto.directory.model.v3.GetManifestResponse> getGetManifestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetManifest",
      requestType = com.aserto.directory.model.v3.GetManifestRequest.class,
      responseType = com.aserto.directory.model.v3.GetManifestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.aserto.directory.model.v3.GetManifestRequest,
      com.aserto.directory.model.v3.GetManifestResponse> getGetManifestMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.model.v3.GetManifestRequest, com.aserto.directory.model.v3.GetManifestResponse> getGetManifestMethod;
    if ((getGetManifestMethod = ModelGrpc.getGetManifestMethod) == null) {
      synchronized (ModelGrpc.class) {
        if ((getGetManifestMethod = ModelGrpc.getGetManifestMethod) == null) {
          ModelGrpc.getGetManifestMethod = getGetManifestMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.model.v3.GetManifestRequest, com.aserto.directory.model.v3.GetManifestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetManifest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.model.v3.GetManifestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.model.v3.GetManifestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelMethodDescriptorSupplier("GetManifest"))
              .build();
        }
      }
    }
    return getGetManifestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.model.v3.SetManifestRequest,
      com.aserto.directory.model.v3.SetManifestResponse> getSetManifestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetManifest",
      requestType = com.aserto.directory.model.v3.SetManifestRequest.class,
      responseType = com.aserto.directory.model.v3.SetManifestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.aserto.directory.model.v3.SetManifestRequest,
      com.aserto.directory.model.v3.SetManifestResponse> getSetManifestMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.model.v3.SetManifestRequest, com.aserto.directory.model.v3.SetManifestResponse> getSetManifestMethod;
    if ((getSetManifestMethod = ModelGrpc.getSetManifestMethod) == null) {
      synchronized (ModelGrpc.class) {
        if ((getSetManifestMethod = ModelGrpc.getSetManifestMethod) == null) {
          ModelGrpc.getSetManifestMethod = getSetManifestMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.model.v3.SetManifestRequest, com.aserto.directory.model.v3.SetManifestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetManifest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.model.v3.SetManifestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.model.v3.SetManifestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelMethodDescriptorSupplier("SetManifest"))
              .build();
        }
      }
    }
    return getSetManifestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.model.v3.DeleteManifestRequest,
      com.aserto.directory.model.v3.DeleteManifestResponse> getDeleteManifestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteManifest",
      requestType = com.aserto.directory.model.v3.DeleteManifestRequest.class,
      responseType = com.aserto.directory.model.v3.DeleteManifestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.model.v3.DeleteManifestRequest,
      com.aserto.directory.model.v3.DeleteManifestResponse> getDeleteManifestMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.model.v3.DeleteManifestRequest, com.aserto.directory.model.v3.DeleteManifestResponse> getDeleteManifestMethod;
    if ((getDeleteManifestMethod = ModelGrpc.getDeleteManifestMethod) == null) {
      synchronized (ModelGrpc.class) {
        if ((getDeleteManifestMethod = ModelGrpc.getDeleteManifestMethod) == null) {
          ModelGrpc.getDeleteManifestMethod = getDeleteManifestMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.model.v3.DeleteManifestRequest, com.aserto.directory.model.v3.DeleteManifestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteManifest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.model.v3.DeleteManifestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.model.v3.DeleteManifestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ModelMethodDescriptorSupplier("DeleteManifest"))
              .build();
        }
      }
    }
    return getDeleteManifestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ModelStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModelStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModelStub>() {
        @java.lang.Override
        public ModelStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModelStub(channel, callOptions);
        }
      };
    return ModelStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ModelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModelBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModelBlockingStub>() {
        @java.lang.Override
        public ModelBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModelBlockingStub(channel, callOptions);
        }
      };
    return ModelBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ModelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModelFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModelFutureStub>() {
        @java.lang.Override
        public ModelFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModelFutureStub(channel, callOptions);
        }
      };
    return ModelFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getManifest(com.aserto.directory.model.v3.GetManifestRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.GetManifestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetManifestMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.SetManifestRequest> setManifest(
        io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.SetManifestResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSetManifestMethod(), responseObserver);
    }

    /**
     */
    default void deleteManifest(com.aserto.directory.model.v3.DeleteManifestRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.DeleteManifestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteManifestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Model.
   */
  public static abstract class ModelImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ModelGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Model.
   */
  public static final class ModelStub
      extends io.grpc.stub.AbstractAsyncStub<ModelStub> {
    private ModelStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModelStub(channel, callOptions);
    }

    /**
     */
    public void getManifest(com.aserto.directory.model.v3.GetManifestRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.GetManifestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetManifestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.SetManifestRequest> setManifest(
        io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.SetManifestResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSetManifestMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void deleteManifest(com.aserto.directory.model.v3.DeleteManifestRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.DeleteManifestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteManifestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Model.
   */
  public static final class ModelBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ModelBlockingStub> {
    private ModelBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModelBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.aserto.directory.model.v3.GetManifestResponse> getManifest(
        com.aserto.directory.model.v3.GetManifestRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetManifestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.model.v3.DeleteManifestResponse deleteManifest(com.aserto.directory.model.v3.DeleteManifestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteManifestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Model.
   */
  public static final class ModelFutureStub
      extends io.grpc.stub.AbstractFutureStub<ModelFutureStub> {
    private ModelFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModelFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModelFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.model.v3.DeleteManifestResponse> deleteManifest(
        com.aserto.directory.model.v3.DeleteManifestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteManifestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MANIFEST = 0;
  private static final int METHODID_DELETE_MANIFEST = 1;
  private static final int METHODID_SET_MANIFEST = 2;

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
        case METHODID_GET_MANIFEST:
          serviceImpl.getManifest((com.aserto.directory.model.v3.GetManifestRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.GetManifestResponse>) responseObserver);
          break;
        case METHODID_DELETE_MANIFEST:
          serviceImpl.deleteManifest((com.aserto.directory.model.v3.DeleteManifestRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.DeleteManifestResponse>) responseObserver);
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
        case METHODID_SET_MANIFEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setManifest(
              (io.grpc.stub.StreamObserver<com.aserto.directory.model.v3.SetManifestResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetManifestMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.aserto.directory.model.v3.GetManifestRequest,
              com.aserto.directory.model.v3.GetManifestResponse>(
                service, METHODID_GET_MANIFEST)))
        .addMethod(
          getSetManifestMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.aserto.directory.model.v3.SetManifestRequest,
              com.aserto.directory.model.v3.SetManifestResponse>(
                service, METHODID_SET_MANIFEST)))
        .addMethod(
          getDeleteManifestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.model.v3.DeleteManifestRequest,
              com.aserto.directory.model.v3.DeleteManifestResponse>(
                service, METHODID_DELETE_MANIFEST)))
        .build();
  }

  private static abstract class ModelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ModelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aserto.directory.model.v3.ModelProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Model");
    }
  }

  private static final class ModelFileDescriptorSupplier
      extends ModelBaseDescriptorSupplier {
    ModelFileDescriptorSupplier() {}
  }

  private static final class ModelMethodDescriptorSupplier
      extends ModelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ModelMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ModelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ModelFileDescriptorSupplier())
              .addMethod(getGetManifestMethod())
              .addMethod(getSetManifestMethod())
              .addMethod(getDeleteManifestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
