package com.wen.test.service;

import com.wen.test.vo.Users;

import java.util.List;


public interface UserService {

    Integer insertUsers(Users users);

    List<Users> selectAllUsers();
}
