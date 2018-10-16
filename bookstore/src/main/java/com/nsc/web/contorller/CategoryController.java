package com.nsc.web.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nsc.backend.entity.Category;
import com.nsc.backend.entity.SecondCategory;
import com.nsc.backend.service.ICategoryService;

/**
 * 小程序分类业务
 * @author Lenovo
 *
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private ICategoryService cateServiceImpl;
	
	//首先查找总分类，返回小程序页面（默认返回第一个 总分类的子分类）
	@RequestMapping("findCategories")//Y-post
	public @ResponseBody List<Category> findCategories(){
		
		//首先查找出所有一级分类，并将一级分类的第一个的子类全部封装
		List<Category>cateList = cateServiceImpl.findCategories();
		//遍历去除分类secondCate_name前边的英文字母
		int leng=cateList.size();
		for(int i=0;i<leng;i++){
			String cateRep = cateList.get(i).getCateName().replace(cateList.get(i).getCateAlias()+" ", "");
			cateList.get(i).setCateName(cateRep);
		}
	    List<SecondCategory> secList= cateServiceImpl.findsecCatesById(cateList.get(0).getCateId());
	    int size = secList.size();
	    for(int i=0;i<size;i++){
	    	String secondRep = secList.get(i).getSecondCateName().replace(secList.get(i).getSecondCateAlias()+" ", "");
	    	secList.get(i).setSecondCateName(secondRep);
		}
	    cateList.get(0).setSecList(secList);
		return cateList;
	}
	//点击一级分类，显示相应的二级分类
	@RequestMapping("secCatesById")//Y-get
	public @ResponseBody List<SecondCategory> findsecCatesById( Integer cateId ){
		List<SecondCategory> secList = cateServiceImpl.findsecCatesById(cateId);
		int length = secList.size();
		for(int i=0;i<length;i++){
	    	String secondRep = secList.get(i).getSecondCateName().replace(secList.get(i).getSecondCateAlias()+" ", "");
	    	secList.get(i).setSecondCateName(secondRep);
		}
		return secList;
	}
	
	
	
	
	
	
	
	
	
	
	
}
