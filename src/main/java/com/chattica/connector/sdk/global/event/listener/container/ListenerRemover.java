package com.chattica.connector.sdk.global.event.listener.container;

import com.chattica.connector.sdk.global.event.Event;
import com.chattica.connector.sdk.global.event.listener.EventListener;

public interface ListenerRemover<T extends Event> {
    void removeListener(EventListener<T> listener);
    void clearListener();
}
