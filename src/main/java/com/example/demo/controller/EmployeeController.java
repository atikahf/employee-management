package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/api/employee")
    @ApiOperation(value = "Insert New Employee Details")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping(value = "/api/employee")
    @ApiOperation(value = "Get Employee Details")
    public Iterable<Employee> getEmployees(){
        return employeeService.getEmployee();
    }

    @GetMapping(value = "/api/employee/{id}")
    @ApiOperation(value = "Get Specific Employee Details Based on EmployeeID")
    public Optional<Employee> getEmployeeById(@PathVariable long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping(value = "/api/employee")
    @ApiOperation(value = "Update Employee Details")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping(value = "/api/employee/{id}")
    @ApiOperation(value = "Remove no longer report employee")
    public boolean deleteEmployee(@PathVariable long id) { return employeeService.deleteEmployee(id); }
}
