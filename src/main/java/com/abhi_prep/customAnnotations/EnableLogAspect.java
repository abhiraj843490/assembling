package com.abhi_prep.customAnnotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EnableLogAspect {

    public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long initTime = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();
        long executionTime = System.currentTimeMillis() - initTime;
        System.out.println("Method Signature is : " + proceedingJoinPoint.getSignature());
        System.out.println("Method executed in : " + executionTime + "ms");
        System.out.println("Input Request: " + proceedingJoinPoint.getArgs()[0]);
        System.out.println("Output Response : " + proceed);
        return proceed;
    }
}
