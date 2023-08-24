package com.shapestone.bootcamp2springboot.repostitory;

import org.springframework.data.repository.CrudRepository;

import com.shapestone.bootcamp2springboot.model.Treatment;

public interface TreatmentsPortalRepository extends CrudRepository<Treatment,Integer>{

}
