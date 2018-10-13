package com.nsc.web.contorller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.nsc.backend.entity.Book;
import com.nsc.backend.service.IBookService;

/**
 * 图书显示类
 * @author linshili
 *
 */

@Controller
@RequestMapping("/showbook")
public class ShowBookController {
	
	private  ArrayList<Book> arrBook = new ArrayList<Book>();
	
	@Autowired
	private IBookService ibookservice;
	
	
	/**
	 * 根据出版社查找并返回书的所有数据
	 */
	@RequestMapping("/Press")//Y-post
    public @ResponseBody ArrayList<Book>  findBookByPress(){
		
		arrBook=ibookservice.findBookByPress();
		
       return arrBook;
	}
	
	
	
	  
	 
	
}
