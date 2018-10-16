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
	private String 	userAvatarUrl;//用户名
	private String userTelephone;
	private String userRegion;
	private String userPostalCode;
	private String userNote;
	
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userOpenId=" + userOpenId + ", userNickName=" + userNickName
				+ ", userGender=" + userGender + ", userCity=" + userCity + ", userProvince=" + userProvince
				+ ", userAvatarUrl=" + userAvatarUrl + ", userTelephone=" + userTelephone + ", userRegion=" + userRegion
				+ ", userPostalCode=" + userPostalCode + ", userNote=" + userNote + "]";
	}


	public String getUserTelephone() {
		return userTelephone;
	}


	public void setUserTelephone(String userTelephone) {
		this.userTelephone = userTelephone;
	}


	public String getUserRegion() {
		return userRegion;
	}


	public void setUserRegion(String userRegion) {
		this.userRegion = userRegion;
	}


	public String getUserPostalCode() {
		return userPostalCode;
	}


	public void setUserPostalCode(String userPostalCode) {
		this.userPostalCode = userPostalCode;
	}


	public String getUserNote() {
		return userNote;
	}


	public void setUserNote(String userNote) {
		this.userNote = userNote;
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
	public String getUserAvatarUrl() {
		return userAvatarUrl;
	}
	public void setUserAvatarUrl(String userAvatarUrl) {
		this.userAvatarUrl = userAvatarUrl;
	}
	
}
