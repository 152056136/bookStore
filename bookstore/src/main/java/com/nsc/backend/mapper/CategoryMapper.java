package com.nsc.backend.mapper;

import java.util.List;

import com.nsc.backend.entity.Category;
import com.nsc.backend.entity.SecondCategory;

//类别mapper层接口
public interface CategoryMapper {
	
	//查找所有一级分类
	List<Category> findCategories();
	//根据一级分类id将这个分类下的子分类全部查询出来
	List<SecondCategory> findsecCatesById(Integer cateId);
		
}
