package com.andrecastrosousa.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("com.andrecastrosousa.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        // start Time = x
        // allow execution of method
        // end Time = y
        logger.info("Time taken by {} is {}", joinPoint, timeTaken);
    }
}
