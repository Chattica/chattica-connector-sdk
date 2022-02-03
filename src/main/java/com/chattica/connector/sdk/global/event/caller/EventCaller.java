package com.chattica.connector.sdk.global.event.caller;

import com.chattica.connector.sdk.global.event.Event;

public interface EventCaller<T extends Event> {
    void callEvent(T event);
}
