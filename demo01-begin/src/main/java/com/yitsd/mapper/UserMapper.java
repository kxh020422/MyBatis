package com.yitsd.mapper;

import com.yitsd.pojo.User;

import java.util.List;

public interface UserMapper {

    int insertUser();

    void delUser();

    void updateUser();

    List<User> getUserList();

    User getUserById();

}
