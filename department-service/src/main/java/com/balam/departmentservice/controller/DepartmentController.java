package com.balam.departmentservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balam.departmentservice.entity.Department;
import com.balam.departmentservice.service.DepartmentService;

@RestController
@RequestMapping(value={"/departments"})
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/{id}")
	public Optional<Department> findDepartmentById(@PathVariable("id") Long deptId) {
		return departmentService.findDepartmentById(deptId);
	}
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
}
