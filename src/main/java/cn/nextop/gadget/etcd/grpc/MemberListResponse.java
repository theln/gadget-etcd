// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package cn.nextop.gadget.etcd.grpc;

/**
 * Protobuf type {@code etcdserverpb.MemberListResponse}
 */
@SuppressWarnings("all") public final class MemberListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.MemberListResponse)
    MemberListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemberListResponse.newBuilder() to construct.
  private MemberListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemberListResponse() {
    members_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemberListResponse(
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
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              members_ = new java.util.ArrayList<cn.nextop.gadget.etcd.grpc.Member>();
              mutable_bitField0_ |= 0x00000002;
            }
            members_.add(
                input.readMessage(cn.nextop.gadget.etcd.grpc.Member.parser(), extensionRegistry));
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
        members_ = java.util.Collections.unmodifiableList(members_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_MemberListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_MemberListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.nextop.gadget.etcd.grpc.MemberListResponse.class, cn.nextop.gadget.etcd.grpc.MemberListResponse.Builder.class);
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

  public static final int MEMBERS_FIELD_NUMBER = 2;
  private java.util.List<cn.nextop.gadget.etcd.grpc.Member> members_;
  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  public java.util.List<cn.nextop.gadget.etcd.grpc.Member> getMembersList() {
    return members_;
  }
  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  public java.util.List<? extends cn.nextop.gadget.etcd.grpc.MemberOrBuilder> 
      getMembersOrBuilderList() {
    return members_;
  }
  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  public int getMembersCount() {
    return members_.size();
  }
  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  public cn.nextop.gadget.etcd.grpc.Member getMembers(int index) {
    return members_.get(index);
  }
  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  public cn.nextop.gadget.etcd.grpc.MemberOrBuilder getMembersOrBuilder(
      int index) {
    return members_.get(index);
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
    for (int i = 0; i < members_.size(); i++) {
      output.writeMessage(2, members_.get(i));
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
    for (int i = 0; i < members_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, members_.get(i));
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
    if (!(obj instanceof cn.nextop.gadget.etcd.grpc.MemberListResponse)) {
      return super.equals(obj);
    }
    cn.nextop.gadget.etcd.grpc.MemberListResponse other = (cn.nextop.gadget.etcd.grpc.MemberListResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getMembersList()
        .equals(other.getMembersList());
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
    if (getMembersCount() > 0) {
      hash = (37 * hash) + MEMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getMembersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.nextop.gadget.etcd.grpc.MemberListResponse parseFrom(
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
  public static Builder newBuilder(cn.nextop.gadget.etcd.grpc.MemberListResponse prototype) {
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
   * Protobuf type {@code etcdserverpb.MemberListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.MemberListResponse)
      cn.nextop.gadget.etcd.grpc.MemberListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_MemberListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_MemberListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.nextop.gadget.etcd.grpc.MemberListResponse.class, cn.nextop.gadget.etcd.grpc.MemberListResponse.Builder.class);
    }

    // Construct using cn.nextop.gadget.etcd.grpc.MemberListResponse.newBuilder()
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
        getMembersFieldBuilder();
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
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        membersBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.nextop.gadget.etcd.grpc.JetcdProto.internal_static_etcdserverpb_MemberListResponse_descriptor;
    }

    public cn.nextop.gadget.etcd.grpc.MemberListResponse getDefaultInstanceForType() {
      return cn.nextop.gadget.etcd.grpc.MemberListResponse.getDefaultInstance();
    }

    public cn.nextop.gadget.etcd.grpc.MemberListResponse build() {
      cn.nextop.gadget.etcd.grpc.MemberListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.nextop.gadget.etcd.grpc.MemberListResponse buildPartial() {
      cn.nextop.gadget.etcd.grpc.MemberListResponse result = new cn.nextop.gadget.etcd.grpc.MemberListResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (membersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          members_ = java.util.Collections.unmodifiableList(members_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.members_ = members_;
      } else {
        result.members_ = membersBuilder_.build();
      }
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
      if (other instanceof cn.nextop.gadget.etcd.grpc.MemberListResponse) {
        return mergeFrom((cn.nextop.gadget.etcd.grpc.MemberListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.nextop.gadget.etcd.grpc.MemberListResponse other) {
      if (other == cn.nextop.gadget.etcd.grpc.MemberListResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (membersBuilder_ == null) {
        if (!other.members_.isEmpty()) {
          if (members_.isEmpty()) {
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMembersIsMutable();
            members_.addAll(other.members_);
          }
          onChanged();
        }
      } else {
        if (!other.members_.isEmpty()) {
          if (membersBuilder_.isEmpty()) {
            membersBuilder_.dispose();
            membersBuilder_ = null;
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000002);
            membersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMembersFieldBuilder() : null;
          } else {
            membersBuilder_.addAllMessages(other.members_);
          }
        }
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
      cn.nextop.gadget.etcd.grpc.MemberListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.nextop.gadget.etcd.grpc.MemberListResponse) e.getUnfinishedMessage();
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

    private java.util.List<cn.nextop.gadget.etcd.grpc.Member> members_ =
      java.util.Collections.emptyList();
    private void ensureMembersIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        members_ = new java.util.ArrayList<cn.nextop.gadget.etcd.grpc.Member>(members_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.nextop.gadget.etcd.grpc.Member, cn.nextop.gadget.etcd.grpc.Member.Builder, cn.nextop.gadget.etcd.grpc.MemberOrBuilder> membersBuilder_;

    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public java.util.List<cn.nextop.gadget.etcd.grpc.Member> getMembersList() {
      if (membersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(members_);
      } else {
        return membersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public int getMembersCount() {
      if (membersBuilder_ == null) {
        return members_.size();
      } else {
        return membersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public cn.nextop.gadget.etcd.grpc.Member getMembers(int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);
      } else {
        return membersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder setMembers(
        int index, cn.nextop.gadget.etcd.grpc.Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.set(index, value);
        onChanged();
      } else {
        membersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder setMembers(
        int index, cn.nextop.gadget.etcd.grpc.Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.set(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(cn.nextop.gadget.etcd.grpc.Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(value);
        onChanged();
      } else {
        membersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(
        int index, cn.nextop.gadget.etcd.grpc.Member value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(index, value);
        onChanged();
      } else {
        membersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(
        cn.nextop.gadget.etcd.grpc.Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addMembers(
        int index, cn.nextop.gadget.etcd.grpc.Member.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder addAllMembers(
        java.lang.Iterable<? extends cn.nextop.gadget.etcd.grpc.Member> values) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, members_);
        onChanged();
      } else {
        membersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder clearMembers() {
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        membersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public Builder removeMembers(int index) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.remove(index);
        onChanged();
      } else {
        membersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public cn.nextop.gadget.etcd.grpc.Member.Builder getMembersBuilder(
        int index) {
      return getMembersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public cn.nextop.gadget.etcd.grpc.MemberOrBuilder getMembersOrBuilder(
        int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);  } else {
        return membersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public java.util.List<? extends cn.nextop.gadget.etcd.grpc.MemberOrBuilder> 
         getMembersOrBuilderList() {
      if (membersBuilder_ != null) {
        return membersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(members_);
      }
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public cn.nextop.gadget.etcd.grpc.Member.Builder addMembersBuilder() {
      return getMembersFieldBuilder().addBuilder(
          cn.nextop.gadget.etcd.grpc.Member.getDefaultInstance());
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public cn.nextop.gadget.etcd.grpc.Member.Builder addMembersBuilder(
        int index) {
      return getMembersFieldBuilder().addBuilder(
          index, cn.nextop.gadget.etcd.grpc.Member.getDefaultInstance());
    }
    /**
     * <pre>
     * members is a list of all members associated with the cluster.
     * </pre>
     *
     * <code>repeated .etcdserverpb.Member members = 2;</code>
     */
    public java.util.List<cn.nextop.gadget.etcd.grpc.Member.Builder> 
         getMembersBuilderList() {
      return getMembersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.nextop.gadget.etcd.grpc.Member, cn.nextop.gadget.etcd.grpc.Member.Builder, cn.nextop.gadget.etcd.grpc.MemberOrBuilder> 
        getMembersFieldBuilder() {
      if (membersBuilder_ == null) {
        membersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cn.nextop.gadget.etcd.grpc.Member, cn.nextop.gadget.etcd.grpc.Member.Builder, cn.nextop.gadget.etcd.grpc.MemberOrBuilder>(
                members_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        members_ = null;
      }
      return membersBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.MemberListResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.MemberListResponse)
  private static final cn.nextop.gadget.etcd.grpc.MemberListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.nextop.gadget.etcd.grpc.MemberListResponse();
  }

  public static cn.nextop.gadget.etcd.grpc.MemberListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemberListResponse>
      PARSER = new com.google.protobuf.AbstractParser<MemberListResponse>() {
    public MemberListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MemberListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemberListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemberListResponse> getParserForType() {
    return PARSER;
  }

  public cn.nextop.gadget.etcd.grpc.MemberListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

