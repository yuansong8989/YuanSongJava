package com.springys.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by yzd on 2019/2/2.
 */
@Data
@Component
public class Aj {
    private int db_type_id;
    private  int dbserver_config_id;
    private int id;
    private String db_name;
    private String alias;
    private String config;
    private int repository_id;
    private String default_port;
    private String ip;
}