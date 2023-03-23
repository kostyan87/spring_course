package com.ignatev.aop.aspects;

//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Component
//@Aspect
@Order(3)
public class ExceptionHandlingAspect {
//    @Before("com.ignatev.aop.aspects.Pointcuts.allAddMethods()")
//    public void beforeAddExceptionHandlingAdvice() {
//        System.out.println("beforeAddExceptionHandlingAdvice:" +
//                " handling exception before get book/magazine");
//        System.out.println("------------------------------------------");
//    }
}
