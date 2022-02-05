package com.chattica.connector.sdk.standard.event;

import com.chattica.connector.sdk.global.data.AbstractData;
import com.chattica.connector.sdk.global.data.DataType;
import com.chattica.connector.sdk.global.event.Event;
import com.chattica.connector.sdk.global.event.EventId;
import com.chattica.connector.sdk.global.event.EventType;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.event.operate.Operator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Event인터페이스를 불변성을 띄는 객체를 통해 구현한 표준 이벤트 구현체입니다.
 *
 * @see Event
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
@RequiredArgsConstructor
@Getter
public class StandardEvent implements Event {
    private final EventId id;
    private final EventType type;
    private final Operator operator;
    private final EventOperation operation;
    private final DataType targetType;
    private final AbstractData target;
}
