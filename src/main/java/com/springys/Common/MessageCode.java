package com.springys.Common;

import lombok.Getter;

/**
 * Created by yzd on 2019/2/2.
 */
@Getter
public enum MessageCode {
    success(1,"成功勒"),
    error(0,"失败了"),
    Exception1(-1,"异常");
    private int code;
    private String message;
 MessageCode(int code,String message){
        this.code=code;
        this.message=message;
    }
}
