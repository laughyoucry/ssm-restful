package com.lemon.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.lemon.dao.UserDao;
import org.springframework.stereotype.Service;

import com.lemon.pojo.model.User;
import com.lemon.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public User getUserById(Long userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public int addUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public List<User> listUsers() {
        return null;
    }

    @Override
    public int countUsers() {
        return 0;
    }

}
