package org.easyeat.entity;

public class Dish {
	private String id;
	private String logo;
	private String name;
	private String price;
	private String timetodo;
	private String desc;
	private String soldtimes;// 本月被点次数
	private String typeId;// 所属商家的哪个类型
	private String orderCounts;
	private String totalPrice;
	public Dish(String id, String logo, String name, String price, String timetodo, String desc, String soldtimes, String typeId) {
		this.id = id;
		this.logo = logo;
		this.setName(name);
		this.price = price;
		this.timetodo = timetodo;
		this.desc = desc;
		this.soldtimes = soldtimes;
		this.typeId = typeId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTimetodo() {
		return timetodo;
	}
	public void setTimetodo(String timetodo) {
		this.timetodo = timetodo;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSoldtimes() {
		return soldtimes;
	}
	public void setSoldtimes(String soldtimes) {
		this.soldtimes = soldtimes;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getOrderCounts() {
		return orderCounts;
	}
	public void setOrderCounts(String orderCounts) {
		this.orderCounts = orderCounts;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
