package ch.hao.dubbocon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ch.hao.dubbocon.service"})
public class DubboconApplication {
    
    public static void main(String[] args) {
        //测试
        SpringApplication.run(DubboconApplication.class, args);
    }
}
