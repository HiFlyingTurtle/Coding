package com.huawei.oj;

import java.util.Scanner;

/**
 * Created by WWH on 2017/3/15.
 * 求两个数的最小公倍数
 */
public class LCM {
    public static int gcd(int a,int b){
        int result=0;
        int temp=0;
        if(a<b){
            temp=a;
            a=b;
            b=temp;
        }
        while(b>0){
            result=a%b;
            a=b;
            b=result;
        }
        return a;
    }
    //可以从n开始递减
    public static int gcd1(int m,int n){
        int gcd=1;
        if(m%n==0) return n;
        //不从1开始向上查找可能的除数，而是从n开始向下查找，这样会更加的高效
        //数组n的除数不可能比n/2大
        for (int k=m/2;k>=1;k--){
            if(m%k==0&&n%k==0){
                gcd=k;
                break;
            }
        }
        return gcd;
    }

     /**
     * 使用欧几里得算法来进行求最大公约数
     * @param m
     * @param n
     * @return
     */
    public  static int gcd2(int m,int n){
        if(m%n==0) return n;
        else {
            return gcd2(n,m%n);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            if(n1==0||n2==0){
                sc.close();
                return;
            }
  //          System.out.println(gcd(n1,n2));
            System.out.println((n1*n2)/gcd(n1,n2));

        }
    }
}
