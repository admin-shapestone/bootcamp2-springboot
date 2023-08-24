package com.shapestone.bootcamp2springboot.repostitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shapestone.bootcamp2springboot.model.Patient;
import com.shapestone.bootcamp2springboot.model.Treatment;

@Repository
public interface PatientPortalRepository extends CrudRepository<Patient, Integer> {

}
