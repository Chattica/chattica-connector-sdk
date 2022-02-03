package com.chattica.connector.sdk.domain.event.caller.facade;

import com.chattica.connector.sdk.domain.event.data.dto.Event;
import com.chattica.connector.sdk.domain.event.listener.EventListener;
import com.chattica.connector.sdk.global.data._interface.datatype.DataType;

public interface EventCallerFacade {
    void routeEvent(Event event);
    <T extends Event> void addListener(DataType type, EventListener<T> listener);
}
