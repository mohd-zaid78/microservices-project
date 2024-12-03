package com.zaid.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaid.department.model.Department;
import com.zaid.department.service.DepartmentServiceInterface;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentServiceInterface service;
	
	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department) {
		Department departmentSaved = service.saveDepartment(department);
		return departmentSaved;
	}
	
	
	@GetMapping("/get/{id}")
	public Department getDepartment(@PathVariable("id")	 int id) {
		Department departmentFetched = service.getDepartment(id);
		return departmentFetched;
	}
	
	
	

}
