package org.easyeat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.easyeat.entity.CusOrder;

public interface CusOrderMapper {
	List<CusOrder> selectAllCusOrder();
	CusOrder selectCusOrderById(String OrderID);
	Integer deleteCusOrderById(String OrderID);
	Integer insertOneCusOrder(CusOrder cusOrder);
	Integer updateStatus(CusOrder cusOrder);
	List<CusOrder> selectCusOrderByCusId(int CusID);
	Integer updateTotalPrice(@Param("OrderID") String id,@Param("OrderPrice") String price);
}
