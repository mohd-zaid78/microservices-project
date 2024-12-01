package com.zaid.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zaid.user.model.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Integer> {

}
