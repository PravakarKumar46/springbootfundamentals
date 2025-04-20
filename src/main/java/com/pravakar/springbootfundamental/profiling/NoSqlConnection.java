package com.pravakar.springbootfundamental.profiling;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "prod")
public class NoSqlConnection {
    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @PostConstruct
    public void init() {
        System.out.println("NoSqlConnection initialized with username: " + username + " and password: " + password);
    }
}
