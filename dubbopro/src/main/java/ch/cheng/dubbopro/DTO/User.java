package ch.cheng.dubbopro.DTO;

import java.io.Serializable;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-10-19 17:47
 */

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private static int id;
    
    private static String name;
    
    private static String age;
    
    public static int getId() {
        return id;
    }
    
    public static void setId(int id) {
        User.id = id;
    }
    
    public static String getName() {
        return name;
    }
    
    public static void setName(String name) {
        User.name = name;
    }
    
    public static String getAge() {
        return age;
    }
    
    public static void setAge(String age) {
        User.age = age;
    }
}
