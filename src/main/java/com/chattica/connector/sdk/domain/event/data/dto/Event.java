package com.chattica.connector.sdk.domain.event.data.dto;

import com.chattica.connector.sdk.domain.event.data.type.EventOperation;
import com.chattica.connector.sdk.global.data._interface.AbstractData;
import com.chattica.connector.sdk.global.data._interface.DataType;
import com.chattica.connector.sdk.global.data.dto.id.EventId;
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
}
