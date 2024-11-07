// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protoc-gen-openapiv2/options/openapiv2.proto
// Protobuf Java Version: 4.28.3

package com.grpc.gateway.protoc_gen_openapiv2.options;

public interface HeaderParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.gateway.protoc_gen_openapiv2.options.HeaderParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `Name` is the header name.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * `Name` is the header name.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * `Description` is a short description of the header.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * `Description` is a short description of the header.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * `Type` is the type of the object. The value MUST be one of "string", "number", "integer", or "boolean". The "array" type is not supported.
   * See: https://swagger.io/specification/v2/#parameterType.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.HeaderParameter.Type type = 3 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * `Type` is the type of the object. The value MUST be one of "string", "number", "integer", or "boolean". The "array" type is not supported.
   * See: https://swagger.io/specification/v2/#parameterType.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.HeaderParameter.Type type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.HeaderParameter.Type getType();

  /**
   * <pre>
   * `Format` The extending format for the previously mentioned type.
   * </pre>
   *
   * <code>string format = 4 [json_name = "format"];</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   * `Format` The extending format for the previously mentioned type.
   * </pre>
   *
   * <code>string format = 4 [json_name = "format"];</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   * `Required` indicates if the header is optional
   * </pre>
   *
   * <code>bool required = 5 [json_name = "required"];</code>
   * @return The required.
   */
  boolean getRequired();
}
