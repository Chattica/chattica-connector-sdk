package com.chattica.connector.sdk.global.event.listener.container;

import com.chattica.connector.sdk.global.event.Event;
import com.chattica.connector.sdk.global.event.listener.EventListener;

/**
 * EventListener 를 제거할 수 있는 객체가 구현해야할 인터페이스입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface ListenerRemover<T extends Event> {
    void removeListener(EventListener<T> listener);
    void clearListener();
}
