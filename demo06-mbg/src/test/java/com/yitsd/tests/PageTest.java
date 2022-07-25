package com.yitsd.tests;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yitsd.mapper.EmpMapper;
import com.yitsd.pojo.Emp;
import com.yitsd.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName PageTest
 * @Date 2022/7/24 0:13
 */
public class PageTest {

    @Test
    public void testPage() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //查询之前开启分页功能
        Page<Object> page = PageHelper.startPage(10, 5);

        List<Emp> empList = mapper.selectByExample(null);

        //查询之后可以获取分页相关的所有数据
        PageInfo<Emp> pageInfo = new PageInfo<>(empList,7);
        System.out.println("pageInfo.getNavigatePages() = " + pageInfo.getNavigatePages());
        int[] nums = pageInfo.getNavigatepageNums();
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("pageInfo = " + pageInfo);
//        for (Emp emp : empList) {
//            System.out.println("emp = " + emp);
//        }
        System.out.println("page = " + page);
        System.out.println(page.getPages());

    }
}
