package com.blogcloud.entity;

import lombok.*;

/**
 * @Description: 相册实体类
 * @Date: Created in 12:02 2020/6/1
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */

public @Data class Picture {

    private Long id;
    private String picturename;
    private String picturetime;
    private String pictureaddress;
    private String picturedescription;

}
