package com.nsc.backend.mapper;

import java.util.List;

import com.nsc.backend.entity.Address;

//地址mapper映射接口
public interface AddressMapper {
	//接受微信授权地址，并且如果能够接受到的话，设为默认地址
	void saveWeiAdd(Address add);
	//获取用户的所有与收货地址
	List<Address> findAllAddress(Integer userId);
	//更新收货地址信息
	void updateAddress(Address add);
	//加载用户的默认地址
	Address findDefaultAdd(Integer userId);
	//通过add的id查找address
	Address findAddressById(Integer addId);
	
	
	
}
