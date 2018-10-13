package com.nsc.backend.service;

import java.util.ArrayList;

import com.nsc.backend.entity.Book;
import com.nsc.web.util.page.PageBean;

public interface IBookService {
	//根据传递的二级分类id，分页查找相应的书籍
	PageBean<Book> findBooksBySecondCaeId(Integer secondCateId, Integer pageNum);
	//根据传递的二级分类id,二级分类名,分页查询相应的书籍
	PageBean<Book> findBooksBySecondCaeId_Name(Integer secondCateId,String secondCateName ,Integer pageNum);
	//根据bookid查找到book
	Book findBookById(Integer bookId);
	//查找出版社并返回书的所有数据
	ArrayList<Book> findBookByPress();
    //畅销的查看全部
	ArrayList<Book> bestSelling();
	//降价的查看全部
	ArrayList<Book> priceReduction();
	//文学小说的查看全部
	ArrayList<Book> literaryNovel(Integer cateId);
	//人文历史的查看全部
	ArrayList<Book> socialScience(Integer cateId);
	//经济管理的查看全部
    ArrayList<Book> economicManagement(Integer cateId);
    //教育学习的查看全部
    ArrayList<Book> education(Integer secondCateId);
    //IT科技的查看全部
    ArrayList<Book> technology(Integer cateId);
    
    
}
