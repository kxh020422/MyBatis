package com.yitsd.tests;

import com.yitsd.mapper.SelectMapper;
import com.yitsd.pojo.User;
import com.yitsd.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;


/**
 * @ClassName SelectMapperTest
 * @Date 2022/7/21 0:08
 */
public class SelectMapperTest {

    @Test
    public void testGetUserById() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println("userById = " + userById);
    }

    @Test
    public void testAllUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(user -> System.out.println("user = " + user));
    }

    @Test
    public void testGetCount() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println("count = " + count);
    }

    @Test
    public void testGetUserToMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> userByIdToMap = mapper.getUserByIdToMap(1);
        //userByIdToMap = {password=123456, gender=男, id=1, age=18, email=123@qq.com, username=admin}
        System.out.println("userByIdToMap = " + userByIdToMap);
    }

    @Test
    public void testGetAllUserToMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<String, Object>> allUserToMap = mapper.getAllUserToMap();
        allUserToMap.forEach(map -> System.out.println("map = " + map));
    }


    @Test
    public void testGetAllUserToMapWithAnno() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> allUserToMapWithAnno = mapper.getAllUserToMapWithAnno();
//        System.out.println("allUserToMapWithAnno = " + allUserToMapWithAnno);
//        allUserToMapWithAnno = {1={password=123456, gender=男, id=1, age=18, email=123@qq.com, username=admin},
//                                2={password=654321, gender=男, id=2, age=18, email=123@163.com, username=ll}}
        System.out.println(allUserToMapWithAnno.get("ll"));


    }

}
