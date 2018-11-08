package com.nsc.backend.service;

import java.util.List;
import java.util.Map;

import com.nsc.backend.entity.ErpBookInfo;


public interface IErpBookInfoService {

	//public  List<Map<String, Object>> selData();
	//public void insert(List<Map<String, Object>> list);
	public  List<ErpBookInfo> selData();
	public void insert(List<ErpBookInfo> list);
	
	/*public  Map<String, Object> selData2();
	public void insert2(Map<String, Object> list);*/
}
