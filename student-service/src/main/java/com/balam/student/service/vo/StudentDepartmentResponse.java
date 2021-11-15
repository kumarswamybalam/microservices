package com.balam.student.service.vo;

import com.balam.student.service.entity.Student;

public class StudentDepartmentResponse {
	
	public Student student;
	public Department department;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
