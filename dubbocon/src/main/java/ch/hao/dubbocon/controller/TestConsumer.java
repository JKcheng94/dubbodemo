package ch.hao.dubbocon.controller;

import ch.hao.dubbocon.service.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-10-19 17:57
 */
@RestController
public class TestConsumer {
    
    @Autowired
    private Consumer consumer;
    
    @RequestMapping("/save")
    public void saveUser(){
        
        String str = "++++++++++++dubbotest++++++++++++";
        consumer.saveUser(str);
    }
}
