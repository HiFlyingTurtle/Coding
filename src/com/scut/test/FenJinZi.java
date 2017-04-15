package com.scut.test;

import java.util.Scanner;

/**
 * Created by WWH on 2017/3/20.
 * 360在线笔试分金子
 */
public class FenJinZi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int suma=0,sumb=0;
            int n=sc.nextInt();
            int []gold=new int[n];
            for (int j=0;j<n;j++){
                gold[j]=sc.nextInt();

            }

            for(int a=0;a<gold.length;a=a+2){
                suma+=gold[a];
            }

            for(int b=1;b<gold.length;b=b+2){
                sumb+=gold[b];
            }
            if(suma<sumb){
                int  temp=suma;
                suma=sumb;
                sumb=temp;
            }

            System.out.println("Case #"+(i+1)+": "+suma+" "+sumb);

        }
        sc.close();
    }
}
