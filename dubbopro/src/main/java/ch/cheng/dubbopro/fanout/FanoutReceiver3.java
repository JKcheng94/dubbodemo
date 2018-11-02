package ch.cheng.dubbopro.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 13:59
 */
@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiver3 {
    
    @RabbitHandler
    public void receive(String msg){
        System.out.println("fanout.C : " + msg);
    }
}
