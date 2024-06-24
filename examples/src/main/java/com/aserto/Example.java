package com.aserto;

import com.aserto.directory.model.v3.*;
import com.aserto.directory.reader.v3.*;
import com.aserto.directory.writer.v3.*;
import com.aserto.directory.importer.v3.*;
import com.aserto.directory.exporter.v3.*;
import com.aserto.directory.common.v3.*;

import io.github.cdimascio.dotenv.DotenvException;
import javax.net.ssl.SSLException;

import com.google.protobuf.*;

public class Example {
    public static void main(String[] args) {
        try {
            Config config = new Config();

            System.out.format("Connecting to directory: %s:%d...\n", config.Host(), config.Port());

            DirectoryClient directoryClient = new DirectoryClient(config);
    
            listObjects(directoryClient);
    
        } catch (DotenvException | SSLException ex) {
            System.out.printf("error: %s\n", ex.getMessage());
            System.exit(1);
        }
    }

    public static void listObjects(DirectoryClient directoryClient) {
        System.out.println("<--------------- list objects call --------------->");

        GetObjectsRequest.Builder builder = GetObjectsRequest.newBuilder();
        GetObjectsRequest request = builder.build();
        GetObjectsResponse response = directoryClient.Reader().getObjects(request);
        
        response.getResultsList().forEach(object -> {
            System.out.println(object);
        });
    }
}

