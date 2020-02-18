package cn.bytes.jtim.core.module;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @version 1.0
 * @date 2020/2/15 15:51
 */
@AllArgsConstructor
@Getter
public enum ModuleMapping {

    MODULE_INITIALIZE("MODULE_INITIALIZE", "MODULE_INITIALIZE", false),

    MODULE_CHANNEL_HANDLER("MODULE_CHANNEL_HANDLER", "MODULE_CHANNEL_HANDLER", true),

    MODULE_CONNECTION("MODULE_CONNECTION", "MODULE_CONNECTION", true),

    MODULE_ROUTER_MANAGER("MODULE_ROUTER_MANAGER", "MODULE_ROUTER_MANAGER", false),

    MODULE_RETRY("MODULE_RETRY", "MODULE_RETRY", false),

    MODULE_NETTY_TCP_CLUSTER("MODULE_NETTY_TCP_CLUSTER", "MODULE_NETTY_TCP_CLUSTER", false),

    MODULE_NETTY_WS_CLUSTER("MODULE_NETTY_WS_CLUSTER", "MODULE_NETTY_WS_CLUSTER", false),
    ;

    private String name;

    private String unique;

    private boolean must;
}
