// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package cn.bytes.jtim.core.protocol.protobuf;

public interface AuthResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AuthResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 status = 1;</code>
   */
  int getStatus();

  /**
   * <pre>
   *错误编码
   * </pre>
   *
   * <code>string err_code = 2;</code>
   */
  java.lang.String getErrCode();
  /**
   * <pre>
   *错误编码
   * </pre>
   *
   * <code>string err_code = 2;</code>
   */
  com.google.protobuf.ByteString
      getErrCodeBytes();

  /**
   * <pre>
   *错误描述
   * </pre>
   *
   * <code>string err_msg = 3;</code>
   */
  java.lang.String getErrMsg();
  /**
   * <pre>
   *错误描述
   * </pre>
   *
   * <code>string err_msg = 3;</code>
   */
  com.google.protobuf.ByteString
      getErrMsgBytes();
}
