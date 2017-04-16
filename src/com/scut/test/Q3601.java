package com.scut.test;
import java.util.Scanner;

/**
 * 360在线编程第一题
 *
 * @author wwh
 * @create 2017-03-25 18:50
 **/
public class Q3601 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        double ex=0.0;
        for(int i=0;i<line;i++){
            int x=sc.nextInt();
            int p=sc.nextInt();
            ex=ex+x*p/100.0;

        }
        System.out.printf("%.3f\n",ex);
    }
}
