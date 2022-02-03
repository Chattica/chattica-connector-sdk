package com.chattica.connector.sdk.standard;

import com.chattica.connector.sdk.global.event.caller.EventCaller;
import com.chattica.connector.sdk.global.event.listener.container.ListenerContainer;
import com.chattica.connector.sdk.global.event.Event;
import com.chattica.connector.sdk.global.event.listener.EventListener;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
public class StandardEventCaller<T extends Event> implements EventCaller<T>, ListenerContainer<T> {
    private final Set<EventListener<T>> eventListeners = new HashSet<>();

    @Override
    public void callEvent(T event) {
        eventListeners.forEach(listener -> listener.call(event));
    }

    @Override
    public void addListener(EventListener<T> listener) {
        eventListeners.add(listener);
    }
    @Override
    public void removeListener(EventListener<T> listener) {
        eventListeners.remove(listener);
    }
    @Override
    public void clearListener() {
        eventListeners.clear();
    }
}
