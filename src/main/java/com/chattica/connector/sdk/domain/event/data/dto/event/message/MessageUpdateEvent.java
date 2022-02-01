package com.chattica.connector.sdk.domain.event.data.dto.event.message;

import com.chattica.connector.sdk.domain.event.data.dto.operator.UserOperator;
import com.chattica.connector.sdk.domain.event.data.type.EventOperation;
import com.chattica.connector.sdk.global.data.dto.Channel;

public class MessageUpdateEvent extends MessageEvent {
    public MessageUpdateEvent(Channel target, UserOperator operator) {
        super(target, operator);
    }

    @Override
    public EventOperation getOperation() {
        return EventOperation.UPDATE;
    }
}
