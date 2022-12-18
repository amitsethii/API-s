package com.Backend.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.backend.entity.Student;
import com.Backend.backend.service.StudentService;
import com.Backend.backend.serviceimpl.StudentServiceImpl;

@RestController
@RequestMapping("/api/stu")
public class StudentController {

	@Autowired
	private StudentService stuService;
	
	@PostMapping("/")
	public ResponseEntity<Student>createStu(@RequestBody Student stu){
	Student stu2 = this.stuService.createStudent(stu);
	return new ResponseEntity<>(stu2,HttpStatus.CREATED);	
	}
	
	
	
}
