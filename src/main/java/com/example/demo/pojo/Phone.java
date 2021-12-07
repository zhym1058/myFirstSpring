package com.example.demo.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    @Value("iphone7 plus")
    private String type;

    private int price;

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
