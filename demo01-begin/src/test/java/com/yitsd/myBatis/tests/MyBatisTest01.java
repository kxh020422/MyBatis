package com.yitsd.myBatis.tests;

import com.yitsd.config.SpringConfig;
import com.yitsd.config.SqlSessionConfig;
import com.yitsd.mapper.UserMapper;
import com.yitsd.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MyBatisTest01
 * @Date 2022/7/20 0:14
 */
@Component
public class MyBatisTest01 {


    @Test
    public void testInsert() throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SqlSessionConfig.class);
        SqlSessionConfig bean = applicationContext.getBean(SqlSessionConfig.class);
        System.out.println();
    }

    @Test
    public void testDelUpdate(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        SqlSessionUtil sqlSessionUtil = applicationContext.getBean(SqlSessionUtil.class);
        SqlSession sqlSession = sqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.delUser();
//        mapper.updateUser();
//        System.out.println(mapper.getUserById());
        mapper.getUserList().forEach(user -> {
            System.out.println("user = " + user);
            System.out.print("");
        });

        sqlSession.close();

    }


}
