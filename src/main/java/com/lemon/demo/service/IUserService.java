package com.lemon.demo.service;

import com.lemon.demo.pojo.User;

public interface IUserService {

	public User getUserById(Integer userId);

	public int addUser(User user);
}
