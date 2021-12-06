package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class House {

    private String houseLocation;
    private int housePrice;

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }
    public String getHouseLocation() {
        return houseLocation;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public int getHousePrice() {
        return housePrice;
    }
}
