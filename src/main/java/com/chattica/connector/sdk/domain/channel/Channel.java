package com.chattica.connector.sdk.domain.channel;

import com.chattica.connector.sdk.global.data.AbstractData;
import com.chattica.connector.sdk.global.data.Nameable;
import com.chattica.connector.sdk.standard.StandardDataType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Channel implements AbstractData, Nameable {
    private final ChannelId id;
    private final String name;

    @Override
    public ChannelType getType() {
        return StandardDataType.CHANNEL;
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