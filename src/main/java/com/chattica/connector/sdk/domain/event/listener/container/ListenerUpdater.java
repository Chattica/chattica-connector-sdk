package com.chattica.connector.sdk.domain.event.listener.container;

import com.chattica.connector.sdk.domain.event.data.dto.Event;
import com.chattica.connector.sdk.domain.event.listener.EventListener;

public interface ListenerUpdater<T extends Event> {
    void addListener(EventListener<T> listener);
}
