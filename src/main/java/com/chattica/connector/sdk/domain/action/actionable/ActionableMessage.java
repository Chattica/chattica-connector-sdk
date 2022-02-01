package com.chattica.connector.sdk.domain.action.actionable;

import com.chattica.connector.sdk.domain.action.generator.ActionableData;
import com.chattica.connector.sdk.global.data._interface.Id;
import com.chattica.connector.sdk.global.data.dto.Channel;
import com.chattica.connector.sdk.global.data.dto.Message;
import com.chattica.connector.sdk.global.data.dto.User;
import com.chattica.connector.sdk.global.data.dto.id.JavaUniqueId;

public abstract class ActionableMessage extends Message implements ActionableData<Message> {
    public ActionableMessage(Id<?> id, String content, User author, Channel messagedAt) {
        super(id, content, author, messagedAt);
    }

    @Override //TODO 나중에 MessageId 로 변경
    public abstract JavaUniqueId update(Message data);
}
