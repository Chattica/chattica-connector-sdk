package com.chattica.connector.sdk.domain.message.action.actionable;

import com.chattica.connector.sdk.global.action.ActionableData;
import com.chattica.connector.sdk.domain.channel.Channel;
import com.chattica.connector.sdk.domain.message.Message;
import com.chattica.connector.sdk.domain.user.User;
import com.chattica.connector.sdk.domain.message.MessageId;

public abstract class ActionableMessage extends Message implements ActionableData<Message> {
    public ActionableMessage(MessageId id, String content, User author, Channel messagedAt) {
        super(id, content, author, messagedAt);
    }

    @Override
    public abstract MessageId update(Message data);
}
