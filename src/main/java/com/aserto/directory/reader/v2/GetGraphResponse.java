// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

// Protobuf Java Version: 3.25.2
package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.GetGraphResponse}
 */
public final class GetGraphResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.GetGraphResponse)
    GetGraphResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGraphResponse.newBuilder() to construct.
  private GetGraphResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGraphResponse() {
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetGraphResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetGraphResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetGraphResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetGraphResponse.class, com.aserto.directory.reader.v2.GetGraphResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aserto.directory.common.v2.ObjectDependency> results_;
  /**
   * <pre>
   * dependency graph
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aserto.directory.common.v2.ObjectDependency> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * dependency graph
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aserto.directory.common.v2.ObjectDependencyOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * dependency graph
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * dependency graph
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectDependency getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * dependency graph
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectDependencyOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  public static com.aserto.directory.reader.v2.GetGraphResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetGraphResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetGraphResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetGraphResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetGraphResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetGraphResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetGraphResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetGraphResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.directory.reader.v2.GetGraphResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.directory.reader.v2.GetGraphResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetGraphResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetGraphResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.GetGraphResponse prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.GetGraphResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.GetGraphResponse)
      com.aserto.directory.reader.v2.GetGraphResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetGraphResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetGraphResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.GetGraphResponse.class, com.aserto.directory.reader.v2.GetGraphResponse.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.GetGraphResponse.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetGraphResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetGraphResponse getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.GetGraphResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetGraphResponse build() {
      com.aserto.directory.reader.v2.GetGraphResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetGraphResponse buildPartial() {
      com.aserto.directory.reader.v2.GetGraphResponse result = new com.aserto.directory.reader.v2.GetGraphResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aserto.directory.reader.v2.GetGraphResponse result) {
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

    private void buildPartial0(com.aserto.directory.reader.v2.GetGraphResponse result) {
      int from_bitField0_ = bitField0_;
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

    private java.util.List<com.aserto.directory.common.v2.ObjectDependency> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<com.aserto.directory.common.v2.ObjectDependency>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectDependency, com.aserto.directory.common.v2.ObjectDependency.Builder, com.aserto.directory.common.v2.ObjectDependencyOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public java.util.List<com.aserto.directory.common.v2.ObjectDependency> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
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
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.ObjectDependency getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public Builder setResults(
        int index, com.aserto.directory.common.v2.ObjectDependency value) {
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
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public Builder setResults(
        int index, com.aserto.directory.common.v2.ObjectDependency.Builder builderForValue) {
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
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(com.aserto.directory.common.v2.ObjectDependency value) {
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
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(
        int index, com.aserto.directory.common.v2.ObjectDependency value) {
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
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(
        com.aserto.directory.common.v2.ObjectDependency.Builder builderForValue) {
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
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public Builder addResults(
        int index, com.aserto.directory.common.v2.ObjectDependency.Builder builderForValue) {
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
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.aserto.directory.common.v2.ObjectDependency> values) {
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
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
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
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
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
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.ObjectDependency.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.ObjectDependencyOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public java.util.List<? extends com.aserto.directory.common.v2.ObjectDependencyOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.ObjectDependency.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.aserto.directory.common.v2.ObjectDependency.getDefaultInstance());
    }
    /**
     * <pre>
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public com.aserto.directory.common.v2.ObjectDependency.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.aserto.directory.common.v2.ObjectDependency.getDefaultInstance());
    }
    /**
     * <pre>
     * dependency graph
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectDependency results = 1 [json_name = "results"];</code>
     */
    public java.util.List<com.aserto.directory.common.v2.ObjectDependency.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectDependency, com.aserto.directory.common.v2.ObjectDependency.Builder, com.aserto.directory.common.v2.ObjectDependencyOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aserto.directory.common.v2.ObjectDependency, com.aserto.directory.common.v2.ObjectDependency.Builder, com.aserto.directory.common.v2.ObjectDependencyOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.GetGraphResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.GetGraphResponse)
  private static final com.aserto.directory.reader.v2.GetGraphResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.GetGraphResponse();
  }

  public static com.aserto.directory.reader.v2.GetGraphResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGraphResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetGraphResponse>() {
    @java.lang.Override
    public GetGraphResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetGraphResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetGraphResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.GetGraphResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

