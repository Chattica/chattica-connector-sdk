package com.chattica.connector.sdk.domain.message.event;

import com.chattica.connector.sdk.domain.message.Message;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.event.operate.Operator;
import com.chattica.connector.sdk.global.event.EventType;
import com.chattica.connector.sdk.global.event.EventId;
import com.chattica.connector.sdk.standard.StandardDataType;
import com.chattica.connector.sdk.standard.event.StandardEvent;
import com.chattica.connector.sdk.standard.event.StandardEventDataType;
import lombok.Getter;

@Getter
public abstract class MessageEvent extends StandardEvent {
    public MessageEvent(EventId id, Operator operator, EventOperation operation, Message target) {
        super(id, StandardEventDataType.EVENT_MESSAGE, operator, operation, StandardDataType.MESSAGE, target);
    }

    public MessageEvent(EventId id, EventType type, Operator operator, EventOperation operation, Message target) {
        super(id, type, operator, operation, StandardDataType.MESSAGE, target);
    }
}
