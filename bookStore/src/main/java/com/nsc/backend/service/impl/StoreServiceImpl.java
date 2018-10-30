package com.nsc.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsc.backend.entity.Store;
import com.nsc.backend.mapper.StoreMapper;
import com.nsc.backend.service.IStoreService;

@Service
@Transactional
public class StoreServiceImpl implements IStoreService{

	@Autowired
	StoreMapper storeMapper;
	
	
	public Store findStoreByStoreId(Integer StoreId) {
		
		return storeMapper.findStoreByStoreId(StoreId);
	}
}
