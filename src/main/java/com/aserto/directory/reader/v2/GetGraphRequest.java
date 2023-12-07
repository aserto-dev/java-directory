// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.1
package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.GetGraphRequest}
 */
public final class GetGraphRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.GetGraphRequest)
    GetGraphRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGraphRequest.newBuilder() to construct.
  private GetGraphRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGraphRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetGraphRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetGraphRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetGraphRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetGraphRequest.class, com.aserto.directory.reader.v2.GetGraphRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ANCHOR_FIELD_NUMBER = 1;
  private com.aserto.directory.common.v2.ObjectIdentifier anchor_;
  /**
   * <pre>
   * anchor selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
   * @return Whether the anchor field is set.
   */
  @java.lang.Override
  public boolean hasAnchor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * anchor selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
   * @return The anchor.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifier getAnchor() {
    return anchor_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : anchor_;
  }
  /**
   * <pre>
   * anchor selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getAnchorOrBuilder() {
    return anchor_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : anchor_;
  }

  public static final int SUBJECT_FIELD_NUMBER = 2;
  private com.aserto.directory.common.v2.ObjectIdentifier subject_;
  /**
   * <pre>
   * subject selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
   * @return Whether the subject field is set.
   */
  @java.lang.Override
  public boolean hasSubject() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * subject selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
   * @return The subject.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifier getSubject() {
    return subject_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : subject_;
  }
  /**
   * <pre>
   * subject selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getSubjectOrBuilder() {
    return subject_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : subject_;
  }

  public static final int RELATION_FIELD_NUMBER = 3;
  private com.aserto.directory.common.v2.RelationTypeIdentifier relation_;
  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
   * @return Whether the relation field is set.
   */
  @java.lang.Override
  public boolean hasRelation() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
   * @return The relation.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationTypeIdentifier getRelation() {
    return relation_ == null ? com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : relation_;
  }
  /**
   * <pre>
   * relation selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder getRelationOrBuilder() {
    return relation_ == null ? com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : relation_;
  }

  public static final int OBJECT_FIELD_NUMBER = 4;
  private com.aserto.directory.common.v2.ObjectIdentifier object_;
  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
   * @return Whether the object field is set.
   */
  @java.lang.Override
  public boolean hasObject() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifier getObject() {
    return object_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : object_;
  }
  /**
   * <pre>
   * object selector
   * </pre>
   *
   * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getObjectOrBuilder() {
    return object_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : object_;
  }

  public static com.aserto.directory.reader.v2.GetGraphRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetGraphRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetGraphRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetGraphRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetGraphRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetGraphRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetGraphRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetGraphRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.reader.v2.GetGraphRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.reader.v2.GetGraphRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetGraphRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetGraphRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.GetGraphRequest prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.GetGraphRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.GetGraphRequest)
      com.aserto.directory.reader.v2.GetGraphRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetGraphRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetGraphRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.GetGraphRequest.class, com.aserto.directory.reader.v2.GetGraphRequest.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.GetGraphRequest.newBuilder()
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
        getAnchorFieldBuilder();
        getSubjectFieldBuilder();
        getRelationFieldBuilder();
        getObjectFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      anchor_ = null;
      if (anchorBuilder_ != null) {
        anchorBuilder_.dispose();
        anchorBuilder_ = null;
      }
      subject_ = null;
      if (subjectBuilder_ != null) {
        subjectBuilder_.dispose();
        subjectBuilder_ = null;
      }
      relation_ = null;
      if (relationBuilder_ != null) {
        relationBuilder_.dispose();
        relationBuilder_ = null;
      }
      object_ = null;
      if (objectBuilder_ != null) {
        objectBuilder_.dispose();
        objectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetGraphRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetGraphRequest getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.GetGraphRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetGraphRequest build() {
      com.aserto.directory.reader.v2.GetGraphRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetGraphRequest buildPartial() {
      com.aserto.directory.reader.v2.GetGraphRequest result = new com.aserto.directory.reader.v2.GetGraphRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.reader.v2.GetGraphRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.anchor_ = anchorBuilder_ == null
            ? anchor_
            : anchorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subject_ = subjectBuilder_ == null
            ? subject_
            : subjectBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.relation_ = relationBuilder_ == null
            ? relation_
            : relationBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.object_ = objectBuilder_ == null
            ? object_
            : objectBuilder_.build();
        to_bitField0_ |= 0x00000008;
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

    private com.aserto.directory.common.v2.ObjectIdentifier anchor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> anchorBuilder_;
    /**
     * <pre>
     * anchor selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
     * @return Whether the anchor field is set.
     */
    public boolean hasAnchor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * anchor selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
     * @return The anchor.
     */
    public com.aserto.directory.common.v2.ObjectIdentifier getAnchor() {
      if (anchorBuilder_ == null) {
        return anchor_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : anchor_;
      } else {
        return anchorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * anchor selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
     */
    public Builder setAnchor(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (anchorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        anchor_ = value;
      } else {
        anchorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * anchor selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
     */
    public Builder setAnchor(
        com.aserto.directory.common.v2.ObjectIdentifier.Builder builderForValue) {
      if (anchorBuilder_ == null) {
        anchor_ = builderForValue.build();
      } else {
        anchorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * anchor selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
     */
    public Builder mergeAnchor(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (anchorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          anchor_ != null &&
          anchor_ != com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance()) {
          getAnchorBuilder().mergeFrom(value);
        } else {
          anchor_ = value;
        }
      } else {
        anchorBuilder_.mergeFrom(value);
      }
      if (anchor_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * anchor selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
     */
    public Builder clearAnchor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      anchor_ = null;
      if (anchorBuilder_ != null) {
        anchorBuilder_.dispose();
        anchorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * anchor selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifier.Builder getAnchorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAnchorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * anchor selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getAnchorOrBuilder() {
      if (anchorBuilder_ != null) {
        return anchorBuilder_.getMessageOrBuilder();
      } else {
        return anchor_ == null ?
            com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : anchor_;
      }
    }
    /**
     * <pre>
     * anchor selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier anchor = 1 [json_name = "anchor"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> 
        getAnchorFieldBuilder() {
      if (anchorBuilder_ == null) {
        anchorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder>(
                getAnchor(),
                getParentForChildren(),
                isClean());
        anchor_ = null;
      }
      return anchorBuilder_;
    }

    private com.aserto.directory.common.v2.ObjectIdentifier subject_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> subjectBuilder_;
    /**
     * <pre>
     * subject selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
     * @return Whether the subject field is set.
     */
    public boolean hasSubject() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * subject selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
     * @return The subject.
     */
    public com.aserto.directory.common.v2.ObjectIdentifier getSubject() {
      if (subjectBuilder_ == null) {
        return subject_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : subject_;
      } else {
        return subjectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * subject selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
     */
    public Builder setSubject(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (subjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subject_ = value;
      } else {
        subjectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
     */
    public Builder setSubject(
        com.aserto.directory.common.v2.ObjectIdentifier.Builder builderForValue) {
      if (subjectBuilder_ == null) {
        subject_ = builderForValue.build();
      } else {
        subjectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
     */
    public Builder mergeSubject(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (subjectBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          subject_ != null &&
          subject_ != com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance()) {
          getSubjectBuilder().mergeFrom(value);
        } else {
          subject_ = value;
        }
      } else {
        subjectBuilder_.mergeFrom(value);
      }
      if (subject_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * subject selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
     */
    public Builder clearSubject() {
      bitField0_ = (bitField0_ & ~0x00000002);
      subject_ = null;
      if (subjectBuilder_ != null) {
        subjectBuilder_.dispose();
        subjectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * subject selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifier.Builder getSubjectBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSubjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * subject selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getSubjectOrBuilder() {
      if (subjectBuilder_ != null) {
        return subjectBuilder_.getMessageOrBuilder();
      } else {
        return subject_ == null ?
            com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : subject_;
      }
    }
    /**
     * <pre>
     * subject selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier subject = 2 [json_name = "subject"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> 
        getSubjectFieldBuilder() {
      if (subjectBuilder_ == null) {
        subjectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder>(
                getSubject(),
                getParentForChildren(),
                isClean());
        subject_ = null;
      }
      return subjectBuilder_;
    }

    private com.aserto.directory.common.v2.RelationTypeIdentifier relation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.RelationTypeIdentifier, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder, com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder> relationBuilder_;
    /**
     * <pre>
     * relation selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
     * @return Whether the relation field is set.
     */
    public boolean hasRelation() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * relation selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
     * @return The relation.
     */
    public com.aserto.directory.common.v2.RelationTypeIdentifier getRelation() {
      if (relationBuilder_ == null) {
        return relation_ == null ? com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : relation_;
      } else {
        return relationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * relation selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
     */
    public Builder setRelation(com.aserto.directory.common.v2.RelationTypeIdentifier value) {
      if (relationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relation_ = value;
      } else {
        relationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
     */
    public Builder setRelation(
        com.aserto.directory.common.v2.RelationTypeIdentifier.Builder builderForValue) {
      if (relationBuilder_ == null) {
        relation_ = builderForValue.build();
      } else {
        relationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * relation selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
     */
    public Builder mergeRelation(com.aserto.directory.common.v2.RelationTypeIdentifier value) {
      if (relationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          relation_ != null &&
          relation_ != com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance()) {
          getRelationBuilder().mergeFrom(value);
        } else {
          relation_ = value;
        }
      } else {
        relationBuilder_.mergeFrom(value);
      }
      if (relation_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * relation selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
     */
    public Builder clearRelation() {
      bitField0_ = (bitField0_ & ~0x00000004);
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
     * relation selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
     */
    public com.aserto.directory.common.v2.RelationTypeIdentifier.Builder getRelationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRelationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * relation selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
     */
    public com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder getRelationOrBuilder() {
      if (relationBuilder_ != null) {
        return relationBuilder_.getMessageOrBuilder();
      } else {
        return relation_ == null ?
            com.aserto.directory.common.v2.RelationTypeIdentifier.getDefaultInstance() : relation_;
      }
    }
    /**
     * <pre>
     * relation selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.RelationTypeIdentifier relation = 3 [json_name = "relation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.RelationTypeIdentifier, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder, com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder> 
        getRelationFieldBuilder() {
      if (relationBuilder_ == null) {
        relationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.RelationTypeIdentifier, com.aserto.directory.common.v2.RelationTypeIdentifier.Builder, com.aserto.directory.common.v2.RelationTypeIdentifierOrBuilder>(
                getRelation(),
                getParentForChildren(),
                isClean());
        relation_ = null;
      }
      return relationBuilder_;
    }

    private com.aserto.directory.common.v2.ObjectIdentifier object_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> objectBuilder_;
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
     * @return Whether the object field is set.
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
     * @return The object.
     */
    public com.aserto.directory.common.v2.ObjectIdentifier getObject() {
      if (objectBuilder_ == null) {
        return object_ == null ? com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : object_;
      } else {
        return objectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
     */
    public Builder setObject(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (objectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        object_ = value;
      } else {
        objectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
     */
    public Builder setObject(
        com.aserto.directory.common.v2.ObjectIdentifier.Builder builderForValue) {
      if (objectBuilder_ == null) {
        object_ = builderForValue.build();
      } else {
        objectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
     */
    public Builder mergeObject(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (objectBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          object_ != null &&
          object_ != com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance()) {
          getObjectBuilder().mergeFrom(value);
        } else {
          object_ = value;
        }
      } else {
        objectBuilder_.mergeFrom(value);
      }
      if (object_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
     */
    public Builder clearObject() {
      bitField0_ = (bitField0_ & ~0x00000008);
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
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifier.Builder getObjectBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getObjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getObjectOrBuilder() {
      if (objectBuilder_ != null) {
        return objectBuilder_.getMessageOrBuilder();
      } else {
        return object_ == null ?
            com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance() : object_;
      }
    }
    /**
     * <pre>
     * object selector
     * </pre>
     *
     * <code>.aserto.directory.common.v2.ObjectIdentifier object = 4 [json_name = "object"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> 
        getObjectFieldBuilder() {
      if (objectBuilder_ == null) {
        objectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder>(
                getObject(),
                getParentForChildren(),
                isClean());
        object_ = null;
      }
      return objectBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.GetGraphRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.GetGraphRequest)
  private static final com.aserto.directory.reader.v2.GetGraphRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.GetGraphRequest();
  }

  public static com.aserto.directory.reader.v2.GetGraphRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGraphRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetGraphRequest>() {
    @java.lang.Override
    public GetGraphRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetGraphRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGraphRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.GetGraphRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

