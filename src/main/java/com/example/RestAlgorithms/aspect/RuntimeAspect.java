package com.example.RestAlgorithms.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RuntimeAspect {

    @Pointcut("execution(* com.example.RestAlgorithms.service..*(..))")
    public void serviceMethods(){};

    @Around("serviceMethods()")
    public Object methodRuntime(ProceedingJoinPoint pjp) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println("Entering method");
        Object output = pjp.proceed();
        System.out.println("Method completed");
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println(String.format("Execution time %d milliseconds", elapsedTime));
        return output;

    }
}
