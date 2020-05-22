package com.facebook.controller;

import com.facebook.factory.MessageConverter;
import com.facebook.factory.MessageConverterFactory;
import com.facebook.pojo.Conversation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/twitter/webhook")
public class TwitterWebHookController {

    @Autowired
    private MessageConverterFactory messageConverterFactory;

    @PostMapping("/messagePost")
    public ResponseEntity<String> messagePost(@RequestBody String payload) {

        // get the facebook conversation object
        MessageConverter messageConverter = messageConverterFactory.getConverter("twitter");
        Conversation conversation = messageConverter.convert(payload);


        return null;
    }


}














