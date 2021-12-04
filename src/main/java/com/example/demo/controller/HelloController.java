package com.example.demo.controller;


import com.example.demo.persist.ProductMapper;
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
        System.out.println(productMapper.getProduct(id));
        System.out.println(person.getInformation());
        return person;
    }




}
