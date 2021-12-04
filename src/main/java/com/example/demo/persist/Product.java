package com.example.demo.persist;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

//Mybatis别名定义
@Alias("product")
public class Product implements Serializable {
    private static final long serialVersionUID = 123456789;
    private long id;
    private String productName;
    private int stock;
    private int version;
    private String note;

    public void setId(long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public int getVersion() {
        return version;
    }

    public String getNote() {
        return note;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
