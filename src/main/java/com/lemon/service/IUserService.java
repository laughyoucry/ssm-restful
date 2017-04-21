package com.lemon.service;

import com.lemon.pojo.model.User;

import java.util.List;

public interface IUserService {

    /**
     * 根据用户id获得用户信息
     * 
     * @param userId
     * @return
     */
    User getUserById(Long userId);

    /**
     * 添加用户
     * 
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 获取用户列表
     * 
     * @return
     */
    List<User> listUsers();

    /**
     * 计算用户数
     * 
     * @return
     */
    int countUsers();
}
