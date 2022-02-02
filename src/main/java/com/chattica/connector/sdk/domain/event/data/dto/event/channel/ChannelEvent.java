package com.chattica.connector.sdk.domain.event.data.dto.event.channel;

import com.chattica.connector.sdk.domain.event.data.dto.Event;
import com.chattica.connector.sdk.domain.event.data.dto.operator.UserOperator;
import com.chattica.connector.sdk.domain.event.data.type.EventDataType;
import com.chattica.connector.sdk.global.data._interface.DataType;
import com.chattica.connector.sdk.global.data.dto.Channel;
import com.chattica.connector.sdk.global.data.dto.id.EventId;
import com.chattica.connector.sdk.global.data.type.StandardDataType;
import lombok.Getter;

@Getter
public abstract class ChannelEvent extends Event {
    private final Channel target;
    private final UserOperator operator;

    public ChannelEvent(EventId id, Channel target, UserOperator operator) {
        super(id);
        this.target = target;
        this.operator = operator;
    }

    @Override
    public DataType getTargetType() {
        return StandardDataType.CHANNEL;
    }

    @Override
    public DataType getType() {
        return EventDataType.EVENT_CHANNEL;
    }
}
