package com.scut.test;

import java.util.Scanner;

/**
 * 携程笔试在线编程题01
 * @author wwh
 * @create 2017-04-11 18:49
 **/
public class XIECHENG01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int []a=new int[n];
            int i=2;
            int total=0;
            while (total+i<=n){
                total+=i;
                a[i-2]=i;
                i++;
            }
            n-=total;
            i=i-3;
            total=i;

            while (i>=0&&n>0){
                n--;
                a[i]++;
                i--;

            }
            if(n>0){
                a[total]++;
            }

            int res=1;
            for ( i=0;i<=total;i++){
                res*=a[i];
            }
            System.out.println(res);

        }


    }
}
