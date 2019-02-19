package com.springys.entity;

import lombok.Data;

/**
 * Created by yzd on 2019/2/11.
 */
@Data
public class MyConfig {
    private String userName;//"用户名",
    private String password;//"密码",
    private String authenticationDatabase;//"认证数据名字",
    private String port;//"port": "端口"
    private String charSetName;//""字符集名称"
    private String sortName;//"排序规则名称"
}
