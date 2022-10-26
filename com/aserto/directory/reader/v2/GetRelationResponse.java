// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.GetRelationResponse}
 */
public final class GetRelationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.GetRelationResponse)
    GetRelationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRelationResponse.newBuilder() to construct.
  private GetRelationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRelationResponse() {
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRelationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetRelationResponse.class, com.aserto.directory.reader.v2.GetRelationResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  private java.util.List<com.aserto.directory.common.v2.Relation> results_;
  /**
   * <pre>
   * array of relation instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aserto.directory.common.v2.Relation> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * array of relation instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aserto.directory.common.v2.RelationOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * array of relation instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * array of relation instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.Relation getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * array of relation instances
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  public static com.aserto.directory.reader.v2.GetRelationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetRelationResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.GetRelationResponse prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.GetRelationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.GetRelationResponse)
      com.aserto.directory.reader.v2.GetRelationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.GetRelationResponse.class, com.aserto.directory.reader.v2.GetRelationResponse.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.GetRelationResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
      } else {
        results_ = null;
        resultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetRelationResponse getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.GetRelationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetRelationResponse build() {
      com.aserto.directory.reader.v2.GetRelationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetRelationResponse buildPartial() {
      com.aserto.directory.reader.v2.GetRelationResponse result = new com.aserto.directory.reader.v2.GetRelationResponse(this);
      int from_bitField0_ = bitField0_;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
      onBuilt();
      return result;
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

    private java.util.List<com.aserto.directory.common.v2.Relation> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<com.aserto.directory.common.v2.Relation>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.directory.common.v2.Relation, com.aserto.directory.common.v2.Relation.Builder, com.aserto.directory.common.v2.RelationOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public java.util.List<com.aserto.directory.common.v2.Relation> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.Relation getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public Builder setResults(
        int index, com.aserto.directory.common.v2.Relation value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public Builder setResults(
        int index, com.aserto.directory.common.v2.Relation.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(com.aserto.directory.common.v2.Relation value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(
        int index, com.aserto.directory.common.v2.Relation value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(
        com.aserto.directory.common.v2.Relation.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(
        int index, com.aserto.directory.common.v2.Relation.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.aserto.directory.common.v2.Relation> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.Relation.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.RelationOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public java.util.List<? extends com.aserto.directory.common.v2.RelationOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.Relation.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.aserto.directory.common.v2.Relation.getDefaultInstance());
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.Relation.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.aserto.directory.common.v2.Relation.getDefaultInstance());
    }
    /**
     * <pre>
     * array of relation instances
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.Relation results = 1 [json_name = "results"];</code>
     */
    public java.util.List<com.aserto.directory.common.v2.Relation.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.directory.common.v2.Relation, com.aserto.directory.common.v2.Relation.Builder, com.aserto.directory.common.v2.RelationOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aserto.directory.common.v2.Relation, com.aserto.directory.common.v2.Relation.Builder, com.aserto.directory.common.v2.RelationOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.GetRelationResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.GetRelationResponse)
  private static final com.aserto.directory.reader.v2.GetRelationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.GetRelationResponse();
  }

  public static com.aserto.directory.reader.v2.GetRelationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRelationResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetRelationResponse>() {
    @java.lang.Override
    public GetRelationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetRelationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRelationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.GetRelationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

