package com.nsc.backend.entity;

//微信用户的地址
public class Address {
	private Integer addId;
	private	String	addUserName;
	private	String	addPostalCode;
	private	String	addCounty;
	private	String	addProvince;
	private	String	addCity;
	private	String	addDetailInfo;
	private	String	addNationalCode;
	private	String	addTele;
	//选择是否默认地址
	private	Boolean	addDefault;
	//一个用户可以有多个地址,但一个地址仅对应一个用户
	private	User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	public String getAddUserName() {
		return addUserName;
	}
	public void setAddUserName(String addUserName) {
		this.addUserName = addUserName;
	}
	public String getAddPostalCode() {
		return addPostalCode;
	}
	public void setAddPostalCode(String addPostalCode) {
		this.addPostalCode = addPostalCode;
	}
	public String getAddCounty() {
		return addCounty;
	}
	public void setAddCounty(String addCounty) {
		this.addCounty = addCounty;
	}
	public String getAddProvince() {
		return addProvince;
	}
	public void setAddProvince(String addProvince) {
		this.addProvince = addProvince;
	}
	public String getAddCity() {
		return addCity;
	}
	public void setAddCity(String addCity) {
		this.addCity = addCity;
	}
	public String getAddDetailInfo() {
		return addDetailInfo;
	}
	public void setAddDetailInfo(String addDetailInfo) {
		this.addDetailInfo = addDetailInfo;
	}
	public String getAddNationalCode() {
		return addNationalCode;
	}
	public void setAddNationalCode(String addNationalCode) {
		this.addNationalCode = addNationalCode;
	}
	public String getAddTele() {
		return addTele;
	}
	public void setAddTele(String addTele) {
		this.addTele = addTele;
	}
	public Boolean getAddDefault() {
		return addDefault;
	}
	public void setAddDefault(Boolean addDefault) {
		this.addDefault = addDefault;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addUserName=" + addUserName + ", addPostalCode=" + addPostalCode
				+ ", addCounty=" + addCounty + ", addProvince=" + addProvince + ", addCity=" + addCity
				+ ", addDetailInfo=" + addDetailInfo + ", addNationalCode=" + addNationalCode + ", addTele=" + addTele
				+ ", addDefault=" + addDefault + ", user=" + user + "]";
	}
	
	
}
