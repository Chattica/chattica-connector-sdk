package com.chattica.connector.sdk.global.action;

import com.chattica.connector.sdk.global.data.AbstractData;

public interface ActionableData<T extends AbstractData> extends SelfUpdatable<T>, SelfRemovable, AbstractData {
}
