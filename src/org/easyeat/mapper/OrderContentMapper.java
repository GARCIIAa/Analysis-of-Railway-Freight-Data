package org.easyeat.mapper;

import java.util.List;

import org.easyeat.entity.OrderContent;

public interface OrderContentMapper {
	void insertOneOrderContent(OrderContent orderContent);
	List<OrderContent> selectOrderContentbyOrderId(String orderId);
}