package com.chattica.connector.sdk.domain.message.event;

import com.chattica.connector.sdk.standard.StandardEventDataType;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.event.EventType;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.global.event.EventId;

public class MessageUpdateEvent extends MessageEvent {
    public MessageUpdateEvent(EventId id, Channel target, Channel operator) {
        super(id, target, operator);
    }

    @Override
    public EventOperation getOperation() {
        return EventOperation.UPDATE;
    }

    @Override
    public EventType getType() {
        return StandardEventDataType.EVENT_MESSAGE_UPDATE;
    }
}
