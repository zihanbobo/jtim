package cn.bytes.jtim.core.module.initialize;

import cn.bytes.jtim.core.config.Configuration;
import cn.bytes.jtim.core.module.handler.ChannelHandlerModule;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.util.concurrent.Future;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * 初始服务模块
 *
 * @version 1.0
 * @date 2020/2/16 22:00
 */
@Getter
@Slf4j
public abstract class SimpleClientInitializeModule extends SimpleInitializeModule implements InitializeModule {

    public SimpleClientInitializeModule(Configuration configuration) {
        super(configuration);
    }

    @Override
    public Future<Void> openAsync(ChannelHandlerModule channelHandlerModule) {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(getWorkerEventGroup())
                .channel(getNioSocketChannelClass())
                .handler(new ChannelInitializer<Channel>() {
                    @Override
                    protected void initChannel(Channel channel) throws Exception {
                        channel.pipeline().addLast(channelHandlerModule.getChannelHandlers());
                    }
                });
        this.options(bootstrap);
        return bootstrap.connect(getSocketAddress());
    }


}