package com.ignatev.hibernate_test;

import com.ignatev.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            session.beginTransaction();

//            Employee employee1 = session.get(Employee.class, 1);
//
            
            session
                    .createQuery("update Employee set salary=1000 " +
                    "where name='Kosta'")
                    .executeUpdate();

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
