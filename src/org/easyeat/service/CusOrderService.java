package org.easyeat.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

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
	public String createCusOrder(CusOrder o){
		String oid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		CusOrder cusOrder = new CusOrder(oid,o.getFinish(),o.getReservetime(),o.getCustomernum(),o.getPrice(),o.getReady(),o.getPhone(),o.getSirormiss(),o.getSex(),o.getCusid(),o.getOrdertime(),o.getPs(),o.getSellerid(),o.getIspaid());
		cusorderMapper.insertOneCusOrder(cusOrder);
		return oid;
	}
	public int updateStatusById(CusOrder cusOrder){
		return cusorderMapper.updateStatus(cusOrder);
	}
	public int updateTotalPriceById(String id,String price){
		return cusorderMapper.updateTotalPrice(id,price);
	}
	public List<CusOrder> getOrderInfoByCusId(String cusId){
		return cusorderMapper.selectCusOrderByCusId(cusId);
	}
}
