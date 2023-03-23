package com.ignatev.spring.springboot.dao;

import com.ignatev.spring.springboot.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO<Employee> {
    @Autowired
    private EntityManager entityManager;

    public List<Employee> getAllEmployees() {
        Query query = entityManager.createQuery("from Employee");
        List<Employee> employees = query.getResultList();
        return employees;

//        Session session = entityManager.unwrap(Session.class);
//        return session
//                .createQuery("from Employee", Employee.class)
//                .getResultList();
    }

    public void saveEmployee(Employee employee) {
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(employee);
    }

    public Employee getEmployee(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;

//        Session session = entityManager.unwrap(Session.class);
//        return session.get(Employee.class, id);
    }

    public void deleteEmployee(int id) {
        entityManager
                .createQuery("delete from Employee " +
                        "where id=:employeeId")
                .setParameter("employeeId", id)
                .executeUpdate();
//        Session session = entityManager.unwrap(Session.class);
//        session
//                .createQuery("delete from Employee where id=:employeeId")
//                .setParameter("employeeId", id)
//                .executeUpdate();
    }
}
