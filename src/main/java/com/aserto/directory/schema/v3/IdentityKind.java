// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v3/identity.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.schema.v3;

/**
 * Protobuf enum {@code aserto.directory.schema.v3.IdentityKind}
 */
public enum IdentityKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * undefined state
   * </pre>
   *
   * <code>IDENTITY_KIND_UNKNOWN = 0;</code>
   */
  IDENTITY_KIND_UNKNOWN(0),
  /**
   * <pre>
   * provider unique identifier
   * </pre>
   *
   * <code>IDENTITY_KIND_PID = 1;</code>
   */
  IDENTITY_KIND_PID(1),
  /**
   * <pre>
   * email address
   * </pre>
   *
   * <code>IDENTITY_KIND_EMAIL = 2;</code>
   */
  IDENTITY_KIND_EMAIL(2),
  /**
   * <pre>
   * username
   * </pre>
   *
   * <code>IDENTITY_KIND_USERNAME = 3;</code>
   */
  IDENTITY_KIND_USERNAME(3),
  /**
   * <pre>
   * distinguished name format RFC1779
   * </pre>
   *
   * <code>IDENTITY_KIND_DN = 4;</code>
   */
  IDENTITY_KIND_DN(4),
  /**
   * <pre>
   * phone number using the format described in RFC3966, using the E.164 recommendation
   * </pre>
   *
   * <code>IDENTITY_KIND_PHONE = 5;</code>
   */
  IDENTITY_KIND_PHONE(5),
  /**
   * <pre>
   * employee identifier
   * </pre>
   *
   * <code>IDENTITY_KIND_EMPID = 6;</code>
   */
  IDENTITY_KIND_EMPID(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * undefined state
   * </pre>
   *
   * <code>IDENTITY_KIND_UNKNOWN = 0;</code>
   */
  public static final int IDENTITY_KIND_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * provider unique identifier
   * </pre>
   *
   * <code>IDENTITY_KIND_PID = 1;</code>
   */
  public static final int IDENTITY_KIND_PID_VALUE = 1;
  /**
   * <pre>
   * email address
   * </pre>
   *
   * <code>IDENTITY_KIND_EMAIL = 2;</code>
   */
  public static final int IDENTITY_KIND_EMAIL_VALUE = 2;
  /**
   * <pre>
   * username
   * </pre>
   *
   * <code>IDENTITY_KIND_USERNAME = 3;</code>
   */
  public static final int IDENTITY_KIND_USERNAME_VALUE = 3;
  /**
   * <pre>
   * distinguished name format RFC1779
   * </pre>
   *
   * <code>IDENTITY_KIND_DN = 4;</code>
   */
  public static final int IDENTITY_KIND_DN_VALUE = 4;
  /**
   * <pre>
   * phone number using the format described in RFC3966, using the E.164 recommendation
   * </pre>
   *
   * <code>IDENTITY_KIND_PHONE = 5;</code>
   */
  public static final int IDENTITY_KIND_PHONE_VALUE = 5;
  /**
   * <pre>
   * employee identifier
   * </pre>
   *
   * <code>IDENTITY_KIND_EMPID = 6;</code>
   */
  public static final int IDENTITY_KIND_EMPID_VALUE = 6;


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
  public static IdentityKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IdentityKind forNumber(int value) {
    switch (value) {
      case 0: return IDENTITY_KIND_UNKNOWN;
      case 1: return IDENTITY_KIND_PID;
      case 2: return IDENTITY_KIND_EMAIL;
      case 3: return IDENTITY_KIND_USERNAME;
      case 4: return IDENTITY_KIND_DN;
      case 5: return IDENTITY_KIND_PHONE;
      case 6: return IDENTITY_KIND_EMPID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IdentityKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IdentityKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IdentityKind>() {
          public IdentityKind findValueByNumber(int number) {
            return IdentityKind.forNumber(number);
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
    return com.aserto.directory.schema.v3.IdentityProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final IdentityKind[] VALUES = values();

  public static IdentityKind valueOf(
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

  private IdentityKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aserto.directory.schema.v3.IdentityKind)
}

