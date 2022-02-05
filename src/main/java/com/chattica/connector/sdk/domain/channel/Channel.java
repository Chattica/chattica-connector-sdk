package com.chattica.connector.sdk.domain.channel;

import com.chattica.connector.sdk.global.data.AbstractData;
import com.chattica.connector.sdk.global.data.Nameable;
import com.chattica.connector.sdk.standard.StandardDataType;
import lombok.RequiredArgsConstructor;

/**
 * 채널 에 대한 정보를 담는 추상화 객체입니다.
 *
 * @see com.chattica.connector.sdk.domain.channel.action.actionable.ActionableChannel
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
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