package cn.bytes.jtim.broker;

import cn.bytes.jtim.broker.config.NettyServerProperties;
import cn.bytes.jtim.broker.handler.ProtobufClientHandler;
import cn.bytes.jtim.broker.handler.ProtobufServerHandler;
import cn.bytes.jtim.core.config.Configuration;
import cn.bytes.jtim.core.config.SocketConfig;
import cn.bytes.jtim.core.connection.DefaultDefineConnectionManager;
import cn.bytes.jtim.core.connection.DefineConnectionManager;
import cn.bytes.jtim.core.handler.DefaultDefineHandlerManager;
import cn.bytes.jtim.core.handler.DefineHandlerManager;
import cn.bytes.jtim.core.module.DefaultModuleManager;
import cn.bytes.jtim.core.server.NettyTcpServer;
import cn.bytes.jtim.core.server.NettyWebSocketServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import static cn.bytes.jtim.common.constant.DefineConstant.PROPER_TCP_ENABLE;
import static cn.bytes.jtim.common.constant.DefineConstant.PROPER_WEBSOCKET_ENABLE;

/**
 * @version 1.0
 * @date 2020/2/12 20:42
 */
@EnableConfigurationProperties({NettyServerProperties.class})
@Slf4j
public class InitializingServer implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Bean
    @ConditionalOnMissingBean
    public ProtobufServerHandler protobufTcpServerHandler() {
        return new ProtobufServerHandler();
    }

    @Bean
    @ConditionalOnMissingBean
    public ProtobufClientHandler protobufClientHandler() {
        return new ProtobufClientHandler();
    }

    @Bean
    @ConditionalOnMissingBean
    public DefineHandlerManager defineHandlerManager(ProtobufServerHandler protobufServerHandler) {
        DefineHandlerManager defineHandlerManager = new DefaultDefineHandlerManager();
        defineHandlerManager.addHandlerLast(protobufServerHandler);
        return defineHandlerManager;
    }

    @Bean
    @ConditionalOnMissingBean
    public DefineConnectionManager defineConnectionManager() {
        DefineConnectionManager defineHandlerManager = new DefaultDefineConnectionManager();
        return defineHandlerManager;
    }

    @Bean
    @ConditionalOnMissingBean
    public ModuleManager moduleManager(DefineHandlerManager defineHandlerManager,
                                       DefineConnectionManager defineConnectionManager) {
        ModuleManager moduleManager =
                DefaultModuleManager.builder().build()
                        .module(defineHandlerManager, defineConnectionManager);
        return moduleManager;
    }

    @Bean
    @ConditionalOnProperty(name = PROPER_TCP_ENABLE, havingValue = "true")
    public NettyTcpServer nettyTcpServer(NettyServerProperties nettyServerProperties, ModuleManager moduleManager) {
        NettyTcpServer nettyTcpServer =
                new NettyTcpServer(this.builderConfig(nettyServerProperties.getTcp()), moduleManager);
        nettyTcpServer.open();

        return nettyTcpServer;
    }

    @Bean
    @ConditionalOnProperty(name = PROPER_WEBSOCKET_ENABLE, havingValue = "true")
    public NettyWebSocketServer nettyWebSocketServer(NettyServerProperties nettyServerProperties, ModuleManager moduleManager) {
        NettyWebSocketServer nettyWebSocketServer =
                new NettyWebSocketServer(this.builderConfig(nettyServerProperties.getWebsocket()), moduleManager);
        nettyWebSocketServer.open();

        return nettyWebSocketServer;
    }

    private Configuration builderConfig(NettyServerProperties.Properties config) {
        return Configuration.builder()
                .host(config.getHost())
                .port(config.getPort())
                .bossThreads(config.getBossThreads())
                .heartReadTime(config.getHeartReadTime())
                .useLinuxNativeEpoll(config.isUseLinuxNativeEpoll())
                .workerThreads(config.getWorkerThreads())
                .maxHttpContentLength(config.getMaxHttpContentLength())
                .maxWebsocketFrameSize(config.getMaxWebsocketFrameSize())
                .socketConfig(
                        SocketConfig.builder()
                                .acceptBackLog(config.getSocketConfig().getAcceptBackLog())
                                .keepAlive(config.getSocketConfig().isKeepAlive())
                                .noDelay(config.getSocketConfig().isNoDelay())
                                .receiveBufferSize(config.getSocketConfig().getReceiveBufferSize())
                                .sendBufferSize(config.getSocketConfig().getSendBufferSize())
                                .writeBufferWaterHigh(config.getSocketConfig().getWriteBufferWaterHigh())
                                .writeBufferWaterLow(config.getSocketConfig().getWriteBufferWaterLow())
                                .build()
                )
                .build();
    }

}
