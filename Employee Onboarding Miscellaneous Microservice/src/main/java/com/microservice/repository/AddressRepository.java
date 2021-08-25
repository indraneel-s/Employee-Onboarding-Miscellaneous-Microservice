package com.microservice.repository;

import com.microservice.entity.Address;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends CrudRepository<Address,Integer> {
    Address findByAddressIdAndType(int addressId, String type);



}