package com.microservice.controller;

import com.microservice.entity.EmployeeDemographics;
import com.microservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeController {
   @Autowired
   private EmployeeService employeeService;
    @CrossOrigin
    @PostMapping("/user")
    public String submitData( @RequestBody  EmployeeDemographics formData)
    {
        employeeService.saveUser(formData);
        return "Completed User Saved Successfully After The Status Update";
    }
}
