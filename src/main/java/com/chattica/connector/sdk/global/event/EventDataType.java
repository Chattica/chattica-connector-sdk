package com.chattica.connector.sdk.global.event;

import com.chattica.connector.sdk.domain.event.EventType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum EventDataType implements EventType {
    EVENT(1000),
    //ALL, ADD, GET, UPDATE, REMOVE
    EVENT_MESSAGE(1001), EVENT_MESSAGE_ADD(1002), EVENT_MESSAGE_UPDATE(1004), EVENT_MESSAGE_REMOVE(1005),
    EVENT_CHANNEL(1006), EVENT_CHANNEL_ADD(1007), EVENT_CHANNEL_UPDATE(1009), EVENT_CHANNEL_REMOVE(1010);

    private final Integer type;

    @Override
    public Integer getType() {
        return type;
    }
}
