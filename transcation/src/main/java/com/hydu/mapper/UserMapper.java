package com.hydu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created on 2020/6/2 @author heyong
 */
@Mapper
public interface UserMapper {
    @Insert("insert into  user(userName) values(#{userName})")
    int insert(@Param("userName") String userName);
}
