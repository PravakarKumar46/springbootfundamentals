package com.pravakar.springbootfundamental.dependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("offline")
@Component
public class OfflineOrder implements OrderInterface {

    public OfflineOrder() {
//        System.out.println("OfflineOrder initialized");
    }
}
