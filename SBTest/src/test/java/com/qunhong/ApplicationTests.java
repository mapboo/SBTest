package com.qunhong;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.qunhong.pojo.User;
import com.qunhong.service.IUserService;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private IUserService userService;
	
	@Test
	void contextLoads() {
		System.out.println("测试用例！");
	}
	
	@Test
	void usetListTest(){
		List<User> users = userService.userList();
		for (User user : users) {
			System.out.println("用户名："+ user.getName());
		}
	}

}
