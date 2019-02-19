package com.springys.Common;

import com.springys.entity.RuseltData;

/**
 * Created by yzd on 2019/2/2.
 */
public class ResultMain {
 public static Uniti success(MessageCode messageCode, RuseltData ruseltData) {
        Uniti uniti = new Uniti(messageCode);
        uniti.setRetult(true);
        uniti.setData(ruseltData);
        return uniti;

    }
    public static Uniti error(MessageCode messageCode){
     Uniti uniti =new Uniti(messageCode);
     uniti.setRetult(false);
     return uniti;
    }
    public static <T> Uniti success1(T t){
        Uniti uniti=new Uniti(MessageCode.success);
uniti.setData(t);
uniti.setRetult(true);
return uniti;
    }
}
