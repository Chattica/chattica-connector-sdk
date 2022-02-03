package com.chattica.connector.sdk.domain.message.event;

import com.chattica.connector.sdk.standard.StandardEventDataType;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.event.EventType;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.global.event.EventId;

public class MessageRemoveEvent extends MessageEvent {
    public MessageRemoveEvent(EventId id, Channel target, Channel operator) {
        super(id, target, operator);
    }

    @Override
    public EventOperation getOperation() {
        return EventOperation.REMOVE;
    }

    @Override
    public EventType getType() {
        return StandardEventDataType.EVENT_MESSAGE_REMOVE;
    }
}
