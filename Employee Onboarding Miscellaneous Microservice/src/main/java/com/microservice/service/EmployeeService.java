package com.microservice.service;

import com.microservice.entity.EmployeeDemographics;
import com.microservice.repository.EmployeeDemographicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDemographicsRepository employeeDemographicsRepository;

    public void saveUser(EmployeeDemographics employeeDemographics)
    {
        employeeDemographicsRepository.save(employeeDemographics);
    }
}
