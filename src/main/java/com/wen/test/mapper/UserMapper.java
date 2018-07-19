package com.wen.test.mapper;


import com.wen.test.vo.Users;

import java.util.List;


public interface UserMapper {

    Integer insertUser(Users users);

    List<Users> selectAllUsers();

}
