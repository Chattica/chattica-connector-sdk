package com.chattica.connector.sdk.domain.event;

import com.chattica.connector.sdk.global.event.EventOperation;
import com.chattica.connector.sdk.global.data.AbstractData;
import com.chattica.connector.sdk.global.data.DataType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Event implements AbstractData {
    private final EventId id;

    public abstract EventOperation getOperation();
    public abstract DataType getTargetType();

    @Override
    public EventId getId() {
        return id;
    }

    @Override
    public abstract EventType getType();
}
