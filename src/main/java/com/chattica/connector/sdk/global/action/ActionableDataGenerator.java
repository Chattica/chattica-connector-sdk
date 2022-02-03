package com.chattica.connector.sdk.global.action;

import com.chattica.connector.sdk.global.data.AbstractData;

public interface ActionableDataGenerator<R extends ActionableData<T>, T extends AbstractData> {
    R just(T data);
}
