package com.ignatev.spring_core;

import org.springframework.beans.factory.annotation.Value;

//@Component
public class Person {
//    @Autowired
//    @Qualifier("cat")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    //    @Autowired
    public Person() {
        System.out.println("Person bean is created");
    }

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet");
        pet.say();
    }
}
