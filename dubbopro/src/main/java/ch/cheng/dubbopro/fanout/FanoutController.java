package ch.cheng.dubbopro.fanout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright (C) 2018 
 * @Description: TODO
 * @Author dp_blue
 * @Date 2018-11-02 14:00
 */
@RestController
public class FanoutController {
    
    @Autowired
    private FanoutSender fanoutSender;
    
    @RequestMapping("/fanoutTest")
    public void fanoutTest(){
        fanoutSender.send();
    }
}
