package com.nsc.backend.service.impl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nsc.backend.entity.Book;
import com.nsc.backend.mapper.BookMapper;
import com.nsc.backend.mapper.ChangeMapper;
import com.nsc.backend.service.IChangeService;

@Service
@Transactional
public class ChangeService implements IChangeService{

	@Autowired
	private ChangeMapper changeMapper;
	
	@Autowired
	private BookMapper bookMapper;
	
	/**
	 * 畅销-换一换
	 */
	public ArrayList<Book> cBestSelling(Integer start,Integer end) {
		// TODO Auto-generated method stub
	    System.out.println("start="+start+"  end="+end);
		ArrayList<Book> list=changeMapper.cBestSelling(start,end);
        return list;
	}

	/**
	 * 降价-换一换
	 */
	public ArrayList<Book> cPrice(Integer start, Integer end) {
		// TODO Auto-generated method stub
		System.out.println("start="+start+"  end="+end);
		ArrayList<Book> list=changeMapper.cPrice(start,end);
	    return list;
	}
    
	/**
	 * 文学小说-换一换
	 */
	public ArrayList<Book> cNovel(Integer cateId ,Integer start,Integer end) {
		// TODO Auto-generated method stub
		//System.out.println("cateId="+cateId+"  start="+start+"  end="+end);
		//String cateName=bookMapper.findCateNameById(cateId);
		ArrayList<Book> list=changeMapper.cNovel(cateId,start,end);
	    return list;
	}
     
	/**
	 * 人文历史-换一换
	 */
	public ArrayList<Book> cHistory(Integer cateId, Integer start, Integer end) {
		// TODO Auto-generated method stub
		//System.out.println("cateId="+cateId+"  start="+start+"  end="+end);
		//String cateName=bookMapper.findCateNameById(cateId);
		ArrayList<Book> list=changeMapper.cHistory(cateId,start,end);
	    return list;
	}

	/**
	 * 经济管理-换一换
	 */
	public ArrayList<Book> cEconomic(Integer cateId, Integer start, Integer end) {
		// TODO Auto-generated method stub
		//System.out.println("cateId="+cateId+"  start="+start+"  end="+end);
		//String cateName=bookMapper.findCateNameById(cateId);
		ArrayList<Book> list=changeMapper.cEconomic(cateId,start,end);
	    return list;
	}
	
    /**
     * 教育学习-换一换
     */
	public ArrayList<Book> cEducation(Integer secondCateId, Integer start, Integer end) {
		// TODO Auto-generated method stub
		//System.out.println("cateId="+secondCateId+"  start="+start+"  end="+end);
		//String secondCateName=bookMapper.findsecCateIdByName(secondCateId);
		ArrayList<Book> list=changeMapper.cEducation(secondCateId,start,end);
	    return list;
	}

	/**
	 * IT科技-换一换
	 */
	public ArrayList<Book> cTechnology(Integer cateId, Integer start, Integer end) {
		// TODO Auto-generated method stub
		System.out.println("cateId="+cateId+"  start="+start+"  end="+end);
		//String cateName=bookMapper.findCateNameById(cateId);
		//System.out.println(cateName);
		ArrayList<Book> list=changeMapper.cTechnology(cateId,start,end);
	    return list;
	}

	
	

}
