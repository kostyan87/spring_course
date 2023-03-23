package com.ignatev.aop.aspects;

//import com.sun.corba.se.spi.ior.ObjectKey;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class NewLoggingAspect {
//    @Around("execution(public String returnBook())")
//    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
//            throws Throwable {
//        System.out.println("TRY TO RETURN book to library");
//
//        Object targetMethodResult = null;
//        try {
//            targetMethodResult = proceedingJoinPoint.proceed();
//        }
//        catch (Exception e) {
//            System.out.println("HANDLING EXCEPTION");
//            throw e;
//        }
//
//        System.out.println("RETURN book to library");
//
//        return targetMethodResult;
//    }
}
