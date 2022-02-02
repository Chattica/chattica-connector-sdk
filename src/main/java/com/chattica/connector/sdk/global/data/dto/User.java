package com.chattica.connector.sdk.global.data.dto;

import com.chattica.connector.sdk.global.data._interface.AbstractData;
import com.chattica.connector.sdk.global.data._interface.Nameable;
import com.chattica.connector.sdk.global.data.dto.id.UserId;
import com.chattica.connector.sdk.global.data.type.StandardDataType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class User implements AbstractData, Nameable {
    private final UserId id;
    private final String name;

    @Override
    public Integer getType() {
        return StandardDataType.USER.getType();
    }

    @Override
    public UserId getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
