package com.com.wwh.qiuzhao;

import java.util.Scanner;

/**
 * 拼多多大整数相乘
 *
 * @author wwh
 * @create 2017-08-01 20:29
 **/
public class BIgIntMulti {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();

        int [] result=new int[s1.length()+s2.length()];
        for(int i=s1.length()-1;i>=0;i--){
            int v1=s1.charAt(i)-'0';
            for(int j=s2.length()-1;j>=0;j--){
                int v2=s2.charAt(j)-'0';
                result[i+j+1]+=v1*v2;
            }
        }

        for(int i=result.length-1;i>0;i--){
            result[i-1]+=result[i]/10;
            result[i] %=10;
        }

        StringBuilder sb=new StringBuilder();
        for(int i=(result[0]==0?1:0);i<result.length;i++){
            sb.append(result[i]);
        }
        System.out.println(sb.toString());

    }
}
