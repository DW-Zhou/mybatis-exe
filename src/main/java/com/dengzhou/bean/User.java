package com.dengzhou.bean;

import lombok.Data;

/**
 * @program: DZEXEDEMO
 * @description: 实体类
 * @author: 北斗
 * @create: 2021-04-25 10:45
 **/

@Data
public class User {
    private Long id;
    private String username;
    private String address;
    private String color;
    private String country;
}