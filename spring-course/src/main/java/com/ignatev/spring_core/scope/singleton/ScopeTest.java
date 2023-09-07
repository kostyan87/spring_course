package com.ignatev.spring_core.scope.singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("scope/singleton/applicationContext.xml");

        Dog myDog1 = context.getBean("dog", Dog.class);
        Dog myDog2 = context.getBean("dog", Dog.class);

        System.out.println(myDog1 == myDog2);

        context.close();
    }
}
