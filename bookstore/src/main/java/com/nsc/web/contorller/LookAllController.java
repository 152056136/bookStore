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

/**
 * 查看全部
 * @author linshili
 *
 */

@Controller
@RequestMapping("/LookAll")
public class LookAllController {
	
	private  ArrayList<Book> arrBook = new ArrayList<Book>();
	
	@Autowired
	private IBookService ibookservice;
	
	
	
    /**
     * 畅销-查看全部
     *    
     */
	
	@RequestMapping(value="/best_selling",method = RequestMethod.POST)
	public @ResponseBody ArrayList<Book> bestSelling(){
	   arrBook=ibookservice.bestSelling();
	  return arrBook;			
	}
	

	/**
	 * 降价-查看全部
	 * 
	 */
	@RequestMapping(value="/price_reduction",method = RequestMethod.POST)
	public ArrayList<Book> priceReduction(){
		arrBook=ibookservice.priceReduction();
		return arrBook;
	}
	
	
	/**
	 * 文学小说-查看全部
	 * 
	 */
	@RequestMapping(value="/literary_novel",method = RequestMethod.POST)
	public @ResponseBody ArrayList<Book> literaryNovel(Integer cateId){
		arrBook=ibookservice.literaryNovel(cateId);
		return arrBook;
	}
	
	
	/**
	 * 人文历史-查看全部
	 * 
	 */
	@RequestMapping(value="/Social_science",method = RequestMethod.POST)
	public @ResponseBody ArrayList<Book> socialScience(Integer cateId){
		arrBook=ibookservice.socialScience(cateId);
		return arrBook;
	}
	
	
	/**
	 * 经济管理-查看全部
	 */
	@RequestMapping(value="/economic_management",method = RequestMethod.POST)
	public  @ResponseBody  ArrayList<Book> economicManagement(Integer cateId){
		arrBook=ibookservice.economicManagement(cateId);
		return arrBook;
	}
	
	/**
	 * 教育学习-查看全部
	 */
	@RequestMapping(value="/education",method = RequestMethod.POST)
	public  @ResponseBody ArrayList<Book> education(Integer secondCateId){
		arrBook=ibookservice.education(secondCateId);
		return arrBook;
	}
	
	/**
	 * IT科技-查看全部s
	 */
	@RequestMapping(value="/technology",method = RequestMethod.POST)
	public  @ResponseBody ArrayList<Book> technology(Integer cateId){
		arrBook=ibookservice.technology(cateId);
		return arrBook;
	}
	
}
