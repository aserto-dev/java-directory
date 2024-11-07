// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/directory/reader/v2/reader.proto
// Protobuf Java Version: 4.28.3

package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.GetRelationsResponse}
 */
@java.lang.Deprecated public final class GetRelationsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.GetRelationsResponse)
    GetRelationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      GetRelationsResponse.class.getName());
  }
  // Use GetRelationsResponse.newBuilder() to construct.
  private GetRelationsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetRelationsResponse() {
    results_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetRelationsResponse.class, com.aserto.directory.reader.v2.GetRelationsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESULTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
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

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(1, results_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(9, getPage());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, results_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(9, getPage());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.aserto.directory.reader.v2.GetRelationsResponse)) {
      return super.equals(obj);
    }
    com.aserto.directory.reader.v2.GetRelationsResponse other = (com.aserto.directory.reader.v2.GetRelationsResponse) obj;

    if (!getResultsList()
        .equals(other.getResultsList())) return false;
    if (hasPage() != other.hasPage()) return false;
    if (hasPage()) {
      if (!getPage()
          .equals(other.getPage())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    if (hasPage()) {
      hash = (37 * hash) + PAGE_FIELD_NUMBER;
      hash = (53 * hash) + getPage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.directory.reader.v2.GetRelationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetRelationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetRelationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetRelationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetRelationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.reader.v2.GetRelationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.reader.v2.GetRelationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetRelationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetRelationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aserto.directory.reader.v2.GetRelationsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code aserto.directory.reader.v2.GetRelationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.GetRelationsResponse)
      com.aserto.directory.reader.v2.GetRelationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.GetRelationsResponse.class, com.aserto.directory.reader.v2.GetRelationsResponse.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.GetRelationsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
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
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationsResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetRelationsResponse getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.GetRelationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetRelationsResponse build() {
      com.aserto.directory.reader.v2.GetRelationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetRelationsResponse buildPartial() {
      com.aserto.directory.reader.v2.GetRelationsResponse result = new com.aserto.directory.reader.v2.GetRelationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aserto.directory.reader.v2.GetRelationsResponse result) {
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

    private void buildPartial0(com.aserto.directory.reader.v2.GetRelationsResponse result) {
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
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aserto.directory.reader.v2.GetRelationsResponse) {
        return mergeFrom((com.aserto.directory.reader.v2.GetRelationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.directory.reader.v2.GetRelationsResponse other) {
      if (other == com.aserto.directory.reader.v2.GetRelationsResponse.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
      }
      if (other.hasPage()) {
        mergePage(other.getPage());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.aserto.directory.common.v2.Relation m =
                  input.readMessage(
                      com.aserto.directory.common.v2.Relation.parser(),
                      extensionRegistry);
              if (resultsBuilder_ == null) {
                ensureResultsIsMutable();
                results_.add(m);
              } else {
                resultsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 74: {
              input.readMessage(
                  getPageFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 74
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
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

    private com.google.protobuf.RepeatedFieldBuilder<
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
    private com.google.protobuf.RepeatedFieldBuilder<
        com.aserto.directory.common.v2.Relation, com.aserto.directory.common.v2.Relation.Builder, com.aserto.directory.common.v2.RelationOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.aserto.directory.common.v2.Relation, com.aserto.directory.common.v2.Relation.Builder, com.aserto.directory.common.v2.RelationOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }

    private com.aserto.directory.common.v2.PaginationResponse page_;
    private com.google.protobuf.SingleFieldBuilder<
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
    private com.google.protobuf.SingleFieldBuilder<
        com.aserto.directory.common.v2.PaginationResponse, com.aserto.directory.common.v2.PaginationResponse.Builder, com.aserto.directory.common.v2.PaginationResponseOrBuilder> 
        getPageFieldBuilder() {
      if (pageBuilder_ == null) {
        pageBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.aserto.directory.common.v2.PaginationResponse, com.aserto.directory.common.v2.PaginationResponse.Builder, com.aserto.directory.common.v2.PaginationResponseOrBuilder>(
                getPage(),
                getParentForChildren(),
                isClean());
        page_ = null;
      }
      return pageBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.GetRelationsResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.GetRelationsResponse)
  private static final com.aserto.directory.reader.v2.GetRelationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.GetRelationsResponse();
  }

  public static com.aserto.directory.reader.v2.GetRelationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRelationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetRelationsResponse>() {
    @java.lang.Override
    public GetRelationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetRelationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRelationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.GetRelationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

