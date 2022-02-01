package com.chattica.connector.sdk.global.data.dto.id;

import com.chattica.connector.sdk.global.data._interface.Id;

import java.util.UUID;

@Deprecated
public class JavaUniqueId implements Id<String> {
    private final String id;

    public JavaUniqueId() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String id() {
        return id;
    }
}
