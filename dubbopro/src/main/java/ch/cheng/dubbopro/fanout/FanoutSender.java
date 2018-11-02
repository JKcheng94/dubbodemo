package ch.cheng.dubbopro.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 13:53
 */
@Component
public class FanoutSender {
    
    @Autowired
    private AmqpTemplate amqpTemplate;
    
    public void send(){
        String str = "fanout is here!";
        System.out.println("fanout 发消息了--------");
        //第二个参数指定routing key 不起作用，因为fanout类型的exchange会路由到所有与它绑定的队列
        amqpTemplate.convertAndSend("fanoutExchange","fanout.A",str);
    }
}
