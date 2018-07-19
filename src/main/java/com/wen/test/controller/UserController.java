package com.wen.test.controller;


import com.wen.test.service.UserService;
import com.wen.test.vo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    /**
     * 插入数据
     */
    @Autowired
    UserService userService;
    @GetMapping(value = "test")
    public String insertUser(Users users){

        userService.insertUsers(users);
        return "插入成功";
    }

    /**
     * 为了方便测试。就只用GET请求来请求数据。。。
     * @param users
     * @return
     */
    @GetMapping(value = "all")
    public List<Users> selectALL(Users users){

       return userService.selectAllUsers();

    }

}
