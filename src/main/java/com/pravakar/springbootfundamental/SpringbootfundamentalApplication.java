package com.pravakar.springbootfundamental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.pravakar.springbootfundamental"}) // To scan the Bean inside this package or sub packages
@SpringBootApplication
public class SpringbootfundamentalApplication {

	public static void main(String[] args) {
		System.out.println("Before");
		SpringApplication.run(SpringbootfundamentalApplication.class, args);
		System.out.println("After");
//		ConfigurableApplicationContext context = SpringApplication.run(SpringbootfundamentalApplication.class, args);
//		context.close();
//		System.out.println("After context");
	}
}
