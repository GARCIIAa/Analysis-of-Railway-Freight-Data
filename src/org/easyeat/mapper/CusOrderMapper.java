package org.easyeat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.easyeat.entity.CusOrder;

public interface CusOrderMapper {
	List<CusOrder> selectAllCusOrder();
	CusOrder selectCusOrderById(String OrderID);
	Integer deleteCusOrderById(String OrderID);
	void insertOneCusOrder(CusOrder cusOrder);
	Integer updateStatus(CusOrder cusOrder);
	List<CusOrder> selectCusOrderByCusId(String cusId);
	Integer updateTotalPrice(@Param("OrderID") String id,@Param("OrderPrice") String price);
}
