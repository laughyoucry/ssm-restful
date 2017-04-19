package com.lemon.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lemon.demo.dao.IUserDao;
import com.lemon.demo.pojo.User;
import com.lemon.demo.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource(name = "userDao")
	private IUserDao userDao;

	@Override
	public User getUserById(Integer userId) {
		return userDao.selectByPrimaryKey(userId);
	}

	@Override
	public int addUser(User user) {
		return userDao.insert(user);
	}

}
