package com.Backend.backend.serviceimpl;

import java.util.List;

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
	public Student updateStudent(Student stu, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(Integer stu) {
		// TODO Auto-generated method stub
		
	}
	
	

}
