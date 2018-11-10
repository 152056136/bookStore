package com.nsc.backend.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsc.backend.entity.ErpBookInfo;
import com.nsc.backend.mapper.ChangeMapper;
import com.nsc.backend.mapper.ErpBookInfoMapper;
import com.nsc.backend.service.IErpBookInfoService;
import com.nsc.web.DynamicDataSourceHolder;



@Service

@Transactional
public class ErpBookInfoServiceImpl implements IErpBookInfoService{

	@Autowired
	private ErpBookInfoMapper ebim;
	
	@Override
	public  List<ErpBookInfo> selData() {
		// TODO Auto-generated method stub
        DynamicDataSourceHolder.setDataSource("jrt_dataSource");
        List<ErpBookInfo> list=null;
        list=ebim.selData();
        return list;
       
	}
	public void insert(List<ErpBookInfo> list){
		DynamicDataSourceHolder.setDataSource("defultdataSource");
		System.out.println("insert before");
		ebim.insert(list);
		System.out.println("insert after");
	}
	
/*	@Override
	public Map<String, Object> selData2() {
		DynamicDataSourceHolder.setDataSource("jrt_dataSource");
        Map<String, Object> list=null;
        list=ebim.selData2();
        return list;
	}
	@Override
	public void insert2(Map<String, Object> list) {
		ebim.insert2(list);
		
	}*/

	
	
	
	

}
