package com.chattica.connector.sdk.global.data.dto;

import com.chattica.connector.sdk.global.data._interface.AbstractData;
import com.chattica.connector.sdk.global.data._interface.Id;
import com.chattica.connector.sdk.global.data.type.StandardDataType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Message implements AbstractData {
    private final Id id;
    private final String content;
    private final User author;
    private final Channel messagedAt;

    @Override
    public Integer getType() {
        return StandardDataType.MESSAGE.getType();
    }

    @Override
    public Id getId() {
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
