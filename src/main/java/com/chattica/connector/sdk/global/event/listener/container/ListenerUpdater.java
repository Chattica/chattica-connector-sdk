package com.chattica.connector.sdk.global.event.listener.container;

import com.chattica.connector.sdk.domain.event.Event;
import com.chattica.connector.sdk.global.event.listener.EventListener;

public interface ListenerUpdater<T extends Event> {
    void addListener(EventListener<T> listener);
}
