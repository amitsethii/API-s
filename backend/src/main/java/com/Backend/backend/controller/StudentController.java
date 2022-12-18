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
	
	//create
	@PostMapping("/")
	public ResponseEntity<Student>createStu(@RequestBody Student newStudent){
	Student studentCreated = this.stuService.createStudent(newStudent);
	return new ResponseEntity<>(studentCreated,HttpStatus.CREATED);	
	}
	
	//update
	@PutMapping("/{id}")
	public ResponseEntity<Student>updateStu(@RequestBody Student upstudent,@PathVariable Integer id ){
		Student studentUpdated = this.stuService.updateStudent(upstudent, id);
		return ResponseEntity.ok(studentUpdated);
	}
	
	//delete
	@DeleteMapping("/{id}")
	public ResponseEntity<Student>deleteStu(@PathVariable Integer id ){
		return ResponseEntity.ok(this.stuService.deleteStudent(id));
	}
	
	//getAll
	@GetMapping("/")
	public ResponseEntity<List<Student>>getAllStu(){
		return ResponseEntity.ok(this.stuService.getAllStu());
	}
	
	//getSingle
	@GetMapping("/{id}")
	public ResponseEntity<Student>getSingleStudent(@PathVariable Integer id){
		return ResponseEntity.ok(this.stuService.getStudentById(id));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
