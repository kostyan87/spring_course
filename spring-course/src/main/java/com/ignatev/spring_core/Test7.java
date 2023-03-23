package com.ignatev.spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Pet pet = context.getBean("catBean", Pet.class);
//        pet.say();

        context.close();
    }
}
