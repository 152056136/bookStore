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
		int limit = 10;
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
		int limit = 10;
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

	//根据出版社查找并返回书的全部数据
	public ArrayList<Book> findBookByPress() {
		// TODO Auto-generated method stub
		ArrayList<Book> arrbook=new ArrayList<Book>();
		arrbook=bookMapper.findBookByPress();
		return arrbook;
	}

	//畅销的查看全部
	public PageBean<Book> bestSelling(Integer pageNum) {
		// TODO Auto-generated method stub
		PageBean<Book> pageBean = new PageBean<Book>();
		pageBean=paging(pageNum,"bestSelling");
		return pageBean;
	}

	//降价的查看全部
	public PageBean<Book> priceReduction(Integer pageNum) {
		// TODO Auto-generated method stub
		PageBean<Book> pageBean = new PageBean<Book>();
		pageBean=paging(pageNum,"priceReduction");
		return pageBean;
	}
	
	//文学小说的查看全部
		public PageBean<Book> literaryNovel(Integer cateId,Integer pageNum) {
			// TODO Auto-generated method stub
			PageBean<Book> pageBean = new PageBean<Book>();
			String cateName=bookMapper.findCateNameById(cateId);
			System.out.println("cateId="+cateId);
			System.out.println("一级分类名："+cateName);
			pageBean=paging(pageNum,cateName);
			return pageBean;
		}

		//人文历史的查看全部
		public PageBean<Book> socialScience(Integer cateId,Integer pageNum) {
			// TODO Auto-generated method stub
			PageBean<Book> pageBean = new PageBean<Book>();
			String cateName=bookMapper.findCateNameById(cateId);
			System.out.println("cateId="+cateId);
			System.out.println("一级分类名"+cateName);
			pageBean=paging(pageNum,cateName);
			return pageBean;
		}

		//经济管理的查看全部
		public PageBean<Book> economicManagement(Integer cateId,Integer pageNum) {
			// TODO Auto-generated method stub
			PageBean<Book> pageBean = new PageBean<Book>();
			String cateName=bookMapper.findCateNameById(cateId);
			System.out.println("cateId="+cateId);
			System.out.println("一级分类名"+cateName);
			pageBean=paging(pageNum,cateName);
			return pageBean;
		}
	
		//教育学习的查看全部
		public PageBean<Book> education(Integer secondCateId,Integer pageNum){
			PageBean<Book> pageBean = new PageBean<Book>();
			String secondCateName=bookMapper.findsecCateIdByName(secondCateId);
			System.out.println("cateId="+secondCateId);
			System.out.println("二级分类名"+secondCateName);
			pageBean=paging(pageNum,secondCateName);
			return pageBean;
		}
		
        //IT科技的查看全部
		public PageBean<Book> technology(Integer cateId,Integer pageNum) {
			// TODO Auto-generated method stub
			PageBean<Book> pageBean = new PageBean<Book>();
			String cateName=bookMapper.findCateNameById(cateId);
			System.out.println("cateId="+cateId);
			System.out.println("一级分类名"+cateName);
			pageBean=paging(pageNum,cateName);
			return pageBean;
		}

		
		
		@Autowired
		private   BookMapper bookMapperPage;

		public  PageBean paging(Integer pageNum,String str){
			System.out.println("pageNum="+pageNum);
			PageBean<Book> pageBean = new PageBean<Book>();
			//设置当前页码
			pageBean.setCurrentPageNum(pageNum);
			//设置每页显示记录数
			int limit = 10;
			pageBean.setLimit(limit);
			//设置总的记录数
			int totalCount = 0;
			
			if("bestSelling".equals(str)){
				System.out.println(bookMapperPage);
				totalCount = bookMapperPage.bestSellingCount();
				System.out.println(totalCount); 
			}else if("priceReduction".equals(str)){
				totalCount = bookMapperPage.priceReductionCount();
			}else if("I 文学".equals(str)){
				totalCount = bookMapperPage.literaryNovelCount(str);
			}else if("K 历史、地理".equals(str)){
				totalCount = bookMapperPage.socialScienceCount(str);
			}else if("F 经济".equals(str)){
				totalCount = bookMapperPage.economicManagementCount(str);
			}else if("G4 教育".equals(str)){
				totalCount = bookMapperPage.educationCount(str);
			}else if("IT科技".equals(str)){
				totalCount = bookMapperPage.technologyCount(str);
			}
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
			List<Book> list = null;
			
			if("bestSelling".equals(str)){
			 list=bookMapperPage.bestSelling(begin,limit);
			}else if("priceReduction".equals(str)){
			 list=bookMapperPage.priceReduction(begin,limit);
			}else if("I 文学".equals(str)){
				list=bookMapperPage.literaryNovel(str,begin,limit);	
			}else if("K 历史、地理".equals(str)){
				list = bookMapperPage.socialScience(str,begin,limit);
			}else if("F 经济".equals(str)){
				list = bookMapperPage.economicManagement(str,begin,limit);
			}else if("G4 教育".equals(str)){
				list = bookMapperPage.education(str,begin,limit);
			}else if("IT科技".equals(str)){
				list = bookMapperPage.technology(str,begin,limit);
			}
			
			pageBean.setList(list);
			return pageBean;
		}

		
	

}
