package com.mini.bbs.domain;

import java.util.Date;

//VO(Value Object) : 주로 사용하는 데이터 타입을 저장
//DAO(Data Access Object) : 데이터베이스와 접속
//DTO(Data Transfer Object) : 계층 간(Controlelr, View, Business Layer) 데이터 교환을 위한 Java Bean를 의미한다. DTO는 로직을 가지지 않는 데이터 객체이고, getter, setter 메소드만 가진 클래스를 의미한다.
//Service 패키지 : DAO와 Controller 사이를 연결해 주는 역할

public class MemberVO {
	
	private String userId;
	private String userPass;
	private String userPassRe;
	private String userName;
	private String userGender;
	private String userPhone;
	private String userAddr1;
	private String userAddr2;
	private String userAddr3;
	private Date regDate;
	private int verify;
	
	
	public String getUserPassRe() {
		return userPassRe;
	}
	public void setUserPassRe(String userPassRe) {
		this.userPassRe = userPassRe;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddr1() {
		return userAddr1;
	}
	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}
	public String getUserAddr2() {
		return userAddr2;
	}
	public void setUserAddr2(String userAddr2) {
		this.userAddr2 = userAddr2;
	}
	public String getUserAddr3() {
		return userAddr3;
	}
	public void setUserAddr3(String userAddr3) {
		this.userAddr3 = userAddr3;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getVerify() {
		return verify;
	}
	public void setVerify(int verify) {
		this.verify = verify;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	
}
