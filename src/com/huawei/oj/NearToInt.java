package com.huawei.oj;

import java.util.Scanner;
/**
 * Created by WWH on 2017/3/14.
 */
public class NearToInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        if(num<0){
            sc.close();
            return;
        }
        String str=String.valueOf(num);
        str=str.substring(str.lastIndexOf('.')+1);
        int temp=str.charAt(0)-'0';
        int sum=(int) num;
        if(temp>=5){
         sum=sum+1;
        }
        System.out.println(sum);
    }
}
