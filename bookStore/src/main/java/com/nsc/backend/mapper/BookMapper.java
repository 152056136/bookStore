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
	
	//查找出版社并返回书的所有数据
	ArrayList<Book> findBookByPress();
	
}
