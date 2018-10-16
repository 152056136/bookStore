package com.nsc.backend.service;

import com.nsc.backend.entity.User;

//操作用户的接口
public interface IUserService {
	//根据用户id查找出用户
	User findUserByopenId(String openId);
	//将用户的openId保存到数据库
	void saveUser(User user);
	
}
