package com.scut.wwh;

import java.util.Random;

/**
 * Created by scut-313 on 2017/2/28.
 * random()是随机产生大于等于0.0 到1.0之间不包括1.0
 * 取整则为0-90 +10 ，则为10-100；
 */
public class Test {
    public static void main(String[] args)
    {   Thread t1=new Thread();
        t1.notify();
//        Random ran=new Random(123);

        int i=(int)(Math.random()*91)+10;
        System.out.println(i);

    }
}
