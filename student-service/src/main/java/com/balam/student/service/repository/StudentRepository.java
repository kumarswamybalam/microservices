package com.balam.student.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balam.student.service.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}