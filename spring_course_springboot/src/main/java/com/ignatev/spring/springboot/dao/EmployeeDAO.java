package com.ignatev.spring.springboot.dao;

import com.ignatev.spring.springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO<T extends Employee> {
    List<T> getAllEmployees();

    void saveEmployee(T t);

    T getEmployee(int id);

    void deleteEmployee(int id);
}
