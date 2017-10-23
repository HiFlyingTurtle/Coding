package com.com.wwh.qiuzhao;

import java.util.Scanner;

/**
 * 美丽联合在线编程
 * @author wwh
 * @create 2017-09-23 14:58
 **/
public class MeiLiLianhe01 {

    public static  boolean isLeapYear(int year){
        boolean flag=false;
        if((year%4==0&&year%100!=0)||year%400==0) flag=true;
        else flag=false;
        return  flag;
    }

    public static int getMonth(int year,int month){
        int monthDay=0;
        if(month==2)
            if(isLeapYear(year))
                monthDay=29;
            else
                monthDay=28;
        else if(month==4||month==6||month==9||month==11)
                monthDay=30;
        else
                monthDay=31;
        return monthDay;
    }
   public static int getDay(int year,int month,int date){
        int total=0;
        for (int i=1;i<month;i++)
            total+=getMonth(year,i);
        total+=date;
        return total;
    }
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        while(sc.hasNext()){
            int year=sc.nextInt();
            int month=sc.nextInt();
            int day=sc.nextInt();
            System.out.println(getDay(year,month,day));
        }
    }
}
