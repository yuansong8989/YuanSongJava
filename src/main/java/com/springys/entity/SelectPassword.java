package com.springys.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by yzd on 2019/2/12.
 */
@Data
public class SelectPassword {
    private int id;
    private String password;
    private Date create_time;
    private Date update_time;
}
