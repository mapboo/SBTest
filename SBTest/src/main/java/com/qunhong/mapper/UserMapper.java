package com.qunhong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.qunhong.pojo.User;

@Mapper
public interface UserMapper {

	List<User> userList();
	
}
