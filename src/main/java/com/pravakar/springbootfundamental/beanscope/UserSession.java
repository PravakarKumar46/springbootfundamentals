package com.pravakar.springbootfundamental.beanscope;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserSession {

    public UserSession() {
        System.out.println("UserSession initialized");
    }
}
