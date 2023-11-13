// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.0
package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.GetRelationTypesResponse}
 */
public final class GetRelationTypesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.GetRelationTypesResponse)
    GetRelationTypesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRelationTypesResponse.newBuilder() to construct.
  private GetRelationTypesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRelationTypesResponse() {
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRelationTypesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationTypesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationTypesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetRelationTypesResponse.class, com.aserto.directory.reader.v2.GetRelationTypesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESULTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aserto.directory.common.v2.RelationType> results_;
  /**
   * <pre>
   * array of relation types
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aserto.directory.common.v2.RelationType> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * array of relation types
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aserto.directory.common.v2.RelationTypeOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * array of relation types
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * array of relation types
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationType getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * array of relation types
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.RelationTypeOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  public static final int PAGE_FIELD_NUMBER = 9;
  private com.aserto.directory.common.v2.PaginationResponse page_;
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
   * @return Whether the page field is set.
   */
  @java.lang.Override
  public boolean hasPage() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
   * @return The page.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.PaginationResponse getPage() {
    return page_ == null ? com.aserto.directory.common.v2.PaginationResponse.getDefaultInstance() : page_;
  }
  /**
   * <pre>
   * pagination response
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.PaginationResponseOrBuilder getPageOrBuilder() {
    return page_ == null ? com.aserto.directory.common.v2.PaginationResponse.getDefaultInstance() : page_;
  }

  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetRelationTypesResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.GetRelationTypesResponse prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.GetRelationTypesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.GetRelationTypesResponse)
      com.aserto.directory.reader.v2.GetRelationTypesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationTypesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationTypesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.GetRelationTypesResponse.class, com.aserto.directory.reader.v2.GetRelationTypesResponse.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.GetRelationTypesResponse.newBuilder()
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
        getResultsFieldBuilder();
        getPageFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
      } else {
        results_ = null;
        resultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      page_ = null;
      if (pageBuilder_ != null) {
        pageBuilder_.dispose();
        pageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationTypesResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetRelationTypesResponse getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.GetRelationTypesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetRelationTypesResponse build() {
      com.aserto.directory.reader.v2.GetRelationTypesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetRelationTypesResponse buildPartial() {
      com.aserto.directory.reader.v2.GetRelationTypesResponse result = new com.aserto.directory.reader.v2.GetRelationTypesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aserto.directory.reader.v2.GetRelationTypesResponse result) {
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
    }

    private void buildPartial0(com.aserto.directory.reader.v2.GetRelationTypesResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.page_ = pageBuilder_ == null
            ? page_
            : pageBuilder_.build();
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

    private java.util.List<com.aserto.directory.common.v2.RelationType> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<com.aserto.directory.common.v2.RelationType>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.directory.common.v2.RelationType, com.aserto.directory.common.v2.RelationType.Builder, com.aserto.directory.common.v2.RelationTypeOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public java.util.List<com.aserto.directory.common.v2.RelationType> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
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
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.RelationType getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public Builder setResults(
        int index, com.aserto.directory.common.v2.RelationType value) {
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
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public Builder setResults(
        int index, com.aserto.directory.common.v2.RelationType.Builder builderForValue) {
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
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(com.aserto.directory.common.v2.RelationType value) {
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
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(
        int index, com.aserto.directory.common.v2.RelationType value) {
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
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(
        com.aserto.directory.common.v2.RelationType.Builder builderForValue) {
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
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(
        int index, com.aserto.directory.common.v2.RelationType.Builder builderForValue) {
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
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.aserto.directory.common.v2.RelationType> values) {
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
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
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
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
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
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.RelationType.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.RelationTypeOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public java.util.List<? extends com.aserto.directory.common.v2.RelationTypeOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.RelationType.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.aserto.directory.common.v2.RelationType.getDefaultInstance());
    }
    /**
     * <pre>
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.RelationType.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.aserto.directory.common.v2.RelationType.getDefaultInstance());
    }
    /**
     * <pre>
     * array of relation types
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.RelationType results = 1 [json_name = "results"];</code>
     */
    public java.util.List<com.aserto.directory.common.v2.RelationType.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.directory.common.v2.RelationType, com.aserto.directory.common.v2.RelationType.Builder, com.aserto.directory.common.v2.RelationTypeOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aserto.directory.common.v2.RelationType, com.aserto.directory.common.v2.RelationType.Builder, com.aserto.directory.common.v2.RelationTypeOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }

    private com.aserto.directory.common.v2.PaginationResponse page_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.PaginationResponse, com.aserto.directory.common.v2.PaginationResponse.Builder, com.aserto.directory.common.v2.PaginationResponseOrBuilder> pageBuilder_;
    /**
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
     * @return Whether the page field is set.
     */
    public boolean hasPage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
     * @return The page.
     */
    public com.aserto.directory.common.v2.PaginationResponse getPage() {
      if (pageBuilder_ == null) {
        return page_ == null ? com.aserto.directory.common.v2.PaginationResponse.getDefaultInstance() : page_;
      } else {
        return pageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
     */
    public Builder setPage(com.aserto.directory.common.v2.PaginationResponse value) {
      if (pageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        page_ = value;
      } else {
        pageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
     */
    public Builder setPage(
        com.aserto.directory.common.v2.PaginationResponse.Builder builderForValue) {
      if (pageBuilder_ == null) {
        page_ = builderForValue.build();
      } else {
        pageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
     */
    public Builder mergePage(com.aserto.directory.common.v2.PaginationResponse value) {
      if (pageBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          page_ != null &&
          page_ != com.aserto.directory.common.v2.PaginationResponse.getDefaultInstance()) {
          getPageBuilder().mergeFrom(value);
        } else {
          page_ = value;
        }
      } else {
        pageBuilder_.mergeFrom(value);
      }
      if (page_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      page_ = null;
      if (pageBuilder_ != null) {
        pageBuilder_.dispose();
        pageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
     */
    public com.aserto.directory.common.v2.PaginationResponse.Builder getPageBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
     */
    public com.aserto.directory.common.v2.PaginationResponseOrBuilder getPageOrBuilder() {
      if (pageBuilder_ != null) {
        return pageBuilder_.getMessageOrBuilder();
      } else {
        return page_ == null ?
            com.aserto.directory.common.v2.PaginationResponse.getDefaultInstance() : page_;
      }
    }
    /**
     * <pre>
     * pagination response
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationResponse page = 9 [json_name = "page"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.PaginationResponse, com.aserto.directory.common.v2.PaginationResponse.Builder, com.aserto.directory.common.v2.PaginationResponseOrBuilder> 
        getPageFieldBuilder() {
      if (pageBuilder_ == null) {
        pageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.PaginationResponse, com.aserto.directory.common.v2.PaginationResponse.Builder, com.aserto.directory.common.v2.PaginationResponseOrBuilder>(
                getPage(),
                getParentForChildren(),
                isClean());
        page_ = null;
      }
      return pageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.GetRelationTypesResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.GetRelationTypesResponse)
  private static final com.aserto.directory.reader.v2.GetRelationTypesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.GetRelationTypesResponse();
  }

  public static com.aserto.directory.reader.v2.GetRelationTypesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRelationTypesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetRelationTypesResponse>() {
    @java.lang.Override
    public GetRelationTypesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetRelationTypesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRelationTypesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.GetRelationTypesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

