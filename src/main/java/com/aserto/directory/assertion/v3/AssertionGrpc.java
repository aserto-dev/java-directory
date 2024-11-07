package com.aserto.directory.assertion.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: aserto/directory/assertion/v3/assertion.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssertionGrpc {

  private AssertionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aserto.directory.assertion.v3.Assertion";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.GetAssertionRequest,
      com.aserto.directory.assertion.v3.GetAssertionResponse> getGetAssertionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssertion",
      requestType = com.aserto.directory.assertion.v3.GetAssertionRequest.class,
      responseType = com.aserto.directory.assertion.v3.GetAssertionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.GetAssertionRequest,
      com.aserto.directory.assertion.v3.GetAssertionResponse> getGetAssertionMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.GetAssertionRequest, com.aserto.directory.assertion.v3.GetAssertionResponse> getGetAssertionMethod;
    if ((getGetAssertionMethod = AssertionGrpc.getGetAssertionMethod) == null) {
      synchronized (AssertionGrpc.class) {
        if ((getGetAssertionMethod = AssertionGrpc.getGetAssertionMethod) == null) {
          AssertionGrpc.getGetAssertionMethod = getGetAssertionMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.assertion.v3.GetAssertionRequest, com.aserto.directory.assertion.v3.GetAssertionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAssertion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.assertion.v3.GetAssertionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.assertion.v3.GetAssertionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssertionMethodDescriptorSupplier("GetAssertion"))
              .build();
        }
      }
    }
    return getGetAssertionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.ListAssertionsRequest,
      com.aserto.directory.assertion.v3.ListAssertionsResponse> getListAssertionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAssertions",
      requestType = com.aserto.directory.assertion.v3.ListAssertionsRequest.class,
      responseType = com.aserto.directory.assertion.v3.ListAssertionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.ListAssertionsRequest,
      com.aserto.directory.assertion.v3.ListAssertionsResponse> getListAssertionsMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.ListAssertionsRequest, com.aserto.directory.assertion.v3.ListAssertionsResponse> getListAssertionsMethod;
    if ((getListAssertionsMethod = AssertionGrpc.getListAssertionsMethod) == null) {
      synchronized (AssertionGrpc.class) {
        if ((getListAssertionsMethod = AssertionGrpc.getListAssertionsMethod) == null) {
          AssertionGrpc.getListAssertionsMethod = getListAssertionsMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.assertion.v3.ListAssertionsRequest, com.aserto.directory.assertion.v3.ListAssertionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAssertions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.assertion.v3.ListAssertionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.assertion.v3.ListAssertionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssertionMethodDescriptorSupplier("ListAssertions"))
              .build();
        }
      }
    }
    return getListAssertionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.SetAssertionRequest,
      com.aserto.directory.assertion.v3.SetAssertionResponse> getSetAssertionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAssertion",
      requestType = com.aserto.directory.assertion.v3.SetAssertionRequest.class,
      responseType = com.aserto.directory.assertion.v3.SetAssertionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.SetAssertionRequest,
      com.aserto.directory.assertion.v3.SetAssertionResponse> getSetAssertionMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.SetAssertionRequest, com.aserto.directory.assertion.v3.SetAssertionResponse> getSetAssertionMethod;
    if ((getSetAssertionMethod = AssertionGrpc.getSetAssertionMethod) == null) {
      synchronized (AssertionGrpc.class) {
        if ((getSetAssertionMethod = AssertionGrpc.getSetAssertionMethod) == null) {
          AssertionGrpc.getSetAssertionMethod = getSetAssertionMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.assertion.v3.SetAssertionRequest, com.aserto.directory.assertion.v3.SetAssertionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAssertion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.assertion.v3.SetAssertionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.assertion.v3.SetAssertionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssertionMethodDescriptorSupplier("SetAssertion"))
              .build();
        }
      }
    }
    return getSetAssertionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.DeleteAssertionRequest,
      com.aserto.directory.assertion.v3.DeleteAssertionResponse> getDeleteAssertionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAssertion",
      requestType = com.aserto.directory.assertion.v3.DeleteAssertionRequest.class,
      responseType = com.aserto.directory.assertion.v3.DeleteAssertionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.DeleteAssertionRequest,
      com.aserto.directory.assertion.v3.DeleteAssertionResponse> getDeleteAssertionMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.assertion.v3.DeleteAssertionRequest, com.aserto.directory.assertion.v3.DeleteAssertionResponse> getDeleteAssertionMethod;
    if ((getDeleteAssertionMethod = AssertionGrpc.getDeleteAssertionMethod) == null) {
      synchronized (AssertionGrpc.class) {
        if ((getDeleteAssertionMethod = AssertionGrpc.getDeleteAssertionMethod) == null) {
          AssertionGrpc.getDeleteAssertionMethod = getDeleteAssertionMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.assertion.v3.DeleteAssertionRequest, com.aserto.directory.assertion.v3.DeleteAssertionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAssertion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.assertion.v3.DeleteAssertionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.assertion.v3.DeleteAssertionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssertionMethodDescriptorSupplier("DeleteAssertion"))
              .build();
        }
      }
    }
    return getDeleteAssertionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssertionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssertionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssertionStub>() {
        @java.lang.Override
        public AssertionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssertionStub(channel, callOptions);
        }
      };
    return AssertionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssertionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssertionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssertionBlockingStub>() {
        @java.lang.Override
        public AssertionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssertionBlockingStub(channel, callOptions);
        }
      };
    return AssertionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssertionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssertionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssertionFutureStub>() {
        @java.lang.Override
        public AssertionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssertionFutureStub(channel, callOptions);
        }
      };
    return AssertionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAssertion(com.aserto.directory.assertion.v3.GetAssertionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.GetAssertionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAssertionMethod(), responseObserver);
    }

    /**
     */
    default void listAssertions(com.aserto.directory.assertion.v3.ListAssertionsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.ListAssertionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAssertionsMethod(), responseObserver);
    }

    /**
     */
    default void setAssertion(com.aserto.directory.assertion.v3.SetAssertionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.SetAssertionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAssertionMethod(), responseObserver);
    }

    /**
     */
    default void deleteAssertion(com.aserto.directory.assertion.v3.DeleteAssertionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.DeleteAssertionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAssertionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Assertion.
   */
  public static abstract class AssertionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AssertionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Assertion.
   */
  public static final class AssertionStub
      extends io.grpc.stub.AbstractAsyncStub<AssertionStub> {
    private AssertionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssertionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssertionStub(channel, callOptions);
    }

    /**
     */
    public void getAssertion(com.aserto.directory.assertion.v3.GetAssertionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.GetAssertionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAssertionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAssertions(com.aserto.directory.assertion.v3.ListAssertionsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.ListAssertionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAssertionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAssertion(com.aserto.directory.assertion.v3.SetAssertionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.SetAssertionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAssertionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAssertion(com.aserto.directory.assertion.v3.DeleteAssertionRequest request,
        io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.DeleteAssertionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAssertionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Assertion.
   */
  public static final class AssertionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AssertionBlockingStub> {
    private AssertionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssertionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssertionBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aserto.directory.assertion.v3.GetAssertionResponse getAssertion(com.aserto.directory.assertion.v3.GetAssertionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAssertionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.assertion.v3.ListAssertionsResponse listAssertions(com.aserto.directory.assertion.v3.ListAssertionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAssertionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.assertion.v3.SetAssertionResponse setAssertion(com.aserto.directory.assertion.v3.SetAssertionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAssertionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.directory.assertion.v3.DeleteAssertionResponse deleteAssertion(com.aserto.directory.assertion.v3.DeleteAssertionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAssertionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Assertion.
   */
  public static final class AssertionFutureStub
      extends io.grpc.stub.AbstractFutureStub<AssertionFutureStub> {
    private AssertionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssertionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssertionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.assertion.v3.GetAssertionResponse> getAssertion(
        com.aserto.directory.assertion.v3.GetAssertionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAssertionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.assertion.v3.ListAssertionsResponse> listAssertions(
        com.aserto.directory.assertion.v3.ListAssertionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAssertionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.assertion.v3.SetAssertionResponse> setAssertion(
        com.aserto.directory.assertion.v3.SetAssertionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAssertionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.directory.assertion.v3.DeleteAssertionResponse> deleteAssertion(
        com.aserto.directory.assertion.v3.DeleteAssertionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAssertionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ASSERTION = 0;
  private static final int METHODID_LIST_ASSERTIONS = 1;
  private static final int METHODID_SET_ASSERTION = 2;
  private static final int METHODID_DELETE_ASSERTION = 3;

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
        case METHODID_GET_ASSERTION:
          serviceImpl.getAssertion((com.aserto.directory.assertion.v3.GetAssertionRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.GetAssertionResponse>) responseObserver);
          break;
        case METHODID_LIST_ASSERTIONS:
          serviceImpl.listAssertions((com.aserto.directory.assertion.v3.ListAssertionsRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.ListAssertionsResponse>) responseObserver);
          break;
        case METHODID_SET_ASSERTION:
          serviceImpl.setAssertion((com.aserto.directory.assertion.v3.SetAssertionRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.SetAssertionResponse>) responseObserver);
          break;
        case METHODID_DELETE_ASSERTION:
          serviceImpl.deleteAssertion((com.aserto.directory.assertion.v3.DeleteAssertionRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.directory.assertion.v3.DeleteAssertionResponse>) responseObserver);
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
          getGetAssertionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.assertion.v3.GetAssertionRequest,
              com.aserto.directory.assertion.v3.GetAssertionResponse>(
                service, METHODID_GET_ASSERTION)))
        .addMethod(
          getListAssertionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.assertion.v3.ListAssertionsRequest,
              com.aserto.directory.assertion.v3.ListAssertionsResponse>(
                service, METHODID_LIST_ASSERTIONS)))
        .addMethod(
          getSetAssertionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.assertion.v3.SetAssertionRequest,
              com.aserto.directory.assertion.v3.SetAssertionResponse>(
                service, METHODID_SET_ASSERTION)))
        .addMethod(
          getDeleteAssertionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.directory.assertion.v3.DeleteAssertionRequest,
              com.aserto.directory.assertion.v3.DeleteAssertionResponse>(
                service, METHODID_DELETE_ASSERTION)))
        .build();
  }

  private static abstract class AssertionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssertionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aserto.directory.assertion.v3.AssertionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Assertion");
    }
  }

  private static final class AssertionFileDescriptorSupplier
      extends AssertionBaseDescriptorSupplier {
    AssertionFileDescriptorSupplier() {}
  }

  private static final class AssertionMethodDescriptorSupplier
      extends AssertionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AssertionMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AssertionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssertionFileDescriptorSupplier())
              .addMethod(getGetAssertionMethod())
              .addMethod(getListAssertionsMethod())
              .addMethod(getSetAssertionMethod())
              .addMethod(getDeleteAssertionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
