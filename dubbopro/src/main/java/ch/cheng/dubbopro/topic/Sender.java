package ch.cheng.dubbopro.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 10:44
 */
@Component
public class Sender {
    
    @Autowired
    private AmqpTemplate amqpTemplate;
    
    public void send(){
        String str1 = "topic1 test........";
        System.out.println("发消息1------" + str1);
        //第二个参数指定routing key 匹配与之对应的队列
        amqpTemplate.convertAndSend("exchange","topic.message",str1);
        
        String str2 = "topic2 test........";
        System.out.println("发消息2------" + str2);
        amqpTemplate.convertAndSend("exchange","topic.messages",str2);
    }
}
