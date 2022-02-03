package com.chattica.connector.sdk.domain.event.data.dto.event.message;

import com.chattica.connector.sdk.domain.event.data.type.EventDataType;
import com.chattica.connector.sdk.domain.event.data.type.EventOperation;
import com.chattica.connector.sdk.global.data._interface.datatype.EventType;
import com.chattica.connector.sdk.global.data.dto.Channel;
import com.chattica.connector.sdk.global.data.dto.id.EventId;

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
        return EventDataType.EVENT_MESSAGE_REMOVE;
    }
}
