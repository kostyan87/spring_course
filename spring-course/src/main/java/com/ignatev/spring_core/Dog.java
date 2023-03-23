package com.ignatev.spring_core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
