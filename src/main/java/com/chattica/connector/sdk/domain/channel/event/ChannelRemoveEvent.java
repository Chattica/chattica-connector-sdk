package com.chattica.connector.sdk.domain.channel.event;

import com.chattica.connector.sdk.global.event.operate.Operator;
import com.chattica.connector.sdk.standard.event.StandardEventDataType;
import com.chattica.connector.sdk.global.event.operate.EventOperation;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.global.event.EventId;

/**
 * 채널이 삭제될 때 발생하는 이벤트입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public class ChannelRemoveEvent extends ChannelEvent{
    public ChannelRemoveEvent(EventId id, Operator operator, Channel target) {
        super(id, StandardEventDataType.EVENT_CHANNEL_REMOVE, operator, EventOperation.REMOVE, target);
    }
}
