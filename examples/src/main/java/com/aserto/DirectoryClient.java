package com.aserto;

import com.aserto.directory.model.v3.*;
import com.aserto.directory.reader.v3.*;
import com.aserto.directory.writer.v3.*;
import com.aserto.directory.importer.v3.*;
import com.aserto.directory.exporter.v3.*;
import com.aserto.directory.common.v3.*;

import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.MetadataUtils;

import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import javax.net.ssl.SSLException;

import com.google.protobuf.*;


public class DirectoryClient {
    private ModelGrpc.ModelBlockingStub modelClient;
    private ReaderGrpc.ReaderBlockingStub readerClient;
    private WriterGrpc.WriterBlockingStub writerClient;
    private ImporterGrpc.ImporterBlockingStub importerClient;
    private ExporterGrpc.ExporterBlockingStub exporterClient;

    public DirectoryClient(Config config) throws SSLException {
        Metadata metadata = new Metadata();

        if (!config.ApiKey().isEmpty()) {
            Metadata.Key<String> authorization = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
            metadata.put(authorization, "basic " + config.ApiKey());
        }

        if (!config.TenantID().isEmpty()) {
            Metadata.Key<String> asertoTenantId = Metadata.Key.of("aserto-tenant-id", Metadata.ASCII_STRING_MARSHALLER);
            metadata.put(asertoTenantId, config.TenantID());
        }

        ManagedChannel channel = NettyChannelBuilder
                .forAddress(config.Host(), config.Port())
                .intercept(MetadataUtils.newAttachHeadersInterceptor(metadata))
                .sslContext(GrpcSslContexts.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build())
                .build();
        
        this.modelClient = ModelGrpc.newBlockingStub(channel);
        this.readerClient = ReaderGrpc.newBlockingStub(channel);
        this.writerClient = WriterGrpc.newBlockingStub(channel);
        this.importerClient = ImporterGrpc.newBlockingStub(channel);
        this.exporterClient = ExporterGrpc.newBlockingStub(channel);
    }

    public ModelGrpc.ModelBlockingStub Model() {
        return modelClient;
    }

    public ReaderGrpc.ReaderBlockingStub Reader() {
        return readerClient;
    }

    public WriterGrpc.WriterBlockingStub Writer() {
        return writerClient;
    }

    public ImporterGrpc.ImporterBlockingStub Importer() {
        return importerClient;
    }

    public ExporterGrpc.ExporterBlockingStub Exporter() {
        return exporterClient;
    }
}