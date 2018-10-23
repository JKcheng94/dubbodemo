package ch.hao.dubbocon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = {"ch.hao.dubbocon.service"})
public class DubboconApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DubboconApplication.class, args);
    }
}
