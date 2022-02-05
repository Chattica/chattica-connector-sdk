package com.chattica.connector.sdk.global.action;

import com.chattica.connector.sdk.global.data.AbstractData;

/**
 * CRUD 및 기타 오퍼레이션을 수행할 수 있는 정보객체가 구현해야하는 인터페이스입니다.
 *
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
public interface ActionableData<T extends AbstractData> extends SelfUpdatable<T>, SelfRemovable, AbstractData {
}
