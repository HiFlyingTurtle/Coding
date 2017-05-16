package com.huawei.oj;

import java.util.Scanner;

/**
 * 华为在线编程小球弹地
 * @author wwh
 * @create 2017/5/16
 */

public class BallJourney {

    public static double getJourney(int high)
    {
        double sum=0;
        double temp=high;
        for (int i=1;i<=5;i++){
            sum=sum+temp+temp/2;
            temp=temp/2;
//            System.out.println("temp:"+temp);
        }
        sum=sum-temp;
        return sum;
    }



    public static double getTenthHigh(int high)
    {
        double temp=high;
        for (int i=1;i<=5;i++){
            temp=temp/2;
//            System.out.println("temp:"+temp);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int high=sc.nextInt();
            System.out.println(getJourney(high));
            System.out.println(getTenthHigh(high));
        }
    }
}
