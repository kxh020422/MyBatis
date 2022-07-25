package com.yitsd.mapper;

import com.yitsd.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    //通过分布查询 查询员工及其部门的第二步
    Dept getEmpAndDeptByStepTWO(@Param("deptId") Integer deptId);

    //查询部门已经部门中的员工信息
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);


    //通过分布查询 查询部门以及部门中的员工信息
    Dept getDeptAndEmpByStepONE(@Param("deptId") Integer deptId);

}
