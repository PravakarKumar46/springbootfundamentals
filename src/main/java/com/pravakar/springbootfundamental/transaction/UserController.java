package com.pravakar.springbootfundamental.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class UserController {

    @Autowired
    AccountUser accountUser;

    @GetMapping(value = "/saveUser")
    public String saveUser() {
        accountUser.saveUserDetails();
        return "successfully saved the user details";
    }
}
