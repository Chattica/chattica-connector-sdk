package com.chattica.connector.sdk.domain.action.actionable;

import com.chattica.connector.sdk.domain.action.generator.ActionableData;
import com.chattica.connector.sdk.global.data._interface.Id;
import com.chattica.connector.sdk.global.data.dto.Channel;
import com.chattica.connector.sdk.global.data.dto.Message;
import com.chattica.connector.sdk.global.data.dto.id.JavaUniqueId;

public abstract class ActionableChannel extends Channel implements ActionableData<Channel> {
    public ActionableChannel(Id<?> id, String name) {
        super(id, name);
    }

    public abstract Id<?> addMessage(Message message);
    public abstract Message getMessage(Id<?> id);
    public abstract Id<?> updateMessage(Id<?> id, Message message);
    public abstract void removeMessage(Id<?> id);

    @Override //TODO 나중에 ChannelId 로 변경
    public abstract JavaUniqueId update(Channel data);
}
