package ch.hao.dubbocon.service;

import ch.cheng.dubbopro.DTO.User;
import ch.cheng.dubbopro.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-10-19 17:54
 */
@Component
public class Consumer {
    
    @Reference(version = "1.0")
    UserService userService;
    
    public void saveUser(String str){
        userService.saveUser(str);
    }
    
    public void soutUser(User user){
        userService.soutUser(user);
    }
}
