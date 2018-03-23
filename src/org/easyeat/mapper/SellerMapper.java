package org.easyeat.mapper;

import java.util.List;

import org.easyeat.entity.Seller;
import org.easyeat.entity.User;

public interface SellerMapper {
	List<Seller> selectAllSeller();
	Seller selectSellerbyID(String id);
	String selectSellerNamebyID(String id);
}
