package com.ignatev.spring.mvc_hibernate_aop.dao;

import com.ignatev.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from Employee", Employee.class)
                .getResultList();
    }

    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }

    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        session
                .createQuery("delete from Employee where id=:employeeId")
                .setParameter("employeeId", id)
                .executeUpdate();
    }
}
