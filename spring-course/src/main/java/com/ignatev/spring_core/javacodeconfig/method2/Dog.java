package com.ignatev.spring_core.javacodeconfig.method2;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }
}
