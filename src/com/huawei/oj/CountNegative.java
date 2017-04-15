package com.huawei.oj;

import java.util.Scanner;
/**
 * Created by WWH on 2017/3/15.
 */
public class CountNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count1=0,count2=0;
        float sum=0;
        while(sc.hasNext()){
            int num=sc.nextInt();
            if(num<0){
                  count1++;
            }else{
                count2++;
                sum=sum+num;
            }
        }
        System.out.println(count1);
        if(count2==0){
            System.out.println(0.0);
        }else {
            float avg=sum/count2;
            System.out.printf("%.1f\n",avg);
        }

        sc.close();

    }
}
