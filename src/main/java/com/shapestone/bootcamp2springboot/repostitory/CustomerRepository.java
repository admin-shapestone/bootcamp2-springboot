package com.shapestone.bootcamp2springboot.repostitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shapestone.bootcamp2springboot.model.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}
