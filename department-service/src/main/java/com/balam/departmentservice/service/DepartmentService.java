package com.balam.departmentservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balam.departmentservice.entity.Department;
import com.balam.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Optional<Department> findDepartmentById(Long deptId) {
		return departmentRepository.findById(deptId);
	}

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	} 

}
