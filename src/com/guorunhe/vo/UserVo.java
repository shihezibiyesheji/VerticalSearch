package com.guorunhe.vo;

import java.util.Date;

/**
 * 用户值对象
 * 
 * @author hanning
 *
 */
public class UserVo {

	// userName,userImg,focusNo,fansNo,blogNo,questionNo
	private int id;
	@Override
	public String toString() {
		return "UserVo [id=" + id + ", userName=" + userName + ", userImg="
				+ userImg + ", focusNo=" + focusNo + ", fansNo=" + fansNo
				+ ", blogNo=" + blogNo + ", questionNo=" + questionNo
				+ ", userAccount=" + userAccount + ", userDesc=" + userDesc
				+ ", userMotto=" + userMotto + ", userBirthday=" + userBirthday
				+ ", userInterest=" + userInterest + ", userNickName="
				+ userNickName + ", userSex=" + userSex + ", userEmail="
				+ userEmail + ", userQQ=" + userQQ + ", userTelephone="
				+ userTelephone + ", userProvince=" + userProvince
				+ ", userCity=" + userCity + ", userCounty=" + userCounty + "]";
	}

	private String userName;
	private String userImg;
	private int focusNo;
	private int fansNo;
	private int blogNo;
	private int questionNo;
	private String userAccount;
	private String userDesc;
	private String userMotto;
	private Date userBirthday;
	private String userInterest;
	private String userNickName;
	private String userSex;
	private String userEmail;
	private String userQQ;
	private String userTelephone;
	private String userProvince;
	private String userCity;
	private String userCounty;

	public String getUserProvince() {
		return userProvince;
	}

	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserCounty() {
		return userCounty;
	}

	public void setUserCounty(String userCounty) {
		this.userCounty = userCounty;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public String getUserMotto() {
		return userMotto;
	}

	public void setUserMotto(String userMotto) {
		this.userMotto = userMotto;
	}

	public Date getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserInterest() {
		return userInterest;
	}

	public void setUserInterest(String userInterest) {
		this.userInterest = userInterest;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserQQ() {
		return userQQ;
	}

	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}

	public String getUserTelephone() {
		return userTelephone;
	}

	public void setUserTelephone(String userTelephone) {
		this.userTelephone = userTelephone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public int getFocusNo() {
		return focusNo;
	}

	public void setFocusNo(int focusNo) {
		this.focusNo = focusNo;
	}

	public int getFansNo() {
		return fansNo;
	}

	public void setFansNo(int fansNo) {
		this.fansNo = fansNo;
	}

	public int getBlogNo() {
		return blogNo;
	}

	public void setBlogNo(int blogNo) {
		this.blogNo = blogNo;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
