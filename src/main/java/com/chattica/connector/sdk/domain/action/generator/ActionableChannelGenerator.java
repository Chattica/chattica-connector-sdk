package com.chattica.connector.sdk.domain.action.generator;

import com.chattica.connector.sdk.domain.action.actionable.ActionableChannel;
import com.chattica.connector.sdk.global.data.dto.Channel;

public interface ActionableChannelGenerator {
    ActionableChannel just(Channel channel);
}
