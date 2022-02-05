package com.chattica.connector.sdk.global.event.caller;

import com.chattica.connector.sdk.global.event.Event;

/**
 * 특정한 경우에, 이벤트를 발행하는 EventCaller 에 대한 인터페이스입니다.
 *
 * @see com.chattica.connector.sdk.standard.event.caller.StandardEventCaller
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface EventCaller<T extends Event> {
    void callEvent(T event);
}
