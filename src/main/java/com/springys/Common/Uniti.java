package com.springys.Common;

import lombok.Data;

/**
 * Created by yzd on 2019/2/2.
 */
@Data
public class Uniti<T> {
    private boolean retult;
    private String message;
    private int code;
    private T Data;

    public Uniti(MessageCode messageCode) {
        this.message = messageCode.getMessage();
        this.code = messageCode.getCode();
    }
}
