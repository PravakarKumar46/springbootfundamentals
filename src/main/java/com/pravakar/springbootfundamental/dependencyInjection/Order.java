package com.pravakar.springbootfundamental.dependencyInjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order {

    public Order() {
        System.out.println("Order initialized");
    }

    public void process() {
        System.out.println("Processing order");
    }

}
