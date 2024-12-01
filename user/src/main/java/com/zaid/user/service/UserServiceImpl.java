package com.zaid.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zaid.user.model.UserDto;
import com.zaid.user.repository.UserRepository;
import com.zaid.user.response_vo.Department;
import com.zaid.user.response_vo.ResponseVO;

@Service
public class UserServiceImpl implements UserServiceInterface {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private RestTemplate template;
	
	@Override
	public UserDto saveUser(UserDto user) {
		UserDto userSaved = repo.save(user);
		return userSaved;
	}

	@Override
	public UserDto getUser(int id) {
		UserDto userFetched = repo.findById(id).orElse(null);
		return userFetched;
	}
	
	@Override
	public ResponseVO getUserDepartment(int id) {
		UserDto userFetched = repo.findById(id).orElse(null);
		Department department = template.getForObject("http://department/department/get/"+userFetched.getDepartmentId(), Department.class);
		ResponseVO vo=new ResponseVO();
		vo.setUser(userFetched);
		vo.setDepartment(department);
		return vo;
	}

}
