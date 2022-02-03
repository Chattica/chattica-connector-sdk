package com.chattica.connector.sdk.domain.channel.event;

import com.chattica.connector.sdk.global.event.operator.Operator;
import com.chattica.connector.sdk.global.event.EventDataType;
import com.chattica.connector.sdk.global.event.EventOperation;
import com.chattica.connector.sdk.domain.event.EventType;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.domain.event.EventId;

public class ChannelRemoveEvent extends ChannelEvent{
    public ChannelRemoveEvent(EventId id, Channel target, Operator operator) {
        super(id, target, operator);
    }

    @Override
    public EventOperation getOperation() {
        return EventOperation.REMOVE;
    }

    @Override
    public EventType getType() {
        return EventDataType.EVENT_CHANNEL_REMOVE;
    }
}
