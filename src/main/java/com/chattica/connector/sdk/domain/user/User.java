package com.chattica.connector.sdk.domain.user;

import com.chattica.connector.sdk.global.data.AbstractData;
import com.chattica.connector.sdk.global.data.Nameable;
import com.chattica.connector.sdk.standard.StandardDataType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class User implements AbstractData, Nameable {
    private final UserId id;
    private final String name;

    @Override
    public UserType getType() {
        return StandardDataType.USER;
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
