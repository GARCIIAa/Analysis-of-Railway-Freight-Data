package org.easyeat.entity;

public class Favor {
	private String id;
	private int satisfy;// 满减的“满”
	private int sirormiss;// 满减的减
	private String sellerid;
	public Favor(String id, int satisfy, int sirormiss, String sellerid) {
		super();
		this.id = id;
		this.satisfy = satisfy;
		this.sirormiss = sirormiss;
		this.sellerid = sellerid;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSatisfy() {
		return satisfy;
	}
	public void setSatisfy(int satisfy) {
		this.satisfy = satisfy;
	}
	public int getSirormiss() {
		return sirormiss;
	}
	public void setSirormiss(int sirormiss) {
		this.sirormiss = sirormiss;
	}
	public String getSellerid() {
		return sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}
}
