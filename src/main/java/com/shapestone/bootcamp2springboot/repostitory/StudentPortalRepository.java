package com.shapestone.bootcamp2springboot.repostitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shapestone.bootcamp2springboot.model.Student;

@Repository
public interface StudentPortalRepository extends CrudRepository<Student, Integer> {

}
