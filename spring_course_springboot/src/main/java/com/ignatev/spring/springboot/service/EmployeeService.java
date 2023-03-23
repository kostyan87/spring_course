package com.ignatev.spring.springboot.service;

import com.ignatev.spring.springboot.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Optional<Employee> getEmployee(int id);

    void deleteEmployee(int id);
}
