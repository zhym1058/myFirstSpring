package com.example.demo.config;

import com.example.demo.pojo.Phone;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//注意ComponentScan与@SpringBootApplication的扫描路径不能有交叉，如果有，就会忽略@SpringBootApplication，使用ComponentScan这个扫描目录
//但是可以用@ComponentScans这种方式，多个@ComponentScan的话，就不会忽略@SpringBootApplication了
//@ComponentScans({@ComponentScan("com.example.aaa"),@ComponentScan("com.example.demo.pojo")})
public class Config {


}
