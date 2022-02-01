package com.chattica.connector.sdk.domain.event.caller.facade;

import com.chattica.connector.sdk.domain.event.caller.StandardEventCaller;
import com.chattica.connector.sdk.domain.event.data.dto.Event;
import com.chattica.connector.sdk.domain.event.data.dto.channel.ChannelAddEvent;
import com.chattica.connector.sdk.domain.event.data.dto.channel.ChannelRemoveEvent;
import com.chattica.connector.sdk.domain.event.data.dto.channel.ChannelUpdateEvent;
import com.chattica.connector.sdk.domain.event.data.dto.message.MessageAddEvent;
import com.chattica.connector.sdk.domain.event.data.dto.message.MessageRemoveEvent;
import com.chattica.connector.sdk.domain.event.data.dto.message.MessageUpdateEvent;
import com.chattica.connector.sdk.domain.event.exception.EventRoutingPathNotFound;

public class ChatticaEventCallerFacade {
    private final ChannelAddEventCaller channelAddEventCaller;
    private final ChannelRemoveEventCaller channelRemoveEventCaller;
    private final ChannelUpdateEventCaller channelUpdateEventCaller;

    private final MessageAddEventCaller messageAddEventCaller;
    private final MessageRemoveEventCaller messageRemoveEventCaller;
    private final MessageUpdateEventCaller messageUpdateEventCaller;

    public ChatticaEventCallerFacade() {
        channelAddEventCaller = new ChannelAddEventCaller();
        channelRemoveEventCaller = new ChannelRemoveEventCaller();
        channelUpdateEventCaller = new ChannelUpdateEventCaller();

        messageAddEventCaller = new MessageAddEventCaller();
        messageRemoveEventCaller = new MessageRemoveEventCaller();
        messageUpdateEventCaller = new MessageUpdateEventCaller();
    }

    //TODO 나중에 HashMap 이랑 getType 을 통해 추상화 가능하지 않을까?
    public void routeEvent(Event event) {
        switch (event) {
            case ChannelAddEvent e -> channelAddEventCaller.callEvent(e);
            case ChannelRemoveEvent e -> channelRemoveEventCaller.callEvent(e);
            case ChannelUpdateEvent e -> channelUpdateEventCaller.callEvent(e);

            case MessageAddEvent e -> messageAddEventCaller.callEvent(e);
            case MessageRemoveEvent e -> messageRemoveEventCaller.callEvent(e);
            case MessageUpdateEvent e -> messageUpdateEventCaller.callEvent(e);
            default -> throw new EventRoutingPathNotFound(event.getClass().getSimpleName());
        }
    }
    private static class ChannelAddEventCaller extends StandardEventCaller<ChannelAddEvent> {}
    private static class ChannelRemoveEventCaller extends StandardEventCaller<ChannelRemoveEvent> {}
    private static class ChannelUpdateEventCaller extends StandardEventCaller<ChannelUpdateEvent> {}

    private static class MessageAddEventCaller extends StandardEventCaller<MessageAddEvent> {}
    private static class MessageRemoveEventCaller extends StandardEventCaller<MessageRemoveEvent> {}
    private static class MessageUpdateEventCaller extends StandardEventCaller<MessageUpdateEvent> {}
}
