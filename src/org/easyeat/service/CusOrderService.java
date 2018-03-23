package org.easyeat.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.easyeat.entity.CusOrder;
import org.easyeat.mapper.CusOrderMapper;
import org.springframework.stereotype.Service;

@Service
public class CusOrderService {
	@Resource
	private CusOrderMapper cusorderMapper;
	public List<CusOrder> inquireAllCusOrder()
	{
		return cusorderMapper.selectAllCusOrder();
	}
	public CusOrder inquireCusOrderById(String id)
	{
		return cusorderMapper.selectCusOrderById(id);
	}
	public int deleteCusOrderbyId(String id){
		return cusorderMapper.deleteCusOrderById(id);
	}
	/*public int createCusOrder(Date orderTime, float totalPrice, int userId,
								  int logisticProviderId, int status, String logisticInfo){
		CusOrder cusOrder = new CusOrder(0,orderTime, totalPrice, userId,
				logisticProviderId, status, logisticInfo);
		cusorderMapper.insertOneCusOrder(cusOrder);
		return cusOrder.getId();
	}*/
	public int updateStatusById(CusOrder cusOrder){
		return cusorderMapper.updateStatus(cusOrder);
	}
	public int updateTotalPriceById(String id,String price){
		return cusorderMapper.updateTotalPrice(id,price);
	}
	public List<CusOrder> getOrderInfoByCusId(int cusId){
		return cusorderMapper.selectCusOrderByCusId(cusId);
	}
}
