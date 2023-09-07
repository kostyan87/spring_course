package com.ignatev.spring_core.scope.prototype;

public class Dog {
    public Dog() {
        System.out.println("Dog bean is created");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
