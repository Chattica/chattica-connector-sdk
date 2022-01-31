package com.chattica.connector.sdk.domain.event.listener;

import com.chattica.connector.sdk.domain.event.data.dto.Event;

public interface EventListener<T extends Event> {
    void call(T event);
}
