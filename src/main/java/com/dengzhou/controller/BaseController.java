package com.dengzhou.controller;

import com.dengzhou.bean.User;
import com.dengzhou.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: DZEXEDEMO
 * @description:
 * @author: 北斗
 * @create: 2021-04-25 10:44
 **/
@RestController
public class BaseController {
    @Autowired
    private UserService userService;

    @GetMapping("/findall")
    public String findALL(){
        List<User> allUsers = userService.findAllUsers();
        if (allUsers.isEmpty()){
            return "查不到用户";
        }
        return allUsers.toString();
    }

    @PostMapping("/insert")
    public String inserUser(@RequestBody User user){
        int i = userService.inserUser(user);
        if (i > 0){
            return "插入成功!";
        }
        return "插入失败!";
    }

    @PostMapping("/getUsersByConditionIf")
    public String findUserCondition(@RequestBody User user){
        List<User> usersByConditionIf = userService.getUsersByConditionIf(user);
        if (usersByConditionIf.isEmpty()){
            return "找不到";
        }
        return usersByConditionIf.toString();
    }

    @PostMapping("/getUsersByConditionChoose")
    public String getUsersByConditionChoose(@RequestBody User user){
        List<User> users = userService.getUsersByConditionChoose(user);
        if (users.isEmpty()){
            return "查询不到数据!";
        }
        return users.toString();
    }

    @PostMapping("/updateUserByConditionSet")
    public String updateUserByConditionSet(@RequestBody User user){
        int i = userService.updateUserByConditionSet(user);
        if (i != 0){
            return "修改成功!";
        }
        return "修改失败!";
    }

    @PostMapping("/usersByConditionForeach")
    public String usersByConditionForeach(){
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(3L);
        list.add(5L);
        List<User> usersByConditionForeach = userService.getUsersByConditionForeach(list);
        if (usersByConditionForeach.isEmpty()){
            return "查询不到数据!";
        }
        return usersByConditionForeach.toString();
    }

    /**
     *  批量插入数据
     */
    @PostMapping("/insertList")
    public String inserList(){
        User user1 = new User("小明","北京","蓝色","中国");
        User user2 = new User("魏源","打更人","灰色","大奉");
        User user3 = new User("许新年","叙府","白色","大奉");
        User user4 = new User("月牙儿","突厥王庭","金黄色","突厥");
        User user5 = new User("小雨若","萧府","红色","大华");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        try {
            userService.addAllUser(userList);
            return "批量插入成功!";
        }catch (Exception e){
            return "批量插入失败!";
        }
    }

    /**
     * @Desption: @Transactional
     * springboot + mybatis 不加事务注解，一级缓存失效
     * 加上，则一级缓存生效
     *
     */
    @PostMapping("/selectid")
    public String selectByCache(@Param("id") Long id){
        User user1 = userService.getUserById(id);
        User user2 = userService.getUserById(id);
        System.out.println(user1 == user2);
        return user1.toString();
    }
}