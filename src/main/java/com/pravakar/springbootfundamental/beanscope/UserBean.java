package com.pravakar.springbootfundamental.beanscope;

import com.pravakar.springbootfundamental.bean.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Scope("singleton")
@Scope("session")
@RequestMapping(path = "/api/")
public class UserBean {

    /**
     * Request Scope Bean
     */
//    private final RequestScopeBean requestBean;
//
//    public UserBean(RequestScopeBean requestBean) {
//        System.out.println("RequestScopeBean userBean: "+ requestBean.hashCode());
//        this.requestBean = requestBean;
//    }
//
//    @GetMapping("/request")
//    public String getRequestInfo() {
//        return "Request ID: " + requestBean.getRequestId();
//    }

//    RequestScopeBean requestScopeBean;
////    public UserBean() {
////        System.out.println("UserBean initialized");
////    }
//
//    @Autowired
//    public UserBean(RequestScopeBean requestScopeBean) {
//        this.requestScopeBean = requestScopeBean;
//        System.out.println("UserBean constructor injected");
//        System.out.println("RequestScopeBean: "+ requestScopeBean.hashCode());
//    }
//
//    @GetMapping(value = "/fetchUserss")
//    public ResponseEntity<String> getUserDetails() {
//        return ResponseEntity.ok("fetching and returning the user details");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("UserBean post construct");
//    }

}
