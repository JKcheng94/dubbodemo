package ch.cheng.dubbopro.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 13:56
 */
@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiver1 {
    
    @RabbitHandler
    public void receive(String str){
        System.out.println("fanout.A : " + str);
    }
}
