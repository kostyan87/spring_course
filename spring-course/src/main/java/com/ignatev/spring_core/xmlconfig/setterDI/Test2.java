package com.ignatev.spring_core.xmlconfig.setterDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("xmlconfig/setterDI/applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        context.close();
    }
}
