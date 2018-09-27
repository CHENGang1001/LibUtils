package com.chengang.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by chengang on 2018/9/23.
 */

public class SharedPreferanceUtil {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public SharedPreferanceUtil(Context context,String SpName) {
        sharedPreferences = context.getSharedPreferences(SpName,Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    /**存储
     * cu
     * @param key
     * @param value
     */
    public void put(String key,Object value){
        if (value instanceof String){
            editor.putString(key, (String) value);
        }else if(value instanceof Boolean){
            editor.putBoolean(key, (Boolean) value);
        }else if (value instanceof Long) {
            editor.putLong(key, (Long) value);
        }else if (value instanceof Float){
            editor.putFloat(key, (Float) value);
        }else if (value instanceof Integer){
            editor.putInt(key, (Integer) value);
        }else {
            editor.putString(key,value.toString());
        }
        editor.commit();
    }

    /**
     * 获取
     * @param key
     * @param defaultValue
     * @return
     */
    public Object get(String key,Object defaultValue){
        if (defaultValue instanceof Integer){
            return sharedPreferences.getInt(key, (Integer) defaultValue);
        }else if (defaultValue instanceof Float){
            return sharedPreferences.getFloat(key, (Float) defaultValue);
        }else if (defaultValue instanceof String){
            return sharedPreferences.getString(key, (String) defaultValue);
        }else if (defaultValue instanceof Boolean){
            return sharedPreferences.getBoolean(key, (Boolean) defaultValue);
        }else if (defaultValue instanceof Long){
            return sharedPreferences.getLong(key, (Long) defaultValue);
        }else{
            return sharedPreferences.getString(key,null);
        }
    }

    /**
     *删除
     */
   public void clearAll(){
        editor.clear();
        editor.commit();
   }

    /**
     *clear
     * @param key
     */
   public void clearKey(String key){
       if (isKey(key)) {
           editor.remove(key);
       }
   }

    /**
     * 判断
     * @param key
     * @return
     */
   public boolean isKey(String key){
       if (sharedPreferences.contains(key)){
           return true;
       }
       return false;
   }
}
