package com.wen.test.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Users implements Serializable{
    private Integer user_id;
    private String phone;
    private String password;

}
