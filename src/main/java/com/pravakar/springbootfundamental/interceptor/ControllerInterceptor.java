package com.pravakar.springbootfundamental.interceptor;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/apis/")
public class ControllerInterceptor {

    @GetMapping(value = "/interceptorFetchUser")
    public String getInterceptorUserDetails() {
//        System.out.println("inside getInterceptorUserDetails: ");
        return "fetching and returning";
    }

    @PostMapping(value = "/interceptorSaveUser")
    public String saveInterceptorUserDetails() {
//        System.out.println("inside saveUserDetails: ");
        return "successfully saved the user details";
    }
}
