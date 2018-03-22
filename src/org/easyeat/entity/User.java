package org.easyeat.entity;

public class User {
	private String id;
	private String tel;
	private String sirormiss;
	private String sex;
	private String name;
	private String iconurl;
	private String password;
	private String passwrodforpay;
	public User(String id, String tel, String sirormiss, String sex, String name, String iconurl,
			String password, String passwrodforpay) {
		this.id = id;
		this.tel = tel;
		this.sirormiss = sirormiss;
		this.sex = sex;
		this.name = name;
		this.iconurl = iconurl;
		this.password = password;
		this.passwrodforpay = passwrodforpay;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSirOrMiss() {
		return sirormiss;
	}
	public void setSirOrMiss(String sirormiss) {
		this.sirormiss = sirormiss;
	}
	public String getIconurl() {
		return iconurl;
	}
	public void setIconurl(String iconurl) {
		this.iconurl = iconurl;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswrodforpay() {
		return passwrodforpay;
	}
	public void setPasswrodforpay(String passwrodforpay) {
		this.passwrodforpay = passwrodforpay;
	}
	
}
