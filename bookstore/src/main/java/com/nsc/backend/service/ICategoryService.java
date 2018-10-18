package com.nsc.backend.service;

import java.util.List;

import com.nsc.backend.entity.Category;
import com.nsc.backend.entity.SecondCategory;

//分类的业务层接口
public interface ICategoryService {
	
	//查找所有一级分类
	List<Category> findCategories();
	//根据一级分类id将这个分类下的子分类全部查询出来
	List<SecondCategory> findsecCatesById(Integer cateId);
	
	
	
	
	
}
