package com.com.wwh.qiuzhao;

import java.util.Scanner;

/**
 * 迅雷在线编程
 *
 * @author wwh
 * @create 2017-09-18 19:50
 **/
public class xunlei02 {
    public static int  calculateSum(int n){
        int count = 0;
        String str;
        for (int i = 2; i <= 5; i++) {
            str = Integer.toString(n, i);
            for (int j = 0; j < str.length(); j++) {
                count += Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        return  count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n= sc.nextInt();
            System.out.println(calculateSum(n));
        }

    }
}
