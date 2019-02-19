package com.springys.Common;

import org.springframework.stereotype.Component;

/**
 * Created by yzd on 2019/2/12.
 */
@Component
public class RequestToken {
    public static   String requesttoken()throws Exception{
        Long a=1L;//userid
        JwtToken jwtToken =new JwtToken();
        String token =jwtToken.createToken(a);
        return token;
    }
    public static void main(String args[]) throws  Exception{
        System.out.println(RequestToken.requesttoken());
    }
}
