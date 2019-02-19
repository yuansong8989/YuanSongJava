package com.springys.Common;

/**
 * Created by yzd on 2019/2/13.
 */
public class StringUtils {
    public static boolean isEmpty(String redisvalue){
        if(redisvalue==null){
            return true;
        }
        else return false;
    }
}
