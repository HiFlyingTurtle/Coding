package com.com.internet.oj;

import java.util.Scanner;
/**
 * Created by WWH on 2017/3/24.
 * 网易编程测试题 打怪升级
 */
public class MonsterUpdate {
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int group=sc.nextInt();
            int a=sc.nextInt();
            for (int i=0;i<group;i++){
                int bi=sc.nextInt();
                if(a>=bi){
                    a=a+bi;
                }else {
                    int add=gcd(bi,a);
                    a=a+add;

                }
            }
            System.out.println(a);
        }

    }
}
