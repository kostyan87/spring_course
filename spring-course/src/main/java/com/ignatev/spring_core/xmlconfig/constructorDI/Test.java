package com.ignatev.spring_core.xmlconfig.constructorDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("xmlconfig/constructorDI/applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class); // DI - spring инжектит bean Dog
        person.getDog().say();

        context.close();
    }
}
