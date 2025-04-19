package com.pravakar.springbootfundamental.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
@RequestMapping(path = "/api/")
public class SessionScopeBean {

//    RequestScopeBean requestScopeBean;
//
//    @Autowired
//    public SessionScopeBean(RequestScopeBean requestScopeBean) {
//        System.out.println("SessionScopeBean constructor injected");
//        this.requestScopeBean = requestScopeBean;
//    }

    public SessionScopeBean() {
        System.out.println("SessionScopeBean initialized : session id:"+ this.hashCode());
    }

    @GetMapping(value = "/fetchSessionUser")
    public ResponseEntity<String> getUserDetails() {
        return ResponseEntity.ok("fetching and returning the user details");
    }
}
