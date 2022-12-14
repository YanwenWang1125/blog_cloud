package com.blogcloud.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 分类实体类
 * @Date: Created in 17:26 2020/5/31
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
public @Data class Type {

    private Long id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();

}