package com.chengang.utils;

import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

    private static final String TAG = "Md5Utils";

    public static byte[] getMd5Byte(String key) {
        byte[] buffer;
        byte[] ret = new byte[16];
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
            md5.reset();
            buffer = key.getBytes();
            md5.update(buffer);
        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG,
                    String.format("readFile Error!\te.getMessage:%s",
                            e.getMessage()));
            return ret;
        }

        ret = md5.digest();
        return ret;
    }

    public final static String getMd5(String key) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            byte[] md = getMd5Byte(key);
            char str[] = new char[md.length * 2];
            int k = 0;
            for (int i = 0; i < md.length; i++) {
                byte b = md[i];
                // 将每个(int)b进行双字节加密
                str[k++] = hexDigits[b >> 4 & 0xf]; // 取字节中高 4 位的数字转换,
                // >>> 为逻辑右移，将符号位一起右移
                str[k++] = hexDigits[b & 0xf]; // 取字节中低 4 位的数字转换
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }

}
