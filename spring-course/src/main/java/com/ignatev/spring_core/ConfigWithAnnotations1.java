package com.ignatev.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        person.callYourPet();

        context.close();
    }
}
