package com.aserto.directory.importer.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: aserto/directory/importer/v2/importer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ImporterGrpc {

  private ImporterGrpc() {}

  public static final java.lang.String SERVICE_NAME = "aserto.directory.importer.v2.Importer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aserto.directory.importer.v2.ImportRequest,
      com.aserto.directory.importer.v2.ImportResponse> getImportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Import",
      requestType = com.aserto.directory.importer.v2.ImportRequest.class,
      responseType = com.aserto.directory.importer.v2.ImportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.aserto.directory.importer.v2.ImportRequest,
      com.aserto.directory.importer.v2.ImportResponse> getImportMethod() {
    io.grpc.MethodDescriptor<com.aserto.directory.importer.v2.ImportRequest, com.aserto.directory.importer.v2.ImportResponse> getImportMethod;
    if ((getImportMethod = ImporterGrpc.getImportMethod) == null) {
      synchronized (ImporterGrpc.class) {
        if ((getImportMethod = ImporterGrpc.getImportMethod) == null) {
          ImporterGrpc.getImportMethod = getImportMethod =
              io.grpc.MethodDescriptor.<com.aserto.directory.importer.v2.ImportRequest, com.aserto.directory.importer.v2.ImportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Import"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.importer.v2.ImportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.directory.importer.v2.ImportResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ImporterMethodDescriptorSupplier("Import"))
              .build();
        }
      }
    }
    return getImportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImporterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImporterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImporterStub>() {
        @java.lang.Override
        public ImporterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImporterStub(channel, callOptions);
        }
      };
    return ImporterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImporterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImporterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImporterBlockingStub>() {
        @java.lang.Override
        public ImporterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImporterBlockingStub(channel, callOptions);
        }
      };
    return ImporterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImporterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImporterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImporterFutureStub>() {
        @java.lang.Override
        public ImporterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImporterFutureStub(channel, callOptions);
        }
      };
    return ImporterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * import stream of objects and relations
     * </pre>
     */
    @java.lang.Deprecated
    default io.grpc.stub.StreamObserver<com.aserto.directory.importer.v2.ImportRequest> import_(
        io.grpc.stub.StreamObserver<com.aserto.directory.importer.v2.ImportResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getImportMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Importer.
   */
  public static abstract class ImporterImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ImporterGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Importer.
   */
  public static final class ImporterStub
      extends io.grpc.stub.AbstractAsyncStub<ImporterStub> {
    private ImporterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImporterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImporterStub(channel, callOptions);
    }

    /**
     * <pre>
     * import stream of objects and relations
     * </pre>
     */
    @java.lang.Deprecated
    public io.grpc.stub.StreamObserver<com.aserto.directory.importer.v2.ImportRequest> import_(
        io.grpc.stub.StreamObserver<com.aserto.directory.importer.v2.ImportResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getImportMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Importer.
   */
  public static final class ImporterBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ImporterBlockingStub> {
    private ImporterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImporterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImporterBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Importer.
   */
  public static final class ImporterFutureStub
      extends io.grpc.stub.AbstractFutureStub<ImporterFutureStub> {
    private ImporterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImporterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImporterFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_IMPORT = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IMPORT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.import_(
              (io.grpc.stub.StreamObserver<com.aserto.directory.importer.v2.ImportResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getImportMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.aserto.directory.importer.v2.ImportRequest,
              com.aserto.directory.importer.v2.ImportResponse>(
                service, METHODID_IMPORT)))
        .build();
  }

  private static abstract class ImporterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImporterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aserto.directory.importer.v2.ImporterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Importer");
    }
  }

  private static final class ImporterFileDescriptorSupplier
      extends ImporterBaseDescriptorSupplier {
    ImporterFileDescriptorSupplier() {}
  }

  private static final class ImporterMethodDescriptorSupplier
      extends ImporterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ImporterMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ImporterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImporterFileDescriptorSupplier())
              .addMethod(getImportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
