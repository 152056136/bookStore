package com.nsc.backend.mapper;

import java.util.ArrayList;
import java.util.List;

import com.nsc.backend.entity.Book;
import com.nsc.web.util.page.PageBean;

public interface BookMapper {
	
	//根据二级分类id查找出下面的所有books
	int findCountBySecondCateId(String secondCateName);
	int findCountBySecondCateIdName(Integer secondCateId,String secondCateName);
	//根据当前记录数，以及页码查询出bookList集合；
	List<Book> findBooksBySecondCateId(String secondCateName, int begin, int limit);
	//根据secondId查找出secondName
	String findsecCateIdByName(Integer secondCateId);
	//根据bookid查找到book
	Book findBookById(Integer bookId);
	//根据出版社查找并返回书的所有数据
	ArrayList<Book> findBookByPress();
	//查找出畅销的所有书
	int bestSellingCount();
	//畅销的查看全部	
	ArrayList<Book> bestSelling(Integer begin,Integer limit);
	//查找降价的所有书
	int priceReductionCount();
	//降价的查看全部
	ArrayList<Book> priceReduction(Integer begin,Integer limit);
	//查找文学小说的所有书
	int literaryNovelCount(String cateName);
	//文学小说的查看全部
	ArrayList<Book> literaryNovel(String cateName,Integer begin,Integer limit);
	//根据一级分类id查找一级分类名
	String findCateNameById(Integer cateId);
	//查找人文历史的所有书
	int socialScienceCount(String cateName);
	//人文历史的查看全部
	ArrayList<Book> socialScience(String cateName,Integer begin,Integer limit);
	//查找经济管理的所有书
	int economicManagementCount(String cateName);
	//经济管理的查看全部
	ArrayList<Book> economicManagement(String cateName,Integer begin,Integer limit);
	//查找教育学习的所有书
	int educationCount(String secondCateName);
	//教育学习的查看全部
	ArrayList<Book> education(String secondCateName,Integer begin,Integer limit);
	//查看IT科技的所有书
	int technologyCount(String cateName);
	//IT科技的查看全部
	ArrayList<Book> technology(String cateName,Integer begin,Integer limit);
}
