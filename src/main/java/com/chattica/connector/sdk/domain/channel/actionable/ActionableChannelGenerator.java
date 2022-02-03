package com.chattica.connector.sdk.domain.channel.actionable;

import com.chattica.connector.sdk.domain.channel.Channel;

public interface ActionableChannelGenerator {
    ActionableChannel just(Channel channel);
}
