package com.nsc.backend.mapper;

import java.util.ArrayList;
import java.util.List;

import com.nsc.backend.entity.Book;

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
<<<<<<< HEAD
	//根据出版社查找并返回书的所有数据
	ArrayList<Book> findBookByPress();
	//畅销的查看全部
	ArrayList<Book> bestSelling();
	//降价的查看全部
	ArrayList<Book> priceReduction();
	//文学小说的查看全部
	ArrayList<Book> literaryNovel(String cateName);
	//根据一级分类id查找一级分类名
	String findCateNameById(Integer cateId);
	//人文历史的查看全部
	ArrayList<Book> socialScience(String cateName);
	//经济管理的查看全部
	ArrayList<Book> economicManagement(String cateName);
	//教育学习的查看全部
	ArrayList<Book> education(String secondCateName);
	//IT科技的查看全部
	ArrayList<Book> technology(String cateName);
=======
	
	//查找出版社并返回书的所有数据
	ArrayList<Book> findBookByPress();
	
>>>>>>> e01cb79c991c6795fafd6df2618901bdb031f7c8
}
