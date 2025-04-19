package com.pravakar.springbootfundamental.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*@Component
public class User {

    String userName;

    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    */

/**
 * spring will not get defalult constructor on above "User" class so spring won't have idea
 * which type of parameter need to pass into multi parameterized constructor
 * so to create bean @Bean annotation is used and remove @Component annotation and add @Configuration
 *//*
    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

}*/

public class User {
    String userName;
    String email;

    public User(String userName, String email) {
        System.out.println("initializing user");
        this.userName = userName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @PostConstruct
    public void initializedBean() {
        System.out.println("Bean has been created and dependency injection has been done");
    }

    @PreDestroy
    public void destroyBean() {
        System.out.println("Bean is going to be destroyed");
    }
}
