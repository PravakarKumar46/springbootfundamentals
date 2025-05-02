package com.pravakar.springbootfundamental.dependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class OnlineOrder implements OrderInterface {

    public OnlineOrder() {
//        System.out.println("OnlineOrder initialized");
    }
}
