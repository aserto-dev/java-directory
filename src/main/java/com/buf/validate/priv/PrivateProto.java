// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/priv/private.proto

// Protobuf Java Version: 3.25.1
package com.buf.validate.priv;

public final class PrivateProto {
  private PrivateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.buf.validate.priv.PrivateProto.field);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int FIELD_FIELD_NUMBER = 1160;
  /**
   * <pre>
   * Do not use. Internal to protovalidate library
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      com.buf.validate.priv.FieldConstraints> field = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.buf.validate.priv.FieldConstraints.class,
        com.buf.validate.priv.FieldConstraints.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_priv_FieldConstraints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_priv_FieldConstraints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_priv_Constraint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_buf_validate_priv_Constraint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037buf/validate/priv/private.proto\022\021buf.v" +
      "alidate.priv\032 google/protobuf/descriptor" +
      ".proto\"C\n\020FieldConstraints\022/\n\003cel\030\001 \003(\0132" +
      "\035.buf.validate.priv.ConstraintR\003cel\"V\n\nC" +
      "onstraint\022\016\n\002id\030\001 \001(\tR\002id\022\030\n\007message\030\002 \001" +
      "(\tR\007message\022\036\n\nexpression\030\003 \001(\tR\nexpress" +
      "ion:\\\n\005field\022\035.google.protobuf.FieldOpti" +
      "ons\030\210\t \001(\0132#.buf.validate.priv.FieldCons" +
      "traintsR\005field\210\001\001B\336\001\n\025com.buf.validate.p" +
      "rivB\014PrivateProtoH\002P\001ZLbuf.build/gen/go/" +
      "bufbuild/protovalidate/protocolbuffers/g" +
      "o/buf/validate/priv\370\001\000\242\002\003BVP\252\002\021Buf.Valid" +
      "ate.Priv\312\002\021Buf\\Validate\\Priv\342\002\035Buf\\Valid" +
      "ate\\Priv\\GPBMetadata\352\002\023Buf::Validate::Pr" +
      "ivb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_buf_validate_priv_FieldConstraints_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_priv_FieldConstraints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_priv_FieldConstraints_descriptor,
        new java.lang.String[] { "Cel", });
    internal_static_buf_validate_priv_Constraint_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_buf_validate_priv_Constraint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_buf_validate_priv_Constraint_descriptor,
        new java.lang.String[] { "Id", "Message", "Expression", });
    field.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}