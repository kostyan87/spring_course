package com.ignatev.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AOPConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        Book book = context.getBean("book", Book.class);
//        universityLibrary.getBook();
//        universityLibrary.returnBook();
//        universityLibrary.getMagazine();
//        universityLibrary.returnMagazine();
        universityLibrary.addBook("Kostya", book);
        universityLibrary.addMagazine();
//        schoolLibrary.getBook();

        context.close();
    }
}
