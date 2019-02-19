package com.springys.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by yzd on 2019/2/11.
 */

public class Five {

    @JsonProperty("Data")
    public Five.Data getData() {
        return Data;
    }

    public void setData(Five.Data data) {
        Data = data;
    }

    private Data Data;
    @lombok.Data
    public  class Data {
    private int id;
    private String db_name;
    private int repository_id;
    private int dbserver_config_id;
    private int db_type_id;
    private String alias;
    private Date update_time;
    private Date create_time;
    //存入config
    private String userName;//"用户名",
    private String password;//"密码",
    private String authenticationDatabase;//"认证数据名字",
    private String port;//"port": "端口"
    private String charSetName;//""字符集名称"
    private String sortName;//"排序规则名称"
}
}