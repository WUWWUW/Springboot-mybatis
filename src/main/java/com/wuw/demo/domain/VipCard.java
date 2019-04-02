package com.wuw.demo.domain;

import lombok.Data;

@Data
public class VipCard {
    private String vid;

    private String ownname;

    private String phone;

    private Integer money;

    private Byte status;


}