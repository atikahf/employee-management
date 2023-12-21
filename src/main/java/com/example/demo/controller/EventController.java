package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.ClockService;
import com.example.demo.utility.EventType;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @Autowired
    ClockService clockService;

    @PostMapping(value = "/api/event")
    @ApiOperation(value = "Insert event - CLOCK IN/CLOCK OUT")
    public boolean createEmployee(@RequestParam Long employeeId, @RequestParam EventType eventType) throws StringIndexOutOfBoundsException{
        return clockService.addEvent(employeeId, eventType);
    }

}
