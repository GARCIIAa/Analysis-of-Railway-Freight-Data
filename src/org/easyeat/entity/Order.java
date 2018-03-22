package org.easyeat.entity;

public class Order {
	private String id;
	private String finish;
	private String reservetime;// �û�Ԥ����ʳʱ��
	private String customernum;// ������Ԥ�����Ͳ͵�����
	private String price;
	private String ready;// �����еĲ�Ʒ�Ƿ�׼�����
	private String phone;
	private String sirormiss;
	private String sex;
	private String cusid;
	private String ordertime;
	private String ps;// ��ע
	private String sellerid;
	private String ispaid;
	public Order(String id, String finish, String reservetime, String customernum, String price, String ready,String phone,
			String sirormiss, String sex, String cusid, String ordertime, String ps, String sellerid, String ispaid) {
		this.id = id;
		this.finish = finish;
		this.reservetime = reservetime;
		this.customernum = customernum;
		this.price = price;
		this.ready = ready;
		this.phone = phone;
		this.sirormiss = sirormiss;
		this.sex = sex;
		this.cusid = cusid;
		this.ordertime = ordertime;
		this.ps = ps;
		this.sellerid = sellerid;
		this.ispaid = ispaid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String isFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	public String getReservetime() {
		return reservetime;
	}
	public void setReservetime(String reservetime) {
		this.reservetime = reservetime;
	}
	public String getCustomernum() {
		return customernum;
	}
	public void setCustomernum(String customernum) {
		this.customernum = customernum;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String isReady() {
		return ready;
	}
	public void setReady(String ready) {
		this.ready = ready;
	}
	public String getSirormiss() {
		return sirormiss;
	}
	public void setSirormiss(String sirormiss) {
		this.sirormiss = sirormiss;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCusid() {
		return cusid;
	}
	public void setCusid(String cusid) {
		this.cusid = cusid;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public String getSellerid() {
		return sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}
	public String isIspaid() {
		return ispaid;
	}
	public void setIspaid(String ispaid) {
		this.ispaid = ispaid;
	}
}
