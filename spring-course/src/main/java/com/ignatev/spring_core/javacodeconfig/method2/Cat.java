package com.ignatev.spring_core.javacodeconfig.method2;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow ");
    }
}
