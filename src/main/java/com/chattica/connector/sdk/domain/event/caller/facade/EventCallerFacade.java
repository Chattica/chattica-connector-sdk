package com.chattica.connector.sdk.domain.event.caller.facade;

import com.chattica.connector.sdk.domain.event.data.dto.Event;
import com.chattica.connector.sdk.domain.event.listener.EventListener;

public interface EventCallerFacade {
    void routeEvent(Event event);
    <T extends Event> void addListener(T event, EventListener<T> listener);
}
