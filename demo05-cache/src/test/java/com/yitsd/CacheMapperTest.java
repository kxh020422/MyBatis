package com.yitsd;

import com.yitsd.mapper.CacheMapper;
import com.yitsd.pojo.Emp;
import com.yitsd.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

/**
 * @ClassName CacheMapperTest
 * @Date 2022/7/23 0:39
 */
public class CacheMapperTest {
    
    @Test
    public void testGetEmpById() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpById(1);
        System.out.println( "emp1 = " + emp1);
//        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper1 = sqlSession.getMapper(CacheMapper.class);
        Emp emp2 = mapper1.getEmpById(1);
//        Emp emp2 = mapper.getEmpById(2);
        System.out.println("emp2 = " + emp2);

                
    }


    
}
