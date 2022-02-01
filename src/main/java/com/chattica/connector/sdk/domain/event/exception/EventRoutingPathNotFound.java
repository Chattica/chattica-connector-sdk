package com.chattica.connector.sdk.domain.event.exception;

/**
 * 설명을 입력해주세요!
 *
 * @author JeeInho
 * @version 0.0.1alpha-RELEASE
 * @see
 * @since 0.0.1alpha-RELEASE
 */
public class EventRoutingPathNotFound extends RuntimeException {
    public EventRoutingPathNotFound(String message) {
        super(message);
    }
}
