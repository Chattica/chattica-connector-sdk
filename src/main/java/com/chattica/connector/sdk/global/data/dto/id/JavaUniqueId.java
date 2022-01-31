package com.chattica.connector.sdk.global.data.dto.id;

import java.util.UUID;

public class JavaUniqueId {
    private final String id;

    public JavaUniqueId() {
        this.id = UUID.randomUUID().toString();
    }

    public String id() {
        return id;
    }
}
