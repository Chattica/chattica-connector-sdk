package com.chattica.connector.sdk.global.data;

//아이디가 존재하는 모든 객체가 구현해야하는 인터페이스
public interface Identifiable{
    <T extends Id> T getId();
}
