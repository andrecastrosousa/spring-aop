package com.andrecastrosousa.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class AfterAopAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @After("com.andrecastrosousa.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void after(JoinPoint joinPoint) {
        // Advice
        logger.info("after execution of {}", joinPoint);
    }

    @AfterReturning(value ="com.andrecastrosousa.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        // Advice
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(value ="com.andrecastrosousa.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Object exception) {
        // Advice
        logger.info("{} throwing an exception: {}", joinPoint, exception);
    }
}
