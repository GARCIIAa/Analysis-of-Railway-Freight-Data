package org.easyeat.entity;

public class Evaluation {
	private String id;
	private String time;
	private String cusid;
	private int level;
	private String desc;
	private String orderid;
	public Evaluation(String id, String time, String cusid, int level, String desc, String orderid) {
		this.id = id;
		this.time = time;
		this.cusid = cusid;
		this.level = level;
		this.desc = desc;
		this.orderid = orderid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCusid() {
		return cusid;
	}
	public void setCusid(String cusid) {
		this.cusid = cusid;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
}
