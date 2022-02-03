package com.chattica.connector.sdk.standard;

import com.chattica.connector.sdk.domain.channel.ChannelType;
import com.chattica.connector.sdk.global.data.DataType;
import com.chattica.connector.sdk.domain.message.MessageType;
import com.chattica.connector.sdk.domain.user.UserType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StandardDataType implements DataType, ChannelType, MessageType, UserType {
    MESSAGE(1),
    SERVER(2),
    CHANNEL(3),
    USER(4);

    private final Integer type;

    @Override
    public Integer getType() {
        return type;
    }
}
