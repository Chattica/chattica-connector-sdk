package com.chattica.connector.sdk.domain.message.event;

import com.chattica.connector.sdk.domain.event.Event;
import com.chattica.connector.sdk.global.event.EventDataType;
import com.chattica.connector.sdk.global.data.DataType;
import com.chattica.connector.sdk.domain.event.EventType;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.domain.event.EventId;
import com.chattica.connector.sdk.standard.StandardDataType;
import lombok.Getter;

@Getter
public abstract class MessageEvent extends Event {
    private final Channel target;
    private final Channel operator;

    public MessageEvent(EventId id, Channel target, Channel operator) {
        super(id);
        this.target = target;
        this.operator = operator;
    }

    @Override
    public DataType getTargetType() {
        return StandardDataType.MESSAGE;
    }

    @Override
    public EventType getType() {
        return EventDataType.EVENT_MESSAGE;
    }
}
