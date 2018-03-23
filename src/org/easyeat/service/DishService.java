package org.easyeat.service;

import java.util.List;

import javax.annotation.Resource;

import org.easyeat.entity.Dish;
import org.easyeat.entity.User;
import org.easyeat.mapper.DishMapper;
import org.easyeat.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class DishService {
	@Resource
	private DishMapper dishMapper;
	public Dish getDishByID(String id){
		return dishMapper.selectDishByID(id);
	}
}
