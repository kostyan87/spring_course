package com.ignatev.aop.aspects;

//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Aspect
@Order(2)
public class SecurityAspect {
//    @Before("com.ignatev.aop.aspects.Pointcuts.allAddMethods()")
//    public void beforeAddSecurityAdvice() {
//        System.out.println("beforeAddSecurityAdvice: security check");
//        System.out.println("------------------------------------------");
//    }
}
