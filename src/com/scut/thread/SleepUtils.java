package com.scut.thread;

import java.util.concurrent.TimeUnit;

/**
 * 线程休眠方法
 * @author wwh
 * @create 2017/5/13
 */
public class SleepUtils {
    public static final void second(long seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
