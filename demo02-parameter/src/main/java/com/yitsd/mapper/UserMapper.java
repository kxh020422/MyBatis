package com.yitsd.mapper;

import com.yitsd.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @ClassName UserMapper
 * @Date 2022/7/20 21:02
 */
public interface UserMapper {


    //根据用户名查询信息
    User getUserByUserName(String username);


    //验证登录
    User checkLogin(String username, String password);


    //验证登录（以map集合作为参数）
    User checkLoginByMap(Map<String, Object> map);


    void insertUser(User user);

    //以@Param中的value属性为键 mapper接口中参数为值
    User checkLoginByParam(@Param(value = "username") String username, @Param("password") String password);


}
