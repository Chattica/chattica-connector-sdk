package com.chattica.connector.sdk.global.event;

import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.data.AbstractData;
import com.chattica.connector.sdk.global.data.DataType;
import com.chattica.connector.sdk.global.event.operate.Operator;

/**
 * Event 에 대한 정보를 담는 Data 객체입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
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
