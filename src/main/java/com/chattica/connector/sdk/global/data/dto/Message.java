package com.chattica.connector.sdk.global.data.dto;

import com.chattica.connector.sdk.global.data._interface.AbstractData;
import com.chattica.connector.sdk.global.data._interface.DataType;
import com.chattica.connector.sdk.global.data.dto.id.MessageId;
import com.chattica.connector.sdk.global.data.type.StandardDataType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Message implements AbstractData {
    private final MessageId id;
    private final String content;
    private final User author;
    private final Channel messagedAt;

    @Override
    public DataType getType() {
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
