package com.chattica.connector.sdk.domain.message.action.actionable;

import com.chattica.connector.sdk.domain.message.Message;

public interface ActionableMessageGenerator {
    ActionableMessage just(Message channel);
}
