// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/importer/v3/importer.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.importer.v3;

public interface ImportStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.directory.importer.v3.ImportStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * gRPC status code (google.golang.org/grpc/codes)
   * </pre>
   *
   * <code>uint32 code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  int getCode();

  /**
   * <pre>
   * gRPC status message (google.golang.org/grpc/status)
   * </pre>
   *
   * <code>string msg = 2 [json_name = "msg"];</code>
   * @return The msg.
   */
  java.lang.String getMsg();
  /**
   * <pre>
   * gRPC status message (google.golang.org/grpc/status)
   * </pre>
   *
   * <code>string msg = 2 [json_name = "msg"];</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <pre>
   * req contains the original import request message
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
   * @return Whether the req field is set.
   */
  boolean hasReq();
  /**
   * <pre>
   * req contains the original import request message
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
   * @return The req.
   */
  com.aserto.directory.importer.v3.ImportRequest getReq();
  /**
   * <pre>
   * req contains the original import request message
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportRequest req = 3 [json_name = "req"];</code>
   */
  com.aserto.directory.importer.v3.ImportRequestOrBuilder getReqOrBuilder();
}
