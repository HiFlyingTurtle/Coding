package com.com.internet.oj;
import java.util.Scanner;
/**
 * 京东真题编程训练 进制均值
 * @author wwh
 * @create 2017-09-07 11:40
 **/
public class JinDong_JinZhi {

    //求两个数最大公约数
    public  static int gcd(int m,int n){
        if(m%n==0) return n;
        else {
            return gcd(n,m%n);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int res=0;
            //dividend
            for(int i=2;i<=num-1;i++){
                int divider=num;
                while (divider>0){
                    int remainder=divider%i;
                    res+=remainder;
                    divider=divider/i;
                }
            }
            int common=gcd(res,num-2);
            System.out.println(res/common+"/"+(num-2)/common);
        }
    }
}
