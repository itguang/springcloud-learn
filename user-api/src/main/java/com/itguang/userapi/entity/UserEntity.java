package com.itguang.userapi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author itguang
 * @create 2017-12-16 9:44
 **/
@Data
public class UserEntity implements Serializable{

    private String username;

    private String password;

    private Integer age;

    private String email;





}
