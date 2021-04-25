package com.dengzhou.controller;

import com.dengzhou.bean.User;
import com.dengzhou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
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
}