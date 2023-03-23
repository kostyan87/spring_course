package com.ignatev.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AOPConfig.class);

        UniversityLibrary universityLibrary =
                context.getBean("universityLibrary", UniversityLibrary.class);

        String bookName = universityLibrary.returnBook();
        System.out.println(bookName);

        context.close();
    }
}
