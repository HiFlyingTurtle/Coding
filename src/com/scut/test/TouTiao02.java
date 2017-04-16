package com.scut.test;

import java.util.Scanner;

/**
 * 今日头条笔试编程第二题
 *
 * @author wwh
 * @create 2017-03-30 18:23
 **/
public class TouTiao02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];

        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int min=0,max=0;
        for (int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                min=-1;
                max=-1;
            } else {

            }
        }
    }
}
