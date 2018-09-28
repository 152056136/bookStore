package com.nsc.backend.entity;
/**
 * 用户实体类
 * @author Lenovo
 *
 */
public class User {
	private Integer userId;
	private String  userOpenId;
	private String  userNickName;//用户昵称
	private String 	userGender;//用户性别
	private String 	userCity;
	private String	userProvince;
	private String	userCountry;
	private String 	userAvatarUrl;//用户名
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userOpenId=" + userOpenId + ", userNickName=" + userNickName
				+ ", userGender=" + userGender + ", userCity=" + userCity + ", userProvince=" + userProvince
				+ ", userCountry=" + userCountry + ", userAvatarUrl=" + userAvatarUrl + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserOpenId() {
		return userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserProvince() {
		return userProvince;
	}
	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public String getUserAvatarUrl() {
		return userAvatarUrl;
	}
	public void setUserAvatarUrl(String userAvatarUrl) {
		this.userAvatarUrl = userAvatarUrl;
	}
	
}
