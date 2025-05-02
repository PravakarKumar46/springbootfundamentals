package com.pravakar.springbootfundamental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootfundamentalApplication {

	public static void main(String[] args) {
//		System.out.println("Before");
		SpringApplication.run(SpringbootfundamentalApplication.class, args);
//		System.out.println("After");
//		ConfigurableApplicationContext context = SpringApplication.run(SpringbootfundamentalApplication.class, args);
//		context.close();
//		System.out.println("After context");
	}
}
