package com.pravakar.springbootfundamental.aop;

import org.springframework.stereotype.Component;

@Component
public class EmployeeUtils {
    public void getEmployeeDetails() {
        System.out.println("Employee details");
    }
}
