package com.andrecastrosousa.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class UserAccessAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls I would intercept
    // execution(* PACKAGE*.*(..))
    // Weaving & Weaver
    @Before("com.andrecastrosousa.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) {
        // Advice
        logger.info(" Check for user access");
        logger.info(" Intercepted method calls {}", joinPoint);
    }
}
