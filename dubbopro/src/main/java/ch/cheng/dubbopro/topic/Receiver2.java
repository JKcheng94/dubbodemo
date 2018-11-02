package ch.cheng.dubbopro.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 10:55
 */
@Component
@RabbitListener(queues = "topic.messages")
public class Receiver2 {
    
    @RabbitHandler
    public void receive(String msg){
        System.out.println("topicMessagesReceive2------" + msg);
    }
}
