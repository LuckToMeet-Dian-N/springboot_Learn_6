package com.wen.test.service.Impl;


import com.wen.test.mapper.UserMapper;
import com.wen.test.service.UserService;
import com.wen.test.vo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
     UserMapper userMapper;

    @Override
    @Transactional  //开启事务
    public Integer insertUsers(Users users) {
        System.out.println("插入成功"+ userMapper.insertUser(users));

         return 1;

    }

    @Override
    public List<Users> selectAllUsers() {
        return userMapper.selectAllUsers();
    }


}
