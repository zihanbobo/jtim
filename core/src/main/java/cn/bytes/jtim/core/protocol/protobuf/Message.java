// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package cn.bytes.jtim.core.protocol.protobuf;

public final class Message {
  private Message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LogoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LogoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LogoutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LogoutResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KichoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KichoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KichoutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KichoutResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartbeatRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HeartbeatRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartbeatResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HeartbeatResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2OSendRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2OSendRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2OSendResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2OSendResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2ODistributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2ODistributeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2ODistributeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2ODistributeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2MSendRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2MSendRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2MSendResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2MSendResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2MDistributeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2MDistributeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_O2MDistributeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_O2MDistributeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\"<\n\013AuthRequest\022\r\n\005token\030" +
      "\001 \001(\t\022\013\n\003uid\030\002 \001(\t\022\021\n\ttimestamp\030\003 \001(\003\"e\n" +
      "\014AuthResponse\022\016\n\006status\030\001 \001(\005\022\020\n\010err_cod" +
      "e\030\002 \001(\t\022\017\n\007err_msg\030\003 \001(\t\"\"\n\006Status\022\006\n\002OK" +
      "\020\000\022\020\n\003ERR\020\377\377\377\377\377\377\377\377\377\001\">\n\rLogoutRequest\022\r\n" +
      "\005token\030\001 \001(\t\022\013\n\003uid\030\002 \001(\t\022\021\n\ttimestamp\030\003" +
      " \001(\003\"\020\n\016LogoutResponse\"=\n\016KichoutRequest" +
      "\022\017\n\007reasion\030\001 \001(\005\"\032\n\007Reasion\022\017\n\013OTHER_LO" +
      "GIN\020\000\"\021\n\017KichoutResponse\" \n\020HeartbeatReq" +
      "uest\022\014\n\004ping\030\001 \001(\014\"!\n\021HeartbeatResponse\022" +
      "\014\n\004pong\030\001 \001(\014\"p\n\016O2OSendRequest\022\016\n\006msgKe" +
      "y\030\001 \001(\t\022\014\n\004from\030\002 \001(\t\022\020\n\010fromName\030\003 \001(\t\022" +
      "\n\n\002to\030\004 \001(\t\022\017\n\007content\030\005 \001(\t\022\021\n\ttimestam" +
      "p\030\006 \001(\003\"C\n\017O2OSendResponse\022\016\n\006msgKey\030\001 \001" +
      "(\t\022\r\n\005msgId\030\002 \001(\t\022\021\n\ttimestamp\030\003 \001(\003\"\205\001\n" +
      "\024O2ODistributeRequest\022\r\n\005msgId\030\001 \001(\t\022\014\n\004" +
      "from\030\002 \001(\t\022\020\n\010fromName\030\003 \001(\t\022\n\n\002to\030\004 \001(\t" +
      "\022\017\n\007content\030\005 \001(\t\022\016\n\006msgKey\030\006 \001(\t\022\021\n\ttim" +
      "estamp\030\007 \001(\003\"6\n\025O2ODistributeResponse\022\r\n" +
      "\005msgId\030\001 \001(\t\022\016\n\006msgKey\030\002 \001(\t\"s\n\016O2MSendR" +
      "equest\022\014\n\004from\030\001 \001(\t\022\020\n\010fromName\030\002 \001(\t\022\r" +
      "\n\005group\030\003 \001(\t\022\017\n\007content\030\004 \001(\t\022\016\n\006msgKey" +
      "\030\005 \001(\t\022\021\n\ttimestamp\030\006 \001(\003\"C\n\017O2MSendResp" +
      "onse\022\r\n\005msgId\030\001 \001(\t\022\016\n\006msgKey\030\002 \001(\t\022\021\n\tt" +
      "imestamp\030\003 \001(\003\"\210\001\n\024O2MDistributeRequest\022" +
      "\r\n\005msgId\030\001 \001(\t\022\014\n\004from\030\002 \001(\t\022\020\n\010fromName" +
      "\030\003 \001(\t\022\r\n\005group\030\004 \001(\t\022\017\n\007content\030\005 \001(\t\022\016" +
      "\n\006msgKey\030\006 \001(\t\022\021\n\ttimestamp\030\007 \001(\003\"6\n\025O2M" +
      "DistributeResponse\022\r\n\005msgId\030\001 \001(\t\022\016\n\006msg" +
      "Key\030\002 \001(\tB1\n$cn.bytes.jtim.core.protocol" +
      ".protobufB\007MessageP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_AuthRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AuthRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthRequest_descriptor,
        new java.lang.String[] { "Token", "Uid", "Timestamp", });
    internal_static_AuthResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AuthResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthResponse_descriptor,
        new java.lang.String[] { "Status", "ErrCode", "ErrMsg", });
    internal_static_LogoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LogoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LogoutRequest_descriptor,
        new java.lang.String[] { "Token", "Uid", "Timestamp", });
    internal_static_LogoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_LogoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LogoutResponse_descriptor,
        new java.lang.String[] { });
    internal_static_KichoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_KichoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KichoutRequest_descriptor,
        new java.lang.String[] { "Reasion", });
    internal_static_KichoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_KichoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KichoutResponse_descriptor,
        new java.lang.String[] { });
    internal_static_HeartbeatRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_HeartbeatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HeartbeatRequest_descriptor,
        new java.lang.String[] { "Ping", });
    internal_static_HeartbeatResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_HeartbeatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HeartbeatResponse_descriptor,
        new java.lang.String[] { "Pong", });
    internal_static_O2OSendRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_O2OSendRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2OSendRequest_descriptor,
        new java.lang.String[] { "MsgKey", "From", "FromName", "To", "Content", "Timestamp", });
    internal_static_O2OSendResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_O2OSendResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2OSendResponse_descriptor,
        new java.lang.String[] { "MsgKey", "MsgId", "Timestamp", });
    internal_static_O2ODistributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_O2ODistributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2ODistributeRequest_descriptor,
        new java.lang.String[] { "MsgId", "From", "FromName", "To", "Content", "MsgKey", "Timestamp", });
    internal_static_O2ODistributeResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_O2ODistributeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2ODistributeResponse_descriptor,
        new java.lang.String[] { "MsgId", "MsgKey", });
    internal_static_O2MSendRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_O2MSendRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2MSendRequest_descriptor,
        new java.lang.String[] { "From", "FromName", "Group", "Content", "MsgKey", "Timestamp", });
    internal_static_O2MSendResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_O2MSendResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2MSendResponse_descriptor,
        new java.lang.String[] { "MsgId", "MsgKey", "Timestamp", });
    internal_static_O2MDistributeRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_O2MDistributeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2MDistributeRequest_descriptor,
        new java.lang.String[] { "MsgId", "From", "FromName", "Group", "Content", "MsgKey", "Timestamp", });
    internal_static_O2MDistributeResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_O2MDistributeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_O2MDistributeResponse_descriptor,
        new java.lang.String[] { "MsgId", "MsgKey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
