package ch.cheng.dubbopro.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 8:59
 */
@Component
public class TestProducer {
    
    @Autowired
    private AmqpTemplate amqpTemplate;
    
    public String send(String msg){
        String content = msg + "-----Date:" + new Date();
        System.out.println("生产者1------" + content);
        amqpTemplate.convertAndSend("chenghao",content);
        return content;
    }
}
