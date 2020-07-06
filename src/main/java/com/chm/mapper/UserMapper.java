package com.chm.mapper;

import com.chm.bean.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    User findById(Integer id);

    int saveUser(User user);

    int updateUser(User user);

    int deleteById(Integer id);
}
