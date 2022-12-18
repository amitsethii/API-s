package com.Backend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.backend.entity.Student;
//DAO LAYER
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
