package com.dengzhou.service;

import com.dengzhou.bean.User;

import java.util.List;

/**
 * @program: DZEXEDEMO
 * @description:
 * @author: 北斗
 * @create: 2021-04-25 10:45
 **/

public interface UserService {
    List<User> findAllUsers();

    int inserUser(User user);

    List<User> getUsersByConditionIf(User user);

    List<User> getUsersByConditionChoose(User user);

    int updateUserByConditionSet(User user);

    List<User> getUsersByConditionForeach(List<Long> list);

    void addAllUser(List<User> list);
}