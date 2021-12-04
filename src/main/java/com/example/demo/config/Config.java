package com.example.demo.config;

import com.example.demo.controller.Phone;
import com.example.demo.persist.productConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(productConfig.class)
@ComponentScan("com.example.demo.controller")
public class Config {

    @Bean
    public Phone initPhone() {
        Phone phone = new Phone();
//        phone.setType("iphone7 plus");
//        phone.setPrice(6800);
        return phone;
    }

}
