package com.yitsd.tests;

import com.yitsd.mapper.SpecialSQLMapper;
import com.yitsd.pojo.User;
import com.yitsd.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName SpecialSQLTest
 * @Date 2022/7/21 22:36
 */
public class SpecialSQLTest {

    @Test
    public void testSpecialSQL() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> userByLike = mapper.getUserByLike("mi");
        userByLike.forEach(user -> System.out.println("user = " + user));
    }


    @Test
    public void testBatchDel() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.batchDel("3,4,5");
    }


    @Test
    public void testGetUserList() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> t_user = mapper.getUserList("t_user");
        t_user.forEach(user -> System.out.println("user = " + user));
    }

    @Test
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User("张三","987654",19,"男","123@gmail.com");
        mapper.insertUser(user);
        System.out.println("user.getId() = " + user.getId());
        
    }



}
