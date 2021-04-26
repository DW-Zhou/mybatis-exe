package com.dengzhou.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: DZEXEDEMO
 * @description: 实体类
 * @author: 北斗
 * @create: 2021-04-25 10:45
 **/

@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private String address;
    private String color;
    private String country;

    public User() {
    }

    public User(String username, String address, String color, String country) {
        this.username = username;
        this.address = address;
        this.color = color;
        this.country = country;
    }
}