package com.dengzhou.dao;

import com.dengzhou.bean.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@MapperScan
@Repository
public interface UserDao {
   List<User> findAll();

   int insertUser(User user);
}