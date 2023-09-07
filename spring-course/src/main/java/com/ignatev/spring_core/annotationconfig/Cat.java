package com.ignatev.spring_core.annotationconfig;

import com.ignatev.spring_core.xmlconfig.setterDI.Pet;
import org.springframework.context.annotation.Scope;
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
