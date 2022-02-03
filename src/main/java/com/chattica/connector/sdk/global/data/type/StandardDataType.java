package com.chattica.connector.sdk.global.data.type;

import com.chattica.connector.sdk.global.data._interface.datatype.ChannelType;
import com.chattica.connector.sdk.global.data._interface.datatype.DataType;
import com.chattica.connector.sdk.global.data._interface.datatype.MessageType;
import com.chattica.connector.sdk.global.data._interface.datatype.UserType;
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
