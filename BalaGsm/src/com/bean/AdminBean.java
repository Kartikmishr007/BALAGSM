package com.bean;

public class AdminBean {
	private  String  userid;
	private String userpassword;

	public AdminBean(String userid, String userpassword) {
		super();
		this.userid = userid;
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "AdminBean [userid=" + userid + ", userpassword=" + userpassword + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	
	

}
