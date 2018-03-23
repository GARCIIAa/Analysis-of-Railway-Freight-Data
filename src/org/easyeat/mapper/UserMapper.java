package org.easyeat.mapper;

import java.util.List;

import org.easyeat.entity.User;

public interface UserMapper {
	List<User> selectAllUser();
	User selectUserbyID(String id);
	void deleteUserbyID(String id);
}
