package com.chattica.connector.sdk.global.data.dto.id;

import com.chattica.connector.sdk.global.data._interface.Id;

@Deprecated
public record LongId(Long id) implements Id<Long> {
}
