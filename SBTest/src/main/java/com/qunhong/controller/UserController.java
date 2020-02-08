package com.qunhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qunhong.pojo.User;
import com.qunhong.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/say")
	@ResponseBody
	private String say() {
		return "Hello World!";
	}

	@RequestMapping("/info")
	private String info(Model model) {
		User user = new User();
		user.setName("唐僧");
//		model.addAttribute("name", "孙悟空");
		model.addAttribute("user", user);

		return "user";
	}
	
	
	@RequestMapping("/info2")
	private String info2(Model model) {
		List<User> users = userService.userList();
		model.addAttribute("users", users);
		return "user";
	}
	

	@RequestMapping("/info3")
	private String info3(Model model) {
		List<User> users = userService.userList();
		model.addAttribute("users", users);
		return "user2";
	}
	
	@ApiOperation(value="获取全部用户信息")
	@RequestMapping(value = "/info4",method = RequestMethod.GET)
	@ResponseBody
	private List<User> info4(Model model) {
		List<User> users = userService.userList();
		return users;
	}
	
	
	
}
