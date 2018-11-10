package com.nsc.web.contorller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nsc.backend.entity.Book;
import com.nsc.backend.service.IBookService;
import com.nsc.web.util.page.PageBean;

/**
 * 查看全部
 */
@Controller
@RequestMapping("/LookAll")
public class LookAllController {
	
	private  ArrayList<Book> arrBook = new ArrayList<Book>();
	private PageBean<Book> pageBean = new PageBean<Book>();
	@Autowired
	private IBookService ibookservice;
	
	
    /**
     * 畅销-查看全部    
     */
	@RequestMapping(value="/best_selling")
	public @ResponseBody PageBean<Book> bestSelling(Integer pageNum){
		pageBean=ibookservice.bestSelling(pageNum);
	    return pageBean;			
	}
	

	/**
	 * 降价-查看全部
	 * 
	 */
	@RequestMapping(value="/price_reduction")
	public @ResponseBody PageBean<Book> priceReduction(Integer pageNum){
		pageBean=ibookservice.priceReduction(pageNum);
		return pageBean;
	}
	
	
	/**
	 * 文学小说-查看全部
	 * 
	 */
	@RequestMapping(value="/literary_novel")
	public @ResponseBody PageBean<Book> literaryNovel(Integer cateId,Integer pageNum){
		pageBean=ibookservice.literaryNovel(cateId,pageNum);
		return pageBean;
	}
	
	
	/**
	 * 人文历史-查看全部
	 * 
	 */
	@RequestMapping(value="/Social_science")
	public @ResponseBody PageBean<Book> socialScience(Integer cateId,Integer pageNum){
		pageBean=ibookservice.socialScience(cateId,pageNum);
		return pageBean;
	}
	
	
	/**
	 * 经济管理-查看全部
	 */
	@RequestMapping(value="/economic_management")
	public  @ResponseBody  PageBean<Book> economicManagement(Integer cateId,Integer pageNum){
		pageBean=ibookservice.economicManagement(cateId,pageNum);
		return pageBean;
	}
	
	/**
	 * 教育学习-查看全部
	 */
	@RequestMapping(value="/education")
	public @ResponseBody PageBean<Book> education(Integer secondCateId,Integer pageNum){
		pageBean=ibookservice.education(secondCateId,pageNum);
		return pageBean;
	}
	
	/**
	 * IT科技-查看全部
	 */
	@RequestMapping(value="/technology")
	public  @ResponseBody PageBean<Book> technology(Integer cateId,Integer pageNum){
		pageBean=ibookservice.technology(cateId,pageNum);
		return pageBean;
	}
	
}
