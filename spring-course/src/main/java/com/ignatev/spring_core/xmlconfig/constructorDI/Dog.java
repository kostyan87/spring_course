package com.ignatev.spring_core.xmlconfig.constructorDI;

import com.ignatev.spring_core.xmlconfig.setterDI.Pet;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }
}
