package com.chattica.connector.sdk.domain.event.data.dto.channel;

import com.chattica.connector.sdk.domain.event.data._interface.Operator;
import com.chattica.connector.sdk.domain.event.data.type.EventOperation;
import com.chattica.connector.sdk.global.data._interface.Id;
import com.chattica.connector.sdk.global.data.dto.Channel;

public class ChannelUpdateEvent extends ChannelEvent{
    public ChannelUpdateEvent(Channel target, Operator operator) {
        super(target, operator, EventOperation.UPDATE);
    }

    @Override //TODO Id 관련 로직 구현
    public Id getId() {
        return null;
    }
}
