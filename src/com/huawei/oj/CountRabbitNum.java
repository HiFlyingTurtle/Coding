package com.huawei.oj;

import java.util.Scanner;
/**
 * 华为在线编程统计兔子的个数
 * @author wwh
 * @create 2017/5/16
 */
public class CountRabbitNum {
    public static int getTotalCount(int monthCount)
    {
        int [] res=new int[monthCount+2];
        res[1]=1;
        res[2]=1;
        res[3]=2;
       if(monthCount<=3){
           return res[monthCount];
       }else {
           for (int i=4;i<=monthCount;i++){
               res[i]=res[i-1]+res[i-2];
           }
       }
        return res[monthCount];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int month=sc.nextInt();
            System.out.println(getTotalCount(month));
        }
    }
}
