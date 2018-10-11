package com.nsc.backend.mapper;

import com.nsc.backend.entity.User;

public interface UserMapper {
	
	//根据用户id查找出用户
	User findUserByopenId(String openId);
	//将用户的openId保存到数据库
	void saveUser(User user);
	
}
