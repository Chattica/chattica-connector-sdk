package com.chattica.connector.sdk.domain.event.caller.facade;

import com.chattica.connector.sdk.domain.event.caller.EventCaller;
import com.chattica.connector.sdk.domain.event.caller.StandardEventCaller;
import com.chattica.connector.sdk.domain.event.data.dto.Event;
import com.chattica.connector.sdk.domain.event.data.dto.event.channel.ChannelAddEvent;
import com.chattica.connector.sdk.domain.event.data.dto.event.channel.ChannelRemoveEvent;
import com.chattica.connector.sdk.domain.event.data.dto.event.channel.ChannelUpdateEvent;
import com.chattica.connector.sdk.domain.event.data.dto.event.message.MessageAddEvent;
import com.chattica.connector.sdk.domain.event.data.dto.event.message.MessageRemoveEvent;
import com.chattica.connector.sdk.domain.event.data.dto.event.message.MessageUpdateEvent;
import com.chattica.connector.sdk.domain.event.exception.EventRoutingPathNotFound;
import com.chattica.connector.sdk.domain.event.listener.EventListener;
import com.chattica.connector.sdk.domain.event.listener.container.ListenerContainer;

import java.util.function.BiConsumer;

public class ChatticaEventCallerFacade implements EventCallerFacade{
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
    @Override
    public void routeEvent(Event event) {
        doWithCallerByEvent(event, EventCaller::callEvent);
    }

    //TODO 뭔가 RxJava 나 Reactor 같은거로 만들 수 있을 것 같은데
    @Override
    public <T extends Event> void addListener(T event, EventListener<T> listener) {
        doWithCallerByEvent(event, (caller, e) -> {
            //TODO ListenerContainer 의 Generic T 와 해당 메서드의 Generic T 가 서로 일치하지 않을 경우 오류발생 즉, doWithCallerByEvent 의 반환값에 따라 오류가 발생할 수 있다.
            if (caller instanceof ListenerContainer container) container.addListener(listener);
            else throw new RuntimeException("해당 이벤트에 대한 caller 는 listener 추가를 지원하지 않습니다!");
        });
    }

    private void  doWithCallerByEvent(Event event, BiConsumer<EventCaller, Event> callback) {
        switch (event) {
            case ChannelAddEvent e -> callback.accept(channelAddEventCaller, e);
            case ChannelRemoveEvent e -> callback.accept(channelRemoveEventCaller, e);
            case ChannelUpdateEvent e -> callback.accept(channelUpdateEventCaller, e);

            case MessageAddEvent e -> callback.accept(messageAddEventCaller, e);
            case MessageRemoveEvent e -> callback.accept(messageRemoveEventCaller, e);
            case MessageUpdateEvent e -> callback.accept(messageUpdateEventCaller, e);
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
