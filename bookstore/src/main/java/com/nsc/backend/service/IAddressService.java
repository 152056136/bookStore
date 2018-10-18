package com.nsc.backend.service;

import java.util.List;

import com.nsc.backend.entity.Address;

//地址管理接口
public interface IAddressService {
	//接受微信授权地址，并且如果能够接受到的话，设为默认地址
	
	void saveWeiAdd(Address add);
	//获取用户的所有收货地址
	List<Address> findAllAddress(Integer userId);
	//更新address信息
	void updateAddress(Address add);
	//加载用户的默认地址
	Address findDefaultAdd(Integer integer);
	//通过add的id查找address
	Address findAddressById(Integer addId);
	
}
