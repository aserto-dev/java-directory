// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/schema/v3/tenant.proto

// Protobuf Java Version: 3.25.3
package com.aserto.directory.schema.v3;

/**
 * Protobuf enum {@code aserto.directory.schema.v3.TenantKind}
 */
public enum TenantKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TENANT_KIND_UNKNOWN = 0;</code>
   */
  TENANT_KIND_UNKNOWN(0),
  /**
   * <code>TENANT_KIND_ORGANIZATION = 1;</code>
   */
  TENANT_KIND_ORGANIZATION(1),
  /**
   * <pre>
   * personal tenant
   * </pre>
   *
   * <code>TENANT_KIND_ACCOUNT = 2;</code>
   */
  TENANT_KIND_ACCOUNT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TENANT_KIND_UNKNOWN = 0;</code>
   */
  public static final int TENANT_KIND_UNKNOWN_VALUE = 0;
  /**
   * <code>TENANT_KIND_ORGANIZATION = 1;</code>
   */
  public static final int TENANT_KIND_ORGANIZATION_VALUE = 1;
  /**
   * <pre>
   * personal tenant
   * </pre>
   *
   * <code>TENANT_KIND_ACCOUNT = 2;</code>
   */
  public static final int TENANT_KIND_ACCOUNT_VALUE = 2;


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
  public static TenantKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TenantKind forNumber(int value) {
    switch (value) {
      case 0: return TENANT_KIND_UNKNOWN;
      case 1: return TENANT_KIND_ORGANIZATION;
      case 2: return TENANT_KIND_ACCOUNT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TenantKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TenantKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TenantKind>() {
          public TenantKind findValueByNumber(int number) {
            return TenantKind.forNumber(number);
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
    return com.aserto.directory.schema.v3.TenantProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TenantKind[] VALUES = values();

  public static TenantKind valueOf(
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

  private TenantKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aserto.directory.schema.v3.TenantKind)
}

