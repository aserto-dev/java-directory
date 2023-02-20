// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.GetObjectManyRequest}
 */
public final class GetObjectManyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.GetObjectManyRequest)
    GetObjectManyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetObjectManyRequest.newBuilder() to construct.
  private GetObjectManyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetObjectManyRequest() {
    param_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetObjectManyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectManyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectManyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetObjectManyRequest.class, com.aserto.directory.reader.v2.GetObjectManyRequest.Builder.class);
  }

  public static final int PARAM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aserto.directory.common.v2.ObjectIdentifier> param_;
  /**
   * <pre>
   * object identifier list
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aserto.directory.common.v2.ObjectIdentifier> getParamList() {
    return param_;
  }
  /**
   * <pre>
   * object identifier list
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> 
      getParamOrBuilderList() {
    return param_;
  }
  /**
   * <pre>
   * object identifier list
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  @java.lang.Override
  public int getParamCount() {
    return param_.size();
  }
  /**
   * <pre>
   * object identifier list
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifier getParam(int index) {
    return param_.get(index);
  }
  /**
   * <pre>
   * object identifier list
   * </pre>
   *
   * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getParamOrBuilder(
      int index) {
    return param_.get(index);
  }

  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetObjectManyRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.GetObjectManyRequest prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.GetObjectManyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.GetObjectManyRequest)
      com.aserto.directory.reader.v2.GetObjectManyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectManyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectManyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.GetObjectManyRequest.class, com.aserto.directory.reader.v2.GetObjectManyRequest.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.GetObjectManyRequest.newBuilder()
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
      if (paramBuilder_ == null) {
        param_ = java.util.Collections.emptyList();
      } else {
        param_ = null;
        paramBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectManyRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetObjectManyRequest getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.GetObjectManyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetObjectManyRequest build() {
      com.aserto.directory.reader.v2.GetObjectManyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetObjectManyRequest buildPartial() {
      com.aserto.directory.reader.v2.GetObjectManyRequest result = new com.aserto.directory.reader.v2.GetObjectManyRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aserto.directory.reader.v2.GetObjectManyRequest result) {
      if (paramBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          param_ = java.util.Collections.unmodifiableList(param_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.param_ = param_;
      } else {
        result.param_ = paramBuilder_.build();
      }
    }

    private void buildPartial0(com.aserto.directory.reader.v2.GetObjectManyRequest result) {
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

    private java.util.List<com.aserto.directory.common.v2.ObjectIdentifier> param_ =
      java.util.Collections.emptyList();
    private void ensureParamIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        param_ = new java.util.ArrayList<com.aserto.directory.common.v2.ObjectIdentifier>(param_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> paramBuilder_;

    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public java.util.List<com.aserto.directory.common.v2.ObjectIdentifier> getParamList() {
      if (paramBuilder_ == null) {
        return java.util.Collections.unmodifiableList(param_);
      } else {
        return paramBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public int getParamCount() {
      if (paramBuilder_ == null) {
        return param_.size();
      } else {
        return paramBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifier getParam(int index) {
      if (paramBuilder_ == null) {
        return param_.get(index);
      } else {
        return paramBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder setParam(
        int index, com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (paramBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamIsMutable();
        param_.set(index, value);
        onChanged();
      } else {
        paramBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder setParam(
        int index, com.aserto.directory.common.v2.ObjectIdentifier.Builder builderForValue) {
      if (paramBuilder_ == null) {
        ensureParamIsMutable();
        param_.set(index, builderForValue.build());
        onChanged();
      } else {
        paramBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder addParam(com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (paramBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamIsMutable();
        param_.add(value);
        onChanged();
      } else {
        paramBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder addParam(
        int index, com.aserto.directory.common.v2.ObjectIdentifier value) {
      if (paramBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParamIsMutable();
        param_.add(index, value);
        onChanged();
      } else {
        paramBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder addParam(
        com.aserto.directory.common.v2.ObjectIdentifier.Builder builderForValue) {
      if (paramBuilder_ == null) {
        ensureParamIsMutable();
        param_.add(builderForValue.build());
        onChanged();
      } else {
        paramBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder addParam(
        int index, com.aserto.directory.common.v2.ObjectIdentifier.Builder builderForValue) {
      if (paramBuilder_ == null) {
        ensureParamIsMutable();
        param_.add(index, builderForValue.build());
        onChanged();
      } else {
        paramBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder addAllParam(
        java.lang.Iterable<? extends com.aserto.directory.common.v2.ObjectIdentifier> values) {
      if (paramBuilder_ == null) {
        ensureParamIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, param_);
        onChanged();
      } else {
        paramBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder clearParam() {
      if (paramBuilder_ == null) {
        param_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        paramBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public Builder removeParam(int index) {
      if (paramBuilder_ == null) {
        ensureParamIsMutable();
        param_.remove(index);
        onChanged();
      } else {
        paramBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifier.Builder getParamBuilder(
        int index) {
      return getParamFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifierOrBuilder getParamOrBuilder(
        int index) {
      if (paramBuilder_ == null) {
        return param_.get(index);  } else {
        return paramBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public java.util.List<? extends com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> 
         getParamOrBuilderList() {
      if (paramBuilder_ != null) {
        return paramBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(param_);
      }
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifier.Builder addParamBuilder() {
      return getParamFieldBuilder().addBuilder(
          com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance());
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public com.aserto.directory.common.v2.ObjectIdentifier.Builder addParamBuilder(
        int index) {
      return getParamFieldBuilder().addBuilder(
          index, com.aserto.directory.common.v2.ObjectIdentifier.getDefaultInstance());
    }
    /**
     * <pre>
     * object identifier list
     * </pre>
     *
     * <code>repeated .aserto.directory.common.v2.ObjectIdentifier param = 1 [json_name = "param"];</code>
     */
    public java.util.List<com.aserto.directory.common.v2.ObjectIdentifier.Builder> 
         getParamBuilderList() {
      return getParamFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder> 
        getParamFieldBuilder() {
      if (paramBuilder_ == null) {
        paramBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aserto.directory.common.v2.ObjectIdentifier, com.aserto.directory.common.v2.ObjectIdentifier.Builder, com.aserto.directory.common.v2.ObjectIdentifierOrBuilder>(
                param_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        param_ = null;
      }
      return paramBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.GetObjectManyRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.GetObjectManyRequest)
  private static final com.aserto.directory.reader.v2.GetObjectManyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.GetObjectManyRequest();
  }

  public static com.aserto.directory.reader.v2.GetObjectManyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetObjectManyRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetObjectManyRequest>() {
    @java.lang.Override
    public GetObjectManyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetObjectManyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetObjectManyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.GetObjectManyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

