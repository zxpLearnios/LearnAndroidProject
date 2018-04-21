package com.example.bava.learnandroidproject.Config;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by bava on 2018/04/20.
 */


public class Const {

    /*
    * 构造方法
    * */
    public Const(String str){

    }

    /**
     * 展示提示信息, 通过方法重载实现函数参数的默认值设置
     * */
    public static void shortShow(Context ctx, String msg){
        show(ctx, msg, false);
    }

    public static void longShow(Context ctx, String msg){
        show(ctx, msg, false);
    }

    /**
     * Context：android.app.Application或android.app.Activity。而我们传入的是this，也就是Activity。另外，我们还可以传this.getApplicationContext(),也就是Application。
     * */
    private static void show(Context ctx, String msg, Boolean isLong){
        int time = (isLong) ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT;
        Toast.makeText(ctx, msg, time).show();
    }

}
