package com.ignatev.aop.aspects;

import com.ignatev.aop.Book;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Aspect
@Order(1)
public class LoggingAspect {
//    @Before("com.ignatev.aop.aspects.Pointcuts.allAddMethods()")
//    public void beforeAddLoggingBookAdvice(JoinPoint joinPoint) {
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//
//        if (methodSignature.getName().equals("addBook")) {
//            for (Object o:
//                    joinPoint.getArgs()) {
//                if (o instanceof Book) {
//                    Book book = (Book) o;
//                    System.out.println(book);
//                }
//                else {
//                    System.out.println("Added by: " + o);
//                }
//            }
//        }
//
//        System.out.println("beforeAddLoggingBookAdvice: logging get book/magazine");
//        System.out.println("------------------------------------------");
//    }

//    @Pointcut("execution(* com.ignatev.aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniversityLibrary() {}
//
//    @Pointcut("execution(* com.ignatev.aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniversityLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniversityLibrary() || allReturnMethodsFromUniversityLibrary()")
//    private void allReturnGetAndReturnMethodsFromUniversityLibrary() {}
//
//    @Before("allGetMethodsFromUniversityLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniversityLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allReturnGetAndReturnMethodsFromUniversityLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");

//    }
}
