package com.chattica.connector.sdk.global.event.caller;

import com.chattica.connector.sdk.global.event.Event;
import com.chattica.connector.sdk.global.event.listener.EventListener;
import com.chattica.connector.sdk.global.data.DataType;

/**
 * EventCaller 에 대한 Facade 패턴을 적용해 Chattica 내의 모든 Event에 대한 Listening/Calling 을 간편하게해주는 기능에 대한 인터페이스입니다.
 *
 * @see EventCaller
 * @see com.chattica.connector.sdk.standard.event.caller.StandardEventCallerFacade
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface EventCallerFacade {
    void routeEvent(Event event);
    <T extends Event> void addListener(DataType type, EventListener<T> listener);
}
