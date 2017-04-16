package com.scut.test;
import java.util.Scanner;

/**
 * 今日头条笔试编程第一题
 * @author wwh
 * @create 2017-03-30 18:21
 **/
public class TouTiao01 {
    public static int query(int a[],int b[],int x,int y){
        int result=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=x&&b[i]>=y) result++;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        int []x=new int[q];
        int []y=new int[q];

        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for (int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }

        for(int i=0;i<q;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }


        for(int i=0;i<q;i++){
            System.out.println(query(a, b, x[i], y[i]));
        }

    }
}
