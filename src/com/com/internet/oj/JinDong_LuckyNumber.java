package com.com.internet.oj;

import java.util.Scanner;
/**
 * 在线编程幸运数字
 * @author wwh
 * @create 2017-09-08 11:34
 **/
public class JinDong_LuckyNumber {

    public static int  SumOfRadix(int num,int radix){
        int res=0;
        while(num>0){
            int remainder=num%radix;
            res+=remainder;
            num=num/radix;
        }
        return res;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int count=0;
            for(int num=1;num<=n;num++){

                int decimal=SumOfRadix(num,10);
                int binary=SumOfRadix(num,2);

                if(decimal==binary)
                    count++;
            }
            System.out.println(count);
        }
    }
}
