package com.yitsd.mapper;

import com.yitsd.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName CacheMapper
 * @Date 2022/7/23 0:37
 */
public interface CacheMapper {

    Emp getEmpById(@Param("empId") Integer empId);
}
