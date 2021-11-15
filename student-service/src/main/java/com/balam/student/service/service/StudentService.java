package com.balam.student.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.balam.student.service.entity.Student;
import com.balam.student.service.repository.StudentRepository;
import com.balam.student.service.vo.Department;
import com.balam.student.service.vo.StudentDepartmentResponse;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	private RestTemplate restTemplate = new RestTemplate();

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student findByStudentId(Long studentId) {
		return studentRepository.findById(studentId).get();
	}
	
	public StudentDepartmentResponse getStundetWithDepartment(Long studentId) {
		StudentDepartmentResponse studentDepartmentResponse = new StudentDepartmentResponse();
		Student student = studentRepository.findById(studentId).get();
		Department department = restTemplate.getForObject("http://localhost:9002/departments/"+student.getDeptId(), Department.class);
		studentDepartmentResponse.setStudent(student);
		studentDepartmentResponse.setDepartment(department);
		return studentDepartmentResponse;
	}

}
