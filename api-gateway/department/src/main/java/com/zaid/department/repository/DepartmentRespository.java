package com.zaid.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zaid.department.model.Department;

public interface DepartmentRespository extends JpaRepository<Department,Integer> {

}
