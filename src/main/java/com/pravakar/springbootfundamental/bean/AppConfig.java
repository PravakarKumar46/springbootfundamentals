package com.pravakar.springbootfundamental.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String userName() {
        return "Pravakar";
    }

    @Bean
    public String email() {
        return "pravakar@gmail.com";
    }

    @Bean
    public User createUser(String userName, String email) {
        System.out.println("Inside createUser method -> 1");
        return new User(userName(), email());
    }

    @Bean
    public User createUserTwo(String userName, String email) {
        System.out.println("Inside createUser method -> 2");
        return new User(userName(), email());
    }

}
