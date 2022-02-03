package com.chattica.connector.sdk.global.data._interface;

import com.chattica.connector.sdk.global.data._interface.datatype.DataType;

public interface AbstractData extends Identifiable {
    DataType getType();
}
