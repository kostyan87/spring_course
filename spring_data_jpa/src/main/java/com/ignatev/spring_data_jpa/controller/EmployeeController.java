package com.ignatev.spring_data_jpa.controller;

import com.ignatev.spring_data_jpa.entity.Employee;
import com.ignatev.spring_data_jpa.exception_handling.NoSuchEmployeeException;
import com.ignatev.spring_data_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Optional<Employee> employee = employeeService.getEmployee(id);

        if (employee.isEmpty())
            throw new NoSuchEmployeeException("There is no employee with this id");

        return employee.get();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Optional<Employee> employee = employeeService.getEmployee(id);

        if (employee.isEmpty())
            throw new NoSuchEmployeeException("There is no employee with this id");

        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted";
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> getEmployeesByName(@PathVariable String name) {
        return employeeService.findEmployeesByName(name);
    }
}
