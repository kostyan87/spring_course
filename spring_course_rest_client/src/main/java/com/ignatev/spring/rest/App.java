package com.ignatev.spring.rest;

import com.ignatev.spring.rest.config.Config;
import com.ignatev.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Communication communication = context.getBean("communication",
                Communication.class);

        System.out.println(communication.getAllEmployees());

        System.out.println(communication.getEmployee(3));

        Employee employee = new Employee("Sveta", "Sokolova",
                "HR", 900);

        communication.saveEmployee(employee);

        System.out.println(communication.getAllEmployees());

        employee.setId(8);

        communication.saveEmployee(employee);

        System.out.println(communication.getAllEmployees());

        communication.deleteEmployee(9);
        
        System.out.println(communication.getAllEmployees());
    }
}
