// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/exporter/v2/exporter.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.exporter.v2;

/**
 * Protobuf enum {@code aserto.directory.exporter.v2.Option}
 */
public enum Option
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * nothing selected (default initialization value)
   * </pre>
   *
   * <code>OPTION_UNKNOWN = 0;</code>
   */
  OPTION_UNKNOWN(0),
  /**
   * <pre>
   * object type metadata
   * </pre>
   *
   * <code>OPTION_METADATA_OBJECT_TYPES = 1;</code>
   */
  OPTION_METADATA_OBJECT_TYPES(1),
  /**
   * <pre>
   * relation type metadata
   * </pre>
   *
   * <code>OPTION_METADATA_RELATION_TYPES = 2;</code>
   */
  OPTION_METADATA_RELATION_TYPES(2),
  /**
   * <pre>
   * permission metadata
   * </pre>
   *
   * <code>OPTION_METADATA_PERMISSIONS = 4;</code>
   */
  OPTION_METADATA_PERMISSIONS(4),
  /**
   * <pre>
   * all metadata = OPTION_METADATA_OBJECT_TYPES | OPTION_METADATA_RELATION_TYPES | OPTION_METADATA_PERMISSIONS
   * </pre>
   *
   * <code>OPTION_METADATA = 7;</code>
   */
  OPTION_METADATA(7),
  /**
   * <pre>
   * object instances
   * </pre>
   *
   * <code>OPTION_DATA_OBJECTS = 8;</code>
   */
  OPTION_DATA_OBJECTS(8),
  /**
   * <pre>
   * relation instances
   * </pre>
   *
   * <code>OPTION_DATA_RELATIONS = 16;</code>
   */
  OPTION_DATA_RELATIONS(16),
  /**
   * <pre>
   * relation instances with key values
   * </pre>
   *
   * <code>OPTION_DATA_RELATIONS_WITH_KEYS = 32;</code>
   */
  OPTION_DATA_RELATIONS_WITH_KEYS(32),
  /**
   * <pre>
   * all data = OPTION_DATA_OBJECTS | OPTION_DATA_RELATIONS
   * </pre>
   *
   * <code>OPTION_DATA = 24;</code>
   */
  OPTION_DATA(24),
  /**
   * <pre>
   * all data with keys = OPTION_DATA_OBJECTS | OPTION_DATA_RELATIONS_WITH_KEYS
   * </pre>
   *
   * <code>OPTION_DATA_WITH_KEYS = 40;</code>
   */
  OPTION_DATA_WITH_KEYS(40),
  /**
   * <pre>
   * all metadata and data = OPTION_METADATA | OPTION_DATA
   * </pre>
   *
   * <code>OPTION_ALL = 31;</code>
   */
  OPTION_ALL(31),
  /**
   * <pre>
   * all metadata and data with keys = OPTION_METADATA | OPTION_DATA_WITH_KEYS
   * </pre>
   *
   * <code>OPTION_ALL_WITH_KEYS = 47;</code>
   */
  OPTION_ALL_WITH_KEYS(47),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * nothing selected (default initialization value)
   * </pre>
   *
   * <code>OPTION_UNKNOWN = 0;</code>
   */
  public static final int OPTION_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * object type metadata
   * </pre>
   *
   * <code>OPTION_METADATA_OBJECT_TYPES = 1;</code>
   */
  public static final int OPTION_METADATA_OBJECT_TYPES_VALUE = 1;
  /**
   * <pre>
   * relation type metadata
   * </pre>
   *
   * <code>OPTION_METADATA_RELATION_TYPES = 2;</code>
   */
  public static final int OPTION_METADATA_RELATION_TYPES_VALUE = 2;
  /**
   * <pre>
   * permission metadata
   * </pre>
   *
   * <code>OPTION_METADATA_PERMISSIONS = 4;</code>
   */
  public static final int OPTION_METADATA_PERMISSIONS_VALUE = 4;
  /**
   * <pre>
   * all metadata = OPTION_METADATA_OBJECT_TYPES | OPTION_METADATA_RELATION_TYPES | OPTION_METADATA_PERMISSIONS
   * </pre>
   *
   * <code>OPTION_METADATA = 7;</code>
   */
  public static final int OPTION_METADATA_VALUE = 7;
  /**
   * <pre>
   * object instances
   * </pre>
   *
   * <code>OPTION_DATA_OBJECTS = 8;</code>
   */
  public static final int OPTION_DATA_OBJECTS_VALUE = 8;
  /**
   * <pre>
   * relation instances
   * </pre>
   *
   * <code>OPTION_DATA_RELATIONS = 16;</code>
   */
  public static final int OPTION_DATA_RELATIONS_VALUE = 16;
  /**
   * <pre>
   * relation instances with key values
   * </pre>
   *
   * <code>OPTION_DATA_RELATIONS_WITH_KEYS = 32;</code>
   */
  public static final int OPTION_DATA_RELATIONS_WITH_KEYS_VALUE = 32;
  /**
   * <pre>
   * all data = OPTION_DATA_OBJECTS | OPTION_DATA_RELATIONS
   * </pre>
   *
   * <code>OPTION_DATA = 24;</code>
   */
  public static final int OPTION_DATA_VALUE = 24;
  /**
   * <pre>
   * all data with keys = OPTION_DATA_OBJECTS | OPTION_DATA_RELATIONS_WITH_KEYS
   * </pre>
   *
   * <code>OPTION_DATA_WITH_KEYS = 40;</code>
   */
  public static final int OPTION_DATA_WITH_KEYS_VALUE = 40;
  /**
   * <pre>
   * all metadata and data = OPTION_METADATA | OPTION_DATA
   * </pre>
   *
   * <code>OPTION_ALL = 31;</code>
   */
  public static final int OPTION_ALL_VALUE = 31;
  /**
   * <pre>
   * all metadata and data with keys = OPTION_METADATA | OPTION_DATA_WITH_KEYS
   * </pre>
   *
   * <code>OPTION_ALL_WITH_KEYS = 47;</code>
   */
  public static final int OPTION_ALL_WITH_KEYS_VALUE = 47;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Option valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Option forNumber(int value) {
    switch (value) {
      case 0: return OPTION_UNKNOWN;
      case 1: return OPTION_METADATA_OBJECT_TYPES;
      case 2: return OPTION_METADATA_RELATION_TYPES;
      case 4: return OPTION_METADATA_PERMISSIONS;
      case 7: return OPTION_METADATA;
      case 8: return OPTION_DATA_OBJECTS;
      case 16: return OPTION_DATA_RELATIONS;
      case 32: return OPTION_DATA_RELATIONS_WITH_KEYS;
      case 24: return OPTION_DATA;
      case 40: return OPTION_DATA_WITH_KEYS;
      case 31: return OPTION_ALL;
      case 47: return OPTION_ALL_WITH_KEYS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Option>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Option> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Option>() {
          public Option findValueByNumber(int number) {
            return Option.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.aserto.directory.exporter.v2.ExporterProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Option[] VALUES = values();

  public static Option valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Option(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aserto.directory.exporter.v2.Option)
}

