package com.shapestone.bootcamp2springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shapestone.bootcamp2springboot.model.Student;
import com.shapestone.bootcamp2springboot.service.StudentPortalService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class StudentPortalController {
	final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(StudentPortalController.class);

	@Autowired
	private StudentPortalService studentPortalService;
	
	@GetMapping("/")
	@RequestMapping(method = RequestMethod.GET, value = "/", produces = "application/json", consumes = "applicatoin/json")
	public String sayHello() {
		return "Hello....";
	}
	
	@PostMapping("/saveStudent")
	public Student saveNewStudent(@RequestBody Student student) {
		log.info("Received POST request for saving new student details" + student.toString());
		return studentPortalService.saveStudent(student);
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		return studentPortalService.getAllStudetns();
	}

}
