package com.zaid.department.service;

import com.zaid.department.model.Department;

public interface DepartmentServiceInterface {

	Department saveDepartment(Department department);

	Department getDepartment(int id);

}
