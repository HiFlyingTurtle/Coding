package com.com.wwh.qiuzhao;

import java.util.Scanner;

/**
 * 微众在线编程02
 * @author wwh
 * @create 2017-09-28 16:54
 **/
public class WeiZhong02 {
    public static int transform(int num,int n){
        int res=0;
        while(num!=0){
            int remainder=num%n;
            num=num/n;
            res+=remainder;
        }
      return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int max=0;
            int temp;
            for(int i=2;i<=num;i++){
                temp=transform(num,i);
                if(temp>max){
                    max=temp;
                }
            }
            System.out.println(max);

        }

    }
}
