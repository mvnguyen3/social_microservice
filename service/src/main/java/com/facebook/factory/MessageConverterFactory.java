package com.facebook.factory;

import org.springframework.stereotype.Component;

@Component
public class MessageConverterFactory {

    public MessageConverter getConverter(String channel) {
        switch (channel) {
            case "facebook":
                return new FacebookMessageConverter();
            case "twitter":
                return new TwitterMessageConverter();
            default:
                return null;
        }
    }

}






