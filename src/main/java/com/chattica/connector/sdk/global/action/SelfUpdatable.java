package com.chattica.connector.sdk.global.action;

import com.chattica.connector.sdk.global.data.AbstractData;
import com.chattica.connector.sdk.global.data.Id;

/**
 * 자기자신에 대한 update operation 을 수행 할 수 있는 객체가 구현해야하는 인터페이스입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface SelfUpdatable<T extends AbstractData> {
    <R extends Id> R update(T data);
}
