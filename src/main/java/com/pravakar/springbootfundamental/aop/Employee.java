package com.pravakar.springbootfundamental.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class Employee {

    @Autowired
    private EmployeeUtils employeeUtils;

    @GetMapping(value = "/fetchEmployee")
    public String getEmployeeDetails() {
        employeeUtils.getEmployeeDetails();
        return "employee details";
    }
}
