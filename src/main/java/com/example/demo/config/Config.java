package com.example.demo.config;

import com.example.demo.pojo.Phone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.pojo")
public class Config {

    @Bean
    public Phone initPhone() {
        Phone phone = new Phone();
//        phone.setType("iphone7 plus");
//        phone.setPrice(6800);
        return phone;
    }

}
