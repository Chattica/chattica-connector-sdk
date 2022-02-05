package com.chattica.connector.sdk.standard.event.caller;

import com.chattica.connector.sdk.global.event.caller.*;
import com.chattica.connector.sdk.domain.channel.event.caller.ChannelAddEventCaller;
import com.chattica.connector.sdk.domain.channel.event.caller.ChannelRemoveEventCaller;
import com.chattica.connector.sdk.domain.channel.event.caller.ChannelUpdateEventCaller;
import com.chattica.connector.sdk.global.event.caller.EventCallerFacade;
import com.chattica.connector.sdk.domain.message.event.caller.MessageAddEventCaller;
import com.chattica.connector.sdk.domain.message.event.caller.MessageRemoveEventCaller;
import com.chattica.connector.sdk.domain.message.event.caller.MessageUpdateEventCaller;
import com.chattica.connector.sdk.global.event.Event;
import com.chattica.connector.sdk.domain.channel.event.ChannelAddEvent;
import com.chattica.connector.sdk.domain.channel.event.ChannelRemoveEvent;
import com.chattica.connector.sdk.domain.channel.event.ChannelUpdateEvent;
import com.chattica.connector.sdk.domain.message.event.MessageAddEvent;
import com.chattica.connector.sdk.domain.message.event.MessageRemoveEvent;
import com.chattica.connector.sdk.domain.message.event.MessageUpdateEvent;
import com.chattica.connector.sdk.global.event.exception.EventRoutingPathNotFound;
import com.chattica.connector.sdk.global.event.listener.EventListener;
import com.chattica.connector.sdk.global.event.listener.container.ListenerContainer;
import com.chattica.connector.sdk.global.data.DataType;
import com.chattica.connector.sdk.standard.event.StandardEventDataType;
import lombok.RequiredArgsConstructor;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Chattica 내의 모든 Event에 대한 Listening/Calling 을 간편하게해주는 EventCallerFacade 에 대한 표준구현체입니다.
 *
 * @see EventCallerFacade
 * @author JeeInho
 * @since 0.0.1alpha-RELEASE
 * @version 0.0.1alpha-RELEASE
 */
@RequiredArgsConstructor
public class StandardEventCallerFacade implements EventCallerFacade {
    private final ChannelAddEventCaller channelAddEventCaller;
    private final ChannelRemoveEventCaller channelRemoveEventCaller;
    private final ChannelUpdateEventCaller channelUpdateEventCaller;

    private final MessageAddEventCaller messageAddEventCaller;
    private final MessageRemoveEventCaller messageRemoveEventCaller;
    private final MessageUpdateEventCaller messageUpdateEventCaller;

    public StandardEventCallerFacade() {
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
    public <T extends Event> void addListener(DataType type, EventListener<T> listener) {
        doWithCallerByEvent((StandardEventDataType) type, (caller) -> {
            //TODO ListenerContainer 의 Generic T 와 해당 메서드의 Generic T 가 서로 일치하지 않을 경우 오류발생 즉, doWithCallerByEvent 의 반환값에 따라 오류가 발생할 수 있다.
            if (caller instanceof ListenerContainer container) container.addListener(listener);
            else throw new RuntimeException("해당 이벤트에 대한 caller 는 listener 추가를 지원하지 않습니다!");
        });
    }

    private void  doWithCallerByEvent(StandardEventDataType type, Consumer<EventCaller> callback) {
        switch (type) {
            case EVENT_CHANNEL_ADD -> callback.accept(channelAddEventCaller);
            case EVENT_CHANNEL_REMOVE -> callback.accept(channelRemoveEventCaller);
            case EVENT_CHANNEL_UPDATE -> callback.accept(channelUpdateEventCaller);
            case EVENT_MESSAGE_ADD -> callback.accept(messageAddEventCaller);
            case EVENT_MESSAGE_REMOVE -> callback.accept(messageRemoveEventCaller);
            case EVENT_MESSAGE_UPDATE -> callback.accept(messageUpdateEventCaller);
            default -> throw new RuntimeException("이벤트타입을 찾을 수 없습니다 - " + type.getType());
        }
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
}
