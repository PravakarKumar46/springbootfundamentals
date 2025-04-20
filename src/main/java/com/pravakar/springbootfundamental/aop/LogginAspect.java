package com.pravakar.springbootfundamental.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

////    @Before(value = "execution(public void com.pravakar.springbootfundamental.aop.UserAop())")
//    @After(value = "target(com.pravakar.springbootfundamental.aop.EmployeeUtils)")
//    public void methodExecution() {
//        System.out.println("Logging");
//    }

    /**
     * Named Aspect -> Replacing the big pointcut expression with a named pointcut expression.
     */

    @Pointcut("execution(public void com.pravakar.springbootfundamental.aop.EmployeeUtils.getEmployeeDetails())")
    public void employeeDetails() {
        //will be empty
    }

//    @Before("employeeDetails()")
//    public void beforeEmployeeDetails() {
//        System.out.println("Before employee details first");
//    }

    @Around("employeeDetails()")
    public void beforeEmployeeDetails(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before employee details");
        joinPoint.proceed();
        System.out.println("After employee details");
    }
}
