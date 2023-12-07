// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

// Protobuf Java Version: 3.25.1
package com.grpc.gateway.protoc_gen_openapiv2.options;

public interface InfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.gateway.protoc_gen_openapiv2.options.Info)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The title of the application.
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The title of the application.
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * A short description of the application. GFM syntax can be used for rich
   * text representation.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A short description of the application. GFM syntax can be used for rich
   * text representation.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The Terms of Service for the API.
   * </pre>
   *
   * <code>string terms_of_service = 3 [json_name = "termsOfService"];</code>
   * @return The termsOfService.
   */
  java.lang.String getTermsOfService();
  /**
   * <pre>
   * The Terms of Service for the API.
   * </pre>
   *
   * <code>string terms_of_service = 3 [json_name = "termsOfService"];</code>
   * @return The bytes for termsOfService.
   */
  com.google.protobuf.ByteString
      getTermsOfServiceBytes();

  /**
   * <pre>
   * The contact information for the exposed API.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Contact contact = 4 [json_name = "contact"];</code>
   * @return Whether the contact field is set.
   */
  boolean hasContact();
  /**
   * <pre>
   * The contact information for the exposed API.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Contact contact = 4 [json_name = "contact"];</code>
   * @return The contact.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.Contact getContact();
  /**
   * <pre>
   * The contact information for the exposed API.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Contact contact = 4 [json_name = "contact"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.ContactOrBuilder getContactOrBuilder();

  /**
   * <pre>
   * The license information for the exposed API.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.License license = 5 [json_name = "license"];</code>
   * @return Whether the license field is set.
   */
  boolean hasLicense();
  /**
   * <pre>
   * The license information for the exposed API.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.License license = 5 [json_name = "license"];</code>
   * @return The license.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.License getLicense();
  /**
   * <pre>
   * The license information for the exposed API.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.License license = 5 [json_name = "license"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.LicenseOrBuilder getLicenseOrBuilder();

  /**
   * <pre>
   * Provides the version of the application API (not to be confused
   * with the specification version).
   * </pre>
   *
   * <code>string version = 6 [json_name = "version"];</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Provides the version of the application API (not to be confused
   * with the specification version).
   * </pre>
   *
   * <code>string version = 6 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7 [json_name = "extensions"];</code>
   */
  int getExtensionsCount();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7 [json_name = "extensions"];</code>
   */
  boolean containsExtensions(
      java.lang.String key);
  /**
   * Use {@link #getExtensionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getExtensions();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7 [json_name = "extensions"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getExtensionsMap();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7 [json_name = "extensions"];</code>
   */
  /* nullable */
com.google.protobuf.Value getExtensionsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Value defaultValue);
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 7 [json_name = "extensions"];</code>
   */
  com.google.protobuf.Value getExtensionsOrThrow(
      java.lang.String key);
}
