package com.nsc.backend.mapper;

import java.util.List;

import com.nsc.backend.entity.Book;

public interface BookMapper {
	
	//根据二级分类id查找出下面的所有books
	int findCountBySecondCateId(String secondCateName);
	//根据当前记录数，以及页码查询出bookList集合；
	List<Book> findBooksBySecondCateId(String secondCateName, int begin, int limit);
	//根据secondId查找出secondName
	String findsecCateIdByName(Integer secondCateId);
	//根据bookid查找到book
	Book findBookById(Integer bookId);
	
}
