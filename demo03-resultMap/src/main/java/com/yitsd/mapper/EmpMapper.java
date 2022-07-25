package com.yitsd.mapper;

import com.yitsd.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    Emp getEmpByEmpId(@Param("id") Integer id);

    Emp getEmpAndDeptByEmpId(@Param("id") Integer id);

    //通过分布查询 查询员工及其部门的第一步
    Emp getEmpAndDeptByStepONE(@Param("id") Integer id);

    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer id);

}
