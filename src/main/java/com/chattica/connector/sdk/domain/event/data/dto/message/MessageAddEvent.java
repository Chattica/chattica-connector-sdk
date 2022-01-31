package com.chattica.connector.sdk.domain.event.data.dto.message;

import com.chattica.connector.sdk.domain.event.data._interface.Operator;
import com.chattica.connector.sdk.domain.event.data.type.EventOperation;
import com.chattica.connector.sdk.global.data.dto.Channel;

public class MessageAddEvent extends MessageEvent{
    public MessageAddEvent(Channel target, Operator operator) {
        super(target, operator);
    }

    @Override
    public EventOperation getOperation() {
        return EventOperation.ADD;
    }
}
