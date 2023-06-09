package com.ignatev.spring_data_jpa.service;

import com.ignatev.spring_data_jpa.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Optional<Employee> getEmployee(int id);

    void deleteEmployee(int id);

    List<Employee> findEmployeesByName(String name);
}
