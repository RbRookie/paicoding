package com.github.liueyueyi.forum.api.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDTO {

    private Long id;

    private Date createTime;

    private Date updateTime;
}
