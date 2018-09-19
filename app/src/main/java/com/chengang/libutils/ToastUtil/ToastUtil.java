package com.chengang.libutils.ToastUtil;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    private static Toast mToast;

    private ToastUtil() {
    }

    public static void showShortString(Context context,String s){
        if (mToast!=null){
            mToast.cancel();
        }
        mToast = Toast.makeText(context,s,Toast.LENGTH_SHORT);
        mToast.show();
    }

    public static void  showShortInt(Context context,int i){
        if (mToast!=null){
            mToast.cancel();
        }
        mToast = Toast.makeText(context,i,Toast.LENGTH_SHORT);
        mToast.show();
    }

    public static void showLongString(Context context,String s){
        if (mToast!=null){
            mToast.cancel();
        }
        mToast = Toast.makeText(context,s,Toast.LENGTH_LONG);
        mToast.show();
    }

    public static void showLongInt(Context context,int i){
        if (mToast!=null){
            mToast.cancel();
        }
        mToast = Toast.makeText(context,i,Toast.LENGTH_LONG);
        mToast.show();
    }

    //自定义时间显示
    public static void showShortString(Context context,String s,int time){
        if (mToast!=null){
            mToast.cancel();
        }
        mToast = Toast.makeText(context,s,time);
        mToast.show();
    }

    public static void  showShortInt(Context context,int i,int time){
        if (mToast!=null){
            mToast.cancel();
        }
        mToast = Toast.makeText(context,i,time);
        mToast.show();
    }

    public static void showLongString(Context context,String s,int time){
        if (mToast!=null){
            mToast.cancel();
        }
        mToast = Toast.makeText(context,s,time);
        mToast.show();
    }

    public static void showLongInt(Context context,int i,int time){
        if (mToast!=null){
            mToast.cancel();
        }
        mToast = Toast.makeText(context,i,time);
        mToast.show();
    }

}
