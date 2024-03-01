// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

// Protobuf Java Version: 3.25.3
package com.buf.validate;

public interface AnyRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.AnyRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `in` requires the field's `type_url` to be equal to one of the
   *specified values. If it doesn't match any of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyAny {
   *   //  The `value` field must have a `type_url` equal to one of the specified values.
   *   google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string in = 2 [json_name = "in"];</code>
   * @return A list containing the in.
   */
  java.util.List<java.lang.String>
      getInList();
  /**
   * <pre>
   * `in` requires the field's `type_url` to be equal to one of the
   *specified values. If it doesn't match any of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyAny {
   *   //  The `value` field must have a `type_url` equal to one of the specified values.
   *   google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string in = 2 [json_name = "in"];</code>
   * @return The count of in.
   */
  int getInCount();
  /**
   * <pre>
   * `in` requires the field's `type_url` to be equal to one of the
   *specified values. If it doesn't match any of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyAny {
   *   //  The `value` field must have a `type_url` equal to one of the specified values.
   *   google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string in = 2 [json_name = "in"];</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  java.lang.String getIn(int index);
  /**
   * <pre>
   * `in` requires the field's `type_url` to be equal to one of the
   *specified values. If it doesn't match any of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyAny {
   *   //  The `value` field must have a `type_url` equal to one of the specified values.
   *   google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string in = 2 [json_name = "in"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the in at the given index.
   */
  com.google.protobuf.ByteString
      getInBytes(int index);

  /**
   * <pre>
   * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
   *
   * ```proto
   * message MyAny {
   *   // The field `value` must not have a `type_url` equal to any of the specified values.
   *   google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
   * @return A list containing the notIn.
   */
  java.util.List<java.lang.String>
      getNotInList();
  /**
   * <pre>
   * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
   *
   * ```proto
   * message MyAny {
   *   // The field `value` must not have a `type_url` equal to any of the specified values.
   *   google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
   * @return The count of notIn.
   */
  int getNotInCount();
  /**
   * <pre>
   * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
   *
   * ```proto
   * message MyAny {
   *   // The field `value` must not have a `type_url` equal to any of the specified values.
   *   google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  java.lang.String getNotIn(int index);
  /**
   * <pre>
   * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
   *
   * ```proto
   * message MyAny {
   *   // The field `value` must not have a `type_url` equal to any of the specified values.
   *   google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the notIn at the given index.
   */
  com.google.protobuf.ByteString
      getNotInBytes(int index);
}
