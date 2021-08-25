package com.microservice.repository;

import com.microservice.entity.EmployeeDemographics;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDemographicsRepository extends CrudRepository<EmployeeDemographics,Integer> {



}

