package com.bean;

public class RegisterBean {
	private  String fullname ;
	private String email;
	private String password;
	private String confirm_password;
	public RegisterBean(String fullname, String email, String password, String confirm_password) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.confirm_password=confirm_password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	@Override
	public String toString() {
		return "RegisterBean [fullname=" + fullname + ", email=" + email + ", password=" + password
				+ ", confirm_password=" + confirm_password + "]";
	}
	
}