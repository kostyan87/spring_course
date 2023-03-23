package com.ignatev.hibernate_test;

import com.ignatev.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Petrov",
                    "Sales", 580);

            session.beginTransaction();

            List<Employee> employees = session
                    .createQuery("from Employee " +
                            "where name = 'Kosta' and salary > 550")
                    .getResultList();

            employees.forEach(System.out::println);

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
