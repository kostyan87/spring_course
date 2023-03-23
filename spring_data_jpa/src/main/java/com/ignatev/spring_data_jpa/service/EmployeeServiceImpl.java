package com.ignatev.spring_data_jpa.service;

import com.ignatev.spring_data_jpa.dao.EmployeeRepository;
import com.ignatev.spring_data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployee(int id) {
        return employeeRepository.findById(id);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findEmployeesByName(String name) {
        return employeeRepository.findAllByName(name);
    }
}
