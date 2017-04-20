package com.lemon.service.impl;

import javax.annotation.Resource;

import com.lemon.dao.IUserDao;
import com.lemon.service.IUserService;
import org.springframework.stereotype.Service;

import com.lemon.pojo.vo.User;

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
