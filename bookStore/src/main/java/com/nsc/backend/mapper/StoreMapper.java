package com.nsc.backend.mapper;

import com.nsc.backend.entity.Store;

public interface StoreMapper {
	
	//通过StoreId查找store
	Store findStoreByStoreId(Integer StoreId);
	
    int deleteByPrimaryKey(Integer storeId);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer storeId);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}