package com.chattica.connector.sdk.domain.channel.event;

import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.event.operate.Operator;
import com.chattica.connector.sdk.standard.event.StandardEvent;
import com.chattica.connector.sdk.standard.event.StandardEventDataType;
import com.chattica.connector.sdk.global.event.EventType;
import com.chattica.connector.sdk.global.event.EventId;
import com.chattica.connector.sdk.standard.StandardDataType;
import lombok.Getter;

@Getter
public abstract class ChannelEvent extends StandardEvent {
    public ChannelEvent(EventId id, Operator operator, EventOperation operation, Channel target) {
        this(id, StandardEventDataType.EVENT_CHANNEL, operator, operation, target);
    }

    public ChannelEvent(EventId id, EventType type, Operator operator, EventOperation operation, Channel target) {
        super(id, type, operator, operation, StandardDataType.CHANNEL, target);
    }
}
