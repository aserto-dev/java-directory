// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/importer/v3/importer.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.importer.v3;

/**
 * Protobuf type {@code aserto.directory.importer.v3.ImportResponse}
 */
public final class ImportResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.importer.v3.ImportResponse)
    ImportResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportResponse.newBuilder() to construct.
  private ImportResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.importer.v3.ImporterProto.internal_static_aserto_directory_importer_v3_ImportResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.importer.v3.ImporterProto.internal_static_aserto_directory_importer_v3_ImportResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.importer.v3.ImportResponse.class, com.aserto.directory.importer.v3.ImportResponse.Builder.class);
  }

  private int bitField0_;
  public static final int OBJECT_FIELD_NUMBER = 1;
  private com.aserto.directory.importer.v3.ImportCounter object_;
  /**
   * <pre>
   * object import counter
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * object import counter
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public com.aserto.directory.importer.v3.ImportCounter getObject() {
    return object_ == null ? com.aserto.directory.importer.v3.ImportCounter.getDefaultInstance() : object_;
  }
  /**
   * <pre>
   * object import counter
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.importer.v3.ImportCounterOrBuilder getObjectOrBuilder() {
    return object_ == null ? com.aserto.directory.importer.v3.ImportCounter.getDefaultInstance() : object_;
  }

  public static final int RELATION_FIELD_NUMBER = 2;
  private com.aserto.directory.importer.v3.ImportCounter relation_;
  /**
   * <pre>
   * relation import counter
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  @java.lang.Override
  public boolean hasRelation() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * relation import counter
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
   * @return The relation.
   */
  @java.lang.Override
  public com.aserto.directory.importer.v3.ImportCounter getRelation() {
    return relation_ == null ? com.aserto.directory.importer.v3.ImportCounter.getDefaultInstance() : relation_;
  }
  /**
   * <pre>
   * relation import counter
   * </pre>
   *
   * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.importer.v3.ImportCounterOrBuilder getRelationOrBuilder() {
    return relation_ == null ? com.aserto.directory.importer.v3.ImportCounter.getDefaultInstance() : relation_;
  }

  public static com.aserto.directory.importer.v3.ImportResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.importer.v3.ImportResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.importer.v3.ImportResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.importer.v3.ImportResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.importer.v3.ImportResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.importer.v3.ImportResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.importer.v3.ImportResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.importer.v3.ImportResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.importer.v3.ImportResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.importer.v3.ImportResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.importer.v3.ImportResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.importer.v3.ImportResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.importer.v3.ImportResponse prototype) {
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
   * Protobuf type {@code aserto.directory.importer.v3.ImportResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.importer.v3.ImportResponse)
      com.aserto.directory.importer.v3.ImportResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.importer.v3.ImporterProto.internal_static_aserto_directory_importer_v3_ImportResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.importer.v3.ImporterProto.internal_static_aserto_directory_importer_v3_ImportResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.importer.v3.ImportResponse.class, com.aserto.directory.importer.v3.ImportResponse.Builder.class);
    }

    // Construct using com.aserto.directory.importer.v3.ImportResponse.newBuilder()
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
        getObjectFieldBuilder();
        getRelationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      relation_ = null;
      if (relationBuilder_ != null) {
        relationBuilder_.dispose();
        relationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.importer.v3.ImporterProto.internal_static_aserto_directory_importer_v3_ImportResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.importer.v3.ImportResponse getDefaultInstanceForType() {
      return com.aserto.directory.importer.v3.ImportResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.importer.v3.ImportResponse build() {
      com.aserto.directory.importer.v3.ImportResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.importer.v3.ImportResponse buildPartial() {
      com.aserto.directory.importer.v3.ImportResponse result = new com.aserto.directory.importer.v3.ImportResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.importer.v3.ImportResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.object_ = objectBuilder_ == null
            ? object_
            : objectBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.relation_ = relationBuilder_ == null
            ? relation_
            : relationBuilder_.build();
        to_bitField0_ |= 0x00000002;
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

    private com.aserto.directory.importer.v3.ImportCounter object_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.importer.v3.ImportCounter, com.aserto.directory.importer.v3.ImportCounter.Builder, com.aserto.directory.importer.v3.ImportCounterOrBuilder> objectBuilder_;
    /**
     * <pre>
     * object import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * object import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
     * @return The object.
     */
    public com.aserto.directory.importer.v3.ImportCounter getObject() {
      if (objectBuilder_ == null) {
        return object_ == null ? com.aserto.directory.importer.v3.ImportCounter.getDefaultInstance() : object_;
      } else {
        return objectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * object import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
     */
    public Builder setObject(com.aserto.directory.importer.v3.ImportCounter value) {
      if (objectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        object_ = value;
      } else {
        objectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
     */
    public Builder setObject(
        com.aserto.directory.importer.v3.ImportCounter.Builder builderForValue) {
      if (objectBuilder_ == null) {
        object_ = builderForValue.build();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
     */
    public Builder mergeObject(com.aserto.directory.importer.v3.ImportCounter value) {
      if (objectBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          object_ != null &&
          object_ != com.aserto.directory.importer.v3.ImportCounter.getDefaultInstance()) {
          getObjectBuilder().mergeFrom(value);
        } else {
          object_ = value;
        }
      } else {
        objectBuilder_.mergeFrom(value);
      }
      if (object_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * object import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
     */
    public Builder clearObject() {
      bitField0_ = (bitField0_ & ~0x00000001);
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
     */
    public com.aserto.directory.importer.v3.ImportCounter.Builder getObjectBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * object import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
     */
    public com.aserto.directory.importer.v3.ImportCounterOrBuilder getObjectOrBuilder() {
      if (objectBuilder_ != null) {
        return objectBuilder_.getMessageOrBuilder();
      } else {
        return object_ == null ?
            com.aserto.directory.importer.v3.ImportCounter.getDefaultInstance() : object_;
      }
    }
    /**
     * <pre>
     * object import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter object = 1 [json_name = "object"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.importer.v3.ImportCounter, com.aserto.directory.importer.v3.ImportCounter.Builder, com.aserto.directory.importer.v3.ImportCounterOrBuilder> 
        getObjectFieldBuilder() {
      if (objectBuilder_ == null) {
        objectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.importer.v3.ImportCounter, com.aserto.directory.importer.v3.ImportCounter.Builder, com.aserto.directory.importer.v3.ImportCounterOrBuilder>(
                getObject(),
                getParentForChildren(),
                isClean());
        object_ = null;
      }
      return objectBuilder_;
    }

    private com.aserto.directory.importer.v3.ImportCounter relation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.importer.v3.ImportCounter, com.aserto.directory.importer.v3.ImportCounter.Builder, com.aserto.directory.importer.v3.ImportCounterOrBuilder> relationBuilder_;
    /**
     * <pre>
     * relation import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
     * @return Whether the relation field is set.
     */
    public boolean hasRelation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * relation import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
     * @return The relation.
     */
    public com.aserto.directory.importer.v3.ImportCounter getRelation() {
      if (relationBuilder_ == null) {
        return relation_ == null ? com.aserto.directory.importer.v3.ImportCounter.getDefaultInstance() : relation_;
      } else {
        return relationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * relation import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
     */
    public Builder setRelation(com.aserto.directory.importer.v3.ImportCounter value) {
      if (relationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relation_ = value;
      } else {
        relationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
     */
    public Builder setRelation(
        com.aserto.directory.importer.v3.ImportCounter.Builder builderForValue) {
      if (relationBuilder_ == null) {
        relation_ = builderForValue.build();
      } else {
        relationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
     */
    public Builder mergeRelation(com.aserto.directory.importer.v3.ImportCounter value) {
      if (relationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          relation_ != null &&
          relation_ != com.aserto.directory.importer.v3.ImportCounter.getDefaultInstance()) {
          getRelationBuilder().mergeFrom(value);
        } else {
          relation_ = value;
        }
      } else {
        relationBuilder_.mergeFrom(value);
      }
      if (relation_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * relation import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
     */
    public Builder clearRelation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      relation_ = null;
      if (relationBuilder_ != null) {
        relationBuilder_.dispose();
        relationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
     */
    public com.aserto.directory.importer.v3.ImportCounter.Builder getRelationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRelationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * relation import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
     */
    public com.aserto.directory.importer.v3.ImportCounterOrBuilder getRelationOrBuilder() {
      if (relationBuilder_ != null) {
        return relationBuilder_.getMessageOrBuilder();
      } else {
        return relation_ == null ?
            com.aserto.directory.importer.v3.ImportCounter.getDefaultInstance() : relation_;
      }
    }
    /**
     * <pre>
     * relation import counter
     * </pre>
     *
     * <code>.aserto.directory.importer.v3.ImportCounter relation = 2 [json_name = "relation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.importer.v3.ImportCounter, com.aserto.directory.importer.v3.ImportCounter.Builder, com.aserto.directory.importer.v3.ImportCounterOrBuilder> 
        getRelationFieldBuilder() {
      if (relationBuilder_ == null) {
        relationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.importer.v3.ImportCounter, com.aserto.directory.importer.v3.ImportCounter.Builder, com.aserto.directory.importer.v3.ImportCounterOrBuilder>(
                getRelation(),
                getParentForChildren(),
                isClean());
        relation_ = null;
      }
      return relationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.importer.v3.ImportResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.importer.v3.ImportResponse)
  private static final com.aserto.directory.importer.v3.ImportResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.importer.v3.ImportResponse();
  }

  public static com.aserto.directory.importer.v3.ImportResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportResponse>
      PARSER = new com.google.protobuf.AbstractParser<ImportResponse>() {
    @java.lang.Override
    public ImportResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.importer.v3.ImportResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

