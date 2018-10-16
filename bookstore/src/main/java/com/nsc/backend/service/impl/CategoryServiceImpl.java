package com.nsc.backend.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsc.backend.entity.Category;
import com.nsc.backend.entity.SecondCategory;
import com.nsc.backend.mapper.CategoryMapper;
import com.nsc.backend.service.ICategoryService;

//绫诲埆涓氬姟灞傚疄鐜扮被
@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService {
	
	@Autowired
	private CategoryMapper cateMapper;
	//鏌ユ壘鎵�鏈変竴绾у垎绫�
	public List<Category> findCategories() {
		
		List<Category> cateList = cateMapper.findCategories();
		
		return cateList;
	}
	//鏍规嵁涓�绾у垎绫籭d灏嗚繖涓垎绫讳笅鐨勫瓙鍒嗙被鍏ㄩ儴鏌ヨ鍑烘潵
	public List<SecondCategory> findsecCatesById(Integer cateId) {
		return cateMapper.findsecCatesById(cateId);
		
	}
		
}
