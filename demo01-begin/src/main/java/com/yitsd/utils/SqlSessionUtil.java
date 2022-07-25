package com.yitsd.utils;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName SqlSessionUtil
 * @Date 2022/7/20 1:09
 */
@Component
public class SqlSessionUtil {

    @Autowired
    private SqlSession sqlSession;

    public SqlSession getSqlSession(){
        return sqlSession;
    }
}
