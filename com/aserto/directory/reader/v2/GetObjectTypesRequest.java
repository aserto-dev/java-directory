// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/directory/reader/v2/reader.proto

package com.aserto.directory.reader.v2;

/**
 * Protobuf type {@code aserto.directory.reader.v2.GetObjectTypesRequest}
 */
public final class GetObjectTypesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.directory.reader.v2.GetObjectTypesRequest)
    GetObjectTypesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetObjectTypesRequest.newBuilder() to construct.
  private GetObjectTypesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetObjectTypesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetObjectTypesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectTypesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectTypesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.directory.reader.v2.GetObjectTypesRequest.class, com.aserto.directory.reader.v2.GetObjectTypesRequest.Builder.class);
  }

  public static final int PAGE_FIELD_NUMBER = 9;
  private com.aserto.directory.common.v2.PaginationRequest page_;
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
   * @return Whether the page field is set.
   */
  @java.lang.Override
  public boolean hasPage() {
    return page_ != null;
  }
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
   * @return The page.
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.PaginationRequest getPage() {
    return page_ == null ? com.aserto.directory.common.v2.PaginationRequest.getDefaultInstance() : page_;
  }
  /**
   * <pre>
   * pagination request
   * </pre>
   *
   * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
   */
  @java.lang.Override
  public com.aserto.directory.common.v2.PaginationRequestOrBuilder getPageOrBuilder() {
    return page_ == null ? com.aserto.directory.common.v2.PaginationRequest.getDefaultInstance() : page_;
  }

  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.directory.reader.v2.GetObjectTypesRequest parseFrom(
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
  public static Builder newBuilder(com.aserto.directory.reader.v2.GetObjectTypesRequest prototype) {
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
   * Protobuf type {@code aserto.directory.reader.v2.GetObjectTypesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.directory.reader.v2.GetObjectTypesRequest)
      com.aserto.directory.reader.v2.GetObjectTypesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectTypesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectTypesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.directory.reader.v2.GetObjectTypesRequest.class, com.aserto.directory.reader.v2.GetObjectTypesRequest.Builder.class);
    }

    // Construct using com.aserto.directory.reader.v2.GetObjectTypesRequest.newBuilder()
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
      return com.aserto.directory.reader.v2.ReaderProto.internal_static_aserto_directory_reader_v2_GetObjectTypesRequest_descriptor;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetObjectTypesRequest getDefaultInstanceForType() {
      return com.aserto.directory.reader.v2.GetObjectTypesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetObjectTypesRequest build() {
      com.aserto.directory.reader.v2.GetObjectTypesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.directory.reader.v2.GetObjectTypesRequest buildPartial() {
      com.aserto.directory.reader.v2.GetObjectTypesRequest result = new com.aserto.directory.reader.v2.GetObjectTypesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.directory.reader.v2.GetObjectTypesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.page_ = pageBuilder_ == null
            ? page_
            : pageBuilder_.build();
      }
    }

    private int bitField0_;

    private com.aserto.directory.common.v2.PaginationRequest page_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.PaginationRequest, com.aserto.directory.common.v2.PaginationRequest.Builder, com.aserto.directory.common.v2.PaginationRequestOrBuilder> pageBuilder_;
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     * @return Whether the page field is set.
     */
    public boolean hasPage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     * @return The page.
     */
    public com.aserto.directory.common.v2.PaginationRequest getPage() {
      if (pageBuilder_ == null) {
        return page_ == null ? com.aserto.directory.common.v2.PaginationRequest.getDefaultInstance() : page_;
      } else {
        return pageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public Builder setPage(com.aserto.directory.common.v2.PaginationRequest value) {
      if (pageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        page_ = value;
      } else {
        pageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public Builder setPage(
        com.aserto.directory.common.v2.PaginationRequest.Builder builderForValue) {
      if (pageBuilder_ == null) {
        page_ = builderForValue.build();
      } else {
        pageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public Builder mergePage(com.aserto.directory.common.v2.PaginationRequest value) {
      if (pageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          page_ != null &&
          page_ != com.aserto.directory.common.v2.PaginationRequest.getDefaultInstance()) {
          getPageBuilder().mergeFrom(value);
        } else {
          page_ = value;
        }
      } else {
        pageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public Builder clearPage() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public com.aserto.directory.common.v2.PaginationRequest.Builder getPageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    public com.aserto.directory.common.v2.PaginationRequestOrBuilder getPageOrBuilder() {
      if (pageBuilder_ != null) {
        return pageBuilder_.getMessageOrBuilder();
      } else {
        return page_ == null ?
            com.aserto.directory.common.v2.PaginationRequest.getDefaultInstance() : page_;
      }
    }
    /**
     * <pre>
     * pagination request
     * </pre>
     *
     * <code>.aserto.directory.common.v2.PaginationRequest page = 9 [json_name = "page"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.directory.common.v2.PaginationRequest, com.aserto.directory.common.v2.PaginationRequest.Builder, com.aserto.directory.common.v2.PaginationRequestOrBuilder> 
        getPageFieldBuilder() {
      if (pageBuilder_ == null) {
        pageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.directory.common.v2.PaginationRequest, com.aserto.directory.common.v2.PaginationRequest.Builder, com.aserto.directory.common.v2.PaginationRequestOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:aserto.directory.reader.v2.GetObjectTypesRequest)
  }

  // @@protoc_insertion_point(class_scope:aserto.directory.reader.v2.GetObjectTypesRequest)
  private static final com.aserto.directory.reader.v2.GetObjectTypesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.directory.reader.v2.GetObjectTypesRequest();
  }

  public static com.aserto.directory.reader.v2.GetObjectTypesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetObjectTypesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetObjectTypesRequest>() {
    @java.lang.Override
    public GetObjectTypesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetObjectTypesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetObjectTypesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.directory.reader.v2.GetObjectTypesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

