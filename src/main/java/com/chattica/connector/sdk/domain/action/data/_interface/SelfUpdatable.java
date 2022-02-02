package com.chattica.connector.sdk.domain.action.data._interface;

import com.chattica.connector.sdk.global.data._interface.AbstractData;
import com.chattica.connector.sdk.global.data._interface.Id;

public interface SelfUpdatable<T extends AbstractData> {
    <R extends Id> R update(T data);
}
