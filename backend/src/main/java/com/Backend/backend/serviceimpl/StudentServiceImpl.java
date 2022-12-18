package com.Backend.backend.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.backend.entity.Student;
import com.Backend.backend.repository.StudentRepo;
import com.Backend.backend.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo stuRepo;
	

	@Override
	public Student createStudent(Student stu) {
		// TODO Auto-generated method stub
		Student saveStu = this.stuRepo.save(stu);
		return saveStu;
	}
	
	

	@Override
	public Student updateStudent(Student inputStu, Integer id) {
		// TODO Auto-generated method stub
		Student changeStudent = this.stuRepo.findById(id).orElse(null);
		changeStudent.setName(inputStu.getName());
		changeStudent.setAbout((inputStu.getAbout()));
		
		Student updatedStudent = this.stuRepo.save(changeStudent);
		return updatedStudent;
	}

	//getbyid
	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stu
	Student student = this.stuRepo.findById(id).orElse(null);
		return student;
	}

	//getAll
	@Override
	public List<Student> getAllStu() {
		// TODO Auto-generated method stub
		List<Student> students = this.stuRepo.findAll();
		return students;
	}
	
	@Override
	public Student deleteStudent(Integer id) {
		// TODO Auto-generated method stub
	Student student = this.stuRepo.findById(id).orElse(null);
	this.stuRepo.delete(student);
	return student;
	}
	

	
	

}
