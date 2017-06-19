package com.huawei.oj;

import java.util.Scanner;

/**
 * 素数伴侣
 * @author wwh
 * @create 2017-06-19 23:12
 **/
public class PrimePartner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int [] array=new int[n];
            for (int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }


        }

    }

    public static boolean isPrime(int n) {
       int count = (int) Math.sqrt(n);
        while (count > 1) {
            if (n % count == 0 ) {
                return false;
               }
           count--;
       }
        return true;
     }

}
