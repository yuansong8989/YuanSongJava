package com.springys.Common;

import org.apache.commons.codec.digest.DigestUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MD5Utils {
    public static final SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    public static final String KEY = "jf-bebds@key";

    public static String md5password() {
        String encodeStr = DigestUtils.md5Hex(KEY + sdf2.format(new Date()));

        return encodeStr;
    }
    public static String md5password1(String md5password) {
        String encodeStr = DigestUtils.md5Hex(md5password + sdf2.format(new Date()));
        return encodeStr;
    }
}