package com.andrecastrosousa.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.andrecastrosousa.springaop.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* com.andrecastrosousa.springaop.business.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("com.andrecastrosousa.springaop.aspect.CommonJoinPointConfig.businessLayerExecution() && com.andrecastrosousa.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void allLayerExecution() {}

    @Pointcut("bean(*dao*)")
    public  void beanContainsDao() {}

    @Pointcut("bean(dao*)")
    public  void beanStartsWithDao() {}

    @Pointcut("within(com.andrecastrosousa.springaop.data..*)")
    public void dataLayerExecutionWithWithin() {}

    @Pointcut("@annotation(com.andrecastrosousa.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation() {}
}
