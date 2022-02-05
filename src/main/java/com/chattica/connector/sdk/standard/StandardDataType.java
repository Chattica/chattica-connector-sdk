package com.chattica.connector.sdk.standard;

import com.chattica.connector.sdk.domain.channel.ChannelType;
import com.chattica.connector.sdk.global.data.DataType;
import com.chattica.connector.sdk.domain.message.MessageType;
import com.chattica.connector.sdk.domain.user.UserType;
import com.chattica.connector.sdk.global.event.EventType;
import lombok.RequiredArgsConstructor;

/**
 * 기본적인 DataType 들을 명시해놓은 DataType 관련 인터페이스에 대한 표준 구현체입니다.
 *
 * @see DataType
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
@RequiredArgsConstructor
public enum StandardDataType implements DataType, ChannelType, MessageType, UserType, EventType {
    EVENT(1000),
    USER(2000),
    CHANNEL(3000),
    MESSAGE(4000);

    private final Integer type;

    @Override
    public Integer getType() {
        return type;
    }
}
