package com.chattica.connector.sdk.domain.channel.action.actionable;

import com.chattica.connector.sdk.global.action.ActionableData;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.domain.message.Message;
import com.chattica.connector.sdk.domain.channel.ChannelId;
import com.chattica.connector.sdk.domain.message.MessageId;

/**
 * 채널 관련 명령에 대한 Actionable 추상 구현체입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public abstract class ActionableChannel extends Channel implements ActionableData<Channel> {
    public ActionableChannel(ChannelId id, String name) {
        super(id, name);
    }

    public abstract MessageId addMessage(Message message);
    public abstract Message getMessage(MessageId id);
    public abstract MessageId updateMessage(ChannelId id, Message message);
    public abstract void removeMessage(MessageId id);

    @Override
    public abstract ChannelId update(Channel data);
}
