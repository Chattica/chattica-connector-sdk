package com.chattica.connector.sdk.domain.event.listener.container;

import com.chattica.connector.sdk.domain.event.data.dto.Event;
import com.chattica.connector.sdk.domain.event.listener.EventListener;

public interface ListenerRemover<T extends Event> {
    void removeListener(EventListener<T> listener);
    void clearListener();
}
