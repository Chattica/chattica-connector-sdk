package com.chattica.connector.sdk.domain.event.data.dto;

import com.chattica.connector.sdk.domain.event.data.type.EventDataType;
import com.chattica.connector.sdk.domain.event.data.type.EventOperation;
import com.chattica.connector.sdk.global.data._interface.AbstractData;
import com.chattica.connector.sdk.global.data._interface.DataType;
import com.chattica.connector.sdk.global.data._interface.Id;
import com.chattica.connector.sdk.global.data.dto.id.JavaUniqueId;

public abstract class Event implements AbstractData {
    @Override
    public Integer getType() {
        return EventDataType.EVENT.getType();
    }

    public abstract EventOperation getOperation();
    public abstract DataType getTargetType();

    @Override
    public Id<String> getId() {
        return new JavaUniqueId();
    }
}
