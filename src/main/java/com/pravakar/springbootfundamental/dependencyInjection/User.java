package com.pravakar.springbootfundamental.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

//    @Autowired
//    public final Order order;//can not be used with immutable variable -> Field 'order' might not have been initialized
    /**
     * Field Injection
     */
//    @Autowired
//    public Order order;

    /**
     * Setter Injection
     */
//    public Order order;
//    @Autowired
//    public void setOrder(Order order) {
//        this.order = order;
//    }

    /**
     * Constructor Injection
     */
//    public final Order order;
//    public final Invoice invoice;

//    @Autowired
//    public User(Order order) {
//        this.order = order;
//        System.out.println("User initialized with Order");
//    }

//    @Autowired
//    public User(Invoice invoice) {
//        this.invoice = invoice;
//        System.out.println("User initialized with Invoice");
//    }
    @Qualifier("offline")
    @Autowired
    public OrderInterface orderInterface;

    public User() {
//        System.out.println("User initialized");
    }

//    public void processOrder() {
//       order.process();
//    }

}
