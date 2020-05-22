package com.facebook.factory;

import com.facebook.pojo.Conversation;

public interface MessageConverter {
    Conversation convert(String messagePayload);
}
