package com.com.internet.oj;

import java.util.Scanner;

/**
 * 计算1024阶乘后面有几个0
 * 末尾0的个数取决于乘法中因子2和5的个数。显然乘法中因子2的个数大于5的个数，所以我们只需统计因子5的个数。
 * @author wwh
 * @create 2017-08-31 11:21
 **/
public class CountZero {
    public  static int ZeroCount(int num){
        int res=0;
        while (num>5){
            num=(num-(num%5))/5;
            res+=num;
        }
        return res;
    }

    public  static int ZeroCount1(int num){
        if(num<5) return 0;
        else {
            num/=5;
            return num+ZeroCount1(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            System.out.println(ZeroCount1(num));
        }
    }
}
