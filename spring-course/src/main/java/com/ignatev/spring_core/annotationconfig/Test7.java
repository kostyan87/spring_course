package com.ignatev.spring_core.annotationconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationconfig/applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(person.getPet() == cat); // одна и та же ссылка, так как scope=singleton

        context.close();
    }
}
