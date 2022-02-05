package com.chattica.connector.sdk.global.action;

import com.chattica.connector.sdk.global.data.AbstractData;

/**
 * ActionableData 를 생성하는 ActionableDataGenerator 에 대한 인터페이스입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface ActionableDataGenerator<R extends ActionableData<T>, T extends AbstractData> {
    R just(T data);
}
