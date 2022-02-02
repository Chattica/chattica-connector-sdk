package com.chattica.connector.sdk.domain.action.actionable;

import com.chattica.connector.sdk.domain.action.generator.ActionableData;
import com.chattica.connector.sdk.global.data.dto.Channel;
import com.chattica.connector.sdk.global.data.dto.Message;
import com.chattica.connector.sdk.global.data.dto.User;
import com.chattica.connector.sdk.global.data.dto.id.MessageId;

public abstract class ActionableMessage extends Message implements ActionableData<Message> {
    public ActionableMessage(MessageId id, String content, User author, Channel messagedAt) {
        super(id, content, author, messagedAt);
    }

    @Override
    public abstract MessageId update(Message data);
}
