package com.zaid.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zaid.user.model.UserDto;
import com.zaid.user.response_vo.ResponseVO;
import com.zaid.user.service.UserServiceInterface;

@RestController
public class UserController {

	@Autowired
	private UserServiceInterface service;
	
	@PostMapping("/save")
	public UserDto saveUser(@RequestBody UserDto user) {
		UserDto userSaved=service.saveUser(user);
		return userSaved;
	}
	
	
	@GetMapping("/get/{id}")
	public UserDto getUser(@PathVariable("id") int  id) {
		UserDto userFetched=service.getUser(id);
		return userFetched;
	}
	
	@GetMapping("/getUserDepartment/{id}")
	public ResponseVO getUserDepartment(@PathVariable("id") int  id) {
		ResponseVO userDepartmentFetched=service.getUserDepartment(id);
		return userDepartmentFetched;
	}
}
