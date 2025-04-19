package com.pravakar.springbootfundamental.beanscope;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


//@Scope("prototype")
@RestController
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScopeBean {
//
//    PrototypeScopeBean prototypeScopeBean;
//
//    @Lazy
//    @Autowired
//    public RequestScopeBean(PrototypeScopeBean prototypeScopeBean) {
//        this.prototypeScopeBean = prototypeScopeBean;
//    }

    private final String requestId = UUID.randomUUID().toString();

    public String getRequestId() {
        return requestId;
    }
    public RequestScopeBean() {
        System.out.println("RequestScopeBean -> class: " + this.hashCode());
//        prototypeScopeBean.firePrototypeMethod();
    }
//
//    public void fireRequestMethod() {
//        System.out.println("RequestScopeBean fireRequestMethod");
//    }

    @PostConstruct
    public void init() {
        System.out.println("RequestScopeBean post construct");
    }
}
