package com.example.demo.service;

import com.example.demo.model.ClockDataRevision;
import com.example.demo.model.Employee;
import com.example.demo.repository.ClockDataRevisionRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.utility.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ClockService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ClockDataRevisionRepository clockDataRevisionRepository;

    public boolean addEvent(Long employeeId, EventType eventType) throws StringIndexOutOfBoundsException{
        try {
            Optional<Employee> employee = employeeRepository.findById(employeeId);
            if (employee.isPresent()) {
                ClockDataRevision clockDataRevision = new ClockDataRevision(employee.get(), eventType, LocalDateTime.now());
                clockDataRevisionRepository.save(clockDataRevision);
                return true;
            }
            else{
                throw new StringIndexOutOfBoundsException("Employee not exist. Please login again");
            }
        }catch (StringIndexOutOfBoundsException exception){
            throw new StringIndexOutOfBoundsException(exception.getMessage());
        }

    }
}
