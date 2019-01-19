package com.ilkayaktas.springexperiment.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * Created by iaktas on 18.01.2019 at 18:44.
 */

@Aspect
@Configuration
public class LogAspect {

    @Before("execution(* *.getSomething())")
    public void getAllAdvice(JoinPoint joinPoint){
        System.out.println("Before getSomething " + joinPoint.getSignature().getName());
    }

    @After("execution(* *.getSomething())")
    public void afterSomething(){
        System.out.println("After getSomething");
    }

    @Before("execution(* com.ilkayaktas.springexperiment.model.*.getName())")
    public void getNameAdvice(JoinPoint joinPoint){
        System.out.println("Before getName " + joinPoint.toLongString());
    }

    @Pointcut("execution(* com.ilkayaktas.springexperiment.model.*.out())")
    public void getNamePointcut(){
    }

    @Before("getNamePointcut()")
    public void loggingAdvice(JoinPoint joinPoint){
        System.out.println("Before out Pointcut " + joinPoint.toLongString());
    }

    @Before("getNamePointcut()")
    public void secondAdvice(JoinPoint joinPoint){
        System.out.println("After out Pointcut " + joinPoint.toLongString());
    }

}
