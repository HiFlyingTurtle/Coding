package com.scut.chunzhao;

import java.util.Scanner;

/**
 * 求前M项的和
 *
 * @author wwh
 * @create 2017-03-19 18:16
 **/
public class SumM {
    public static void main(String[] args) {
        double sum,n;
        int m;
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            n=sc.nextInt();
            m=sc.nextInt();
            sum=0;
            for(int i=0;i<m;i++){
                sum=sum+n;
                n=Math.sqrt(n);
            }
            System.out.printf("%.2f",sum);
            System.out.println();
        }
    }

}
