package com.nsc.backend.mapper;

import java.util.ArrayList;

import com.nsc.backend.entity.Book;

public interface ChangeMapper {
	
    //畅销-换一换
	ArrayList<Book> cBestSelling(Integer start,Integer end);
	
    //降价-换一换
    ArrayList<Book> cPrice(Integer start,Integer end);
    
    //文学小说-换一换
    ArrayList<Book> cNovel(String cateName ,Integer start,Integer end);
    
    //人文历史-换一换
    ArrayList<Book> cHistory(String cateName ,Integer start,Integer end);
    
    //经济管理-换一换
    ArrayList<Book>  cEconomic(String cateName ,Integer start,Integer end);
    
    //教育学习-换一换
    ArrayList<Book> cEducation(String secondCateId ,Integer start,Integer end);
    
    //IT科技-换一换
    ArrayList<Book> cTechnology(String cateName ,Integer start,Integer end);
}
