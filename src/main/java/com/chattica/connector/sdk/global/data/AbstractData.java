package com.chattica.connector.sdk.global.data;

/**
 * Chattica 의 모든 추상정보 객체들이 구현해야하는 인터페이스입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface AbstractData extends Identifiable {
    DataType getType();
}
