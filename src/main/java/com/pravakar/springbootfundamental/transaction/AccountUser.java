package com.pravakar.springbootfundamental.transaction;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class AccountUser {

    @Transactional
    public void saveUserDetails() {
//        System.out.println("UPDATE QUERY To update the user DB value");
//        throw new RuntimeException("Exception in saving user details");
    }
}
