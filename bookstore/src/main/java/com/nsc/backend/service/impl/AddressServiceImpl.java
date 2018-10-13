package com.nsc.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsc.backend.entity.Address;
import com.nsc.backend.mapper.AddressMapper;
import com.nsc.backend.service.IAddressService;

//地址管理业务层实现类
@Service
public class AddressServiceImpl implements IAddressService {
	
	@Autowired
	private AddressMapper addMapper;
	
	//接受微信授权地址，并且如果能够接受到的话，设为默认地址
	public void saveWeiAdd(Address add) {
		addMapper.saveWeiAdd(add);
	}

	//获取用户的所有与收货地址
	public List<Address> findAllAddress(Integer userId) {
		List<Address>  list = addMapper.findAllAddress(userId);
		return list;
	}

	//更新收货地址信息
	public void updateAddress(Address add) {
		addMapper.updateAddress(add);
	}
	//加载用户的默认地址
	public Address findDefaultAdd(Integer userId) {
		Address add = addMapper.findDefaultAdd(userId);
		return add;
	}

	//通过add的id查找address
	public Address findAddressById(Integer addId) {
		return addMapper.findAddressById(addId);
	}
	
}
