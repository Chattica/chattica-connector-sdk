package com.chattica.connector.sdk.global.event.caller;

import com.chattica.connector.sdk.domain.event.Event;
import com.chattica.connector.sdk.global.event.listener.EventListener;
import com.chattica.connector.sdk.global.data.DataType;

public interface EventCallerFacade {
    void routeEvent(Event event);
    <T extends Event> void addListener(DataType type, EventListener<T> listener);
}
