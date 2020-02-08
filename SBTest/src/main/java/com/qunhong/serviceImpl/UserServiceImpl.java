package com.qunhong.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qunhong.mapper.UserMapper;
import com.qunhong.pojo.User;
import com.qunhong.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> userList() {
		return userMapper.userList();
	}

}
