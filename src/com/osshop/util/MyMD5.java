package com.osshop.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/**
 * Created by RandolfJay on 16/5/21.
 */
public class MyMD5 {
    /**
     * 进行MD5加密
     * @param String 原始的SPKEY
     * @return byte[] 指定加密方式为md5后的byte[]
     */
    public static String md5(String strSrc){
        byte[] returnByte = null;
        try
        {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            returnByte = md5.digest(strSrc.getBytes());

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return strSrc;//String(returnByte);
    }

}
