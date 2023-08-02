package com.shapestone.bootcamp2springboot.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shapestone.bootcamp2springboot.model.Student;
import com.shapestone.bootcamp2springboot.repostitory.StudentPortalRepository;

@Service
public class StudentPortalService {
	
	@Autowired
	private StudentPortalRepository studentPortalRepository;
	
	public Student saveStudent(Student student) {
		return studentPortalRepository.save(student);
	}

	public List<Student> getAllStudetns() {
		Iterable<Student> findAll = studentPortalRepository.findAll();
		List<Student> collect = StreamSupport.stream(findAll.spliterator(), false).collect(Collectors.toList());
		return collect;
		
	}

}
