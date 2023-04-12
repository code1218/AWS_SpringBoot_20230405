package com.web.study.repository;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.User;

@Mapper
public interface UserRepository {
	
	public User findUserByUsername(String username);
	public int saveUser(User user);
}
