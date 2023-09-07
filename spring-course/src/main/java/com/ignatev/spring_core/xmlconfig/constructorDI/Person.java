package com.ignatev.spring_core.xmlconfig.constructorDI;

public class Person {
    private Dog dog;

    public Person(Dog dog) {
        System.out.println("Person bean is created");
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }
}
