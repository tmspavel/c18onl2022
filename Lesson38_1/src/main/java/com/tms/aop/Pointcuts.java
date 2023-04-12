package com.tms.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(public * com.tms.service.UserService.*(..))")
    public void userServiceMethods() {
    }
}
