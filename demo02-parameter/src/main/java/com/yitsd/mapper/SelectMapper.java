package com.yitsd.mapper;

import com.yitsd.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getCount();

    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    List<Map<String, Object>> getAllUserToMap();

    @MapKey("username")
    //相当与在外面套了一层map
    //也就是 Map<String, Map<String, Object>> 在最外面的这层map上 他的key的值也就是@MapKey中username的值
    //要注意@MapKey中的值必须是表格中某个字段的值
    Map<String, Object> getAllUserToMapWithAnno();

}
