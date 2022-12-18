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
	private StudentRepo studentRepo;
	

	@Override
	public Student createStudent(Student newStudent) {
		// TODO Auto-generated method stub
		Student saveStu = this.studentRepo.save(newStudent);
		return saveStu;
	}
	
	

	@Override
	public Student updateStudent(Student upstudent, Integer id) {
		// TODO Auto-generated method stub
		Student oldStudent = this.studentRepo.findById(id).orElse(null);
		oldStudent.setName(upstudent.getName());
		oldStudent.setAbout((upstudent.getAbout()));
		
		Student updatedStudent = this.studentRepo.save(oldStudent);
		return updatedStudent;
	}

	
	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stu
	Student student = this.studentRepo.findById(id).orElse(null);
		return student;
	}

	
	@Override
	public List<Student> getAllStu() {
		// TODO Auto-generated method stub
		List<Student> students = this.studentRepo.findAll();
		return students;
	}
	
	@Override
	public Student deleteStudent(Integer id) {
		// TODO Auto-generated method stub
	Student student = this.studentRepo.findById(id).orElse(null);
	this.studentRepo.delete(student);
	return student;
	}
	

	
	

}
