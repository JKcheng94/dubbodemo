package ch.cheng.dubbopro.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 10:49
 */
@Component
@RabbitListener(queues = "topic.message")
public class Receiver1 {
    
    @RabbitHandler
    public void receive(String msg){
        System.out.println("topicMessageReceiver1------" + msg);
    }
}
