package com.tms.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect {

    @Around("Pointcuts.userServiceMethods()")
    public Object beforeGet(final ProceedingJoinPoint jp) throws Throwable {
        System.out.println("beforeGetAspect start");
        Object proceed = jp.proceed();
        System.out.println("beforeGetAspect end");
        return proceed;
    }
}
