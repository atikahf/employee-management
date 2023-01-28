package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/api/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping(value = "/api/employee")
    public Iterable<Employee> getEmployees(){
        return employeeService.getEmployee();
    }

    @GetMapping(value = "/api/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping(value = "/api/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping(value = "/api/employee/{id}")
    public boolean deleteEmployee(@PathVariable long id) { return employeeService.deleteEmployee(id); }
}
