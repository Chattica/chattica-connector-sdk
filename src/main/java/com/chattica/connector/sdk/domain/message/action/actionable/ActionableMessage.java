package com.chattica.connector.sdk.domain.message.action.actionable;

import com.chattica.connector.sdk.global.action.ActionableData;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.domain.message.Message;
import com.chattica.connector.sdk.domain.user.User;
import com.chattica.connector.sdk.domain.message.MessageId;

/**
 * 메세지 관련 명령에 대한 Actionable 추상 구현체입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public abstract class ActionableMessage extends Message implements ActionableData<Message> {
    public ActionableMessage(MessageId id, String content, User author, Channel messagedAt) {
        super(id, content, author, messagedAt);
    }

    @Override
    public abstract MessageId update(Message data);
}
