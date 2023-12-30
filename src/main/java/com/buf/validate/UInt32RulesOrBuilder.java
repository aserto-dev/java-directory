// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

// Protobuf Java Version: 3.25.1
package com.buf.validate;

public interface UInt32RulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.UInt32Rules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `const` requires the field value to exactly match the specified value. If
   * the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must equal 42
   *   uint32 value = 1 [(buf.validate.field).uint32.const = 42];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint32 const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the const field is set.
   */
  boolean hasConst();
  /**
   * <pre>
   * `const` requires the field value to exactly match the specified value. If
   * the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must equal 42
   *   uint32 value = 1 [(buf.validate.field).uint32.const = 42];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint32 const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return The const.
   */
  int getConst();

  /**
   * <pre>
   * `lt` requires the field value to be less than the specified value (field &lt;
   * value). If the field value is equal to or greater than the specified value,
   * an error message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be less than 10
   *   uint32 value = 1 [(buf.validate.field).uint32.lt = 10];
   * }
   * ```
   * </pre>
   *
   * <code>uint32 lt = 2 [json_name = "lt", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the lt field is set.
   */
  boolean hasLt();
  /**
   * <pre>
   * `lt` requires the field value to be less than the specified value (field &lt;
   * value). If the field value is equal to or greater than the specified value,
   * an error message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be less than 10
   *   uint32 value = 1 [(buf.validate.field).uint32.lt = 10];
   * }
   * ```
   * </pre>
   *
   * <code>uint32 lt = 2 [json_name = "lt", (.buf.validate.priv.field) = { ... }</code>
   * @return The lt.
   */
  int getLt();

  /**
   * <pre>
   * `lte` requires the field value to be less than or equal to the specified
   * value (field &lt;= value). If the field value is greater than the specified
   * value, an error message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be less than or equal to 10
   *   uint32 value = 1 [(buf.validate.field).uint32.lte = 10];
   * }
   * ```
   * </pre>
   *
   * <code>uint32 lte = 3 [json_name = "lte", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the lte field is set.
   */
  boolean hasLte();
  /**
   * <pre>
   * `lte` requires the field value to be less than or equal to the specified
   * value (field &lt;= value). If the field value is greater than the specified
   * value, an error message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be less than or equal to 10
   *   uint32 value = 1 [(buf.validate.field).uint32.lte = 10];
   * }
   * ```
   * </pre>
   *
   * <code>uint32 lte = 3 [json_name = "lte", (.buf.validate.priv.field) = { ... }</code>
   * @return The lte.
   */
  int getLte();

  /**
   * <pre>
   * `gt` requires the field value to be greater than the specified value
   * (exclusive). If the value of `gt` is larger than a specified `lt` or
   * `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be greater than 5 [uint32.gt]
   *   uint32 value = 1 [(buf.validate.field).uint32.gt = 5];
   *
   *   // value must be greater than 5 and less than 10 [uint32.gt_lt]
   *   uint32 other_value = 2 [(buf.validate.field).uint32 = { gt: 5, lt: 10 }];
   *
   *   // value must be greater than 10 or less than 5 [uint32.gt_lt_exclusive]
   *   uint32 another_value = 3 [(buf.validate.field).uint32 = { gt: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>uint32 gt = 4 [json_name = "gt", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the gt field is set.
   */
  boolean hasGt();
  /**
   * <pre>
   * `gt` requires the field value to be greater than the specified value
   * (exclusive). If the value of `gt` is larger than a specified `lt` or
   * `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be greater than 5 [uint32.gt]
   *   uint32 value = 1 [(buf.validate.field).uint32.gt = 5];
   *
   *   // value must be greater than 5 and less than 10 [uint32.gt_lt]
   *   uint32 other_value = 2 [(buf.validate.field).uint32 = { gt: 5, lt: 10 }];
   *
   *   // value must be greater than 10 or less than 5 [uint32.gt_lt_exclusive]
   *   uint32 another_value = 3 [(buf.validate.field).uint32 = { gt: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>uint32 gt = 4 [json_name = "gt", (.buf.validate.priv.field) = { ... }</code>
   * @return The gt.
   */
  int getGt();

  /**
   * <pre>
   * `gte` requires the field value to be greater than or equal to the specified
   * value (exclusive). If the value of `gte` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be greater than or equal to 5 [uint32.gte]
   *   uint32 value = 1 [(buf.validate.field).uint32.gte = 5];
   *
   *   // value must be greater than or equal to 5 and less than 10 [uint32.gte_lt]
   *   uint32 other_value = 2 [(buf.validate.field).uint32 = { gte: 5, lt: 10 }];
   *
   *   // value must be greater than or equal to 10 or less than 5 [uint32.gte_lt_exclusive]
   *   uint32 another_value = 3 [(buf.validate.field).uint32 = { gte: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>uint32 gte = 5 [json_name = "gte", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the gte field is set.
   */
  boolean hasGte();
  /**
   * <pre>
   * `gte` requires the field value to be greater than or equal to the specified
   * value (exclusive). If the value of `gte` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be greater than or equal to 5 [uint32.gte]
   *   uint32 value = 1 [(buf.validate.field).uint32.gte = 5];
   *
   *   // value must be greater than or equal to 5 and less than 10 [uint32.gte_lt]
   *   uint32 other_value = 2 [(buf.validate.field).uint32 = { gte: 5, lt: 10 }];
   *
   *   // value must be greater than or equal to 10 or less than 5 [uint32.gte_lt_exclusive]
   *   uint32 another_value = 3 [(buf.validate.field).uint32 = { gte: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>uint32 gte = 5 [json_name = "gte", (.buf.validate.priv.field) = { ... }</code>
   * @return The gte.
   */
  int getGte();

  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be in list [1, 2, 3]
   *   repeated uint32 value = 1 (buf.validate.field).uint32 = { in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated uint32 in = 6 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   * @return A list containing the in.
   */
  java.util.List<java.lang.Integer> getInList();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be in list [1, 2, 3]
   *   repeated uint32 value = 1 (buf.validate.field).uint32 = { in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated uint32 in = 6 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   * @return The count of in.
   */
  int getInCount();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must be in list [1, 2, 3]
   *   repeated uint32 value = 1 (buf.validate.field).uint32 = { in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated uint32 in = 6 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  int getIn(int index);

  /**
   * <pre>
   * `not_in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must not be in list [1, 2, 3]
   *   repeated uint32 value = 1 (buf.validate.field).uint32 = { not_in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated uint32 not_in = 7 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   * @return A list containing the notIn.
   */
  java.util.List<java.lang.Integer> getNotInList();
  /**
   * <pre>
   * `not_in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must not be in list [1, 2, 3]
   *   repeated uint32 value = 1 (buf.validate.field).uint32 = { not_in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated uint32 not_in = 7 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   * @return The count of notIn.
   */
  int getNotInCount();
  /**
   * <pre>
   * `not_in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyUInt32 {
   *   // value must not be in list [1, 2, 3]
   *   repeated uint32 value = 1 (buf.validate.field).uint32 = { not_in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated uint32 not_in = 7 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  int getNotIn(int index);

  com.buf.validate.UInt32Rules.LessThanCase getLessThanCase();

  com.buf.validate.UInt32Rules.GreaterThanCase getGreaterThanCase();
}