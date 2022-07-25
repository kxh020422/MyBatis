package com.yitsd.mapper;

import com.yitsd.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {

    List<Emp> getEmpByCondition(Emp emp);

    void insertMoreEmp(@Param("empList") List<Emp> empList);

    void delMoreEmp(@Param("empIds") Integer[] empIds);
}
