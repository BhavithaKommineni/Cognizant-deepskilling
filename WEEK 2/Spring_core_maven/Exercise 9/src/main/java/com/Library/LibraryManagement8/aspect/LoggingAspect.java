package com.Library.LibraryManagement8.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.Library.LibraryManagement8.service.*.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {
        System.out.println("Before method: " + joinPoint.getSignature().toShortString());
    }

    @After("execution(* com.Library.LibraryManagement8.service.*.*(..))")
    public void logAfterMethod(JoinPoint joinPoint) {
        System.out.println("After method: " + joinPoint.getSignature().toShortString());
    }
}
