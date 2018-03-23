package org.easyeat.entity;

public class OrderContent {
	private String OrderID;
	private String DishID;
	private String Count;
	public OrderContent(String orderID, String dishID, String count) {
		OrderID = orderID;
		DishID = dishID;
		Count = count;
	}
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	public String getDishID() {
		return DishID;
	}
	public void setDishID(String dishID) {
		DishID = dishID;
	}
	public String getCount() {
		return Count;
	}
	public void setCount(String count) {
		Count = count;
	}
	
}
