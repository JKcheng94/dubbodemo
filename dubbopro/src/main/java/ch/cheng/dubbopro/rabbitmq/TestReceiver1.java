package ch.cheng.dubbopro.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 9:02
 */
@Component
@RabbitListener(queues = "chenghao")
public class TestReceiver1 {
    
    @RabbitHandler
    public void receiver(String msg){
        System.out.println("消费者1------" + msg);
    }
}
