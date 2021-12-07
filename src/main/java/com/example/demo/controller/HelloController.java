package com.example.demo.controller;


import com.example.aaa.Dog;
import com.example.demo.pojo.Person;
import com.example.demo.dao.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    private Person person;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private Dog dog;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @ResponseBody
    @RequestMapping("displayPerson")
    public Person displayPerson(){
        Long id = 1L;
        productMapper.getProduct(id);
        System.out.println(productMapper.getProduct(id).getProductName());
        System.out.println(person.getInformation());
        System.out.println(dog.getName());
        return person;
    }




}
