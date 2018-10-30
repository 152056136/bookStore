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
		int totalCount = bookMapperPage.bestSellingCount();
		pageBean=paging(pageNum,totalCount,4,"bestSelling");
		return pageBean;
	}

	//降价的查看全部
	public PageBean<Book> priceReduction(Integer pageNum) {
		// TODO Auto-generated method stub
		PageBean<Book> pageBean = new PageBean<Book>();
		int totalCount = bookMapperPage.priceReductionCount();
		pageBean=paging(pageNum,totalCount,5,"priceReduction");
		return pageBean;
	}
	
	//文学小说的查看全部
		public PageBean<Book> literaryNovel(Integer cateId,Integer pageNum) {
			// TODO Auto-generated method stub
			PageBean<Book> pageBean = new PageBean<Book>();
			//String cateName=bookMapper.findCateNameById(cateId);
			int totalCount = bookMapperPage.literaryNovelCount(cateId);
			pageBean=paging(pageNum,totalCount,cateId,"literaryNovel");
			return pageBean;
		}

		//人文历史的查看全部
		public PageBean<Book> socialScience(Integer cateId,Integer pageNum) {
			// TODO Auto-generated method stub
			PageBean<Book> pageBean = new PageBean<Book>();
			//String cateName=bookMapper.findCateNameById(cateId);
			int totalCount = bookMapperPage.socialScienceCount(cateId);
			pageBean=paging(pageNum,totalCount,cateId,"socialScience");
			return pageBean;
		}

		//经济管理的查看全部
		public PageBean<Book> economicManagement(Integer cateId,Integer pageNum) {
			// TODO Auto-generated method stub
			PageBean<Book> pageBean = new PageBean<Book>();
			//String cateName=bookMapper.findCateNameById(cateId);
			int totalCount = bookMapperPage.economicManagementCount(cateId);
			pageBean=paging(pageNum,totalCount,cateId,"economicManagement");
			return pageBean;
		}
	
		//教育学习的查看全部
		public PageBean<Book> education(Integer secondCateId,Integer pageNum){
			PageBean<Book> pageBean = new PageBean<Book>();
			//String secondCateName=bookMapper.findsecCateIdByName(secondCateId);
			int totalCount = bookMapperPage.educationCount(secondCateId);
			pageBean=paging(pageNum,totalCount,secondCateId,"education");
			return pageBean;
		}
		
        //IT科技的查看全部
		public PageBean<Book> technology(Integer cateId,Integer pageNum) {
			// TODO Auto-generated method stub
			PageBean<Book> pageBean = new PageBean<Book>();
			//String cateName=bookMapper.findCateNameById(cateId);
			/*pageBean=paging(pageNum,cateName);*/
			int totalCount = bookMapperPage.technologyCount(cateId);
			pageBean=paging(pageNum,totalCount,cateId,"technology");
			return pageBean;
		}

		
		
		@Autowired
		private   BookMapper bookMapperPage;

		public  PageBean paging(Integer pageNum,Integer totalCount,Integer cateId, String vary){
			System.out.println("pageNum="+pageNum);
			PageBean<Book> pageBean = new PageBean<Book>();
			//设置当前页码
			pageBean.setCurrentPageNum(pageNum);
			//设置每页显示记录数
			int limit = 10;
			pageBean.setLimit(limit);
			//设置总的记录数
			//int totalCount = 0;
			
			/*if("bestSelling".equals(vary)){
				System.out.println(bookMapperPage);
				totalCount = bookMapperPage.bestSellingCount();
				System.out.println(totalCount); 
			}else if("priceReduction".equals(vary)){
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
			}*/
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
			
			if("bestSelling".equals(vary)){
			 list=bookMapperPage.bestSelling(begin,limit);
			}else if("priceReduction".equals(vary)){
			 list=bookMapperPage.priceReduction(begin,limit);
			}else if("literaryNovel".equals(vary)){
				list=bookMapperPage.literaryNovel(cateId,begin,limit);	
			}else if("socialScience".equals(vary)){
				list = bookMapperPage.socialScience(cateId,begin,limit);
			}else if("economicManagement".equals(vary)){
				list = bookMapperPage.economicManagement(cateId,begin,limit);
			}else if("education".equals(vary)){
				list = bookMapperPage.education(cateId,begin,limit);
			}else if("technology".equals(vary)){
				list = bookMapperPage.technology(cateId,begin,limit);
			}
			
			pageBean.setList(list);
			return pageBean;
		}

		public int findStoreIdBybookId(Integer bookId) {
			return bookMapper.findStoreIdBybookId(bookId);
		}
	

}
