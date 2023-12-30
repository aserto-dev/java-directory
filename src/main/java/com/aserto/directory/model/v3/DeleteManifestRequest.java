// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/model/v3/model.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.model.v3;

/**
 * Protobuf type {@code aserto.directory.model.v3.DeleteManifestRequest}
 */
public final class DeleteManifestRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.model.v3.DeleteManifestRequest)
    DeleteManifestRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteManifestRequest.newBuilder() to construct.
  private DeleteManifestRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteManifestRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteManifestRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_DeleteManifestRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_DeleteManifestRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.model.v3.DeleteManifestRequest.class, com.aserto.directory.model.v3.DeleteManifestRequest.Builder.class);
  }

  private int bitField0_;
  public static final int EMPTY_FIELD_NUMBER = 1;
  private com.google.protobuf.Empty empty_;
  /**
   * <pre>
   * empty request
   * </pre>
   *
   * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
   * @return Whether the empty field is set.
   */
  @java.lang.Override
  public boolean hasEmpty() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * empty request
   * </pre>
   *
   * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
   * @return The empty.
   */
  @java.lang.Override
  public com.google.protobuf.Empty getEmpty() {
    return empty_ == null ? com.google.protobuf.Empty.getDefaultInstance() : empty_;
  }
  /**
   * <pre>
   * empty request
   * </pre>
   *
   * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.EmptyOrBuilder getEmptyOrBuilder() {
    return empty_ == null ? com.google.protobuf.Empty.getDefaultInstance() : empty_;
  }

  public static com.aserto.directory.model.v3.DeleteManifestRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.model.v3.DeleteManifestRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.DeleteManifestRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.model.v3.DeleteManifestRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.DeleteManifestRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.model.v3.DeleteManifestRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.DeleteManifestRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.model.v3.DeleteManifestRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.model.v3.DeleteManifestRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.model.v3.DeleteManifestRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.model.v3.DeleteManifestRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.model.v3.DeleteManifestRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aserto.directory.model.v3.DeleteManifestRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code aserto.directory.model.v3.DeleteManifestRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.model.v3.DeleteManifestRequest)
      com.aserto.directory.model.v3.DeleteManifestRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_DeleteManifestRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_DeleteManifestRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.model.v3.DeleteManifestRequest.class, com.aserto.directory.model.v3.DeleteManifestRequest.Builder.class);
    }

    // Construct using com.aserto.directory.model.v3.DeleteManifestRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getEmptyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      empty_ = null;
      if (emptyBuilder_ != null) {
        emptyBuilder_.dispose();
        emptyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.model.v3.ModelProto.internal_static_aserto_directory_model_v3_DeleteManifestRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.model.v3.DeleteManifestRequest getDefaultInstanceForType() {
      return com.aserto.directory.model.v3.DeleteManifestRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.model.v3.DeleteManifestRequest build() {
      com.aserto.directory.model.v3.DeleteManifestRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.model.v3.DeleteManifestRequest buildPartial() {
      com.aserto.directory.model.v3.DeleteManifestRequest result = new com.aserto.directory.model.v3.DeleteManifestRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.model.v3.DeleteManifestRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.empty_ = emptyBuilder_ == null
            ? empty_
            : emptyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private com.google.protobuf.Empty empty_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Empty, com.google.protobuf.Empty.Builder, com.google.protobuf.EmptyOrBuilder> emptyBuilder_;
    /**
     * <pre>
     * empty request
     * </pre>
     *
     * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
     * @return Whether the empty field is set.
     */
    public boolean hasEmpty() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * empty request
     * </pre>
     *
     * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
     * @return The empty.
     */
    public com.google.protobuf.Empty getEmpty() {
      if (emptyBuilder_ == null) {
        return empty_ == null ? com.google.protobuf.Empty.getDefaultInstance() : empty_;
      } else {
        return emptyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * empty request
     * </pre>
     *
     * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
     */
    public Builder setEmpty(com.google.protobuf.Empty value) {
      if (emptyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        empty_ = value;
      } else {
        emptyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * empty request
     * </pre>
     *
     * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
     */
    public Builder setEmpty(
        com.google.protobuf.Empty.Builder builderForValue) {
      if (emptyBuilder_ == null) {
        empty_ = builderForValue.build();
      } else {
        emptyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * empty request
     * </pre>
     *
     * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
     */
    public Builder mergeEmpty(com.google.protobuf.Empty value) {
      if (emptyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          empty_ != null &&
          empty_ != com.google.protobuf.Empty.getDefaultInstance()) {
          getEmptyBuilder().mergeFrom(value);
        } else {
          empty_ = value;
        }
      } else {
        emptyBuilder_.mergeFrom(value);
      }
      if (empty_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * empty request
     * </pre>
     *
     * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
     */
    public Builder clearEmpty() {
      bitField0_ = (bitField0_ & ~0x00000001);
      empty_ = null;
      if (emptyBuilder_ != null) {
        emptyBuilder_.dispose();
        emptyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * empty request
     * </pre>
     *
     * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
     */
    public com.google.protobuf.Empty.Builder getEmptyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEmptyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * empty request
     * </pre>
     *
     * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
     */
    public com.google.protobuf.EmptyOrBuilder getEmptyOrBuilder() {
      if (emptyBuilder_ != null) {
        return emptyBuilder_.getMessageOrBuilder();
      } else {
        return empty_ == null ?
            com.google.protobuf.Empty.getDefaultInstance() : empty_;
      }
    }
    /**
     * <pre>
     * empty request
     * </pre>
     *
     * <code>.google.protobuf.Empty empty = 1 [json_name = "empty"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Empty, com.google.protobuf.Empty.Builder, com.google.protobuf.EmptyOrBuilder> 
        getEmptyFieldBuilder() {
      if (emptyBuilder_ == null) {
        emptyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Empty, com.google.protobuf.Empty.Builder, com.google.protobuf.EmptyOrBuilder>(
                getEmpty(),
                getParentForChildren(),
                isClean());
        empty_ = null;
      }
      return emptyBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:aserto.directory.model.v3.DeleteManifestRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.model.v3.DeleteManifestRequest)
  private static final com.aserto.directory.model.v3.DeleteManifestRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.model.v3.DeleteManifestRequest();
  }

  public static com.aserto.directory.model.v3.DeleteManifestRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteManifestRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteManifestRequest>() {
    @java.lang.Override
    public DeleteManifestRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DeleteManifestRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteManifestRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.model.v3.DeleteManifestRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
