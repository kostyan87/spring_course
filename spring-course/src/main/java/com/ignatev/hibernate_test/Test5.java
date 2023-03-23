package com.ignatev.hibernate_test;

import com.ignatev.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee1 = session.get(Employee.class, 1);
//            session.delete(employee1);

            session
                    .createQuery("delete Employee " +
                            "where name = 'Oleg'")
                    .executeUpdate();

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
