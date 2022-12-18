package com.Backend.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	//post
	@PostMapping("/")
	public ResponseEntity<Student>createStu(@RequestBody Student stu){
	Student stuCreated = this.stuService.createStudent(stu);
	return new ResponseEntity<>(stuCreated,HttpStatus.CREATED);	
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Student>updateStu(@RequestBody Student stu,@PathVariable Integer id ){
		Student stuUpdated = this.stuService.updateStudent(stu, id);
		return ResponseEntity.ok(stuUpdated);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Student>deleteStu(@PathVariable Integer id ){
		return ResponseEntity.ok(this.stuService.deleteStudent(id));
	}
	
	//getAll
	@GetMapping("/")
	public ResponseEntity<List<Student>>getAllStu(){
		return ResponseEntity.ok(this.stuService.getAllStu());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student>getSingleStudent(@PathVariable Integer id){
		return ResponseEntity.ok(this.stuService.getStudentById(id));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
