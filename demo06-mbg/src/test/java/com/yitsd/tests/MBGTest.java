package com.yitsd.tests;

import com.yitsd.mapper.EmpMapper;
import com.yitsd.pojo.Emp;
import com.yitsd.pojo.EmpExample;
import com.yitsd.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName MBGTest
 * @Date 2022/7/23 23:18
 */
public class MBGTest {


    @Test
    public void testMBG() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println("emp = " + emp);

        //查询所有数据
//        List<Emp> empList = mapper.selectByExample(null);
//        empList.forEach(emp -> System.out.println("emp = " + emp));


        //根据条件查询数据
//        EmpExample empExample = new EmpExample();
//        empExample.createCriteria().andEmpNameEqualTo("张三");
//        empExample.or().andGenderEqualTo("女");
//        List<Emp> empList = mapper.selectByExample(empExample);
//        empList.forEach(emp -> System.out.println("emp = " + emp));

//        mapper.insert(new Emp(null,"你",12,null,null));
//        mapper.insertSelective(new Emp(null,"你",null,"女",null));

        //测试普通修改功能
//        Emp emp = new Emp(30,"coheir",null,"男",null);
//        mapper.updateByPrimaryKey(emp);

        //测试选择性修改（如果要把某个属性修改位null或者不对某属性进行赋值，那么这个属性将不会被修改）
        Emp emp = new Emp(30, "小黑", null, "男", null);
        mapper.updateByPrimaryKeySelective(emp);
    }
}
