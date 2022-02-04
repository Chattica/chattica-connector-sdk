package com.chattica.connector.sdk.global.event;

import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.data.AbstractData;
import com.chattica.connector.sdk.global.data.DataType;
import com.chattica.connector.sdk.global.event.operate.Operator;

public interface Event extends AbstractData {
    @Override
    EventId getId();
    @Override
    EventType getType();
    Operator getOperator();
    EventOperation getOperation();
    DataType getTargetType();
    AbstractData getTarget();
}
