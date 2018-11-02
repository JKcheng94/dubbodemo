package ch.cheng.dubbopro.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 9:21
 */
@RestController
public class TestController {
    
    @Autowired
    private TestProducer testProducer;
    @Autowired
    private TestProducer2 testProducer2;
    
    @RequestMapping("/send")
    public void hello(){
        testProducer.send("11111");
    }
    
    @RequestMapping("/oneToMany")
    public void oneToMany(){
        for(int i = 0; i < 10; i++){
            testProducer.send("message:" + i);
        }
    }
    
    @RequestMapping("/manyToMany")
    public void manyToMany(){
        for(int i = 0; i < 10; i++){
            testProducer.send("message:" + i);
            testProducer2.send("message:" + i);
        }
    }
}
