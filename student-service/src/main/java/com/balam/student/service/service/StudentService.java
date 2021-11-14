package com.balam.student.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balam.student.service.entity.Student;
import com.balam.student.service.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student findByStudentId(Long studentId) {
		return studentRepository.findById(studentId).get();
	}

}
