package com.pravakar.springbootfundamental.async_annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {this.customerService = customerService;}

    @GetMapping(value = "/fetchUserDetails")
    public String UserDetails() {
//        System.out.println("inside getUserDetails: " + Thread.currentThread().getName());
        customerService.asyncMethod();
        return "user details fetched";
    }

}
