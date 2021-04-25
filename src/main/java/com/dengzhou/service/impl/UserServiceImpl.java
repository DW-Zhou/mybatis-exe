package com.dengzhou.service.impl;

import com.dengzhou.bean.User;
import com.dengzhou.dao.UserDao;
import com.dengzhou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: DZEXEDEMO
 * @description:
 * @author: 北斗
 * @create: 2021-04-25 10:47
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    @Override
    public int inserUser(User user) {
        int i = userDao.insertUser(user);
        return i;
    }
}