// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package cn.nextop.gadget.etcd.grpc;

/**
 * Protobuf type {@code etcdserverpb.AuthUserListResponse}
 */
@SuppressWarnings("all") public final class AuthUserListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AuthUserListResponse)
    AuthUserListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthUserListResponse.newBuilder() to construct.
  private AuthUserListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthUserListResponse() {
    users_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthUserListResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            cn.nextop.gadget.etcd.grpc.ResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(cn.nextop.gadget.etcd.grpc.ResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              users_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            users_.add(s);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        users_ = users_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AuthUserListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AuthUserListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.nextop.gadget.etcd.grpc.AuthUserListResponse.class, cn.nextop.gadget.etcd.grpc.AuthUserListResponse.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private cn.nextop.gadget.etcd.grpc.ResponseHeader header_;
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public cn.nextop.gadget.etcd.grpc.ResponseHeader getHeader() {
    return header_ == null ? cn.nextop.gadget.etcd.grpc.ResponseHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public cn.nextop.gadget.etcd.grpc.ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int USERS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList users_;
  /**
   * <code>repeated string users = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getUsersList() {
    return users_;
  }
  /**
   * <code>repeated string users = 2;</code>
   */
  public int getUsersCount() {
    return users_.size();
  }
  /**
   * <code>repeated string users = 2;</code>
   */
  public java.lang.String getUsers(int index) {
    return users_.get(index);
  }
  /**
   * <code>repeated string users = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUsersBytes(int index) {
    return users_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    for (int i = 0; i < users_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, users_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < users_.size(); i++) {
        dataSize += computeStringSizeNoTag(users_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUsersList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.nextop.gadget.etcd.grpc.AuthUserListResponse)) {
      return super.equals(obj);
    }
    cn.nextop.gadget.etcd.grpc.AuthUserListResponse other = (cn.nextop.gadget.etcd.grpc.AuthUserListResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getUsersList()
        .equals(other.getUsersList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getUsersCount() > 0) {
      hash = (37 * hash) + USERS_FIELD_NUMBER;
      hash = (53 * hash) + getUsersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cn.nextop.gadget.etcd.grpc.AuthUserListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code etcdserverpb.AuthUserListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AuthUserListResponse)
      cn.nextop.gadget.etcd.grpc.AuthUserListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AuthUserListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AuthUserListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.nextop.gadget.etcd.grpc.AuthUserListResponse.class, cn.nextop.gadget.etcd.grpc.AuthUserListResponse.Builder.class);
    }

    // Construct using cn.nextop.gadget.etcd.grpc.AuthUserListResponse.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      users_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_AuthUserListResponse_descriptor;
    }

    public cn.nextop.gadget.etcd.grpc.AuthUserListResponse getDefaultInstanceForType() {
      return cn.nextop.gadget.etcd.grpc.AuthUserListResponse.getDefaultInstance();
    }

    public cn.nextop.gadget.etcd.grpc.AuthUserListResponse build() {
      cn.nextop.gadget.etcd.grpc.AuthUserListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.nextop.gadget.etcd.grpc.AuthUserListResponse buildPartial() {
      cn.nextop.gadget.etcd.grpc.AuthUserListResponse result = new cn.nextop.gadget.etcd.grpc.AuthUserListResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        users_ = users_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.users_ = users_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.nextop.gadget.etcd.grpc.AuthUserListResponse) {
        return mergeFrom((cn.nextop.gadget.etcd.grpc.AuthUserListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.nextop.gadget.etcd.grpc.AuthUserListResponse other) {
      if (other == cn.nextop.gadget.etcd.grpc.AuthUserListResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.users_.isEmpty()) {
        if (users_.isEmpty()) {
          users_ = other.users_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureUsersIsMutable();
          users_.addAll(other.users_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cn.nextop.gadget.etcd.grpc.AuthUserListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.nextop.gadget.etcd.grpc.AuthUserListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private cn.nextop.gadget.etcd.grpc.ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.nextop.gadget.etcd.grpc.ResponseHeader, cn.nextop.gadget.etcd.grpc.ResponseHeader.Builder, cn.nextop.gadget.etcd.grpc.ResponseHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public cn.nextop.gadget.etcd.grpc.ResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? cn.nextop.gadget.etcd.grpc.ResponseHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(cn.nextop.gadget.etcd.grpc.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        cn.nextop.gadget.etcd.grpc.ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(cn.nextop.gadget.etcd.grpc.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            cn.nextop.gadget.etcd.grpc.ResponseHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public cn.nextop.gadget.etcd.grpc.ResponseHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public cn.nextop.gadget.etcd.grpc.ResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            cn.nextop.gadget.etcd.grpc.ResponseHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.nextop.gadget.etcd.grpc.ResponseHeader, cn.nextop.gadget.etcd.grpc.ResponseHeader.Builder, cn.nextop.gadget.etcd.grpc.ResponseHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.nextop.gadget.etcd.grpc.ResponseHeader, cn.nextop.gadget.etcd.grpc.ResponseHeader.Builder, cn.nextop.gadget.etcd.grpc.ResponseHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.google.protobuf.LazyStringList users_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureUsersIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        users_ = new com.google.protobuf.LazyStringArrayList(users_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string users = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getUsersList() {
      return users_.getUnmodifiableView();
    }
    /**
     * <code>repeated string users = 2;</code>
     */
    public int getUsersCount() {
      return users_.size();
    }
    /**
     * <code>repeated string users = 2;</code>
     */
    public java.lang.String getUsers(int index) {
      return users_.get(index);
    }
    /**
     * <code>repeated string users = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsersBytes(int index) {
      return users_.getByteString(index);
    }
    /**
     * <code>repeated string users = 2;</code>
     */
    public Builder setUsers(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureUsersIsMutable();
      users_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string users = 2;</code>
     */
    public Builder addUsers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureUsersIsMutable();
      users_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string users = 2;</code>
     */
    public Builder addAllUsers(
        java.lang.Iterable<java.lang.String> values) {
      ensureUsersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, users_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string users = 2;</code>
     */
    public Builder clearUsers() {
      users_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string users = 2;</code>
     */
    public Builder addUsersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureUsersIsMutable();
      users_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AuthUserListResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.AuthUserListResponse)
  private static final cn.nextop.gadget.etcd.grpc.AuthUserListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.nextop.gadget.etcd.grpc.AuthUserListResponse();
  }

  public static cn.nextop.gadget.etcd.grpc.AuthUserListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthUserListResponse>
      PARSER = new com.google.protobuf.AbstractParser<AuthUserListResponse>() {
    public AuthUserListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthUserListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthUserListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthUserListResponse> getParserForType() {
    return PARSER;
  }

  public cn.nextop.gadget.etcd.grpc.AuthUserListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

