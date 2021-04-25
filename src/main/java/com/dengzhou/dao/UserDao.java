package com.dengzhou.dao;

import com.dengzhou.bean.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@MapperScan
@Repository
public interface UserDao {
   List<User> findAll();

   int insertUser(User user);

   /**
    * @description: 携带了哪个字段查询条件就带上哪个字段的值
    * @param user
    * @return
    */
   List<User> getUsersByConditionIf(User user);

   List<User> getUsersByConditionChoose(User user);

   int updateUserByConditionSet(User user);

   List<User> getUsersByConditionForeach(List<Long> list);

   void addAllUser(List<User> list);

   User getUserById(@Param("id") Long id);
}