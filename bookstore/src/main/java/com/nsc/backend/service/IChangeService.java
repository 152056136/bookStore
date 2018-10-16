package com.nsc.backend.service;

import java.util.ArrayList;

import com.nsc.backend.entity.Book;

public interface IChangeService {

	//畅销-换一换
	ArrayList<Book> cBestSelling(Integer start,Integer end);
	//降价-换一换
	ArrayList<Book> cPrice(Integer start,Integer end);
	//文学小说-换一换
	ArrayList<Book> cNovel(Integer cateId ,Integer start,Integer end);
	//人文历史-换一换
	ArrayList<Book> cHistory(Integer cateId ,Integer start,Integer end);
	//经济管理-换一换
	ArrayList<Book> cEconomic(Integer cateId ,Integer start,Integer end);
	//教育学习-换一换
	ArrayList<Book> cEducation(Integer secondCateId ,Integer start,Integer end);
	//IT科技-换一换
	ArrayList<Book> cTechnology(Integer cateId ,Integer start,Integer end);
}
