package com.chattica.connector.sdk.domain.message;

import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.global.data.AbstractData;
import com.chattica.connector.sdk.domain.user.User;
import com.chattica.connector.sdk.standard.StandardDataType;
import lombok.RequiredArgsConstructor;

/**
 * 메세지 에 대한 정보를 담는 추상화 객체입니다.
 *
 * @see com.chattica.connector.sdk.domain.message.action.actionable.ActionableMessage
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
@RequiredArgsConstructor
public abstract class Message implements AbstractData {
    private final MessageId id;
    private final String content;
    private final User author;
    private final Channel messagedAt;

    @Override
    public MessageType getType() {
        return StandardDataType.MESSAGE;
    }

    @Override
    public MessageId getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public Channel getMessagedAt() {
        return messagedAt;
    }
}
