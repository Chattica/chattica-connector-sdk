package com.chattica.connector.sdk.domain.event.data.dto.channel;

import com.chattica.connector.sdk.domain.event.data._interface.Operator;
import com.chattica.connector.sdk.domain.event.data.dto.Event;
import com.chattica.connector.sdk.global.data._interface.DataType;
import com.chattica.connector.sdk.global.data.dto.Channel;
import com.chattica.connector.sdk.global.data.type.StandardDataType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public abstract class ChannelEvent extends Event {
    private final Channel target;
    private final Operator operator;

    @Override
    public DataType getTargetType() {
        return StandardDataType.CHANNEL;
    }
}
