package com.chattica.connector.sdk.global.event.listener;

import com.chattica.connector.sdk.global.event.Event;

/**
 * 특정한 이벤트가 발생하였을때, 해당 이벤트에대한 처리를 담당하는 리스너가 구현해야하는 인터페이스입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface EventListener<T extends Event> {
    void call(T event);
}
