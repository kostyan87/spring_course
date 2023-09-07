package com.ignatev.spring_core.javacodeconfig.method1;

import com.ignatev.spring_core.xmlconfig.setterDI.Pet;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow ");
    }
}
