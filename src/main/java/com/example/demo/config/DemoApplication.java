package com.example.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

//定义spring boot扫描路径
@SpringBootApplication(scanBasePackages = {"com.example.demo"})
//定义jpa接口扫描包路径
@EnableJpaRepositories(basePackages = "com.example.demo.dao")
@MapperScan(
		basePackages = "com.example.demo.*",
		sqlSessionFactoryRef = "sqlSessionFactory",
		sqlSessionTemplateRef = "sqlSessionTemplate",
		annotationClass = Repository.class)
public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//		Person person = context.getBean(Person.class);
//		System.out.println(person.getInformation());
		SpringApplication.run(DemoApplication.class, args);
	}

}
