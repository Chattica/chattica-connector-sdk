package com.chattica.connector.sdk.domain.action.generator;

import com.chattica.connector.sdk.domain.action.actionable.ActionableMessage;
import com.chattica.connector.sdk.global.data.dto.Message;

public interface ActionableMessageGenerator {
    ActionableMessage just(Message channel);
}
