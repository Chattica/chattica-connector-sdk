package com.chattica.connector.sdk.global.event.listener.container;

import com.chattica.connector.sdk.global.event.Event;

/**
 * EventListener 를 관리하는 객체가 구현해야할 인터페이스입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface ListenerContainer<T extends Event> extends ListenerAdder<T>, ListenerRemover<T> {
}


