package com.example.demo.config;

import com.example.demo.persist.productConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(productConfig.class);
//		Person person = context.getBean(Person.class);
//		System.out.println(person.getInformation());
		SpringApplication.run(DemoApplication.class, args);
	}

}
