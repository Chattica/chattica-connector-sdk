package com.chattica.connector.sdk.domain.event.data.type;

import com.chattica.connector.sdk.global.data._interface.DataType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum EventDataType implements DataType {
    EVENT(10),
    //ALL, ADD, GET, UPDATE, REMOVE
    EVENT_MESSAGE(11), EVENT_MESSAGE_ADD(12), EVENT_MESSAGE_UPDATE(14), EVENT_MESSAGE_REMOVE(15),
    EVENT_CHANNEL(16), EVENT_CHANNEL_ADD(17), EVENT_CHANNEL_UPDATE(19), EVENT_CHANNEL_REMOVE(20);

    private final Integer type;

    @Override
    public Integer getType() {
        return type;
    }
}
