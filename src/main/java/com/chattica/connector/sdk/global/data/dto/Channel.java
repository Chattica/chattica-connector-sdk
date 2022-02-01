package com.chattica.connector.sdk.global.data.dto;

import com.chattica.connector.sdk.global.data._interface.AbstractData;
import com.chattica.connector.sdk.global.data._interface.Nameable;
import com.chattica.connector.sdk.global.data.dto.id.ChannelId;
import com.chattica.connector.sdk.global.data.type.StandardDataType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Channel implements AbstractData, Nameable {
    private final ChannelId id;
    private final String name;

    @Override
    public Integer getType() {
        return StandardDataType.CHANNEL.getType();
    }

    @Override
    public ChannelId getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
