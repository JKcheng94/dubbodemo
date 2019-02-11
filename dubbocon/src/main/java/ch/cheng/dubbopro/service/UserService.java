package ch.cheng.dubbopro.service;


import ch.cheng.dubbopro.DTO.User;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-10-19 17:51
 */
public interface UserService {
    void saveUser(String str);
    
    void soutUser(User user);
}
