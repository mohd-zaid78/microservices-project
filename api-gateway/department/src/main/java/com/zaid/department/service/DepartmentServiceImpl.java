package com.zaid.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaid.department.model.Department;
import com.zaid.department.repository.DepartmentRespository;

@Service
public class DepartmentServiceImpl implements DepartmentServiceInterface {

	@Autowired
	private DepartmentRespository repo;
	
	@Override
	public Department saveDepartment(Department department) {
		Department departmentSaved = repo.save(department);
		return departmentSaved;
	}

	@Override
	public Department getDepartment(int id) {
	Department departFetched = repo.findById(id).orElse(null);
		return departFetched;
	}
	
	
}
