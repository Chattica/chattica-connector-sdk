package com.chattica.connector.sdk.domain.event.data.dto.event.channel;

import com.chattica.connector.sdk.domain.event.data.dto.operator.UserOperator;
import com.chattica.connector.sdk.domain.event.data.type.EventDataType;
import com.chattica.connector.sdk.domain.event.data.type.EventOperation;
import com.chattica.connector.sdk.global.data._interface.DataType;
import com.chattica.connector.sdk.global.data.dto.Channel;
import com.chattica.connector.sdk.global.data.dto.id.EventId;

public class ChannelUpdateEvent extends ChannelEvent{
    public ChannelUpdateEvent(EventId id, Channel target, UserOperator operator) {
        super(id, target, operator);
    }

    @Override
    public EventOperation getOperation() {
        return EventOperation.UPDATE;
    }

    @Override
    public DataType getType() {
        return EventDataType.EVENT_CHANNEL_UPDATE;
    }
}
