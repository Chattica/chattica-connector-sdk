package com.chattica.connector.sdk.domain.channel.event;

import com.chattica.connector.sdk.global.event.operate.Operator;
import com.chattica.connector.sdk.global.event.EventDataType;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.event.EventType;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.global.event.EventId;

public class ChannelAddEvent extends ChannelEvent{
    public ChannelAddEvent(EventId id, Channel target, Operator operator) {
        super(id, target, operator);
    }

    @Override
    public EventOperation getOperation() {
        return EventOperation.ADD;
    }

    @Override
    public EventType getType() {
        return EventDataType.EVENT_CHANNEL_ADD;
    }
}
