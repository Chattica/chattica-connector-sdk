package com.chattica.connector.sdk.domain.event.caller;

import com.chattica.connector.sdk.domain.event.data.dto.Event;

public interface EventCaller<T extends Event> {
    void callEvent(T event);
}
