package com.chattica.connector.sdk.standard.event;

import com.chattica.connector.sdk.global.event.EventType;
import lombok.RequiredArgsConstructor;

/**
 * Chattica 에서 기본적으로 지원하는 Event에 대한 EventType 표준구현체 입니다.
 *
 * @see EventType
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
@RequiredArgsConstructor
public enum StandardEventDataType implements EventType {
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
