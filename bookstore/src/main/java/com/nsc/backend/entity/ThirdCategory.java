package com.nsc.backend.entity;

/**
 * 三级类别类
 * @author Lenovo
 *
 */
public class ThirdCategory {
	private Integer thirdCateId;
	private String 	thirdCateAlias;
	private	String 	thirdCateName;
	//关联属性
	private SecondCategory secondCategory;
	
	
	public Integer getThirdCateId() {
		return thirdCateId;
	}
	public void setThirdCateId(Integer thirdCateId) {
		this.thirdCateId = thirdCateId;
	}
	public String getThirdCateAlias() {
		return thirdCateAlias;
	}
	public void setThirdCateAlias(String thirdCateAlias) {
		this.thirdCateAlias = thirdCateAlias;
	}
	public String getThirdCateName() {
		return thirdCateName;
	}
	public void setThirdCateName(String thirdCateName) {
		this.thirdCateName = thirdCateName;
	}
	public SecondCategory getSecondCategory() {
		return secondCategory;
	}
	public void setSecondCategory(SecondCategory secondCategory) {
		this.secondCategory = secondCategory;
	}
	
	
	
	
	
}
