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
	
	public static ArrayList<Book> arrBook = new ArrayList<Book>();
	
	@Autowired
	private IBookService ibookservice;
	
	
	/**
	 * 查找出版社并返回书的所有数据
	 */
	@RequestMapping("/Press")
    public @ResponseBody ArrayList<Book>  findBookByPress(){
		
		arrBook=ibookservice.findBookByPress();
		
       return arrBook;
	}
	  
	 
	
}
