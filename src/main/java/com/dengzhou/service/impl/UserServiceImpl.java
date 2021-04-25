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

    @Override
    public List<User> getUsersByConditionIf(User user) {
        List<User> usersByConditionIf = userDao.getUsersByConditionIf(user);
        return usersByConditionIf;
    }

    @Override
    public List<User> getUsersByConditionChoose(User user) {
        List<User> users = userDao.getUsersByConditionChoose(user);
        return users;
    }

    @Override
    public int updateUserByConditionSet(User user) {
        int i = userDao.updateUserByConditionSet(user);
        return i;
    }

    @Override
    public List<User> getUsersByConditionForeach(List<Long> list) {
        List<User> usersByConditionForeach = userDao.getUsersByConditionForeach(list);
        return usersByConditionForeach;
    }

    @Override
    public void addAllUser(List<User> list) {
        userDao.addAllUser(list);
    }
}