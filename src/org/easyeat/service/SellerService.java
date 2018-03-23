package org.easyeat.service;

import java.util.List;

import javax.annotation.Resource;

import org.easyeat.entity.Seller;
import org.easyeat.entity.User;
import org.easyeat.mapper.SellerMapper;
import org.easyeat.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
	@Resource
	private SellerMapper sellerMapper;
	public List<Seller> querrySellers()
	{
		return sellerMapper.selectAllSeller();
	}
	public Seller querrySellerbyID(String id)
	{
		return sellerMapper.selectSellerbyID(id);
	}
	public String querrySellerNamebyID(String id)
	{
		return sellerMapper.selectSellerNamebyID(id);
	}

}
