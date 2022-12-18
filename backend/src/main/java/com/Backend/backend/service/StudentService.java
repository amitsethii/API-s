package com.Backend.backend.service;

import java.util.List;

import com.Backend.backend.entity.Student;

public interface StudentService {
	
	Student createStudent(Student stu);
	Student updateStudent(Student stu, Integer id);
	Student getStudentById(Integer id);
	List<Student>getAllStu();
	void deleteStudent(Integer stu);

}
