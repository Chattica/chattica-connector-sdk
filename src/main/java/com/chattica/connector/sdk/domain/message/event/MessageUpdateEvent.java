package com.chattica.connector.sdk.domain.message.event;

import com.chattica.connector.sdk.domain.message.Message;
import com.chattica.connector.sdk.global.event.operate.Operator;
import com.chattica.connector.sdk.standard.event.StandardEventDataType;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.global.event.EventId;

/**
 * 메세지가 갱신될 때 발생하는 이벤트입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public class MessageUpdateEvent extends MessageEvent {
    public MessageUpdateEvent(EventId id, Operator operator, Message target) {
        super(id, StandardEventDataType.EVENT_MESSAGE_UPDATE, operator, EventOperation.UPDATE, target);
    }
}
