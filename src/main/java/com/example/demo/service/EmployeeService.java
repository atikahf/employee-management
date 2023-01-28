package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        employeeRepository.save(employee);
        return employee;
    }

    public Iterable<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(long id){
        return employeeRepository.findById(id);
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public boolean deleteEmployee(long id){
        employeeRepository.deleteById(id);
        return true;
    }
}
