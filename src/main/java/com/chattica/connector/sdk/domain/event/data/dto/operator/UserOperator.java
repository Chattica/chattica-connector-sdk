package com.chattica.connector.sdk.domain.event.data.dto.operator;

import com.chattica.connector.sdk.domain.event.data._interface.Operator;
import com.chattica.connector.sdk.global.data.dto.User;
import com.chattica.connector.sdk.global.data.dto.id.UserId;

public abstract class UserOperator extends User implements Operator {
    public UserOperator(UserId id, String name) {
        super(id, name);
    }
}
