package com.chattica.connector.sdk.domain.event.data.dto.event.message;

import com.chattica.connector.sdk.domain.event.data.dto.Event;
import com.chattica.connector.sdk.domain.event.data.type.EventDataType;
import com.chattica.connector.sdk.global.data._interface.datatype.DataType;
import com.chattica.connector.sdk.global.data._interface.datatype.EventType;
import com.chattica.connector.sdk.global.data.dto.Channel;
import com.chattica.connector.sdk.global.data.dto.id.EventId;
import com.chattica.connector.sdk.global.data.type.StandardDataType;
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
