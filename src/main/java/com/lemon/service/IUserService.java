package com.lemon.service;

import com.lemon.pojo.vo.User;

public interface IUserService {

	public User getUserById(Integer userId);

	public int addUser(User user);
}
