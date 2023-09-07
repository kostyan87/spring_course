package com.ignatev.spring_core.javacodeconfig.method1;

import com.ignatev.spring_core.xmlconfig.setterDI.Pet;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }
}
