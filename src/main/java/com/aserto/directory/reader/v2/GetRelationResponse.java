// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.0
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

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetObjects();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetRelationResponse.class, com.aserto.directory.reader.v2.GetRelationResponse.Builder.class);
  }

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

  public static final int OBJECTS_FIELD_NUMBER = 2;
  private static final class ObjectsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.aserto.directory.common.v2.Object> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.aserto.directory.common.v2.Object>newDefaultInstance(
                com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetRelationResponse_ObjectsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.aserto.directory.common.v2.Object.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.aserto.directory.common.v2.Object> objects_;
  private com.google.protobuf.MapField<java.lang.String, com.aserto.directory.common.v2.Object>
  internalGetObjects() {
    if (objects_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ObjectsDefaultEntryHolder.defaultEntry);
    }
    return objects_;
  }
  public int getObjectsCount() {
    return internalGetObjects().getMap().size();
  }
  /**
   * <pre>
   * map of materialized relation objects
   * </pre>
   *
   * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public boolean containsObjects(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetObjects().getMap().containsKey(key);
  }
  /**
   * Use {@link #getObjectsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.aserto.directory.common.v2.Object> getObjects() {
    return getObjectsMap();
  }
  /**
   * <pre>
   * map of materialized relation objects
   * </pre>
   *
   * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.aserto.directory.common.v2.Object> getObjectsMap() {
    return internalGetObjects().getMap();
  }
  /**
   * <pre>
   * map of materialized relation objects
   * </pre>
   *
   * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public /* nullable */
com.aserto.directory.common.v2.Object getObjectsOrDefault(
      java.lang.String key,
      /* nullable */
com.aserto.directory.common.v2.Object defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.aserto.directory.common.v2.Object> map =
        internalGetObjects().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * map of materialized relation objects
   * </pre>
   *
   * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.Object getObjectsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.aserto.directory.common.v2.Object> map =
        internalGetObjects().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetObjects();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableObjects();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
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
      bitField0_ = 0;
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
      } else {
        results_ = null;
        resultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableObjects().clear();
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
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aserto.directory.reader.v2.GetRelationResponse result) {
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

    private void buildPartial0(com.aserto.directory.reader.v2.GetRelationResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.objects_ = internalGetObjects().build(ObjectsDefaultEntryHolder.defaultEntry);
      }
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

    private static final class ObjectsConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.String, com.aserto.directory.common.v2.ObjectOrBuilder, com.aserto.directory.common.v2.Object> {
      @java.lang.Override
      public com.aserto.directory.common.v2.Object build(com.aserto.directory.common.v2.ObjectOrBuilder val) {
        if (val instanceof com.aserto.directory.common.v2.Object) { return (com.aserto.directory.common.v2.Object) val; }
        return ((com.aserto.directory.common.v2.Object.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, com.aserto.directory.common.v2.Object> defaultEntry() {
        return ObjectsDefaultEntryHolder.defaultEntry;
      }
    };
    private static final ObjectsConverter objectsConverter = new ObjectsConverter();

    private com.google.protobuf.MapFieldBuilder<
        java.lang.String, com.aserto.directory.common.v2.ObjectOrBuilder, com.aserto.directory.common.v2.Object, com.aserto.directory.common.v2.Object.Builder> objects_;
    private com.google.protobuf.MapFieldBuilder<java.lang.String, com.aserto.directory.common.v2.ObjectOrBuilder, com.aserto.directory.common.v2.Object, com.aserto.directory.common.v2.Object.Builder>
        internalGetObjects() {
      if (objects_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(objectsConverter);
      }
      return objects_;
    }
    private com.google.protobuf.MapFieldBuilder<java.lang.String, com.aserto.directory.common.v2.ObjectOrBuilder, com.aserto.directory.common.v2.Object, com.aserto.directory.common.v2.Object.Builder>
        internalGetMutableObjects() {
      if (objects_ == null) {
        objects_ = new com.google.protobuf.MapFieldBuilder<>(objectsConverter);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return objects_;
    }
    public int getObjectsCount() {
      return internalGetObjects().ensureBuilderMap().size();
    }
    /**
     * <pre>
     * map of materialized relation objects
     * </pre>
     *
     * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
     */
    @java.lang.Override
    public boolean containsObjects(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetObjects().ensureBuilderMap().containsKey(key);
    }
    /**
     * Use {@link #getObjectsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.aserto.directory.common.v2.Object> getObjects() {
      return getObjectsMap();
    }
    /**
     * <pre>
     * map of materialized relation objects
     * </pre>
     *
     * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.aserto.directory.common.v2.Object> getObjectsMap() {
      return internalGetObjects().getImmutableMap();
    }
    /**
     * <pre>
     * map of materialized relation objects
     * </pre>
     *
     * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
     */
    @java.lang.Override
    public /* nullable */
com.aserto.directory.common.v2.Object getObjectsOrDefault(
        java.lang.String key,
        /* nullable */
com.aserto.directory.common.v2.Object defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.aserto.directory.common.v2.ObjectOrBuilder> map = internalGetMutableObjects().ensureBuilderMap();
      return map.containsKey(key) ? objectsConverter.build(map.get(key)) : defaultValue;
    }
    /**
     * <pre>
     * map of materialized relation objects
     * </pre>
     *
     * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
     */
    @java.lang.Override
    public com.aserto.directory.common.v2.Object getObjectsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.aserto.directory.common.v2.ObjectOrBuilder> map = internalGetMutableObjects().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return objectsConverter.build(map.get(key));
    }
    public Builder clearObjects() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableObjects().clear();
      return this;
    }
    /**
     * <pre>
     * map of materialized relation objects
     * </pre>
     *
     * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
     */
    public Builder removeObjects(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableObjects().ensureBuilderMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.aserto.directory.common.v2.Object>
        getMutableObjects() {
      bitField0_ |= 0x00000002;
      return internalGetMutableObjects().ensureMessageMap();
    }
    /**
     * <pre>
     * map of materialized relation objects
     * </pre>
     *
     * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
     */
    public Builder putObjects(
        java.lang.String key,
        com.aserto.directory.common.v2.Object value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableObjects().ensureBuilderMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * map of materialized relation objects
     * </pre>
     *
     * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
     */
    public Builder putAllObjects(
        java.util.Map<java.lang.String, com.aserto.directory.common.v2.Object> values) {
      for (java.util.Map.Entry<java.lang.String, com.aserto.directory.common.v2.Object> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableObjects().ensureBuilderMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <pre>
     * map of materialized relation objects
     * </pre>
     *
     * <code>map&lt;string, .aserto.directory.common.v2.Object&gt; objects = 2 [json_name = "objects"];</code>
     */
    public com.aserto.directory.common.v2.Object.Builder putObjectsBuilderIfAbsent(
        java.lang.String key) {
      java.util.Map<java.lang.String, com.aserto.directory.common.v2.ObjectOrBuilder> builderMap = internalGetMutableObjects().ensureBuilderMap();
      com.aserto.directory.common.v2.ObjectOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.aserto.directory.common.v2.Object.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.aserto.directory.common.v2.Object) {
        entry = ((com.aserto.directory.common.v2.Object) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.aserto.directory.common.v2.Object.Builder) entry;
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

