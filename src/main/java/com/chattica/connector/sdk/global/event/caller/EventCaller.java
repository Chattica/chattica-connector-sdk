package com.chattica.connector.sdk.global.event.caller;

import com.chattica.connector.sdk.domain.event.Event;

public interface EventCaller<T extends Event> {
    void callEvent(T event);
}
