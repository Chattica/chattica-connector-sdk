package com.chattica.connector.sdk.global.event.listener.container;

import com.chattica.connector.sdk.domain.event.Event;

public interface ListenerContainer<T extends Event> extends ListenerUpdater<T>, ListenerRemover<T> {
}


