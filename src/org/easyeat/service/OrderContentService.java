package org.easyeat.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.easyeat.entity.Dish;
import org.easyeat.entity.OrderContent;
import org.easyeat.mapper.OrderContentMapper;
import org.springframework.stereotype.Service;

@Service
public class OrderContentService {
	@Resource
	private OrderContentMapper ordercontentMapper;
	public void createOrderContent(String orderId, String dishId, String count){
		OrderContent OrderContent = new OrderContent(orderId, dishId,count);
		ordercontentMapper.insertOneOrderContent(OrderContent);
	}
	public List<OrderContent> getOrderContentByOrderId(String orderId){
		return ordercontentMapper.selectOrderContentbyOrderId(orderId);
	}
}
