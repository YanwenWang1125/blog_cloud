package com.blogcloud.entity;

import lombok.Data;

import java.util.Date;
public @Data class User {

    private Long id;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;
    private Date createTime;
    private Date updateTime;

}
