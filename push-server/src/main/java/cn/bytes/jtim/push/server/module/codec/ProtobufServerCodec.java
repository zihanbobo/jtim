package cn.bytes.jtim.push.server.module.codec;

import cn.bytes.jtim.core.module.connection.Connection;
import cn.bytes.jtim.core.module.connection.ConnectionModule;
import cn.bytes.jtim.core.module.handler.codec.AbstractSimpleCodecInboundHandler;
import cn.bytes.jtim.core.protocol.protobuf.HeartbeatRequest;
import cn.bytes.jtim.core.protocol.protobuf.HeartbeatResponse;
import cn.bytes.jtim.core.protocol.protobuf.Message;
import com.google.protobuf.ByteString;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @version 1.0
 * @date 2020/2/13 18:14
 */
@Slf4j
@ChannelHandler.Sharable
public class ProtobufServerCodec extends AbstractSimpleCodecInboundHandler<Message> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Message message) throws Exception {

        log.info("服务端收到消息: {}", message);
        Message.Cmd cmd = message.getCmd();
        TimeUnit.MILLISECONDS.sleep(1);
        if (Message.Cmd.HeartbeatRequest.equals(cmd)) {
            channelHandlerContext.writeAndFlush(Message.newBuilder()
                    .setCmd(Message.Cmd.HeartbeatResponse)
                    .setHeartbeatResponse(HeartbeatResponse.newBuilder()
                            .setPong(ByteString.EMPTY)
                            .build())
                    .build());
        }

        if (Message.Cmd.O2MDistributeRequest.equals(cmd)) {
            System.out.println("收到信息: " + message.getO2MDistributeRequest().getContent());
        }

//
//        if (Message.Cmd.HeartbeatResponse.equals(cmd)) {
//            channelHandlerContext.writeAndFlush(Message.newBuilder()
//                    .setCmd(Message.Cmd.HeartbeatRequest)
//                    .setHeartbeatRequest(HeartbeatRequest.newBuilder()
//                            .setPing(ByteString.EMPTY)
//                            .build())
//                    .build());
//        }

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("连接成功:{}", ctx);

        Channel channel = ctx.channel();
        InetSocketAddress socketAddress = (InetSocketAddress) channel.remoteAddress();
        Connection connection = Connection.builder()
                .channel(channel)
                .channelId(channel.id().asLongText())
                .remotePort(socketAddress.getPort())
                .remoteHost(socketAddress.getAddress().getHostAddress())
                .clientTime(System.currentTimeMillis())
                .build();

        Message message = Message.newBuilder().setCmd(Message.Cmd.HeartbeatRequest)
                .setHeartbeatRequest(HeartbeatRequest.newBuilder()
                        .setPing(ByteString.EMPTY)
                        .build()).build();

        ConnectionModule connectionModule = getHost().getModule(ConnectionModule.class);
        if (Objects.nonNull(connectionModule)) {
            connectionModule
                    .saveConnection(connection)
                    .writeAndFlush(connection, message);
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        ConnectionModule connectionModule = getHost().getModule(ConnectionModule.class);
        if (Objects.nonNull(connectionModule)) {
            connectionModule
                    .removeConnection(ctx.channel());
            log.info("连接断开,当前连接数量:{}", connectionModule.onLine());
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
