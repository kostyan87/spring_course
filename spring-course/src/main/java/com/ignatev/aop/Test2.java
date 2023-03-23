package com.ignatev.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AOPConfig.class);

        University university = context.getBean("university", University.class);

        try {
            List<Student> studentList = university.getStudents();
            System.out.println(studentList);
        }
        catch (Exception e) {
            System.out.println("CATCH");
        }

        context.close();
    }
}
