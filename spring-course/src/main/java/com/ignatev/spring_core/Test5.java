package com.ignatev.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Pet pet1 = context.getBean("myPet", Pet.class);
        Pet pet2 = context.getBean("myPet", Pet.class);
        System.out.println(pet2 == pet1);

        context.close();
    }
}
