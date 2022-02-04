package com.chattica.connector.sdk.standard.event;

import com.chattica.connector.sdk.global.data.AbstractData;
import com.chattica.connector.sdk.global.data.DataType;
import com.chattica.connector.sdk.global.event.Event;
import com.chattica.connector.sdk.global.event.EventId;
import com.chattica.connector.sdk.global.event.EventType;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.event.operate.Operator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StandardEvent implements Event {
    private final EventId id;
    private final EventType type;
    private final Operator operator;
    private final EventOperation operation;
    private final DataType targetType;
    private final AbstractData target;

    @Override public EventId getId() { return id; }
    @Override public EventType getType() { return type; }
    @Override public Operator getOperator() { return operator; }
    @Override public EventOperation getOperation() { return operation; }
    @Override public DataType getTargetType() { return targetType; }
    @Override public AbstractData getTarget() { return target; }
}
