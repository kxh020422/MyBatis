package com.yitsd.tests;

import com.yitsd.mapper.DeptMapper;
import com.yitsd.mapper.EmpMapper;
import com.yitsd.pojo.Dept;
import com.yitsd.pojo.Emp;
import com.yitsd.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

/**
 * @ClassName ResultMapTest
 * @Date 2022/7/22 0:24
 */
public class ResultMapTest {

    @Test
    public void testGetEmpByEmpId() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpByEmpId(1);
        System.out.println(emp);
    }



    @Test
    public void testGetEmpAndDeptByEmpId() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(emp);
    }

    @Test
    public void testGetEmpAndDeptByStep() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepONE(1);
        System.out.println(emp);
    }

    @Test
    public void testGetDeptAndEmpByDeptId() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByDeptId(1);
        System.out.println("dept = " + dept);
    }

    @Test
    public void testGetDeptAndEmpByStep() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStepONE(1);
        System.out.println("dept = " + dept);
    }

}
