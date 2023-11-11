package com.altimetrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
