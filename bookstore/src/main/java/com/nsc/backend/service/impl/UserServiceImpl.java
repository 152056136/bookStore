package com.nsc.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsc.backend.entity.User;
import com.nsc.backend.mapper.UserMapper;
import com.nsc.backend.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	//根据openId查找出用户
	public User findUserByopenId(String openId) {
		User user = userMapper.findUserByopenId(openId);
		return user;
	}
	//将用户的openId保存到数据库
	public void saveUser(User user) {
		userMapper.saveUser(user);
	}

}
