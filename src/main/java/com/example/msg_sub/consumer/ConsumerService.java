package com.example.msg_sub.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @RabbitListener(queues = {"${queue.name}"})
    public void consumeMessage(@Payload MessageForm form){
        System.out.println(form.getName());
        System.out.println(form.getAmount());
    }
}
