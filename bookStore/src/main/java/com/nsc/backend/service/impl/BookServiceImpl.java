package com.nsc.backend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsc.backend.entity.Book;
import com.nsc.backend.mapper.BookMapper;
import com.nsc.backend.service.IBookService;
import com.nsc.web.util.page.PageBean;

@Service
@Transactional
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private BookMapper bookMapper;
	
	//根据传递的二级分类id，分页查找相应的书籍
	public PageBean<Book> findBooksBySecondCaeId(Integer secondCateId, Integer pageNum) {
		PageBean<Book> pageBean = new PageBean<Book>();
		//设置当前页码
		pageBean.setCurrentPageNum(pageNum);
		//设置每页显示记录数
		int limit = 8;
		pageBean.setLimit(limit);
		//设置总的记录数
		int totalCount = 0;
		//因为暂时关联的外键是，secondCateName，所以先根据id查找出name
		String secondCateName = bookMapper.findsecCateIdByName(secondCateId);
	    System.out.println("二级分类名为:=================="+secondCateName);
		totalCount = bookMapper.findCountBySecondCateId(secondCateName);
		pageBean.setTotalCount(totalCount);
		System.out.println("总的数目是+++=================="+totalCount);
		//设置总页数
		int totalPage=0;
		if(totalCount%limit==0){
			totalPage=totalCount/limit;
		}else{
			totalPage=totalCount/limit+1;
		}
		pageBean.setTotalPageNum(totalPage);
		//填充每页显示的数据集合
		//从第几个元素开始查询
		int begin = (pageNum-1)*limit;
		System.out.println("begin================="+begin);
		System.out.println("limit================="+limit);
		List<Book> list= bookMapper.findBooksBySecondCateId(secondCateName,begin,limit);
		pageBean.setList(list);
		
		return pageBean;
	}
	
	//根据传递的二级分类id，二级分类名,分页查找相应的书籍
	public PageBean<Book> findBooksBySecondCaeId_Name(Integer secondCateId, String secondCateName, Integer pageNum) {
		// TODO Auto-generated method stub
		PageBean<Book> pageBean = new PageBean<Book>();
		//设置当前页码
		pageBean.setCurrentPageNum(pageNum);
		//设置每页显示记录数
		int limit = 8;
		pageBean.setLimit(limit);
		//设置总的记录数
		int totalCount = 0;
		//因为暂时关联的外键是，secondCateName，所以先根据id查找出name
		totalCount = bookMapper.findCountBySecondCateIdName(secondCateId,secondCateName);
		pageBean.setTotalCount(totalCount);
		System.out.println("总的数目是+++=================="+totalCount);
		//设置总页数
		int totalPage=0;
		if(totalCount%limit==0){
			totalPage=totalCount/limit;
		}else{
			totalPage=totalCount/limit+1;
		}
		pageBean.setTotalPageNum(totalPage);
		//填充每页显示的数据集合
		//从第几个元素开始查询
		int begin = (pageNum-1)*limit;
		System.out.println("begin======"+begin);
		List<Book> list= bookMapper.findBooksBySecondCateId(secondCateName,begin,limit);
		pageBean.setList(list);
		return pageBean;
	}

	//根据bookid查找到book
	public Book findBookById(Integer bookId) {
		Book book = bookMapper.findBookById(bookId);
		return book;
	}

	public ArrayList<Book> findBookByPress() {
		// TODO Auto-generated method stub
		ArrayList<Book> arrbook=new ArrayList<Book>();
		arrbook=bookMapper.findBookByPress();
		return arrbook;
	}

	

}
