package ch.hao.dubbocon.controller;

import ch.cheng.dubbopro.DTO.User;
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
    
    @RequestMapping("/soutUser")
    public void soutUser(){
        User user = new User();
        user.setAge(25);
        user.setId(777);
        user.setName("AK94");
        consumer.soutUser(user);
    }
}
