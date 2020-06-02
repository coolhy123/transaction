package com.hydu.service;

import com.hydu.annotation.MyTranscation;
import com.hydu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created on 2020/6/2 @author heyong
 */
@Component
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @MyTranscation
    public int insert(String userName){
        return userMapper.insert(userName);
    }

}