// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package cn.nextop.gadget.etcd.grpc;

public interface LeaseGrantResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.LeaseGrantResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  cn.nextop.gadget.etcd.grpc.ResponseHeader getHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  cn.nextop.gadget.etcd.grpc.ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * ID is the lease ID for the granted lease.
   * </pre>
   *
   * <code>int64 ID = 2;</code>
   */
  long getID();

  /**
   * <pre>
   * TTL is the server chosen lease time-to-live in seconds.
   * </pre>
   *
   * <code>int64 TTL = 3;</code>
   */
  long getTTL();

  /**
   * <code>string error = 4;</code>
   */
  java.lang.String getError();
  /**
   * <code>string error = 4;</code>
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
