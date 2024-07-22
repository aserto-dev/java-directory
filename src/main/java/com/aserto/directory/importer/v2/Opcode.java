// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/importer/v2/importer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.importer.v2;

/**
 * Protobuf enum {@code aserto.directory.importer.v2.Opcode}
 */
@java.lang.Deprecated public enum Opcode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OPCODE_UNKNOWN = 0;</code>
   */
  OPCODE_UNKNOWN(0),
  /**
   * <code>OPCODE_SET = 1;</code>
   */
  OPCODE_SET(1),
  /**
   * <code>OPCODE_DELETE = 2;</code>
   */
  OPCODE_DELETE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OPCODE_UNKNOWN = 0;</code>
   */
  public static final int OPCODE_UNKNOWN_VALUE = 0;
  /**
   * <code>OPCODE_SET = 1;</code>
   */
  public static final int OPCODE_SET_VALUE = 1;
  /**
   * <code>OPCODE_DELETE = 2;</code>
   */
  public static final int OPCODE_DELETE_VALUE = 2;


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
  public static Opcode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Opcode forNumber(int value) {
    switch (value) {
      case 0: return OPCODE_UNKNOWN;
      case 1: return OPCODE_SET;
      case 2: return OPCODE_DELETE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Opcode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Opcode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Opcode>() {
          public Opcode findValueByNumber(int number) {
            return Opcode.forNumber(number);
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
    return com.aserto.directory.importer.v2.ImporterProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Opcode[] VALUES = values();

  public static Opcode valueOf(
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

  private Opcode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aserto.directory.importer.v2.Opcode)
}

