package com.blogcloud.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description: 留言实体类
 * @Date: Created in 11:44 2020/6/1
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
public @Data class Message {

    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;
    private Date createTime;
    private Long parentMessageId;
    private boolean adminMessage;

    //回复留言
    private List<Message> replyMessages = new ArrayList<>();
    private Message parentMessage;
    private String parentNickname;

}