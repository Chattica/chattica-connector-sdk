package com.chattica.connector.sdk.domain.channel.event;

import com.chattica.connector.sdk.standard.StandardEventDataType;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.event.operate.Operator;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.global.event.EventId;

public class ChannelUpdateEvent extends ChannelEvent{
    public ChannelUpdateEvent(EventId id, Operator operator, Channel target) {
        super(id, StandardEventDataType.EVENT_CHANNEL_UPDATE, operator, EventOperation.UPDATE, target);
    }
}
