package com.chattica.connector.sdk.global.data.type;

import com.chattica.connector.sdk.global.data._interface.DataType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum StandardDataType implements DataType {
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
