package com.pravakar.springbootfundamental.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

//    @Autowired
//    public final Order order;//can not be used with immutable variable

    @Autowired
    public Order order;

    public User() {
        System.out.println("User initialized");
    }

    public void processOrder() {
       order.process();
    }

}
