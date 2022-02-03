package com.chattica.connector.sdk.domain.message.event;

import com.chattica.connector.sdk.global.event.EventDataType;
import com.chattica.connector.sdk.global.event.EventOperation;
import com.chattica.connector.sdk.domain.event.EventType;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.domain.event.EventId;

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
        return EventDataType.EVENT_MESSAGE_UPDATE;
    }
}
