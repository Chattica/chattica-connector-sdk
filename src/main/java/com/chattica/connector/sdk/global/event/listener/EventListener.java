package com.chattica.connector.sdk.global.event.listener;

import com.chattica.connector.sdk.global.event.Event;

public interface EventListener<T extends Event> {
    void call(T event);
}
