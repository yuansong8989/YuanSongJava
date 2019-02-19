package com.springys.entity;

import lombok.Data;

/**
 * Created by yzd on 2019/2/2.
 */
@Data
public class RequestObject {
    private Data data;

    @lombok.Data
    public static class Data {
        private Integer number;
        private int id;
        private String password;
        private String user;
        private int pageNum;
        private int pageSize;
    }
}