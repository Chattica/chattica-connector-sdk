package com.chattica.connector.sdk.domain.action.generator;

import com.chattica.connector.sdk.domain.action.data._interface.SelfRemovable;
import com.chattica.connector.sdk.domain.action.data._interface.SelfUpdatable;
import com.chattica.connector.sdk.global.data._interface.AbstractData;

public interface ActionableData<T extends AbstractData> extends SelfUpdatable<T>, SelfRemovable, AbstractData {
}
