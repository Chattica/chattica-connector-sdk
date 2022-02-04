package com.chattica.connector.sdk.domain.message.event;

import com.chattica.connector.sdk.domain.message.Message;
import com.chattica.connector.sdk.global.event.operate.Operator;
import com.chattica.connector.sdk.standard.StandardEventDataType;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.event.EventId;

public class MessageAddEvent extends MessageEvent{
    public MessageAddEvent(EventId id, Operator operator, Message target) {
        super(id, StandardEventDataType.EVENT_MESSAGE_ADD, operator, EventOperation.ADD, target);
    }
}
