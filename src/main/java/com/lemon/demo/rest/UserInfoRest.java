package com.lemon.demo.rest;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lemon.demo.pojo.User;
import com.lemon.demo.service.IUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "用户服务")
@Controller
@RequestMapping("/user")
public class UserInfoRest {

	@Resource(name = "userService")
	private IUserService userService;

	@ApiOperation(value = "获取用户信息", notes = "根据ID获取")
	@ResponseBody
	@RequestMapping(value = "/showUser/{id}", method = RequestMethod.GET)
	public User getUserById(@ApiParam(required = true, value = "用户id") @PathVariable(value = "id") Integer userId) {
		User user = this.userService.getUserById(userId);
		return user;
	}

	@ApiOperation(value = "展示用户信息", notes = "根据ID获取信息并跳转页面")
	@RequestMapping(value = "/userInfo/{id}", method = RequestMethod.GET)
	public String showUser(@ApiParam(required = true, value = "用户id") @PathVariable(value = "id") Integer userId,
			Model model) {
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "UserInfo";
	}
}
