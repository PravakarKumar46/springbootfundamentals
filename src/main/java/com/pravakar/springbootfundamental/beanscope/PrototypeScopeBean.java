package com.pravakar.springbootfundamental.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrototypeScopeBean {

//    RequestScopeBean requestScopeBean;

    public PrototypeScopeBean() {
        System.out.println("PrototypeScopeBean initialized");
    }

//    @Autowired
//    public PrototypeScopeBean(RequestScopeBean requestScopeBean) {
//        System.out.println("PrototypeScopeBean constructor injected");
//        this.requestScopeBean = requestScopeBean;
//        firePrototypeMethod();
//    }
//
//    public void firePrototypeMethod() {
//        System.out.println("PrototypeScopeBean firePrototypeMethod");
//        requestScopeBean.fireRequestMethod();
//    }

}
