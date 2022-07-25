package com.yitsd.tests;

import com.yitsd.mapper.UserMapper;
import com.yitsd.pojo.User;
import com.yitsd.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserMapperTest
 * @Date 2022/7/20 21:38
 */
public class UserMapperTest {

    @Test
    public void testGetUserByUserName() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUserName("admin");
        System.out.println("user = " + user);
    }

    @Test
    public void checkLogin() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("admin", "123456");
        System.out.println("user = " + user);
    }

    @Test
    public void checkLoginByMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("username","admin");
        map.put("password","123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println("user = " + user);
    }

    @Test
    public void insertUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(new User("ll","654321",18,"男","123@163.com"));
    }


    @Test
    public void checkLoginByParam() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("admin", "123456");
        System.out.println("user = " + user);
    }









}
