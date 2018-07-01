package com.designthink.integration.service;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

public class MessageEnricher {

    public Message<String> enrichMessage(Message<String> message){
        System.out.println("The input Message" + message.getPayload());
        return MessageBuilder.withPayload("Reply for message " + message.getHeaders().get("messageNo")).build();
    }
}


