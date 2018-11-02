package ch.cheng.dubbopro.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 10:59
 */
@RestController
public class TopicController {
    @Autowired
    private Sender sender;
    
    @RequestMapping("/topictest")
    public void topicTest(){
        sender.send();
    }
}
