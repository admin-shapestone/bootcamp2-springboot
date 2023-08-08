  package com.shapestone.bootcamp2springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shapestone.bootcamp2springboot.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
