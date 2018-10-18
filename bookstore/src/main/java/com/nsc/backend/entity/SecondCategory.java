package com.nsc.backend.entity;
//二级分类实体类
public class SecondCategory {
	private Integer secondCateId;
	private  String secondCateAlias;
	private  String secondCateName;
	private boolean isDeleted;
	private String secondCateNote;
	//二级分类属于一级分类
	private Category category;
	
	
	
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getSecondCateNote() {
		return secondCateNote;
	}
	public void setSecondCateNote(String secondCateNote) {
		this.secondCateNote = secondCateNote;
	}
	public Integer getSecondCateId() {
		return secondCateId;
	}
	public void setSecondCateId(Integer secondCateId) {
		this.secondCateId = secondCateId;
	}
	public String getSecondCateAlias() {
		return secondCateAlias;
	}
	public void setSecondCateAlias(String secondCateAlias) {
		this.secondCateAlias = secondCateAlias;
	}
	public String getSecondCateName() {
		return secondCateName;
	}
	public void setSecondCateName(String secondCateName) {
		this.secondCateName = secondCateName;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
}
