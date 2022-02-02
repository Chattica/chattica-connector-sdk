package com.chattica.connector.sdk.domain.event;

import com.chattica.connector.sdk.domain.event.caller.facade.ChatticaEventCallerFacade;
import com.chattica.connector.sdk.domain.event.data.dto.event.channel.ChannelAddEvent;
import com.chattica.connector.sdk.domain.event.data.dto.event.channel.ChannelRemoveEvent;
import com.chattica.connector.sdk.domain.event.data.dto.event.message.MessageAddEvent;
import com.chattica.connector.sdk.domain.event.data.dto.operator.UserOperator;
import com.chattica.connector.sdk.global.data.dto.Channel;
import com.chattica.connector.sdk.global.data.dto.id.EventId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.chattica.connector.sdk.domain.event.data.type.EventDataType.EVENT_CHANNEL_ADD;

public class ChatticaEventCallerFacadeTest {
    ChatticaEventCallerFacade facade;

    @BeforeEach
    public void init() {
        facade = new ChatticaEventCallerFacade();
    }

    @Test
    public void testPositive() {
        facade.addListener(EVENT_CHANNEL_ADD, event -> System.out.println("이벤트 : " + event.getId().id() + " | " + event.getOperation() + " | " + event.getClass().getSimpleName()));
        facade.addListener(EVENT_CHANNEL_ADD, event -> System.out.println("2벤트 : " + event.getId().id() + " | " + event.getOperation() + " | " + event.getClass().getSimpleName()));
        facade.routeEvent(new ChannelAddEvent(() -> 12, null, null));
        facade.routeEvent(new ChannelRemoveEvent(() -> 13, null, null));
        facade.routeEvent(new MessageAddEvent(() -> 14, null, null));
        facade.routeEvent(new CustomChannelAddEvent(() -> 15, null, null));
    }

    private static class CustomChannelAddEvent extends ChannelAddEvent {
        public CustomChannelAddEvent(EventId id, Channel target, UserOperator operator) {
            super(id, target, operator);
        }
    }
}
