package org.easyeat.entity;

public class Dish {
	private String id;
	private String logo;
	private float price;
	private String timetodo;
	private String desc;
	private int soldtimes;// ���±������
	private String typeId;// �����̼ҵ��ĸ�����
	public Dish(String id, String logo, float price, String timetodo, String desc, int soldtimes, String typeId) {
		this.id = id;
		this.logo = logo;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
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
	public int getSoldtimes() {
		return soldtimes;
	}
	public void setSoldtimes(int soldtimes) {
		this.soldtimes = soldtimes;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
}
