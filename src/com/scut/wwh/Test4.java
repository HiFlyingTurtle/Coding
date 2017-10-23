package com.scut.wwh;

import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 测试代码
 * @author wwh
 * @create 2017-09-23 20:52
 **/
public class Test4 {
//    public  static  Test4 t1=new Test4();
//
//    static {
//        System.out.println("BlockA");
//    }
//
//    {
//        System.out.println("BlockB");
//    }
        Test4(){
            System.out.println("C");
        }
        static
        {
            System.out.println("A");
        }

            {
                System.out.println("B");
            }
    public static void main(String[] args) {
//        Test4 t4=new Test4();
//        StringBuilder sb=new StringBuilder();
//                StringBuffer
//        String s1 = "Programming";
//        String s2 = new String("Programming");
//        String s3 = "Program";
//        String s4 = "ming";
//        String s5 = "Program" + "ming";
//        String s6 = s3 + s4;
//        System.out.println(s1 == s2); //false
//        System.out.println(s1 == s5); //true
//        System.out.println(s1 == s6);  //false
//        System.out.println(s1 == s6.intern());//true
//        System.out.println(s2 == s2.intern());//false
//        ConcurrentHashMap
//        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor();

    }

}
