package com.yitsd.tests;

import com.yitsd.mapper.DynamicSQLMapper;
import com.yitsd.pojo.Emp;
import com.yitsd.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName tests
 * @Date 2022/7/22 20:40
 */
public class TestDynamicSQL {

    @Test
    public void testGetEmpByCondition() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, null, null, null);
        List<Emp> empList = mapper.getEmpByCondition(emp);
        empList.forEach(emp1 -> System.out.println("emp1 = " + emp1));
    }

    @Test
    public void testInsertMore() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empList = new ArrayList<>();
        Emp emp1 = new Emp(null, "a", 18, "女");
        Emp emp2 = new Emp(null, "b", 12, "女");
        Emp emp3 = new Emp(null, "c", 17, "女");
        Emp emp4 = new Emp(null, "d", 23, "女");
        Emp emp5 = new Emp(null, "e", 24, "女");
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        mapper.insertMoreEmp(empList);
        empList.forEach(emp -> System.out.println("emp.getEmpId() = " + emp.getEmpId()));
    }

    @Test
    public void testDelMore() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds = {15, 16, 17, 18, 19};
        mapper.delMoreEmp(empIds);
    }
}
