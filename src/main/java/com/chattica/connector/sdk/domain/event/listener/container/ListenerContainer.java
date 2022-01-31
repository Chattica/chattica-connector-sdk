package com.chattica.connector.sdk.domain.event.listener.container;

import com.chattica.connector.sdk.domain.event.data.dto.Event;

public interface ListenerContainer<T extends Event> extends ListenerUpdater<T>, ListenerRemover<T> {
}


