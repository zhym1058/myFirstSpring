package com.example.demo.pojo;


public class Phone {

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
