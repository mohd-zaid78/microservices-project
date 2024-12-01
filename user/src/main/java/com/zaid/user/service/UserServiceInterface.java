package com.zaid.user.service;


import com.zaid.user.model.UserDto;
import com.zaid.user.response_vo.ResponseVO;

public interface UserServiceInterface {


	UserDto saveUser(UserDto user);

	UserDto getUser(int id);

	ResponseVO getUserDepartment(int id);

}
