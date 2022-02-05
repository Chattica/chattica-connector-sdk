package com.chattica.connector.sdk.global.data;

/**
 * 식별자로 사용될 수 있는 모든 객체가 구현해야하는 인터페이스입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface Id<T> {
    T id();
}
