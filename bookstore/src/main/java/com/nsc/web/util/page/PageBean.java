package com.nsc.web.util.page;

import java.util.List;

/**
 *  分页查询，数据库，存放分页相关的数据
 * @author Lenovo
 * @param <T>
 */
public class PageBean<T> {
	private int currentPageNum;	//当前页码
	private int limit;	//每页记录条数
	private int totalCount;	//总记录条数
	private int totalPageNum;	//总页数
	private List<T>list;	//当前需要的数据
	
	public int getCurrentPageNum() {
		return currentPageNum;
	}
	public void setCurrentPageNum(int currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPageNum() {
		return totalPageNum;
	}
	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
	
}
