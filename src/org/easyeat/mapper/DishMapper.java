package org.easyeat.mapper;

import java.util.List;

import org.easyeat.entity.Dish;

public interface DishMapper {
	Dish selectDishByID(String id);
}
