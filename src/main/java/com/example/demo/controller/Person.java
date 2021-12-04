package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties(prefix = "person")
public class Person {

    //自动装配House
    @Autowired
    private House house;

    //自动装配phone
    //phone类里没有写@Component，那么是怎么注入到Ioc的呢？
    //因为把它写到了config类中，config类使用@Configuration来加载，而这个类中使用@Bean注入了phone类
    //所以注入可以采用扫描的方式，也可以使用@Bean，区别就是扫描是类，@Bean是方法，在方法中返回对象

    @Autowired
    private Phone phone;

    @NotNull
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Value("001")
    private String ID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Value("zhangym")
    private String Name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Value("13001135811")
    private String Tel;

    @Value("beijing")
    private String information;


    public Person(){

    }
    public String getID(){
        return this.ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getTel(){
        return this.Tel;
    }
    public void setTel(String tel){
        this.Tel = tel;
    }

    public void setInformation(String information){
        this.information = information;
    }


    public String getInformation(){
        house.setHouseLocation("CGO");
        return house.getHouseLocation()+phone.getType();
    }

    @Override
    public String toString(){
        return "ID:"+ID+"Name:"+Name+"tel:"+Tel;
    }



}
