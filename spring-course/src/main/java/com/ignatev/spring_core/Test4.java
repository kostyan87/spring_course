package com.ignatev.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}
