package com.yitsd.mapper;

import com.yitsd.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLMapper {


    List<User> getUserByLike(@Param("likeStr") String likeStr);

    void batchDel(@Param("ids") String ids);

    List<User> getUserList(@Param("tableName") String tableName);

    void insertUser(User user);

}
