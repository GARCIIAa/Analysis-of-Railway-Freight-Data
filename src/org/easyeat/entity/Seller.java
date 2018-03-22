package org.easyeat.entity;

public class Seller {
	
	private String id;
	private String logo;
	private String name;
	private String password;
	private String desc;
	private String address;
	private String tel;
	private String aptitude;// �̼����ʣ���Ӫҵִ�յ���Ʒ����ƬUrl��ַ
	private String circumstance;// �̼һ��������̼һ�����Ƭ��Url��ַ
	private String level;// �����Ǽ���ƽ��ֵ��һλС��
	private String keeptime;// ���˿��ղصĴ���
	private String period;// Ӫҵʱ������
	private String open;// �Ƿ���Ӫҵ
	private String full;// �Ƿ����

	public Seller(String id, String logo, String name, String password, String desc, String address, String tel,
			String aptitude, String circumstance, String level, String keeptime, String period, String open,
			String full) {
		this.id = id;
		this.logo = logo;
		this.name = name;
		this.password = password;
		this.desc = desc;
		this.address = address;
		this.tel = tel;
		this.aptitude = aptitude;
		this.circumstance = circumstance;
		this.level = level;
		this.keeptime = keeptime;
		this.period = period;
		this.open = open;
		this.full = full;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAptitude() {
		return aptitude;
	}
	public void setAptitude(String aptitude) {
		this.aptitude = aptitude;
	}
	public String getCircumstance() {
		return circumstance;
	}
	public void setCircumstance(String circumstance) {
		this.circumstance = circumstance;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getKeeptime() {
		return keeptime;
	}
	public void setKeeptime(String keeptime) {
		this.keeptime = keeptime;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String isOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String isFull() {
		return full;
	}
	public void setFull(String full) {
		this.full = full;
	}
	
}
