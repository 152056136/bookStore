package com.nsc.web.contorller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nsc.backend.entity.Book;
import com.nsc.backend.service.IBookService;
import com.nsc.backend.service.IChangeService;

@Controller
@RequestMapping("/change")
public class ChangeController {
	
	private ArrayList<Book> arrChange=new ArrayList<Book>();
	
	@Autowired
	private IChangeService changservice;
	
	
	/**
	 * 畅销-换一换
	 */
	  @RequestMapping(value="cbestSelling")
	 public @ResponseBody ArrayList<Book> cBestSelling(Integer start,Integer end){
		 arrChange=changservice.cBestSelling(start,end);
		 return arrChange;
	 }
	  
	  /**
	   * 降价-换一换
	   */
	  @RequestMapping(value="cPrice")
		 public @ResponseBody ArrayList<Book> cPrice(Integer start,Integer end){
			 arrChange=changservice.cPrice(start,end);
			 return arrChange;
		 }
	  
	  
	  /**
	   * 文学小说-换一换
	   */
	  
	     @RequestMapping(value="cNovel")
		 public @ResponseBody ArrayList<Book> cNovel(Integer cateId ,Integer start,Integer end){
			 arrChange=changservice.cNovel(cateId,start,end);
			 return arrChange;
		 }
	     
	     
	    /**
	     * 人文历史-换一换
	     */
	     @RequestMapping(value="/cHistory")
	 	public @ResponseBody ArrayList<Book> cHistory(Integer cateId ,Integer start,Integer end){
	    	 arrChange=changservice.cHistory(cateId,start,end);
	 		return arrChange;
	 	}
	     
	    
	     /**
	      * 经济管理-换一换
	      */
	     @RequestMapping(value="/cEconomic")
		 	public @ResponseBody ArrayList<Book> cEconomic(Integer cateId ,Integer start,Integer end){
		    	 arrChange=changservice.cEconomic(cateId,start,end);
		 		return arrChange;
		 	}
 
	     /**
	      * 教育学习-换一换
	      */
	     @RequestMapping(value="/cEducation")
		 	public @ResponseBody ArrayList<Book> cEducation(Integer secondCateId ,Integer start,Integer end){
		    	 arrChange=changservice.cEducation(secondCateId,start,end);
		 		return arrChange;
		 	}
	     
	     /**
	      * IT科技-换一换
	      */ 
	     @RequestMapping(value="/cTechnology")
		 	public @ResponseBody ArrayList<Book> cTechnology(Integer cateId ,Integer start,Integer end){
		    	 arrChange=changservice.cTechnology(cateId,start,end);
		 		return arrChange;
		 	}
}
