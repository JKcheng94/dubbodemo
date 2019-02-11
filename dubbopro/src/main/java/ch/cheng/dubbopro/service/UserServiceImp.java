package ch.cheng.dubbopro.service;

import ch.cheng.dubbopro.DTO.User;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-10-19 17:49
 */
@Service(version = "1.0")
public class UserServiceImp implements UserService {
    @Override
    public void saveUser(String str) {
        System.out.println("调用成功:" + str);
    }
    
    @Override
    public void soutUser(User user) {
        System.out.println(user.toString());
    }
}
