package com.chattica.connector.sdk.global.event.exception;

/**
 * Event 를 중계(route) 할 경로를 찾지 못하였을 때 발생하는 예외입니다.
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @since 0.0.1alpha-RELEASE
 */
public class EventRoutingPathNotFound extends RuntimeException {
    public EventRoutingPathNotFound(String message) {
        super(message);
    }
}
