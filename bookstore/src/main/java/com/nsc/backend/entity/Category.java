package com.nsc.backend.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 一级分类实体类
 * @author Lenovo
 *
 */
public class Category {
	private Integer cateId;
	private String cateAlias;
	private String cateName;
	private boolean isDeleted;
	private String cateNote;
	
	//配置关联关系，根据一级分类去查找下面的二级分类list
	private List<SecondCategory> secList = new ArrayList<SecondCategory>();
	
	
	
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getCateNote() {
		return cateNote;
	}
	public void setCateNote(String cateNote) {
		this.cateNote = cateNote;
	}
	public List<SecondCategory> getSecList() {
		return secList;
	}
	public void setSecList(List<SecondCategory> secList) {
		this.secList = secList;
	}
	public Integer getCateId() {
		return cateId;
	}
	public void setCateId(Integer cateId) {
		this.cateId = cateId;
	}
	public String getCateAlias() {
		return cateAlias;
	}
	public void setCateAlias(String cateAlias) {
		this.cateAlias = cateAlias;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	
	
	
}
