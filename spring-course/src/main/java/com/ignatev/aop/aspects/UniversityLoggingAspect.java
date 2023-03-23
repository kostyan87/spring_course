package com.ignatev.aop.aspects;

import com.ignatev.aop.Student;
//import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice:" +
//                "BEFORE");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//        students.add(new Student("Grisha", "Leps", 48));
//        System.out.println("beforeGetStudentsLoggingAdvice:" +
//                "AFTER");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//            throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("AFTER THROWING");
//        System.out.println(exception);
//    }

//    @After("execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice() {
//        System.out.println("AFTER");
//    }
}
