package com.KoreaIT.java.Basic.Review.dto;

public class Member extends Dto {
	public String loginId;
	public String loginPw;
	public String name;

	public Member(int id, String regDate, String updateDate, String loginId, String loginPw, String name) {
		this.id = id;
		this.regDate = regDate;
		this.updateDate = updateDate;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.name = name;
	}

	public String getloginId() {
		
		return loginId;
	}

}