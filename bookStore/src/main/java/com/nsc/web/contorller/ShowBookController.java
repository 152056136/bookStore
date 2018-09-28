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
	
<<<<<<< HEAD
	private  ArrayList<Book> arrBook = new ArrayList<Book>();
=======
	public static ArrayList<Book> arrBook = new ArrayList<Book>();
>>>>>>> e01cb79c991c6795fafd6df2618901bdb031f7c8
	
	@Autowired
	private IBookService ibookservice;
	
	
	/**
<<<<<<< HEAD
	 * 根据出版社查找并返回书的所有数据
	 */
	@RequestMapping("/Press")//Y-post
=======
	 * 查找出版社并返回书的所有数据
	 */
	@RequestMapping("/Press")
>>>>>>> e01cb79c991c6795fafd6df2618901bdb031f7c8
    public @ResponseBody ArrayList<Book>  findBookByPress(){
		
		arrBook=ibookservice.findBookByPress();
		
       return arrBook;
	}
<<<<<<< HEAD
	
	
	
=======
>>>>>>> e01cb79c991c6795fafd6df2618901bdb031f7c8
	  
	 
	
}
